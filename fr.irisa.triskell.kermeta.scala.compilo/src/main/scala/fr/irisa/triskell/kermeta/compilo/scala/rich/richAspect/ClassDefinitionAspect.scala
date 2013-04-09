package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import _root_.kermeta.utils.ReflexivityLoader
import org.antlr.stringtemplate.StringTemplate
import org.eclipse.emf.common.util.EList
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import java.util.ArrayList


trait ClassDefinitionAspect extends ObjectVisitor{
	

	
    /*class BAspect(wrappee:test.B) extends AAspect(wrappee) {
	
	override def foo() : B ={
	  return null;
	}
   
	 def fuu() : B ={
	  return null;
	} 
    
	 override  def getWrappee() : test.B = {
	  return wrappee;
	} 
}*/
    
    
     def visitClassDefinition(thi: ClassDefinition,res : StringBuilder) : Unit = {
        res.append("import "+ "_root_."+ GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n")
        if (Util.hasEcoreTag(thi)&& !Util.isAMapEntry(thi)){
            res.append("trait ")
            res.append(thi.getName())
            res.append("Aspect")
            generateParamerterClass(thi,res)
            if (thi.getSuperType.size == 0){
              res append " extends "
                res append Util.protectScalaKeyword(fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(getQualifiedNameCompilo(thi)))
                
            } else {
                var i = 0;
                thi.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }
					
                        var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						
                       res.append(Util.protectScalaKeyword(getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition)))
                        generateBindingParamerterClass(thi,superC.asInstanceOf[Class],res)
                        i=i+1
                    })
				
                res append " with "+ fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(getQualifiedNameCompilo(thi))
            }
            
            var param : StringBuilder = new  StringBuilder
            generateParamerterClass(thi,param)
            if (!Util.hasEcoreFromAPITag(thi)){                
                res append " with "+Util.protectScalaKeyword("_root_."+getQualifiedNamedBase(thi) + param.toString)                
            }
            else
                res.append(" with "+Util.protectScalaKeyword("_root_."+getQualifiedNameCompilo(thi.eContainer)) + ".itf."+ thi.getName() +"Itf" + param.toString)
	    
            res.append("{\n")

				
				
            thi.getOwnedAttribute foreach(a=> visit(a,res))
            thi.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> visit(op,res))
            this.generateInvariants(thi,res)
            this.generategetQualifiedName(thi,res)
            res.append("}\n")

        }
        else if(Util.hasEcoreTag(thi)){
          this.generateMapEntryWrapper(thi,res)
        }
        else{
            res.append("trait ")
            res.append(thi.getName())
            res.append("Aspect")
            generateParamerterClass(thi,res)

            if (thi.getSuperType.size == 0){
                //TODO extends a superClassAspect
            }else{
                res.append(" ")
				
                var i = 0;
                thi.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }

            res.append("_root_."+getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
                        generateBindingParamerterClass(thi,superC.asInstanceOf[Class],res)
                        i=i+1
                    })
            }
            res append " with "+Util.protectScalaKeyword("_root_."+getQualifiedNamedBase(thi))
            res.append("{\n")

            thi.getOwnedAttribute foreach(a=> visit(a,res))
            thi.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> visit(op,res))
            
				
            /* Generate Invariants */
            this.generateInvariants(thi,res)
            this.generategetQualifiedName(thi,res)
      

            res.append("}\n")
        }
    }


    def generategetQualifiedName(thi:ClassDefinition,res:StringBuilder) = {
        var qualifiedName = ReflexivityLoader.qualifiedName(thi)
        var template = new StringTemplate("override def getMetaClass():_root_.fr.irisa.triskell.kermeta.language.structure.Class={\n var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   _root_.kermeta.utils.ReflexivityLoader.getMetaClass(\"$ClassName$\"); \n         if (cd !=null){ \n var cl = "+fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".fr.irisa.triskell.kermeta.language.structure."+GlobalConfiguration.factoryName+".createClass \n cl.setTypeDefinition(cd) \n return cl \n }else \n return null; \n }\n")
        template.setAttribute("ClassName", qualifiedName)
        res.append(template.toString)
    }

    def generateInvariants(thi:ClassDefinition,res1:StringBuilder) = {
        var listInv = this.getAllInvariants(thi)

        if(listInv.size() > 0){
            res1.append("override def checkInvariants(){\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
            var i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                    visit(a,res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("checkParamInvariants(invariants)\n")
            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")
            /* End checkInvariants Generation  */

            res1.append("override def checkAllInvariants(){\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
             i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                    visit(a,res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("checkParamInvariants(invariants, constraintDiagnostic)\n")
            
            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")

            res1.append("override def getInvariants() :  scala.collection.immutable.HashMap[String,Condition] = {\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
             i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                   visit(a,res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("return invariants\n")

            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")

        }
    }

    def getAllInvariants(thi:ClassDefinition) : java.util.List[Constraint] =  {
        var result = new ArrayList[Constraint]()
      result.addAll(thi.getInv)
        thi.getSuperType.foreach{st =>
            st match {
                case cd:Class => {
                            result.addAll(getAllInvariants(cd.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition]))
                    }
                case _ => println("TOTO " + st)
            }
        }
        return result
    }
	

	
    def generateParamerterClass(thi:ClassDefinition,res1:StringBuilder) = {
        if (thi.getTypeParameter().size()>0){
            var i = 0
            res1.append("[")
            thi.getTypeParameter().foreach{param =>
                if (i>0)
                    res1.append(",")
                res1.append(getQualifiedNameCompilo(param))
                i=i+1
            }
            res1.append("]")
        }
    }
    def generateBindingParamerterClass(thi:ClassDefinition,superC:Class,res1:StringBuilder) = {
        if (superC.getTypeParamBinding().size()>0){  res1.append("[")
                                                   var ii = 0;
                                                   superC.getTypeParamBinding.foreach{binding=>
                if (ii>0) {res1.append(",")}
                visit(binding.getType,res1)
                ii= ii+1
            }
                                                   res1.append("]")
        }
    }
    
    def generateMapEntryWrapper(thi: ClassDefinition,res : StringBuilder)={
                  res.append("class ")
            res.append(thi.getName())
            res.append("( self : ")

            res.append(Util.getQualifiedNameForMapEntry(thi,this.asInstanceOf[PackageVisitor],true))
//            _root_.org.eclipse.emf.ecore.EObject,_root_.p1.A]            
            res append ") extends "
            res append Util.protectScalaKeyword(fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(getQualifiedNameCompilo(thi)))                
            var param : StringBuilder = new  StringBuilder
            res append " with kermeta.standard.EObjectImplForPrimitive "                
	    
            res.append("{\n")
            res.append("\tvar wrappedvalue = self\n")
            
				
				
            thi.getOwnedAttribute foreach(a=> visit(a,res))
            thi.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> visit(op,res))
            this.generateInvariants(thi,res)
            this.generategetQualifiedName(thi,res)
            res.append("}\n")

        }
    
    
}