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

trait KExpressionParser extends KAbstractParser
                           with KStructuralParser
                           with KQualifiedNameParser
                           with KVarParser
                           with KConditionalParser
                           with KLiteralParser
                           with KLoopParser
                           with KCallParser
                           with KPrimitiveExpressionParser {

  override def fExpression : Parser[Expression] = fLiteral | fBlock | pExpression | fVariableDecl | fCall | fLoop | fConditional
  override def fStatement : Parser[Expression] = fAssignement

  def parseExpression(content : String) : Option[Expression] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(fStatement)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {println(e);None}
    }
  }

}
