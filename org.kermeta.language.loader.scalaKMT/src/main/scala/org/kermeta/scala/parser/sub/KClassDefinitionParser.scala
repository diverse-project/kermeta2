/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse ClassDefinition in KMt textual syntax
 */
trait KClassDefinitionParser extends KAbstractParser {

  def abstractModifier = ("abstract")?
  def aspectModifier = ("aspect")?
  def classDecl : Parser[ClassDefinition] = aspectModifier ~ abstractModifier ~ "class" ~ ident ~ "{" ~ classMemberDecls ~ "}" ^^ { case aspectM ~ abstractM ~ _ ~ id1 ~ _ ~ members ~ _ =>
      var newo =StructureFactory.eINSTANCE.createClassDefinition
      newo.setName(id1.toString)
      aspectM match {
        case Some(_) =>  newo.setIsAspect(true)
        case None => newo.setIsAspect(false)
      }
      abstractM match {
        case Some(_) => newo.setIsAbstract(true)
        case None => newo.setIsAbstract(false)
      }
      members.foreach{member => {
          member match {
            case m : Constraint => newo.getInv.add(m)
            case m : Operation => {
                newo.getOwnedOperation.add(m);
                newo.getContainedType.add(m.getType) // TODO OPTIMISATION
              }
            case m : Property => newo.getOwnedAttribute.add(m)
            case _ => println("class def add new member type")
          }
        }}
      newo
  }

  private def classMemberDecls = annotableClassMemberDecl +
  private def annotableClassMemberDecl = (annotation?) ~ classMemberDecl ^^ { case e ~ e1 =>
      e match {
        case Some(_ @ annotation) => e1.getOwnedTags.add(annotation)
        case None => //NOTHING TO DO
      }
      e1
  }
  private def annotation : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }

  def classMemberDecl = ( invariant | operation | property | attribute ) //attribute | reference | operation ;

  def invariant = ("inv" ~ ident ~ "is" ~ fStatement ) ^^ { case _ ~ ident ~ _ ~ expr =>
      var newo =StructureFactory.eINSTANCE.createConstraint
      newo.setName(ident)
      newo.setBody(expr)
      newo
  }
  def operation =  ( operationKind ~ ident ~ "(" ~ (operationParameters?) ~ ")" ~ ":" ~ packageName ~ "is" ~ operationExpressionBody) ^^ { case opkind ~ opName ~ _ ~ params ~ _  ~ _ ~ id2 ~ _ ~ body =>
      var newo =StructureFactory.eINSTANCE.createOperation
      opkind match {
        case "operation" => //NOTHING TO DO
        case "method" => /* println("method") SET SUPER OPERATION */
      }
      newo.setName(opName)
      if(body != null) newo.setBody(body)
      params match {
        case Some(_ @ lpara) => for(par <- lpara) newo.getOwnedParameter.add(par)
        case None => // DO NOTHING
      }
      var unresolveType = StructureFactory.eINSTANCE.createUnresolvedType
      unresolveType.setTypeIdentifier(id2)
      newo.setType(unresolveType)
      newo.getContainedType.add(unresolveType)
      newo
  }

  def operationParameter : Parser[Parameter] = ident ~ ":" ~ packageName ^^ { case id ~ _ ~ name =>
      var newo = StructureFactory.eINSTANCE.createParameter
      newo.setName(id)
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newo.getContainedType.add(newtype)
      newtype.setTypeIdentifier(name)
      newo.setType(newtype)
      newo
  }
  def operationParameterss = (("," ~ operationParameter )*) ^^ { case params => for(par <- params) yield par match {case _ ~ p => p} }
  def operationParameters = operationParameter ~ operationParameterss ^^ { case par ~ params => List(par)++params }

  private def operationKind = ("operation" | "method")
  def property = "prop" ^^^ StructureFactory.eINSTANCE.createProperty

  private def operationBody = ("abstract" ^^^ {null} | operationExpressionBody)
  def operationExpressionBody = ( (annotation?) ~ fStatement) ^^ { case a1 ~ exp =>
      a1 match {
        case Some(_ @ tag) => exp.getTag.add(tag)
        case None =>
      }
      exp
  }


  //ATTRIBUTE
  def attribute : Parser[Property] = "attribute" ~> ident ~ ":" ~ packageName ~ propertyBounds ^^ { case id ~ _ ~ name ~ bounds =>
      var newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      newo.setLower(bounds._1)
      newo.setUpper(bounds._2)
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newo.getContainedType.add(newtype)
      newtype.setTypeIdentifier(name)
      newo.setType(newtype)
      newo
  }

  def propertyBounds : Parser[Tuple2[Int,Int]] = "[" ~> numericLit ~ ".." ~ (numericLit | "*" ) <~ "]" ^^{ case lower ~_ ~upper =>
      upper match {
        case "*"=> Tuple2(Integer.parseInt(lower),-1)
        case upper : String => Tuple2(Integer.parseInt(lower),Integer.parseInt(upper))
      }
  }

}
