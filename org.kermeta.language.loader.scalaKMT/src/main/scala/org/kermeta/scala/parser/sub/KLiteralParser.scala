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

trait KLiteralParser extends KAbstractParser {

  def fLiteral : Parser[Expression] = (fVoidLiteral|fStringLiteral|fBooleanLiteral|fNumericLiteral)
  def fBooleanLiteral : Parser[Expression] = ("true" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral;newo.setValue(true)
      newo
    } | "false" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral;newo.setValue(false)
      newo
    } )
  private def fVoidLiteral : Parser[Expression] = ( "Void" ) ^^^ { BehaviorFactory.eINSTANCE.createVoidLiteral }
  private def fStringLiteral : Parser[Expression] = ( stringLit ^^ { case e => var newo =BehaviorFactory.eINSTANCE.createStringLiteral;newo.setValue(e.toString);newo  } )
  private def fNumericLiteral : Parser[Expression] = ( numericLit ^^ { case e => var newo =BehaviorFactory.eINSTANCE.createIntegerLiteral;newo.setValue(e.toInt);newo  } )

}
