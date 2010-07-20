/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.lexer

import scala.util.parsing.combinator.lexical.Scanners

class KMLexer(content : String) extends KMLexical {

  var tokens = new this.Scanner(content)

  def nextToken : Token = {
    var tok = tokens.first
    tokens = tokens.rest

    /*
    val retoken = tok match {
      case v : Keyword => KToken(v.chars,TOKEN_CATEG.KEYWORD)
      case v : Identifier => KToken(v.chars,TOKEN_CATEG.IDENTIFIER)
      case v : StringLit => KToken(v.chars,TOKEN_CATEG.STRINGLIT)
      case v @ _ => println("uncatch_element="+v.toString);null
    }
    retoken*/
   tok
  }

  def atEnd = tokens.atEnd

}
