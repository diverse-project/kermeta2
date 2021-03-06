/* $Id:  $
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

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Type
import org.kermeta.language.structure.UnresolvedType

trait KGenericTypeParser extends KAbstractParser with KLambdaParser {
  /* PUBLIC METHOD */
  def genericQualifiedType : Parser[Type] = lambdaType | genericQualifiedTypeObject


  def genericQualifiedTypeObject : Parser[UnresolvedType] = packageName ~ opt(genericParams) ^^{case qname ~ optParams =>
      var newType =StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(qname)
      optParams match {
        case None =>
        case Some(gparams) => {
          newType.getGenerics.addAll(gparams)
          newType.getContainedType.addAll(gparams)
        }
      }
      newType
  }

  def genericParams : Parser[List[Type]] = genericParamsWithChevrons | genericParamsWithBrackets
  def genericParamsWithChevrons : Parser[List[Type]] = "<" ~ rep1sep(genericQualifiedType,",") ~ ">" ^^{case _ ~ params ~ _ => params }
  def genericParamsWithBrackets : Parser[List[Type]] = "[" ~ rep1sep(genericQualifiedType,",") ~ "]" ^^{case _ ~ params ~ _ => params }

}
