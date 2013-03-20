/* $Id: KConditionalParser.scala 14584 2011-03-09 16:53:49Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.collection.JavaConversions._

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

/**
 * Sub parser dedicated to parse Conditional expression in KMT textual syntax
 */
trait KConditionalParser extends KAbstractParser {


  def fConditional : Parser[Expression] = "if"~fStatement~"then"~opt(optionalBlock)~lastBlock ^^ { case _~cond~_~optBody~lastBody=>
      var newo = BehaviorFactory.eINSTANCE.createConditional
      newo.setCondition(cond)

		optBody match{		
			case None => newo.setThenBody(lastBody)
			case Some(_ @ thenBody) =>{
				newo.setThenBody(thenBody)
				newo.setElseBody(lastBody)
			}
		}
      newo
  }

  def lastBlock : Parser[Expression] = fExpressionLst<~"end" ^^{
    case list =>
 		var newThenBlock = BehaviorFactory.eINSTANCE.createBlock
      newThenBlock.getStatement.addAll(list)
		newThenBlock
  }
  def optionalBlock : Parser[Expression] = fExpressionLst<~"else" ^^{
    case list =>
 		var newThenBlock = BehaviorFactory.eINSTANCE.createBlock
      newThenBlock.getStatement.addAll(list)
		newThenBlock
  }
}
