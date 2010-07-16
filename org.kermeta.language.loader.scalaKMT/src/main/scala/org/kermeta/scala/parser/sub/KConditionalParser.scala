/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

trait KConditionalParser extends KAbstractParser {

    def fConditional : Parser[Expression] = "if"~fStatement~"then"~fStatement~(("else"~fStatement)?)~"end" ^^ { case _~cond~_~thenBody~elseBody~_=>
      var newo = BehaviorFactory.eINSTANCE.createConditional
      newo.setCondition(cond)
      newo.setThenBody(thenBody)
      elseBody match {
        case None => //NOTHING TO DO
        case Some(_ @ parser) => parser match {
            case "else"~elseBody => newo.setElseBody(elseBody)
          }
      }
      newo
  }

}
