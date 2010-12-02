/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test

import fr.irisa.triskell.kermeta.compilo.scala.loader._
import fr.irisa.triskell.kermeta.language.structure._

import scala.collection.JavaConversions._

object Main {

    var classdefs :java.util.List[ClassDefinition]=new java.util.ArrayList[ClassDefinition]()



    def main(args : Array[String]) : Unit = {
  
        kermeta.utils.ReflexivityLoader.loadKmModel("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.output/resources/Reflexivity.km").foreach(e=>
            if (e.isInstanceOf[ClassDefinition])
                classdefs .add(e.asInstanceOf[ClassDefinition])
        )
        var selectedclassdefs = classdefs.filter(e=> kermeta.utils.ReflexivityLoader.qualifiedName(e) .equals("kermeta.language.structure.Class"))
        var selectedclassdefs1 = classdefs.filter(e=> kermeta.utils.ReflexivityLoader.qualifiedName(e) .equals("kermeta.language.structure.ClassDefinition"))
        
        var cl = fr.irisa.triskell.kermeta.language.structure.StructureFactory.eINSTANCE.createClass
            if (selectedclassdefs.size>0){
                println(selectedclassdefs.size)
            cl.setTypeDefinition(selectedclassdefs.get(0));
        }
        var cl1 = fr.irisa.triskell.kermeta.language.structure.StructureFactory.eINSTANCE.createClass

        if (selectedclassdefs1.size>0){
                println(selectedclassdefs1.size)
            cl1.setTypeDefinition(selectedclassdefs1.get(0));
        }
        println(""+this.isSuperTypeOf(cl,cl1))
    }

    def isSuperTypeOf(this1 : fr.irisa.triskell.kermeta.language.structure.Type,cl : fr.irisa.triskell.kermeta.language.structure.Type):Boolean = {
        if (!this1.isInstanceOf[Class] )
            return false
        else
        {
            if (!cl .isInstanceOf[Class]){
                return false
            }
            var thisclass : Class =this1.asInstanceOf[Class]
            var clclass : Class = cl.asInstanceOf[Class]
            
         /*   if (_root_.utils.UTilScala.getQualifiedNameClass( clclass.asInstanceOf[Class].getTypeDefinition).equals(_root_.utils.UTilScala.getQualifiedNameClass(thisclass.getTypeDefinition) ))
                return true
            else
                return clclass.getTypeDefinition.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ClassDefinition].getSuperType.exists(e=> this.isSuperTypeOf(this1,e))
        */    return false
        }

    }

   }
