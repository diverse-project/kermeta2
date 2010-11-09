/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.UnresolvedType
import scala.collection.JavaConversions._

trait KGenericTypeParser extends KAbstractParser {
  /* PUBLIC METHOD */
  def genericQualifiedType : Parser[UnresolvedType] = packageName ~ opt(genericParams) ^^{case qname ~ optParams =>
      var newType =StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(qname)
      optParams match {
        case None =>
        case Some(gparams) => newType.getGenerics.addAll(gparams)
      }
      newType
  }

  private def genericParams : Parser[List[UnresolvedType]] = "<" ~ rep1sep(genericQualifiedType,",") ~ ">" ^^{case _ ~ params ~ _ => params }

}
