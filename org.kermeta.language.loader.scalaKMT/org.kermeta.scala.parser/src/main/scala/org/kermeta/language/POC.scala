/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language

import org.kermeta.scala.parser.sub.KLiteralParser
import scala.util.parsing.combinator.syntactical._

object POC extends StandardTokenParsers with KLiteralParser {
  override val lexical = new KMLexical



  // def sum : Parser[String] = repsep(expr,"+") ^^ { case e=> e.toString }
  def sum : Parser[String] = expr ~ "+" ~ expr ^^ { case e=> e.toString }
  def expr = fLiteral | sum          //top level expression

  def parse(s:String) = {
    val tokens = new lexical.Scanner(s)
    phrase(expr)(tokens)
  }

  def apply(s:String) = {
    parse(s) match {
      case Success(tree, _) => tree
      case e: NoSuccess =>
        throw new IllegalArgumentException("Bad syntax: "+s)
    }
  }

  //Simplify testing
  def test(exprstr: String) = {
    parse(exprstr) match {
      case Success(tree, _) =>
        println("Tree: "+tree)
      case e: NoSuccess => Console.err.println(e)
    }
  }

  //A main method for testing
  def main(args: Array[String]) = test(args(0))
}