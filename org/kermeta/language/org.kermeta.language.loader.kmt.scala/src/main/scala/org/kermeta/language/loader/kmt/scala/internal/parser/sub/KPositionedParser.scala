/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional

import org.kermeta.language.structure.KermetaModelElement
import org.kermeta.language.structure.StructureFactory

trait KPositionedParser extends KAbstractParser {

  def addPosition(modelElem: KermetaModelElement,posToken : Positional,posTokenEnd : Positional, tokenLength : Integer) : KermetaModelElement = {
    var newtag= StructureFactory.eINSTANCE.createTag
    newtag.setName("traceability_text_reference")

    /*
    println("---------------")
    println("Adding position for " + modelElem)
    println("postoken="+posToken)
    println("postoken.pos="+posToken.pos)
    println("postoken.pos.asInstanceOf[OffsetPosition]="+posToken.pos.asInstanceOf[OffsetPosition])
    println("postokenEnd="+posTokenEnd)
    println("postokenEnd.pos="+posTokenEnd.pos)
    println("postokenEnd.pos.asInstanceOf[OffsetPosition]="+posTokenEnd.pos.asInstanceOf[OffsetPosition])
      */

    //println(modelElem + "----"+ posToken)
    
    var beginOffset = posToken.pos.asInstanceOf[OffsetPosition].offset
    var endOffset = posTokenEnd.pos.asInstanceOf[OffsetPosition].offset + tokenLength - 1
    //println(posToken+"="+beginOffset+"=>"+endOffset+"="+posTokenEnd)
    
    //posToken.pos.asInstanceOf[OffsetPosition].

    //newtag.setValue(posToken.pos.line.toString + ";" + posToken.pos.column.toString+";"+posTokenEnd.pos.line.toString + ";" + posTokenEnd.pos.column.toString)
    
    newtag.setValue(beginOffset.toString + ";" + endOffset.toString)
    
    modelElem.getKOwnedTags.add(newtag)
    newtag.getObject().add(modelElem) // make sure to create a correct tag
    modelElem
  }
  
  def kpositioned[T](p : Parser[T]) : Parser[T] = Parser { in =>
    p(in) match {
      case Success(x,rest) => {
          var positionedResult = x
          in.first match {
            case positionedToken : Positional => { 
                x match {
                  case me : KermetaModelElement => {
                      
                	  val limit = rest.offset
                	  
                      var currentRest = in.rest
                      while(!currentRest.atEnd && currentRest.rest.offset < limit){
						currentRest = currentRest.rest
                      }
                	  var currentToken = currentRest.first
                      
                      currentToken match {
                        case positionedEndToken : Positional => {
									 var endTokenlength = currentToken.toString.length
                            positionedResult = addPosition(me,positionedToken,positionedEndToken,endTokenlength).asInstanceOf[T]  
                     }
                        case _ => //positionedResult = addPosition(me,positionedToken).asInstanceOf[T]
                      }
                      
                    }
                  case _ @ e=> println("PositionedToken which is not a KermetaModelElement : " +e)
                }
              }
              Success(positionedResult,rest)
          }
        }
      case _ @ e => e
    }
  }  
}
