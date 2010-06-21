/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

trait KQualifiedNameParser extends KAbstractParser {

  def packageName : Parser[String] = ident ~ packageQualifiedName ^^ { case id ~ q => id+q  }
  def packageQualifiedName : Parser[String] =  (( "::" ~ ident )*) ^^ { case lId =>
      (for(idp <- lId) yield idp match {case _ ~ ident => "::"+ident.toString}).mkString
  }


}
