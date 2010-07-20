/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.lexer

import scala.util.parsing.combinator.token.Tokens

trait KTokens extends Tokens {

  /** The class of comment tokens */
  case class Comment(chars: String) extends Token {
    override def toString = "/* "+chars+" */"
  }

  /** The class of comment tokens */
  case class MLComment(chars: String) extends Token {
    override def toString = "/* "+chars+" */"
  }

  /** The class of delim tokens */
  case class Delimiter(chars: String) extends Token {
    override def toString = chars
  }

  /** The class of keyword tokens */
  case class Keyword(chars: String) extends Token {
    override def toString = "`"+chars+"'"
  }

  /** The class of numeric literal tokens */
  case class NumericLit(chars: String) extends Token {
    override def toString = chars
  }

  /** The class of string literal tokens */
  case class StringLit(chars: String) extends Token {
    override def toString = "\""+chars+"\""
  }

  /** The class of identifier tokens */
  case class Identifier(chars: String) extends Token {
    override def toString = "identifier "+chars
  }

}
