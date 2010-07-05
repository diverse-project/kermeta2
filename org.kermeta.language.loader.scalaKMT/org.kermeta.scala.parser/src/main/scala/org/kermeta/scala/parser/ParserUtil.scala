/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

import scala.io.Source

object ParserUtil {

  def loadFile(uri : String) : String = {

    var res = new StringBuilder
    Source.fromFile(uri).getLines.foreach{l=> res.append(l);res.append("\n")}
    res.toString

  }

}
