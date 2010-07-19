/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language

class KMLexer(content : String) extends KMLexical {

  var tokens = new this.Scanner(content)

  def nextToken : KToken = {
    var ret = tokens.first
    tokens = tokens.rest

    println(ret)

    null

  }

  def atEnd = tokens.atEnd


}
