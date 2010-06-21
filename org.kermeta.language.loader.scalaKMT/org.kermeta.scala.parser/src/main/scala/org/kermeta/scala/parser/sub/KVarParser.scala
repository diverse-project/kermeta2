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

trait KVarParser extends KAbstractParser {

  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ packageName ~ (("init" ~ fStatement)?) ^^ { case id1 ~ _ ~ name ~ initStat  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      var newtype = BehaviorFactory.eINSTANCE.createTypeReference
      newtype.setName(name)
      newo.setType(newtype)
      initStat match {
        case None =>
        case Some(elseExp)=> elseExp match { case "init"~statm => newo.setInitialization(statm) }
      }
      newo
  }

}
