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

trait KStructuralParser extends KAbstractParser {

  def fExpressionLst : Parser[List[Expression]] = (fStatement+)
  def pExpression : Parser[Expression] = "(" ~> fStatement <~ ")"

  def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>
      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getStatement.add(rescueL getOrElse BehaviorFactory.eINSTANCE.createEmptyExpression)
      newo
  }

  def fRescueLst = ident ^^^ {BehaviorFactory.eINSTANCE.createEmptyExpression}
  
}
