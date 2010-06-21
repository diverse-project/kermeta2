/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

import org.kermeta.scala.parser.sub.KAbstractParser
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior.impl._
import org.kermeta.scala.parser.sub._
import scala.collection.JavaConversions._

class KParser extends KExpressionParser
                 with KModelingUnitParser
                 with KClassParser  {

  def parse(content : String) : Option[ModelingUnit] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(program)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {
          println(e)
          lastNoSucess = Some(e)
          None
        }
    }
  }

  var lastNoSucess : Option[NoSuccess] = None

  def getErrors : Option[ParseException] = {
    lastNoSucess match {
      case Some(err) => {
          val pos = err.next.pos
          var except = new ParseException
          except.line = pos.line
          except.colonne = pos.column
          except.errMsg = err.msg
          return Some(except)
        }
      case None => None
    }

  }


}
