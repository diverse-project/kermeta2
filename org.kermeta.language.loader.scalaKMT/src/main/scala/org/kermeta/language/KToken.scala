/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language

class TOKEN_CATEG extends Enumeration {
  val WHITESPACE, KEYWORD, SEPARATOR, IDENTIFIER, COMMENT = Value
}
object TOKEN_CATEGS extends TOKEN_CATEG

case object TOKENCATEG_WHITESPACE
case object TOKENCATEG_COMMEN

case class KToken(value : String , categ : TOKEN_CATEG) 
