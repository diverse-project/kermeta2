/* $Id: KExpressionParser.scala 14616 2011-03-11 12:09:18Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser

import org.kermeta.language.behavior.Expression
import org.kermeta.language.loader.kmt.scala.internal.parser.sub._
import org.kermeta.language.behavior.Rescue

/**
 * Parser of Kermeta expression in KMT textual syntax
 *
 */
trait KExpressionParser extends KAbstractParser
                           with KStructuralParser
                           with KQualifiedNameParser
                           with KVarParser
                           with KConditionalParser
                           with KLiteralParser
                           with KLoopParser
                           with KCallParser
                           with KPrimitiveExpressionParser
                           with KLambdaParser
                           with KRaiseParser
                           with KPositionedParser
                           with KExternParser {

  /**
   * extend the fExpression parser with sub parser
   */
  override def fExpression : Parser[Expression] =  positionedfExpression | fBlock |   fVariableDecl
  def positionedfExpression : Parser[Expression] = kpositioned ( fExtern | fRaise | pExpression  | fLoop | fConditional | fLambda |  fCall | fLiteral )
  override def fStatement : Parser[Expression] = kpositioned (fAssignement)

  override def optionalBlock : Parser[Expression] = kpositioned(super.optionalBlock)
  override def lastBlock : Parser[Expression] = kpositioned(super.lastBlock)
  
  override def loopBody : Parser[Expression] = kpositioned(super.loopBody)
  
  override def fRescueRescue : Parser[Rescue] = kpositioned(super.fRescueRescue)
  override def fRescueEnd : Parser[Rescue] = kpositioned(super.fRescueEnd)
  
  override def fLambda : Parser[Expression] = kpositioned(super.fLambda)
  override def lambdaBody : Parser[Expression] = kpositioned(super.lambdaBody)

  def parseExpression(content : String) : Option[Expression] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase( fStatement)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {println(e);None}
    }
  }

}
