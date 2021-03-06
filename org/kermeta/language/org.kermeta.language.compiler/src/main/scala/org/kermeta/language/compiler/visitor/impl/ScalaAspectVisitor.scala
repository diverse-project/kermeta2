package org.kermeta.language.compiler.visitor.impl

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler._
import org.kermeta.language.compiler.aspects.sub._
import org.kermeta.language.compiler.visitor._
import scala.collection.JavaConversions._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

class ScalaAspectVisitor extends IVisitor {
	
  def visit(par : ModelingUnit){
    par.getPackages().foreach(p => p.accept(this))
  }

  def visit(par : Package){
    var actualPackage = par.getQualifiedName
    if (Util.doesGeneratePackage(actualPackage)){
      var subTask = new ScalaAspectPackageVisitorRunnable
      VisitorAsyncUtility.runAfter(par,subTask)
      par.getNestedPackage.foreach(p=> {p.accept(this)})
    }
  }
 
  def visit(par : ClassDefinition){Console.println("multithread error")}
	
  def init(){}
	
  def close(){}
	
}

class ScalaAspectPackageVisitorRunnable extends IVisitor  {

  def visit(par : ModelingUnit){Console.println("multithread error")}
	
  var actualPackage : String = ""
	
  def visit(par : Package){
    actualPackage = par.getQualifiedName
    par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinition].accept(this))
    par.getOwnedTypeDefinition filter(p => p.isInstanceOf[Enumeration]) foreach(p=> p.asInstanceOf[EnumerationAspect].generateEnum())
  }
	
  def visit(par : ClassDefinition){
    if (!Util.hasCompilerIgnoreTag(par)){

      var genpackageName : StringBuilder= new StringBuilder
      //var packageName : StringBuilder= new StringBuilder

      // println(par.eContainer.asInstanceOf[PackageAspect].getQualifiedNameCompilo)

      genpackageName.append(TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[Package].getQualifiedNameCompilo))
	
      //og.error("AspectVisitor ClassDef Gen | {} | {}",genpackageName.toString,par.eContainer.asInstanceOf[PackageAspect].getQualifiedNameNoRoot)
			
      if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
        //genpackageName.append("ScalaAspect")
        genpackageName.insert(0, GlobalConfiguration.scalaAspectPrefix+".")
      }
      //packageName.append(genpackageName.toString)
      //packageName.append(".")
			
      var res : StringBuilder = new StringBuilder
      res.append("package "+Util.protectScalaKeyword(genpackageName.toString)+"\n")
      res.append("import _root_.kermeta.io._\n")
      res.append("import _root_.kermeta.standard._\n")
      res.append("import _root_.kermeta.standard.JavaConversions._\n")
      res.append("import _root_.kermeta.standard.PrimitiveConversion._\n")
      par.generateScalaCode(res)
      Util.generateFile(genpackageName.toString, par.getName+"Aspect", res.toString())
      if (!Util.hasEcoreTag(par)){
        var res1 : StringBuilder = new StringBuilder

        res1.append("package "+Util.protectScalaKeyword(genpackageName.toString)+"\n")
        res1.append("trait ")
        res1.append(par.getName())
				
        par.generateParamerterClass(res1);

        if(par.getSuperType.size > 0){
          if(!par.getSuperType().first.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo.equals("kermeta.language.structure.Object")){
            //log.debug("SuperTypefound="+ par.getSuperType().first.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)
            var listSuperTypes = par.getSuperType()
            var i = 0
            for(a <- listSuperTypes){
              if(i == 0) { res1.append(" extends ") } else { res1.append(" with ") }
              res1.append(Util.protectScalaKeyword("_root_."+Util.getQualifiedNamedBase(a.asInstanceOf[Class].getTypeDefinition)))
              par.generateBindingParamerterClass(a.asInstanceOf[Class],res1)
              i = i + 1
            }
          }
        }

        //GENERATE METHOD SIGNATURE
        res1.append("{\n")
        par.getOwnedOperation.foreach{op : Operation =>
          op.generateSignature(res1)
        }
        res1.append("}\n")
        /*
         par.getOwnedAttribute.foreach{at : Attribute

         }
         */
        //GENERATE ATTRIBUTE SIGNATURE

        //res1.append("trait " + par.getName + " extends "+superQualifiedName+" with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect")
        Util.generateFile(genpackageName.toString, par.getName, res1.toString())
      }
    }
  }
	
  def init(){}
	
  def close(){}
	
}
