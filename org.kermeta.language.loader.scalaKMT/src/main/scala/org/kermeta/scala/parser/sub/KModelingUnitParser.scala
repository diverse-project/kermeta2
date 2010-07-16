/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

trait KModelingUnitParser extends KAbstractParser  {
	
	case class NameSpacePrefix(name : String)
	
	
  /* */
  def classDecl : Parser[ClassDefinition]

  def program = kermetaUnit ^^ { case unit =>
      var newp =StructureFactory.eINSTANCE.createModelingUnit
      unit.foreach{elem => elem match {  	  
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
                case t : Tag => newp.getTag.add(t);newp.getOwnedTags.add(t)
                case r : Require => newp.getRequires.add(r)
                case p : Package => newp.getPackages.add(p)
                case cd : ClassDefinition => newp.getOwnedTypeDefinition.add(cd)
                case _ @ elem => println("unknow elem" + elem)
              }}
          case np : NameSpacePrefix => newp.setNamespacePrefix(np.name)
          case _ @ d => println("TODO modeling unit catch some type sub elem="+d)
        }}
      newp
  }

  def kermetaUnit = scompUnit+

  def scompUnit = (packageDecl|importStmts|usingStmts|topLevelDecl) // TODO ADD ANNOTATION TO ELEM
  /* DEPRECATED */
  
   def packageDecl : Parser[NameSpacePrefix] = "package" ~> packageName ~ ";" ^^ { case p ~ _ => { NameSpacePrefix(p)}}
  private def importStmts = importStmt+
  private def importStmt = "require" ~ packageName ^^ { case _ ~ e =>
      var newo =StructureFactory.eINSTANCE.createRequire
      newo.setUri(e.toString)
      newo
  }
  private def usingStmts = "using" ~ packageName ^^ { case _ ~ name =>
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setQualifiedName(name.toString)
  }

  private def topLevelDecl : Parser[List[Object]] = ((annotation | annotableElement)+) ^^ { case elems =>
      var listAnnotElem : List[Object] = List()
      var listTempTagToAdd : List[Tag] = List()
      for(elem <- elems ){
        elem match {
          case t : Tag => listTempTagToAdd=listTempTagToAdd++List(t)
          case o : Object => {
              listTempTagToAdd.foreach{tag=>o.getTag.add(tag);o.getOwnedTags.add(tag)}
              listAnnotElem = listAnnotElem ++ List(o)
              listTempTagToAdd = Nil
            }
        }
      }
      if(listTempTagToAdd != Nil){ listAnnotElem = listAnnotElem++listTempTagToAdd}
      listAnnotElem
  }

  private def annotation : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }
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
