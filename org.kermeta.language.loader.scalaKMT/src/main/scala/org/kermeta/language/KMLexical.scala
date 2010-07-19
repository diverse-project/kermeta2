/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language

import scala.util.parsing.combinator.lexical.Scanners
import scala.util.parsing.combinator.lexical.StdLexical

class KMLexical extends StdLexical with Scanners {

  reserved ++= org.kermeta.language.Lexical.keywords
  delimiters ++= org.kermeta.language.Lexical.delimiters


  override def token: Parser[Token] = floatingToken | super.token

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
}
