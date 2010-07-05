/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

class ParseException extends Throwable {

  var line : Int = _
  var colonne : Int = _
  var errMsg : String = _

}
