/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.lexer

import scala.util.parsing.combinator.token.Tokens
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional


trait KTokens extends Tokens {

  abstract case class KToken extends Token with Positional {
    def getOffset = this.pos.asInstanceOf[OffsetPosition].offset
  }

  /** The class of comment tokens */
  case class WHITESPACE extends KToken {
    override def chars = ' '.toString
    override def toString = ' '.toString
  }

  /** The class of comment tokens */
  case class Comment(chars: String) extends KToken {
    override def toString = "//"+chars
  }

  /** The class of comment tokens */
  case class MLComment(chars: String) extends KToken {
    override def toString = "/*"+chars+"*/"
  }
  /** The class of comment tokens */
  case class ERR_MLComment(chars: String) extends KToken {
    override def toString = "/* "+chars+" */"
  }
  /** The class of delim tokens */
  case class Delimiter(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of keyword tokens */
  case class Keyword(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of numeric literal tokens */
  case class NumericLit(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of string literal tokens */
  case class StringLit(chars: String) extends KToken {
    override def toString = "\""+chars+"\""
  }

  /** The class of identifier tokens */
  case class Identifier(chars: String) extends KToken {
    override def toString = chars
  }

}
