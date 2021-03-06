package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import _root_.k2.utils.ReflexivityLoader
import org.eclipse.emf.common.util.EList
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._
import java.util.ArrayList
import org.kermeta.compilo.scala.visitor.impl.UtilModelTypeDefinition

trait ClassDefinitionAspect extends ObjectVisitor {

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

  def visitClassDefinition(thi: ClassDefinition, res: StringBuilder, compilerConfiguration: CompilerConfiguration): Unit = {
    res.append("import " + "_root_." + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")
    if (Util.hasEcoreTag(thi) && !Util.isAMapEntry(thi)) {
      res.append("trait ")
      res.append(thi.getName())
      res.append("Aspect")
      generateTypeParameterForClassDefinitionWithBounds(thi, res)
      if (thi.getSuperType.size == 0) {
        res append " extends "
        res.append("_root_.k2.standard.KermetaObject")

        //res append Util.protectScalaKeyword(/*k2.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(*/getQualifiedNameCompilo(thi))

      } else {
        var i = 0;
        thi.getSuperType.foreach(superC => {
          if (i == 0) {
            res.append(" extends ")
          } else {
            res.append(" with ")
          }

          var ty: GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition

          res.append(Util.protectScalaKeyword(getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition)))
          generateBindingParamerterClass(thi, superC.asInstanceOf[Class], res)
          i = i + 1
        })

        // res append " with "+ /*org.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(*/getQualifiedNameCompilo(thi)
      }

      //MODELTYPEADDITION
      //Add extends with Model Type interfaces
      if (UtilModelTypeDefinition.isReferencedByModelTypeDefinition(thi)) {
        res.append(" with ")
        res.append(Util.getModelTypeInterfaceQualifiedName(thi))

        UtilModelTypeDefinition.getTypeDefinitionDirectBindings(thi) match {
          case Some(s) => {
            s.foreach(cb => {
              res.append(" with ")
              res.append(Util.getModelTypeInterfaceQualifiedName(cb))
            })
          }
          case None =>
        }
      }

      var param: StringBuilder = new StringBuilder
      generateTypeParameterForClassDefinition(thi, param)
      if (!Util.hasEcoreFromAPITag(thi)) {
        res append " with " + Util.protectScalaKeyword("_root_." + getPQualifiedNamedBase(thi) + param.toString)
      } else
        res.append(" with " + Util.protectScalaKeyword("_root_." + getQualifiedNameCompilo(thi.eContainer)) + ".itf." + thi.getName() + "Itf" + param.toString)

      res.append("{\n")

      //MODELTYPEADDITION
      //Add fixed type members from Model Type interfaces
      if (UtilModelTypeDefinition.isReferencedByModelTypeDefinition(thi)) {
        var mm = Util.getMetamodel(thi)
        if (Util.needToAddFixedTypeMembers(thi, mm)) {
          res.append(UtilModelTypeDefinition.getFixedTypeMembers(mm))
        }
        res.append("\n")
        setImplementingModelTypeInterface(true)
        thi.getOwnedAttribute foreach (a => visit(a, res))
        res.append("\n")
        thi.getOwnedOperation filter (op => !Util.hasEcoreTag(op)) foreach (op => visit(op, res))
        res.append("\n")
        
        UtilModelTypeDefinition.getOperationsFromMatchedClassDefinitions(thi) match {
          case Some(s) => s.foreach(op => {
            visit(op, res)
          })
          case None =>
        }
        
        setImplementingModelTypeInterface(false)
      }
      
      thi.getOwnedAttribute foreach (a => visit(a, res))
      thi.getOwnedOperation filter (op => !Util.hasEcoreTag(op) || op.getBody != null) foreach (op => visit(op, res))

      this.generateInvariants(thi, res)
      this.generategetQualifiedName(thi, res, compilerConfiguration)
      res.append("}\n")

    } else if (Util.hasEcoreTag(thi) && Util.isAMapEntry(thi)) {
      this.generateMapEntryWrapper(thi, res, compilerConfiguration)
    } else {
      res.append("trait ")
      res.append(thi.getName())
      res.append("Aspect")
      generateTypeParameterForClassDefinition(thi, res)

      if (thi.getSuperType.size == 0) {
        //TODO extends a superClassAspect
      } else {
        res.append(" ")

        var i = 0;
        thi.getSuperType.foreach(superC => {
          if (i == 0) {
            res.append(" extends ")
          } else {
            res.append(" with ")
          }

          res.append("_root_." + getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
          generateBindingParamerterClass(thi, superC.asInstanceOf[Class], res)
          i = i + 1
        })
      }
      res append " with " + Util.protectScalaKeyword("_root_." + getQualifiedNamedBase(thi))
      generateTypeParameterForClassDefinition(thi, res)

      //MODELTYPEADDITION
      //Add extends with Model Type interfaces
      if (UtilModelTypeDefinition.isReferencedByModelTypeDefinition(thi)) {
        res.append(" with ")
        res.append(Util.getModelTypeInterfaceQualifiedName(thi))

        UtilModelTypeDefinition.getTypeDefinitionDirectBindings(thi) match {
          case Some(s) => {
            s.foreach(cb => {
              res.append(" with ")
              res.append(Util.getModelTypeInterfaceQualifiedName(cb))
            })
          }
          case None =>
        }
      }

      res.append("{\n")

      //MODELTYPEADDITION
      //Add fixed type members from Model Type interfaces
      if (UtilModelTypeDefinition.isReferencedByModelTypeDefinition(thi)) {
        var mm = Util.getMetamodel(thi)
        if (Util.needToAddFixedTypeMembers(thi, mm)) {
          res.append(UtilModelTypeDefinition.getFixedTypeMembers(mm))
        }
        res.append("\n")
        setImplementingModelTypeInterface(true)        
        thi.getOwnedAttribute foreach (a => visit(a, res))
        res.append("\n")
        thi.getOwnedOperation filter (op => !Util.hasEcoreTag(op)) foreach (op => visit(op, res))
        res.append("\n")
        setImplementingModelTypeInterface(false)
      }

      thi.getOwnedAttribute foreach (a => visit(a, res))
      thi.getOwnedOperation filter (op => !Util.hasEcoreTag(op)) foreach (op => visit(op, res))

      /* Generate Invariants */
      this.generateInvariants(thi, res)
      this.generategetQualifiedName(thi, res, compilerConfiguration)

      res.append("}\n")
    }
  }

  //MODELTYPE ADDITION
  def generateInitializeOperation(thi: ClassDefinition, res: StringBuilder) = {
    var first: Boolean = true
    //Signature and body of the operation initializeFactories
    var resSig: StringBuilder = new StringBuilder
    var resBody: StringBuilder = new StringBuilder
    //Variables to be assigned by the operation initializeFactories
    var resVar: StringBuilder = new StringBuilder
    resSig.append("def initializeFactories(")
    thi.getTypeParameter().foreach(param => {
      if (param.isInstanceOf[ModelTypeVariable]) {
        if (first) {
          first = false
        } else {
          resSig.append(", ")
        }
        //Variables declaration
        resVar.append("\tvar ")
        resVar.append(Util.getModelTypeFactoryParameterVariableName(param.asInstanceOf[ModelTypeVariable]))
        resVar.append(" : ")
        resVar.append(Util.getModelTypeFactoryTypeName())
        resVar.append(" = null\n")
        //Operation signature
        resSig.append(Util.getModelTypeFactoryParameterVariableName(param.asInstanceOf[ModelTypeVariable]))
        resSig.append(" : ")
        resSig.append(Util.getModelTypeFactoryTypeName())
        //Operation body (assignment of parameters to variables)
        resBody.append("this.")
        resBody.append(Util.getModelTypeFactoryParameterVariableName(param.asInstanceOf[ModelTypeVariable]))
        resBody.append(" = ")
        resBody.append(Util.getModelTypeFactoryParameterVariableName(param.asInstanceOf[ModelTypeVariable]))
      }
    })
    resSig.append(") = {\n")
    resSig.append()

    if (!first) {
      res.append(resVar)
      res.append(resSig)
      res.append(resBody)
    }

  }

  def generategetQualifiedName(thi: ClassDefinition, res: StringBuilder, compilerConfiguration: CompilerConfiguration) = {
    var qualifiedName = ReflexivityLoader.qualifiedName(thi)
    res.append("  override def getMetaClass():_root_.org.kermeta.language.structure.Class={\n")
    res.append("    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass(\"" + qualifiedName + "\"); \n")
    res.append("    if (cd !=null){ \n")
    res.append("       var cl = _root_." + compilerConfiguration.kermetaStandardMMName + ".org.kermeta.language.structure." + GlobalConfiguration.factoryName + ".createClass \n")
    res.append("       cl.setTypeDefinition(cd) \n")
    res.append("      return cl \n")
    res.append("    } else \n")
    res.append("      return null; \n")
    res.append("  }\n")

  }

  def generateInvariants(thi: ClassDefinition, res1: StringBuilder) = {
    var listInv = this.getAllInvariants(thi)

    if (listInv.size() > 0) {
      res1.append("  override def checkInvariants(stopOnError : Boolean){\n")
      res1.append("    val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
      var i = 0
      listInv.filter(b => !Util.hasCompilerIgnoreTag(b)).foreach(a => {
        if (i != 0) res1.append(",")
        res1.append("(")
        res1.append("\"" + a.getName + "\" -> (()=>")
        visit(a, res1)
        res1.append("))")
        i = i + 1
      })
      res1.append(" )\n")
      res1.append("if(stopOnError)\n  checkParamInvariants(invariants)\n"
        + "else\n  checkParamInvariants(invariants, constraintDiagnostic)\n")
      /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
      //res.append("checkParamInvariants(super.getInvariants)\n")
      res1.append("}\n")
      /* End checkInvariants Generation  */

      res1.append("override def checkAllInvariants(stopOnError : Boolean){\n")
      res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
      i = 0
      listInv.filter(b => !Util.hasCompilerIgnoreTag(b)).foreach(a => {
        if (i != 0) res1.append(",")
        res1.append("(")
        res1.append("\"" + a.getName + "\" -> (()=>")
        visit(a, res1)
        res1.append("))")
        i = i + 1
      })
      res1.append(" )\n")
      res1.append("if(stopOnError)\n  checkParamInvariants(invariants)\n"
        + "else\n  checkParamInvariants(invariants, constraintDiagnostic)\n")
      /* Calling checkAllInvariants on composite properties */
      thi.getOwnedAttribute().foreach(att =>
        if (att.getIsComposite()) {
          if (att.getUpper() > 1 || att.getUpper() == -1)
            res1.append(GlobalConfiguration.scalaPrefix + att.getName() + ".each(e=>\n  if(e!=null)\n    e.checkAllInvariants(stopOnError))\n")
          else
            res1.append("if("+ GlobalConfiguration.scalaPrefix + att.getName() + "!=null)\n  "
              + GlobalConfiguration.scalaPrefix + att.getName() + ".checkAllInvariants(stopOnError)\n")
        })
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
      listInv.filter(b => !Util.hasCompilerIgnoreTag(b)).foreach(a => {
        if (i != 0) res1.append(",")
        res1.append("(")
        res1.append("\"" + a.getName + "\" -> (()=>")
        visit(a, res1)
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

  /**
   * Returns all the invariant of this ClassDefinition including inherited ones
   */
  def getAllInvariants(thi: ClassDefinition): java.util.List[Constraint] = {
    var result = new ArrayList[Constraint]()
    result.addAll(thi.getInv)
    thi.getSuperType.foreach { st =>
      st match {
        case cd: Class => {
          result.addAll(getAllInvariants(cd.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition]))
        }
        case _ => println("TOTO " + st)
      }
    }
    return result
  }

  /**
   * Returns all the operation of this ClassDefinition including inherited ones
   */
  def getAllOperations(thi: ClassDefinition): java.util.List[Operation] = {
    var result = new ArrayList[Operation]()
    result.addAll(thi.getOwnedOperation())
    thi.getSuperType.foreach { st =>
      st match {
        case cd: Class => {
          result.addAll(getAllOperations(cd.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition]))
        }
        case _ => println("TOTO " + st)
      }
    }
    return result
  }

  def generateTypeParameterForClassDefinition(thi: ClassDefinition, res1: StringBuilder) = {
    if (thi.getTypeParameter().size() > 0) {
      var i = 0
      var res: StringBuilder = new StringBuilder
      res.append("[")
      thi.getTypeParameter().foreach { param =>
        if (!param.isInstanceOf[ModelTypeVariable]) {
          if (i > 0)
            res.append(",")
          res.append(getQualifiedNameCompilo(param))
          i = i + 1
        }
      }
      res.append("]")
      if (i > 0) {
        res1.append(res)
      }
    }
  }
  
  def generateTypeParameterForClassDefinitionWithBounds(thi: ClassDefinition, res1: StringBuilder) = {
    if (thi.getTypeParameter().size() > 0) {
      var i = 0
      var res: StringBuilder = new StringBuilder
      res.append("[")
      thi.getTypeParameter().foreach { param =>
        if (!param.isInstanceOf[ModelTypeVariable]) {
          if (i > 0)
            res.append(",")
          res.append(getQualifiedNameCompilo(param))
          if (param.getSupertype() != null) {
            res.append(" <: ")
            res.append(getQualifiedNameCompilo(param.getSupertype()))
          }
          i = i + 1
        }
      }
      res.append("]")
      if (i > 0) {
        res1.append(res)
      }
    }
  }
  
  def generateBindingParamerterClass(thi: ClassDefinition, superC: Class, res1: StringBuilder) = {
    if (superC.getTypeParamBinding().size() > 0) {
      res1.append("[")
      var ii = 0;
      superC.getTypeParamBinding.foreach { binding =>
        if (ii > 0) { res1.append(",") }
        visit(binding.getType, res1)
        ii = ii + 1
      }
      res1.append("]")
    }
  }

   def generateBindingParameterClass(c : org.kermeta.language.structure.Class, res : StringBuilder) = {
    if (c.getTypeParamBinding().size() > 0) {
      res.append("[")
      var i = 0;
      c.getTypeParamBinding.foreach { binding =>
        if (i > 0) { res.append(",") }
        visit(binding.getType, res)
        i = i + 1
      }
      res.append("]")
    }
  }
  
  def generateMapEntryWrapper(thi: ClassDefinition, res: StringBuilder, compilerConfiguration: CompilerConfiguration) = {
    res.append("class ")
    res.append(thi.getName())
    res.append("( self : ")

    res.append(Util.getQualifiedNameForMapEntry(thi, this.asInstanceOf[PackageVisitor], true))
    //            _root_.org.eclipse.emf.ecore.EObject,_root_.p1.A]            
    res append ") extends "
    res.append("_root_.k2.standard.KermetaObject")
    //res append Util.protectScalaKeyword(fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(getQualifiedNameCompilo(thi)))                
    var param: StringBuilder = new StringBuilder
    res append " with k2.standard.EObjectImplForPrimitive "

    res.append("{\n")
    res.append("  var wrappedvalue = self\n")

    thi.getOwnedAttribute foreach (a => visit(a, res))
    thi.getOwnedOperation filter (op => !Util.hasEcoreTag(op) || op.getBody != null) foreach (op => visit(op, res))
    this.generateInvariants(thi, res)
    this.generategetQualifiedName(thi, res, compilerConfiguration)
    res.append("}\n")

  }

}
