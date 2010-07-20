/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.lexer

import scala.collection.mutable.HashSet
import scala.util.parsing.combinator.Parsers
import scala.util.parsing.combinator.lexical.Lexical
import scala.util.parsing.combinator.lexical.Scanners
import scala.util.parsing.combinator.lexical.StdLexical
import scala.util.parsing.input.CharArrayReader.EofCh

class KMLexical extends Lexical with KTokens {

  val reserved : HashSet[String] = HashSet("package","attribute","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var","from","until","loop","if","then","else","init","true","false")
  val delimiters : HashSet[String] = HashSet("=",";","::","@","{","}","(",")",":",":=",".",",","|","==","!=","-","+","!","*","/","<","<=",">",">=")

  override def whitespace: Parser[Any] = rep(whitespaceChar)

  def comment : Parser[Token] =
   ( '/' ~ '*' ~ mlcomment ^^ { case _ ~ _ ~ mlcomment => mlcomment }
    | '/' ~ '/' ~ rep( chrExcept(EofCh, '\n') ) ^^ { case _ ~ _ ~ content => Comment(content.mkString) }
  //  | '/' ~ '*' ~ failure("unclosed comment") ^^^ {case _ => ERR_MLComment("unclosed comment") }
   )


  protected def mlcomment: Parser[MLComment] = (
    '*' ~ '/'  ^^ { case _ => MLComment("")  }
    | chrExcept(EofCh) ~ mlcomment ^^ { case c ~ rc => MLComment(c+rc.chars)  }
  )

  // legal identifier chars other than digits
  def identChar = letter | elem('_')

  /*

   def floatingToken: Parser[Token] =
   rep1(digit) ~ optFraction ^^
   { case intPart ~ frac => NumericLit(
   (intPart mkString "") :: frac :: Nil mkString "")}

   def chr(c:Char) = elem("", ch => ch==c )
   def sign = chr('+') | chr('-')
   def optSign = opt(sign) ^^ {
   case None => ""
   case Some(sign) => sign
   }
   def fraction = '.' ~ rep(digit) ^^ {
   case dot ~ ff => dot :: (ff mkString "") :: Nil mkString ""
   }
   def optFraction = opt(fraction) ^^ {
   case None => ""
   case Some(fraction) => fraction
   }
   */



// see `token' in `Scanners'
  def token: Parser[Token] =
    comment |
    ( identChar ~ rep( identChar | digit )              ^^ { case first ~ rest => processIdent(first :: rest mkString "") }
     | digit ~ rep( digit )                              ^^ { case first ~ rest => NumericLit(first :: rest mkString "") }
     | '\'' ~ rep( chrExcept('\'', '\n', EofCh) ) ~ '\'' ^^ { case '\'' ~ chars ~ '\'' => StringLit(chars mkString "") }
     | '\"' ~ rep( chrExcept('\"', '\n', EofCh) ) ~ '\"' ^^ { case '\"' ~ chars ~ '\"' => StringLit(chars mkString "") }
     | EofCh                                             ^^^ EOF
     | '\'' ~> failure("unclosed string literal")
     | '\"' ~> failure("unclosed string literal")
     | delim
     /* | floatingToken*/
     | failure("illegal character")
    )




  protected def processIdent(name: String) =
    if (reserved contains name) Keyword(name) else Identifier(name)

  private lazy val _delim: Parser[Token] = {
    // construct parser for delimiters by |'ing together the parsers for the individual delimiters,
    // starting with the longest one -- otherwise a delimiter D will never be matched if there is
    // another delimiter that is a prefix of D
    def parseDelim(s: String): Parser[Token] = accept(s.toList) ^^ { x => Delimiter(s) }

    val d = new Array[String](delimiters.size)
    delimiters.copyToArray(d, 0)
    scala.util.Sorting.quickSort(d)
    (d.toList map parseDelim).foldRight(failure("no matching delimiter"): Parser[Token])((x, y) => y | x)
  }
  protected def delim: Parser[Token] = _delim

  private def lift[T](f: String => T)(xs: List[Char]): T = f(xs.mkString("", "", ""))
  private def lift2[T](f: String => T)(p: ~[Char, List[Char]]): T = lift(f)(p._1 :: p._2)


  



}
