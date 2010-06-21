/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

import org.kermeta.scala.parser.sub.KExpressionParser
import scala.io.Source

object Runner{

  def main(args: Array[String]): Unit = {
    //val input = Source.fromFile(new java.io.File("sample.kmt")).getLines("\n").reduceLeft[String](_ + '\n' + _)
    val input = Source.fromFile(new java.io.File("expressionBloc.kmt")).getLines().reduceLeft[String](_ + '\n' + _)

    var result = KExpressionParser.parseExpression(input)
    // var result = org.kermeta.language.POC.test(input)
    
    result match {
      //case Some(_ @ res )=> println(res)
      //case Some(_ @ res) => LoadSaveKM.saveKmModelingUnit("parsed.km", res) //new Interpreter(res).run
      case Some(_ @ res) =>{


          LoadSaveKM.saveKmExpression("parsed.km", res)
        }
      case None =>
    }
  }
}
