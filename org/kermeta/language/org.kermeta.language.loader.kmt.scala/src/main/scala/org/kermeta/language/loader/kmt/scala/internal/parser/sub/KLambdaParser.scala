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

import scala.collection.JavaConversions._

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression
import org.kermeta.language.behavior.LambdaParameter
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Type
import org.kermeta.language.structure.UnresolvedType

/**
 * Sub parser dedicated to parse Lambda expression in KMT textual syntax
 */
trait KLambdaParser extends KAbstractParser {

  def fLambda : Parser[Expression] = "{" ~ repsep(lambdaProperty, ",") ~ "|" ~ lambdaBody ^^ {
    case _ ~ params ~ _ ~ body  => {

        var newLambdaExp = BehaviorFactory.eINSTANCE.createLambdaExpression

        params.foreach{prop=>
          newLambdaExp.getParameters.add(prop)
        }

        newLambdaExp.setBody(body)
        newLambdaExp
      }

  }
  
  def lambdaBody : Parser[Expression] = fExpressionLst <~ "}" ^^{
    case body =>{
      var newBlock = BehaviorFactory.eINSTANCE.createBlock
      newBlock.getStatement.addAll(body)
      newBlock
    }
  }


  def lambdaProperty : Parser[LambdaParameter] = ident ~ opt(":" ~> genericQualifiedType)  ^^ {
    case id ~ qualifName => {
      var newLambdaP = BehaviorFactory.eINSTANCE.createLambdaParameter
      newLambdaP.setName(id)

      var newTypeRef = BehaviorFactory.eINSTANCE.createTypeReference
      qualifName match {
        case Some(paramType) => {
          if(paramType.isInstanceOf[UnresolvedType])
            newTypeRef.setName(paramType.asInstanceOf[UnresolvedType].getTypeIdentifier())
          newTypeRef.setType(paramType)
          newTypeRef.getContainedType.add(paramType)
        }
        case None => {
          // no type provided, we must indicates that it must be inferred
          var unresolvedParamType  = StructureFactory.eINSTANCE.createUnresolvedInferredType()
          newTypeRef.setType(unresolvedParamType)
          newTypeRef.getContainedType.add(unresolvedParamType)
        }

      }
       newLambdaP.setType(newTypeRef)
      newLambdaP
    }
  }


  def lambdaType : Parser[Type] = "<" ~ ( lambdaTypeParam | lambdaSingleTypeParam )  ~ "->" ~ genericQualifiedType ~ ">" ^^ {case _ ~ params ~ _ ~ res ~ _ =>
      var newType = StructureFactory.eINSTANCE.createFunctionType
      newType.getContainedType.add(res)
      var left = StructureFactory.eINSTANCE.createProductType
      newType.getContainedType.add(left)
      left.getType.addAll(params)
      newType.setLeft(left)
      newType.setRight(res)

      left.getContainedType.addAll(params)

      newType
  }

  def lambdaSingleTypeParam : Parser[List[UnresolvedType]] = packageName ^^{ case name =>
      var newType = StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(name)
      List(newType)
  }
  def lambdaTypeParam : Parser[List[Type]] = "[" ~ repsep(genericQualifiedType,",") ~ "]" ^^ { case _ ~ unresolvedType ~ _ =>
    unresolvedType
  }




}
