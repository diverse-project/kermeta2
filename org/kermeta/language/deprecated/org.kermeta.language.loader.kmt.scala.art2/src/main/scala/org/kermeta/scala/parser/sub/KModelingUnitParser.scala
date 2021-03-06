/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional

/**
 * Sub parser dedicated to parse ModelingUnit in KMT textual syntax  
 */
trait KModelingUnitParser extends KAbstractParser with KTagParser with KUsingParser  {
	
  case class NameSpacePrefix(name : String) extends Positional
  case class ExpressionWrapper(expr : Expression) extends Positional
  case class PositionalString(value : String ) extends Positional
	

  /* */
  def classDecl : Parser[ClassDefinition]

  def program = kermetaUnit ^^ { case unit =>
      var newp =StructureFactory.eINSTANCE.createModelingUnit
      var usings : List[Using] = List()
      unit.foreach{elem => elem match {  	  
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
                case t : Tag => newp.getKTag.add(t);newp.getKOwnedTags.add(t)
                case r : Require => newp.getRequires.add(r)
                case p : Package => newp.getPackages.add(p)
                case u : Using => usings = usings ++ List(u) //newp.getUsings.add(u)
                case cd : ClassDefinition => newp.getOwnedTypeDefinition.add(cd)
                case _ @ elem => println("unknow elem" + elem)
              }}
          case np : NameSpacePrefix => newp.setNamespacePrefix(np.name) //; var pos2 = np.pos.asInstanceOf[OffsetPosition] ; println(pos2.productArity+"-"+pos2.source.subSequence(0, pos2.offset.toInt))
          case u : Using => usings = usings ++ List(u)
          case _ @ d => println("TODO modeling unit catch some type sub elem="+d)
        }}
      /* USING POST PROCESS */
      //Add Using clone to all UnresolvedType and UnresolvedCall
      newp.eAllContents.filter(p=> p.isInstanceOf[UnresolvedType] || p.isInstanceOf[UnresolvedCall]).foreach{ut =>
        var localUsings = List() ++ usings.toList //CLONE USING
        localUsings.foreach{lu=>
          var newo =StructureFactory.eINSTANCE.createUsing
          newo.setFromQName(lu.getFromQName)
          newo.setToName(lu.getToName)
          ut match {
            case unresolvedType : UnresolvedType => unresolvedType.getUsings.add(newo)
            case unresolvedCall : UnresolvedCall => unresolvedCall.getUsings.add(newo)
          }
        }
      }
      newp
  }

  def kermetaUnit = scompUnit+

  def scompUnit = (packageDecl|importStmts|usingStmts|topLevelDecl) // TODO ADD ANNOTATION TO ELEM
  /* DEPRECATED */
  
  def packageDecl : Parser[NameSpacePrefix] = positioned( "package" ~> packageName <~ ";" ^^ { case p =>  NameSpacePrefix(p)} )
  private def importStmts = importStmt+
  private def importStmt = "require" ~ ( packageName | stringLit ) ^^ { case _ ~ e =>
      var newo =StructureFactory.eINSTANCE.createRequire
      newo.setUri(e.toString)
      newo
  }




  private def topLevelDecl : Parser[List[Object]] = ((annotation | annotableElement)+) ^^ { case elems =>
      var listAnnotElem : List[Object] = List()
      var listTempTagToAdd : List[Tag] = List()
      for(elem <- elems ){
        elem match {
          case t : Tag => listTempTagToAdd=listTempTagToAdd++List(t)
          case o : Object => {
              listTempTagToAdd.foreach{tag=>o.getKTag.add(tag);o.getKOwnedTags.add(tag)}
              listAnnotElem = listAnnotElem ++ List(o)
              listTempTagToAdd = Nil
            }
        }
      }
      if(listTempTagToAdd != Nil){ listAnnotElem = listAnnotElem++listTempTagToAdd}
      listAnnotElem
  }

  /*
   def annotation : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
   var newo =StructureFactory.eINSTANCE.createTag
   newo.setName(id1.toString)
   newo.setValue(st1.toString)
   newo
   }*/
  def annotableElement = (subPackageDecl | classDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )
  def subPackageDecl = "package" ~ ident ~ "{" ~ (topLevelDecl?) ~ "}" ^^ { case _ ~ packageName ~ _ ~ decls ~ _ =>
      var newp =StructureFactory.eINSTANCE.createPackage
      newp.setName(packageName)
      decls match {
        case Some(_ @ subElem) => subElem.asInstanceOf[List[_]].foreach{elem => elem match {
              case cdef : ClassDefinition => newp.getOwnedTypeDefinition.add(cdef)
              case subPack : Package => newp.getNestedPackage.add(subPack);subPack.setNestingPackage(newp)
              case _ => println("unknow subelem")
            }}
        case None => println("Warning : Empty Package "+newp.getName)
      }
      newp
  }

}
