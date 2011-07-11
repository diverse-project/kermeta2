/* $Id: KLambdaParser.scala 13969 2010-12-23 12:16:40Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import org.kermeta.language.loader.kmt.scala.internal.parser.KmBuildHelper
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse Lambda expression in KMT textual syntax
 */
trait KLambdaParser extends KAbstractParser {

  def fLambda : Parser[Expression] = "{" ~ repsep(ident, ",") ~ "|" ~ fExpressionLst ~ "}" ^^ {
    case ob1 ~ params ~ pipe ~ exps ~ cb1 => {
	 	  
        var newLambdaExp = BehaviorFactory.eINSTANCE.createLambdaExpression
	 	 
        params.foreach{pname=>
          var newLambdaP = BehaviorFactory.eINSTANCE.createLambdaParameter
          newLambdaP.setName(pname)
          newLambdaExp.getParameters.add(newLambdaP)
        }
	var newBlock = BehaviorFactory.eINSTANCE.createBlock
        newBlock.getStatement.addAll(exps)
        newLambdaExp.setBody(newBlock)
        newLambdaExp
      }
	  
  }

  def lambdaType : Parser[Type] = "<" ~ ( lambdaTypeParam | lambdaSingleTypeParam )  ~ "->" ~ packageName ~ ">" ^^ {case _ ~ params ~ _ ~ res ~ _ =>
      var newType = StructureFactory.eINSTANCE.createFunctionType
      var unresolveType = KmBuildHelper.getOrCreateUnresolvedType(newType,res) //StructureFactory.eINSTANCE.createUnresolvedType
      //unresolveType.setTypeIdentifier(res)
      newType.setKType(unresolveType)
      //newType.getContainedType.add(unresolveType)
      //newType.getType.addAll(params)
      var left = StructureFactory.eINSTANCE.createProductType
      newType.getContainedType.add(left)
      left.getType.addAll(params) 
      newType.setLeft(left)
      newType.setRight(unresolveType)
      
      left.getContainedType.addAll(params)

      newType
  }

  def lambdaSingleTypeParam : Parser[List[UnresolvedType]] = packageName ^^{ case name =>
      var newType = StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(name)
      List(newType)
  }
  def lambdaTypeParam : Parser[List[UnresolvedType]] = "[" ~ rep1sep(packageName,",") ~ "]" ^^ { case _ ~ unresolvedType ~ _ =>
      for(name <- unresolvedType) yield {
        var newType = StructureFactory.eINSTANCE.createUnresolvedType
        newType.setTypeIdentifier(name)
        newType
      }
  }

  
  

}
