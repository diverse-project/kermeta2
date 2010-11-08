/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure.Property
import org.kermeta.language.structure.StructureFactory

trait KAttributeParser extends KAbstractParser {

  def attribute : Parser[Property] = "attribute" ~> ident ~ ":" ~ packageName ~ attributeBounds ^^ { case id ~ _ ~ name ~ bounds =>
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

  def attributeBounds : Parser[Tuple2[Int,Int]] = "[" ~> numericLit ~ ".." ~ (numericLit | "*" ) <~ "]" ^^{ case lower ~_ ~upper =>
      upper match {
        case "*"=> Tuple2(Integer.parseInt(lower),-1)
        case upper : String => Tuple2(Integer.parseInt(lower),Integer.parseInt(upper))
      }
  }

}
