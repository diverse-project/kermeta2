/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior.impl._
import org.kermeta.language.KMLexical
import scala.collection.JavaConversions._

object KExpressionParser extends StandardTokenParsers with KLiteralParser with KQualifiedName {
  override val lexical = new KMLexical

  def parseExpression(content : String) : Option[Expression] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(fStatement)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {
          println(e)
          None

        }
    }
  }


  def pExpression : Parser[Expression] = "(" ~ fStatement ~ ")" ^^ { case _ ~ statment ~ _ => statment }
  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ packageName ~ (("init" ~ fStatement)?) ^^ { case id1 ~ _ ~ name ~ initStat  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      var newtype = BehaviorFactory.eINSTANCE.createTypeReference
      newtype.setName(name)
      newo.setType(newtype)
      initStat match {
        case None =>
        case Some(elseExp)=> elseExp match { case "init"~statm => newo.setInitialization(statm) }
      }
      newo
  }

  def fCall : Parser[CallExpression] = (
    ident ^^ {
      case e =>
        var newo = BehaviorFactory.eINSTANCE.createCallVariable
        newo.setName(e.toString);
        newo
    } |||
    ident ~ "(" ~ (callFeatureParams?) ~ ")" ^^ { case id ~ _ ~ params ~ _ =>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setName(id)
        params match {
          case Some(_ @ par) => for(p <- par) newo.getParameters.add(p)
          case None =>
        }
        newo

    } |||
    ident ~ callFeatureQualifiedName ^^ {
      case id1 ~ callF =>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature;
        newo.setName(id1.toString)
        newo.setTarget(callF)
        newo
    } |||
    ident ~ "(" ~ (callFeatureParams?) ~ ")" ~ callFeatureQualifiedName ^^ { case id ~ _ ~ params ~ _ ~ qualName => {
          var newo = BehaviorFactory.eINSTANCE.createCallFeature
          newo.setName(id)
          params match {
            case Some(_ @ par) => for(p <- par) newo.getParameters.add(p)
            case None =>
          }
          qualName.asInstanceOf[CallFeature].setTarget(newo)
          newo
        }
    })

  private def fLoop : Parser[Expression] = "from" ~ fStatement ~ "until" ~ fStatement ~ "loop" ~ fStatement ~ "end" ^^ { case _ ~ init ~ _ ~ stop ~ _ ~ body ~ _ =>
      var newo = BehaviorFactory.eINSTANCE.createLoop
      newo.setInitialization(init)
      newo.setStopCondition(stop)
      newo.setBody(body)
      newo
  }

  private def fConditional : Parser[Expression] = "if"~fStatement~"then"~fStatement~(("else"~fStatement)?)~"end" ^^ { case _~cond~_~thenBody~elseBody~_=>
      var newo = BehaviorFactory.eINSTANCE.createConditional
      newo.setCondition(cond)
      newo.setThenBody(thenBody)
      elseBody match {
        case None => //NOTHING TO DO
        case Some(_ @ parser) => parser match {
            case "else"~elseBody => newo.setElseBody(elseBody)
          }
      }
      newo
  }

  private def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>
      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getStatement.add(rescueL getOrElse BehaviorFactory.eINSTANCE.createEmptyExpression)
      newo
  }

  
  def fRescueLst = ident ^^^ {BehaviorFactory.eINSTANCE.createEmptyExpression}

  def callFeatureQualifiedName : Parser[CallExpression] =  "." ~ fCall ^^ {case _ ~ subcall => subcall }

  private def callFeatureParams = fStatement ~ callFeatureParam ^^ { case stat ~ statL => List(stat)++statL }
  private def callFeatureParam = (("," ~ fStatement ^^ { case delim ~ stat => stat } )*)






  //def fStatement : Parser[Expression] = (pExpression | fBlock | fVariableDecl | fAssignement | fCall | fLoop | fConditional | fUnaryExpression | fBinaryExpression| fLiteral) // | fConditional | fRaiseException )
  def fStatement : Parser[Expression] = fAssignement // | fConditional | fRaiseException )
  def fExpressionLst : Parser[List[Expression]] = (fStatement+)
  def fPrimitiveExpression : Parser[Expression] = fLiteral | fBlock | pExpression | fVariableDecl | fCall | fLoop | fConditional

  private def fAssignement : Parser[Expression] = fLogicalExpression ~ opt(":=" ~ fLogicalExpression) ^^ { case target ~ statment =>
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
  def fUnaryExpression : Parser[Expression] = (fUnaryOp?) ~ fPrimitiveExpression   ^^ {
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



  /*
   def fBinaryExpression : Parser[Expression] = fStatement ~ binaryOp ~ fStatement ^^ { case stat1 ~ op ~ stat2 =>
   var newo = BehaviorFactory.eINSTANCE.createCallFeature
   newo.setTarget(stat1)
   newo.getParameters.add(stat2)
   op match {
   case "+" => newo.setName("plus")
   case "-" => newo.setName("minus")
   case "and" => newo.setName("and")
   case "or" => newo.setName("or")
   case "*" => newo.setName("mult")
   case "/" => newo.setName("div")
   case "==" => newo.setName("equals")
   case _ =>
   }
   println(newo)
   newo
   }*/


}
