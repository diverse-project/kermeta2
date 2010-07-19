/* $Id: KClassDefinitionParser.scala 11789 2010-07-19 09:20:19Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser.sub

import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import org.kermeta.language.KMLexical
import scala.collection.JavaConversions._

/**
 * Common part of all Sub parsers
 */
trait KAbstractParser extends StandardTokenParsers {
  override val lexical = new KMLexical

  def fStatement : Parser[Expression]
  def fExpression : Parser[Expression] = fLiteral
  def fLiteral : Parser[Expression]
  def packageName : Parser[String]

}
