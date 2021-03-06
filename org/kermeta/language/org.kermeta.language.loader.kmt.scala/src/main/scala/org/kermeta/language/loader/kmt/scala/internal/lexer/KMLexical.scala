/* $Id: KMLexical.scala 14622 2011-03-11 17:11:36Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.lexer

import scala.collection.mutable.HashSet
import scala.collection.mutable.ListBuffer
import scala.util.parsing.combinator.lexical.Lexical
import scala.util.parsing.input.CharArrayReader.EofCh

class KMLexical extends Lexical with KTokens {


  /** This token is produced by a scanner {@see Scanner} when scanning failed. */
  override def errorToken(msg: String): KToken = new KError(msg)


  //def kfailure(msg: String) = Parser{ in => KError(msg, in) }
  //def keof : Parser[KToken] = Parser{in => eof ^^ { case _ => Identifier("") } }

  def eof = elem("eof", ch => ch == EofCh)
  protected def kident(name: String) : KToken = if (reserved contains name) Keyword(name) else Identifier(name)
  override def whitespace: Parser[Any] = rep(whitespaceChar)

  val reserved : HashSet[String] = HashSet("abstract", "alias", "and", "aspect", "attribute","bag", "class" , "do", "end", "enum", "enumeration", "else", "extern", "false", "from", "getter", "init", "inherits","if","inv","is","loop","metamodel","method","not", "operation", "or","oset", "package", "post", "pre", "property", "until","then","true", "raise", "readonly", "reference", "result","require", "self", "seq", "set", "setter", "singleton", "subtypeof", "super", "transformation", "using","value","var", "void","rescue")
  val delimiters : HashSet[String] = HashSet("^","^:","#","=",";","::","@","{","}","(",")",":",":=",".",",","|","==","!=", "?=","-","+","!","*","/","<","<=",">",">=","[","]","..","->","=>")


  def docComment : Parser[KToken] =  docML ~ commentBody ^^ { case _ ~ body =>
    //println("Lexer found a documentation comment (/**" + body.mkString + ")")
    MLDocumentation("/**" + body.mkString)
  }

  def comment : Parser[KToken] = (
    positioned('/' ~> '/' ~> rep( chrExcept(EofCh, '\n') ) ^^ { case content =>
      //println("Lexer found a comment (//" + content.mkString + ")" )
      Comment(content.mkString) })
    |
    //positioned(docML ~ commentBody ^^ { case _ ~ body =>
    //  println("Lexer found a (comment parser) documentation comment (" + body.mkString + ")")
    //  MLDocumentation("/**"+body.mkString) })
    //|
    //docComment
    //|
    positioned(beginML ~ commentBody ^^ {case _ ~ body =>
      //println("Lexer found a multiline comment (/*" + body.mkString  + ")")
      MLComment("/*"+body.mkString)})
    
  )


  def commentBody[T]: Parser[List[Elem]] = Parser { in =>
    val elems = new ListBuffer[Elem]
    var startFound = false
    if(in.first == '*') {
      startFound = true
    }
    elems += in.first
    var tok = in.rest
    while(!  ((tok.first=='/'&&startFound)||(tok.first == EofCh))   ){
      startFound = ( tok.first == '*')
      elems += tok.first
      tok = tok.rest
    }
    elems += tok.first
    Success(elems.toList, tok.rest)

  }

  def stringLiteralBody[T]: Parser[List[Elem]] = Parser { in =>
    val elems = new ListBuffer[Elem]
    var backslashFound = false
    if(in.first == '\\') {
      backslashFound = true
    }
    var tok = in.rest

    if (in.first == '"') {
    	// empty String literal, so we just go back, this parser should absorb only the final "
    	tok = in
    }
    else{
    	elems += in.first
	    while(!  ((tok.first=='"'&&(!backslashFound))||(tok.first == EofCh))   ){
	      backslashFound = ( tok.first == '\\'&&(!backslashFound))
	      elems += tok.first
	      tok = tok.rest
	    }
    }
    Success(elems.toList, tok.rest)
  }

    def stringLiteralQuoteBody[T]: Parser[List[Elem]] = Parser { in =>
    val elems = new ListBuffer[Elem]
    var backslashFound = false
    if(in.first == '\\') {
      backslashFound = true
    }
    var tok = in.rest
    if (in.first == '"') {
    	tok = in
    }
    else{
    	elems += in.first
	   while(!  ((tok.first=='\''&&(!backslashFound))||(tok.first == EofCh))   ){
	      backslashFound = ( tok.first == '\\'&&(!backslashFound))
	      elems += tok.first
	      tok = tok.rest
	    }
    }
    Success(elems.toList, tok.rest)
  }

 // def mlSuite : Parser[String] =  commentBody ~ endML ^^ { case bodyml ~endml =>
  //    bodyml+"*/"
 // }
  def beginML = '/' ~ '*'  ~ chrExcept('*') //whitespaceChar
  def docML = '/' ~ '*' ~ '*'

  //def endML = '*' ~ '/'
  //def bodyML : Parser[String] = rep( endML ^^^ { "*/" } | chrExcept(EofCh)^^ {case _ => ""} ) ^^ { case s => s.mkString }

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
  def token: Parser[KToken] = (
    positioned( '~' ~ identChar ~ rep( identChar | digit ) ^^ { case _ ~ first ~ rest => Identifier(first :: rest mkString "") } )
    | positioned( identChar ~ rep( identChar | digit ) ^^ { case first ~ rest => kident(first :: rest mkString "") } )
    | positioned(docComment ^^ { case c => MLDocumentation(c.toString()) } )
    | positioned(comment ^^{ case c => c })
    | positioned(digit ~ rep( digit )                              ^^ { case first ~ rest => NumericLit(first :: rest mkString "") })
    //| positioned('\'' ~ rep( chrExcept('\'', '\n', EofCh) ) ~ '\'' ^^ { case '\'' ~ chars ~ '\'' => StringLit(chars mkString "") })
    //| positioned('\"' ~ rep( chrExcept('\"', '\n', EofCh) ) ~ '\"' ^^ { case '\"' ~ chars ~ '\"' => StringLit(chars mkString "") })
    | positioned('\'' ~ stringLiteralQuoteBody  /*~ '\"'*/ ^^ { case '\'' ~ chars /*~ '\"' */=> StringLit(chars mkString "") })
    | positioned('\"' ~ stringLiteralBody  /*~ '\"'*/ ^^ { case '\"' ~ chars /*~ '\"'*/ => StringLit(chars mkString "") })
    | positioned(eof ^^ {case _ => KEOF() })
    | positioned('\'' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) // ~> failure("unclosed string literal") )
    | positioned('\"' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) //~> failure("unclosed string literal") )
    | positioned(delim)
    /* | floatingToken*/
    |  positioned( elem("illegal character", p => true ) ^^^KError("illegal character") ) //  failure("illegal character"))
  )


  private lazy val _delim: Parser[KToken] = {
    // construct parser for delimiters by |'ing together the parsers for the individual delimiters,
    // starting with the longest one -- otherwise a delimiter D will never be matched if there is
    // another delimiter that is a prefix of D
    def parseDelim(s: String): Parser[KToken] = positioned(accept(s.toList) ^^ { x => Delimiter(s) })

    val d = new Array[String](delimiters.size)
    delimiters.copyToArray(d, 0)
    scala.util.Sorting.quickSort(d)
    (d.toList map parseDelim).foldRight(failure("no matching delimiter"): Parser[KToken])((x, y) => y | x)
  }
  protected def delim: Parser[KToken] = _delim

  // private def lift[T](f: String => T)(xs: List[Char]): T = f(xs.mkString("", "", ""))
//  private def lift2[T](f: String => T)(p: ~[Char, List[Char]]): T = lift(f)(p._1 :: p._2)


  

}
