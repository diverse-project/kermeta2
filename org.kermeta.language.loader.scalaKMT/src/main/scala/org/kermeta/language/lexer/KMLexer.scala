/* $Id: FixPackageNSUri.java,v 1.12 2008-03-19 16:34:14 cfaucher Exp $
 * Project    : .loader.scalaKMTorg.kermeta.language
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 12 dec. 2004
 * Authors : 
 *           Francois Fouquet 
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
