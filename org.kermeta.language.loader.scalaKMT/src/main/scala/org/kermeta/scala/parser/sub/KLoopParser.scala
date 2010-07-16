/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

trait KLoopParser extends KAbstractParser {

  def fLoop : Parser[Expression] = "from" ~ fStatement ~ "until" ~ fStatement ~ "loop" ~ fStatement ~ "end" ^^ { case _ ~ init ~ _ ~ stop ~ _ ~ body ~ _ =>
      var newo = BehaviorFactory.eINSTANCE.createLoop
      newo.setInitialization(init)
      newo.setStopCondition(stop)
      newo.setBody(body)
      newo
  }

}
