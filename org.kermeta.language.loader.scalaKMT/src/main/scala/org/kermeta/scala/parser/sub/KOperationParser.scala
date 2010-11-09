/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure.Parameter
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag

trait KOperationParser extends KAbstractParser with KGenericTypeParser {
  /* SUB PARSER CONTRACT */
  def annotation : Parser[Tag]

  /* END SUB PARSER CONTRACT */

  def operation =  ( operationKind ~ ident ~ "(" ~ repsep(operationParameter,",") ~ ")" ~ ":" ~ genericQualifiedType ~ "is" ~ operationExpressionBody) ^^ { case opkind ~ opName ~ _ ~ params ~ _  ~ _ ~ unresolveType ~ _ ~ body =>
      var newo =StructureFactory.eINSTANCE.createOperation
      opkind match {
        case "operation" => //NOTHING TO DO
        case "method" => /* println("method") SET SUPER OPERATION */
      }
      newo.setName(opName)
      if(body != null) newo.setBody(body)
      
      /*
      params match {
        case Some(_ @ lpara) => for(par <- lpara) newo.getOwnedParameter.add(par)
        case None => // DO NOTHING
      }*/
     params.foreach{par=>
       newo.getOwnedParameter.add(par)
     }


      newo.setType(unresolveType)
      newo.getContainedType.add(unresolveType)
      newo
  }

  def operationParameter : Parser[Parameter] = ident ~ ":" ~ genericQualifiedType ^^ { case id ~ _ ~ unresolveType =>
      var newo = StructureFactory.eINSTANCE.createParameter
      newo.setName(id)
      newo.setType(unresolveType)
      newo.getContainedType.add(unresolveType)
      newo
  }
/*
  def operationParameterss = (("," ~ operationParameter )*) ^^ { case params => for(par <- params) yield par match {case _ ~ p => p} }
  def operationParameters = operationParameter ~ operationParameterss ^^ { case par ~ params => List(par)++params }
*/
  private def operationKind = ("operation" | "method")
  def property = "prop" ^^^ StructureFactory.eINSTANCE.createProperty

  private def operationBody = ("abstract" ^^^ {null} | operationExpressionBody)

  def operationExpressionBody = ( (annotation?) ~ fStatement) ^^ { case a1 ~ exp =>
      a1 match {
        case Some(_ @ tag) => exp.getKTag.add(tag)
        case None =>
      }
      exp
  }

  

}
