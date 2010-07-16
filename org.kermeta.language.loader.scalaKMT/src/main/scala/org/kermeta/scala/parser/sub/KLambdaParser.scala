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

/**  */
trait KLambdaParser extends KAbstractParser {

  def fLambda : Parser[Expression] = "{" ~ repsep(ident, ",") ~ "|" ~ fExpression ~ "}" ^^ { 
	  case ob1 ~ params ~ pipe ~ exp ~ cb1 => {
	 	  
	 	  var newLambdaExp = BehaviorFactory.eINSTANCE.createLambdaExpression
	 	  
	 	  params.foreach{pname=> 
	 	  		var newLambdaP = BehaviorFactory.eINSTANCE.createLambdaParameter
	 	  		newLambdaP.setName(pname)
	 	  		newLambdaExp.getParameters.add(newLambdaP)
	 	  }
	 	  
	 	  newLambdaExp.setBody(exp)
		  newLambdaExp
	  }
	  
  }
  
  

}
