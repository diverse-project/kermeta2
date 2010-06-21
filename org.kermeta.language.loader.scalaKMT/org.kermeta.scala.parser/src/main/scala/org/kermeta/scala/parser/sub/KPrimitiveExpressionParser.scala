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

trait KPrimitiveExpressionParser extends KAbstractParser {

   // override def fStatement : Parser[Expression] = fAssignement
   //override def fStatement : Parser[Expression] = fLiteral | fBlock | pExpression | fVariableDecl | fCall | fLoop | fConditional


    def fAssignement : Parser[Expression] = fLogicalExpression ~ opt(":=" ~ fLogicalExpression) ^^ { case target ~ statment =>
      statment match {
        case Some(e) => {
            var newo = BehaviorFactory.eINSTANCE.createAssignment //TODO CHECK CALL FEATURE
            newo.setTarget(target.asInstanceOf[CallExpression])
            e match {
              case ":=" ~ t => newo.setValue(t)
            }
            newo
          }
        case None => target
      }
  }

  def fLogicalExpression : Parser[Expression] = fRelationalExpression ~ rep(fLogicalOp ~ fRelationalExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setTarget(result)
        bexpp match {
          case "and" ~ e => newo.setName("and");newo.getParameters.add(e)
          case "or" ~ e => newo.setName("or");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fLogicalOp = "and" | "or"
  def fRelationalExpression : Parser[Expression] = fAddExpression ~ rep(fRelationalOp ~ fAddExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setTarget(result)
        bexpp match {
          case "==" ~ e => newo.setName("equals");newo.getParameters.add(e)
          case "!=" ~ e => newo.setName("dif");newo.getParameters.add(e)
          case "<" ~ e => newo.setName("inf");newo.getParameters.add(e)
          case ">" ~ e => newo.setName("sup");newo.getParameters.add(e)
          case "<=" ~ e => newo.setName("infeq");newo.getParameters.add(e)
          case ">=" ~ e => newo.setName("supeq");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fRelationalOp = "==" | "!=" | "<" | ">" | "<=" | ">="
  def fAddExpression : Parser[Expression] = fMultExpression ~ rep(fAddOp ~ fMultExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setTarget(result)
        bexpp match {
          case "+" ~ e => newo.setName("plus");newo.getParameters.add(e)
          case "-" ~ e => newo.setName("minus");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fAddOp = "+" | "-"
  def fMultExpression : Parser[Expression] = fUnaryExpression ~ rep(fMultOp ~ fUnaryExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setTarget(result)
        bexpp match {
          case "*" ~ e => newo.setName("mult");newo.getParameters.add(e)
          case "/" ~ e => newo.setName("div");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fMultOp = "*" | "/"
  def fUnaryExpression : Parser[Expression] = (fUnaryOp?) ~ fExpression   ^^ {
    case op ~ stat => {
        op match {
          case Some(op) => {
              var newo = BehaviorFactory.eINSTANCE.createCallFeature
              newo.setTarget(stat)
              op match {
                case "!" => newo.setName("not")
                case "-" => newo.setName("minus")
              }
              newo
            }
          case None => stat
        }
      }
  }
  def fUnaryOp = "!" | "-"

}
