/* $Id: KStructuralParser.scala 14622 2011-03-11 17:11:36Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Block
import org.kermeta.language.behavior.CallResult
import org.kermeta.language.behavior.CallSuperOperation
import org.kermeta.language.behavior.Expression
import org.kermeta.language.behavior.Literal
import org.kermeta.language.behavior.Rescue
import org.kermeta.language.behavior.SelfExpression
import org.kermeta.language.behavior.UnresolvedCall
import org.kermeta.language.structure.StructureFactory

/**
 * Sub parser dedicated to parse Block and Expression lists (using parenthesis) in KMT textual syntax
 */
trait KStructuralParser extends KAbstractParser {

  def fExpressionExpressionWithCallParser = Parser {
    in =>
    val elems = new ListBuffer[Expression]
    val p0 = fExpression // avoid repeatedly re-evaluating by-name parser
    @tailrec def applyp(in0: Input): ParseResult[List[Expression]] =
      p0(in0) match {
        case Success(x, rest) => {
            x match {


              case self: SelfExpression => {
                  if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }

              case cf: Literal => {
                  if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }
              case cf: CallResult => {
                  if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }

              case block : Block => {
                if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
              }

              case cf: UnresolvedCall if (cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                  elems += x;
                  applyp(rest)
                }
              case cf: UnresolvedCall if (!cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                  if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }
              case cf: CallSuperOperation if (!cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                  if (elems.size == 0) {
                    elems += x;
                    applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }
              case _@e => {
                  if (elems.size > 0) {
                    Success(elems.toList, in0)

                  } else {
                    elems += x;
                    Success(elems.toList, rest)
                  }


                  //SI ELEMS > 0
                  // SUCESS
                  // otherwise
                  //  NoSucess
                }
            }
          }
        case ns: NoSuccess => {


            if (elems.size > 0) {
              //Success((), in)
              Success(elems.toList, in0)
            } else {
              ns
            }
          }
      }

    applyp(in)
  }


  /**
   * Parses a one or several expressions but returns only one expression. This method thus link the input
   * expressions.
   */
  def fExpressionMergedCall: Parser[Expression] = fExpressionExpressionWithCallParser ^^ {
    case l =>
      var previousUnresolvedCall: Option[UnresolvedCall] = None
      var processedList: List[Expression] = List()
      // navigate the original list in the reverse order and rebuild a list with the correct exprseeion,
      // recreate a hierachy for Calls that must be nested in the target of another expression
      //println(l.size + " " + l.mkString("\n"))
      l.reverse.foreach(p => {
          p match {
            case cf: UnresolvedCall if (cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                previousUnresolvedCall match {
                  case None => previousUnresolvedCall = Some(cf); processedList = cf :: processedList
                  case Some(pe) => pe.setTarget(cf); previousUnresolvedCall = Some(cf)
                }
              }
            case _@e => {
                previousUnresolvedCall match {
                  case None => processedList = e :: processedList
                  case Some(pe) => pe.setTarget(e); previousUnresolvedCall = None
                }
              }

          }

        })
      if (processedList.size > 1) {
        println("fail")
        println(processedList.mkString)
        failure("Chain expression failed !")
      }
      processedList.head
  }

  /*  def fExpressionMergedCall : Parser[Expression] = fCall ^^ {
   case _@e => e
   }*/


  /**
   * Parses a list of statements and expressions that can contain unresolved and unlinked calls. THis method
   * also contains a process to link these unresolved calls.
   */
  def fExpressionLst: Parser[List[Expression]] = rep(fStatement) ^^ {
    case list =>
      /* POST PROCESS, LINK UnresolvedCall to each other */
      var previousUnresolvedCall: Option[UnresolvedCall] = None
      var processedList: List[Expression] = List()
      // navigate the original list in the reverse order and rebuild a list with the correct expression,
      // recreate a hierarchy for Calls that must be nested in the target of another expression
      list.toList.reverse.foreach(p => {
          p match {
            case cf: UnresolvedCall if (cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                previousUnresolvedCall match {
                  case None => previousUnresolvedCall = Some(cf); processedList = cf :: processedList
                  case Some(pe) => pe.setTarget(cf); previousUnresolvedCall = Some(cf)
                }
              }
            case _@e => {
                previousUnresolvedCall match {
                  case None => processedList = e :: processedList
                  case Some(pe) => pe.setTarget(e); previousUnresolvedCall = None
                }
              }
          }
        })
      processedList
  }

  def pExpression: Parser[Expression] = "(" ~> fStatement <~ ")"

  def fBlock: Parser[Expression] = fSimpleBlock | fRescueBlock
  
  def fSimpleBlock: Parser[Expression] = "do" ~> fExpressionLst <~ "end" ^^ {
    case expL  =>

      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo
  }
  
  def fRescueBlock: Parser[Expression] = "do" ~> fExpressionLst ~ fRepRescue ^^ {
    case expL ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getRescueBlock.addAll(rescueL)
      newo
  }

  def fRepRescue: Parser[List[Rescue]] = "rescue" ~> rep(fRescueRescue) ~ fRescueEnd ^^ {
    case resLst ~ endElem => {
      resLst match{
        case Nil => List(endElem)
        case _  => resLst :+ endElem
      }
    }
  }
  /*def fRescue: Parser[Rescue] = "rescue" ~ "(" ~> ident ~ ":" ~ packageName ~ ")" ~ fExpressionLst ^^ {
    case rIdent ~ _ ~ rPname ~ _ ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createRescue
      newo.setExceptionName(rIdent)
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newtype.setTypeIdentifier(rPname)
      newtyperef.setName(rPname)
      newtyperef.setType(newtype)
      newtyperef.getContainedType.add(newtype)
      newo.setExceptionType(newtyperef)
      newo.getBody.addAll(rescueL)

      newo
  }*/
  
  def fRescueRescue: Parser[Rescue] = "(" ~> ident ~ ":" ~ packageName ~ ")" ~ fExpressionLst <~ "rescue" ^^ {
    case rIdent ~ _ ~ rPname ~ _ ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createRescue
      newo.setExceptionName(rIdent)
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newtype.setTypeIdentifier(rPname)
      newtyperef.setName(rPname)
      newtyperef.setType(newtype)
      newtyperef.getContainedType.add(newtype)
      newo.setExceptionType(newtyperef)
      newo.getBody.addAll(rescueL)

      newo
  }
  
  def fRescueEnd: Parser[Rescue] = "(" ~> ident ~ ":" ~ packageName ~ ")" ~ fExpressionLst <~ "end"^^ {
    case rIdent ~ _ ~ rPname ~ _ ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createRescue
      newo.setExceptionName(rIdent)
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newtype.setTypeIdentifier(rPname)
      newtyperef.setName(rPname)
      newtyperef.setType(newtype)
      newtyperef.getContainedType.add(newtype)
      newo.setExceptionType(newtyperef)
      newo.getBody.addAll(rescueL)

      newo
  }

  private def attributeBound : Parser[Tuple2[Int,Int]] = "[" ~ ( numericLit | "*" ) ~ "]" ^^ { case _ ~ bound ~ _ =>
      bound match {
        case "*" => (0,-1)
        case s : String => (Integer.parseInt(s),Integer.parseInt(s))
      }

  }
  private def biattributeBounds : Parser[Tuple2[Int,Int]] = "[" ~> numericLit ~ ".." ~ (numericLit | "*" ) <~ "]" ^^{ case lower ~_ ~upper =>
      upper match {
        case "*" => Tuple2(Integer.parseInt(lower),-1)
        case upperS : String => Tuple2(Integer.parseInt(lower),Integer.parseInt(upperS))
      }
  }

  def attributeBounds = ( biattributeBounds | attributeBound )



}
