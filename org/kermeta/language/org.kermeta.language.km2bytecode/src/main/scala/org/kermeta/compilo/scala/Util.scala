/* Util.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package org.kermeta.compilo.scala

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.util.ModelingUnit
import java.io.File
import java.io.IOException
import java.util._
import scala.collection.JavaConversions._
import java.util.concurrent.Executors
import java.util.concurrent.ExecutorService
import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._
import org.eclipse.emf.ecore.EObject
import scala.collection.mutable.HashMap$

object Util extends LogAspect {
  /**
   * Check if a model element has an Ecore Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore".equals(e.asInstanceOf[Tag].getName()))
  }

  def hasNoEcoreRenameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "NOECORERENAME".equals(e.asInstanceOf[Tag].getName()))
  }
  

  /**
   * Check if a model element has a Main Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasMainTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "main".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * @return the value of the main tag
   */
  def getMainTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "main".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }

  /**
   * Check if a model element has an ecore.EDataType_instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreEDataTypeInstanceClassNameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore.EDataType_instanceClassName".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an ecore.EDataType_instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def getEcoreEDataTypeInstanceClassNameTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "ecore.EDataType_instanceClassName".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }

  /**
   * Check if a model element has an ecore.instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreInstanceClassNameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore.instanceClassName".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an ecore.instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def getEcoreInstanceClassNameTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "ecore.instanceClassName".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }

  def isAMapEntry(obj: ClassDefinition): Boolean = {
    !obj.getName().equals("EStringToStringMapEntryAspect") &&
      !obj.eContainer().asInstanceOf[Package].getName().equals("ecore") &&
      //hasEcoreTag(obj) && 
      hasEcoreInstanceClassNameTag(obj) && getEcoreInstanceClassNameTag(obj).equals("java.util.Map$Entry") &&
      //obj.getOwnedAttribute().size() == 2 && 
      obj.getOwnedAttribute().exists(e => e.getName() == "key") &&
      obj.getOwnedAttribute().exists(e => e.getName() == "value")
  }

  def getQualifiedNameForMapEntry(par: ClassDefinition, visitor: ObjectVisitor, firstpass: Boolean): String = {
    var res1 = new StringBuilder
    //    	    if (par.getOwnedAttribute().filter(e => e.getName().equals("value")).get(0).getUpper().equals(1))
    if (firstpass)
      res1.append("java.util.Map.Entry[") //
    else
      res1.append("org.eclipse.emf.common.util.EMap[")

    var typekey = par.getOwnedAttribute().filter(e => e.getName.equals("key")).get(0).getType
    var typevalue = par.getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType
    var typekeystring: String = null
    var typevaluestring: String = null
    if (Util.isAMapEntry(typekey)) {
      typekeystring = getQualifiedNameForMapEntry(typekey.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, true)
    } else {
      typekeystring = visitor.getQualifiedNameCompilo(typekey)
    }
    if (Util.isAMapEntry(typevalue)) {
      if (par.getOwnedAttribute().filter(e => e.getName().equals("value")).get(0).getUpper().equals(1)) {
        typevaluestring = getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, true)
      } else {
        typevaluestring = getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, false)
      }
    } else {
      typevaluestring = visitor.getQualifiedNameCompilo(typevalue)
    }

    res1.append(typekeystring)
    res1.append(",")
    res1.append(typevaluestring)
    res1.append("]")
    return res1.toString

  }

  def isAMapEntry(obj: Type): Boolean = {
    if (obj.isInstanceOf[Class])
      return isAMapEntry(obj.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition])
    else
      return false
  }

  /**
   * Check if a model element has an EcoreFromAPI Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */

  def hasEcoreFromAPITag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "ecoreFromAPI".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * Check if a model element has an CompilerIgnore tag
   * @param obj model element to test
   * @return true if CompilerIgnore tag is found
   */
  def hasCompilerIgnoreTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "CompilerIgnore".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * Check if a model element has an ScalaCompilerName tag
   * @param obj model element to test
   * @return true if ScalaCompilerName tag is found
   */
  def hasScalaCompilerNameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "ScalaCompilerName".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an ScalaCompilerName Tag
   * @param obj model element to test
   * @return the value of the tag
   */
  def getScalaCompilerNameTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "ScalaCompilerName".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }
  /**
   * Utility method, generate src file
   * @param repName Target directory name, sub directory separated by .
   * @param fileName Target file name without extension
   * @param content Target file content
   */
  def generateScalaFile(repName: String, fileName: String, content: String) {
    generateFile(GlobalConfiguration.outputFolder, repName, fileName + ".scala", content)
  }
  
  /**
   * Utility method, generate src file
   * @param repName Target directory name, sub directory separated by .
   * @param fileName Target file name without extension
   * @param content Target file content
   */
  def generateJavaFile(repName: String, fileName: String, content: String) {
    generateFile(GlobalConfiguration.javaOutputFolder, repName, fileName + ".java", content)
  }
  
   /**
   * Utility method, generate src file
   * @param repName Target directory name, sub directory separated by .
   * @param fileName Target file name with its extension
   * @param content Target file content
   */
  def generateFile(outputFolder : String,  repName: String, fileName: String, content: String) {
    // println("REPNAME="+repName+"-"+fileName)
    var f: java.io.File = new java.io.File(outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator))
    if (!f.exists()) f.mkdirs
    var f1: java.io.File = new java.io.File(outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName )
    var output: java.io.FileOutputStream = new java.io.FileOutputStream(f1)
    var writer: java.io.PrintWriter = new java.io.PrintWriter(output)
    writer.println(content)
    writer.flush
    writer.close
    output.close
  }
  

  def cleanFolder(repName: String) {
    if (repName != null) {
      var f: java.io.File = new java.io.File(repName)
      if (f != null) {
        cleanFolder(f)
      } else {
        log.debug("Cleaning : folder : {} ,not exist", repName)
      }
    }
  }

  def cleanFolder(f: java.io.File) {
    if (f.exists()) {
      var children = f.list
      for (i <- 0 until children.length) {
        var subF = new java.io.File(f + java.io.File.separator + children(i))
        if (subF.isDirectory) {
          cleanFolder(subF)
        } else {
          subF.delete
        }
      }
      f.delete()
    } else {
      log.debug("Cleaning : folder : {} ,not exist", f.getName())
    }
  }

  val keywords = scala.List("implicit", "match", "requires", "type", "var", "abstract", "do", "finally", "import", "object", "throw", "val", "case", "else", "for", "lazy", "override", "return", "trait", "catch", "extends", "forSome", "match", "package", "sealed", "try", "while", "class", "false", "if", "new", "private", "super", "true", "with", "def", "final", "implicit", "null", "protected", "this", "yield", "_", ":", "=", "=>", "<-", "<:", "<%", ">:", "#", "@")
  val badChar = scala.List("_")
  def protectScalaKeyword(value: String): String = {
    var returnString = new StringBuilder
    var splittedVal = new RichIterable(value.split('.'))
    splittedVal.foreachCtx((e, ctx) => {
      if (!ctx.isFirst) { returnString.append(".") }
      if (badChar.exists({ p => e.contains(p) }) || keywords.exists(p => p.equals(e))) {
        returnString append "`" + e + "`"
        //log.debug("Reserved Scala Keyword : {}, backquote protection : ",e)
      } else {
        returnString append e
      }
    })
    return returnString.toString
  }

  /*
     def getProtectedQualifiedName(p : Package) : String = {
     var genpackageName = _root_.k2.utils.TypeEquivalence.getPackageEquivalence(p.getQualifiedNameCompilo)
     if (Util.hasEcoreTag(p)){
     //problem qualifiedname can finish by `
     if(genpackageName.endsWith("`")){
     genpackageName = genpackageName.substring(0, genpackageName.size-1)
     genpackageName = genpackageName + "ScalaAspect"
     genpackageName = genpackageName + "`"
     } else {
     genpackageName = genpackageName + "ScalaAspect"
     }
     }
     return genpackageName.toString
     }
     */

  def getImplPackageSuffix(packName: String): String = {
    if ("org.eclipse.uml2.uml".equals(packName) || (GlobalConfiguration.scalaAspectPrefix + ".org.eclipse.uml2.uml").equals(packName) || "uml".equals(packName.toString))
      return ".internal.impl."
    else { //println("toto "+ packName)
      return ".impl."
    }
  }

  def getPackagePrefix(packName: String): String = {
    if ("Kermeta".equals(packName)) {
      return "Km"
    } else if ("Uml".equals(packName) || "Uml".equals(packName.toString)) {
      return "UML"
    } else {
      return packName
    }
  }

  /**
   * Global Compiler Thread Executor
   */
  var threadExecutor: ExecutorService = null

  /*   def generateScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String )={
        implicit def rich (xs : Iterable[A]) = new RichIterable(list)
        list.foreachCtx((e,ctx) => {
                if(!ctx.isFirst) {res.append(sep) }
                e.asInstanceOf[ObjectAspect].generateScalaCode(res)
            })
    }
   
   
    def generateProtectedScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String )={
        implicit def rich (xs : Iterable[A]) = new RichIterable(list)
        list.foreachCtx((e,ctx) => {
                if(!ctx.isFirst) {res.append(sep) }
                var temp = new StringBuilder
                e.asInstanceOf[ObjectAspect].generateScalaCode(temp)
                res.append(protectScalaKeyword(temp.toString))
            })
        //TODO CAS INTERESSANT POUR LES FONCTIONS ANONYM
        /*
         for(i <- 0 until list.size){
         if(i != 0) {res.append(sep) }
         list.get(i).generateScalaCode(res)
         }*/
    }*/

  def createTempDirectory: File = {
    val temp = File.createTempFile("temp", System.nanoTime.toString)
    if (!temp.delete)
      ioError("Could not delete temp file: " + temp.getAbsolutePath)
    if (!temp.mkdir)
      ioError("Could not create temp directory: " + temp.getAbsolutePath)
    return temp
  }

  def ioError(msg: String) = throw new IOException(msg)

  def doesGeneratePackage(packQualifiedName: String): Boolean = {
    var hasToGenerate: Boolean = true
    if (GlobalConfiguration.props.getProperty("use.default.aspect.km") == true) {
      hasToGenerate && !packQualifiedName.startsWith("org.kermeta.language")
    }
    if (GlobalConfiguration.props.getProperty("use.default.aspect.uml") == true) {
      hasToGenerate && !packQualifiedName.startsWith("")
    }
    if (GlobalConfiguration.props.getProperty("use.default.aspect.ecore") == true) {
      hasToGenerate && !packQualifiedName.startsWith("org.eclipse.emf")
    }
    if (!hasToGenerate) { log.debug("Exclude compilation package |" + packQualifiedName) }
    return hasToGenerate
  }

  def getEcoreRenameOperation(op1: Operation): String = {
    if ((Util.hasEcoreTag(op1) && op1.getBody != null && !Util.hasNoEcoreRenameTag(op1)) ||
      (op1.eContainer.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName().equals("op_" + op1.getName())).size > 0)) {
      return "EMFRENAME" + op1.getName
    } /*else if (op1.getSuperOperation != null && op1.getSuperOperation() != op1) {
      return getEcoreRenameOperation(op1.getSuperOperation.asInstanceOf[Operation])
    }*/ else {
      return op1.getName
    }
  } 

  def getClassLoaderForClasspath(classpath: String): java.net.URLClassLoader = {
    var urls: scala.Array[java.net.URL] = scala.Array[java.net.URL]()
    var splittedclasspath = new RichIterable(classpath.split(System.getProperty("path.separator")))
    splittedclasspath.foreachCtx((e, ctx) => {
      if (!e.isEmpty()) {
        urls = urls :+ (new java.net.URL("file:///" + e)) // need 3 / with windows
      }
    })

    return new java.net.URLClassLoader(urls) //java.net.URLClassLoader.newInstance(urls) 
  }

  def doesMethodExists(className: String, methodName: String): Boolean = {
    val cl = getClassLoaderForClasspath(GlobalConfiguration.props.getProperty("user.additional.classpath"))
    try {
      val c = cl.loadClass(className)
      return c.getDeclaredMethods().exists((m) => {
        m.getName().equals(methodName)
      })
    } catch {
      case e: java.lang.ClassNotFoundException => {
        log.debug(e + " in " + cl.getURLs().mkString + " cl.getURL.size=" + cl.getURLs().length)
        return false
      }
    }
    return false
  }

  def isValueType(o: org.kermeta.language.structure.Class): Boolean = {
    val name = k2.utils.UTilScala.getQualifiedNameClassKermeta(o.getTypeDefinition, ".")
    return name == "kermeta.standard.Integer" || name == "kermeta.standard.String" ||
      name == "kermeta.standard.Boolean" || name == "kermeta.standard.Short" ||
      name == "kermeta.standard.Double" || name == "kermeta.standard.Long" ||
      name == "kermeta.standard.Float" || name == "kermeta.standard.Character"
  }

  def getMetamodel(k: EObject): Metamodel = {
    var container = k.eContainer()
    container match {
      case m: Metamodel => {
        return m
      }
      case o => {
        return getMetamodel(o)
      }
    }
  }

  /**
   * return the metamodel that defines the KermetaStandard reflexivity layer
   */
  def getKermetaStandardMetamodelName(mu: ModelingUnit): String = {
    mu.getMetamodels().find(mm => mm.getKOwnedTags.exists(t => t.getName().equals("kermeta_standard"))) match {
      case Some(m) => {
        m.getName()
      }
      case _ => {
        "kermeta_standard"
      }
    }
  }

  /**
   * Helper for getting qualified names, paths...
   * TODO: Migrate and refactor code in order to clearly separate Utils and PackageVisitor
   */
  val compilerConfiguration: CompilerConfiguration = new CompilerConfiguration
  val helper: PackageVisitor = new PackageVisitor(compilerConfiguration)

  def whichBoolean(thi: PrimitiveType): String = {
    return helper.whichBoolean(thi)
  }
  def getQualifiedNameEMap(thi: EObject): String = {
    return helper.getQualifiedNameEMap(thi)
  }
  def getPQualifiedNameCompilo(thi: EObject): String = {
    return helper.getPQualifiedNameCompilo(thi)
  }
  def getQualifiedNameCompilo(thi: EObject): String = {
    return helper.getQualifiedNameCompilo(thi)
  }

  def getQualifiedName(thi: EObject): String = {
    return helper.getQualifiedName(thi)
  }

  def getQualifiedNamedBase(typD: GenericTypeDefinition): String = {
    return helper.getQualifiedNamedBase(typD)
  }
  /** returns the qualified named up to the package */
  def getPQualifiedNamedBase(typD: GenericTypeDefinition): String = {
    return helper.getPQualifiedNamedBase(typD)
  }

  def getQualifiedNamedAspect(typD: GenericTypeDefinition): String = {
    return helper.getQualifiedNamedAspect(typD)
  }

  def getQualifiedPathWithMetamodel(thi: EObject): String = {
    return helper.getQualifiedPathWithMetamodel(thi)
  }
  def getQualifiedPathWithoutMetamodel(thi: EObject): String = {
    return helper.getQualifiedPathWithoutMetamodel(thi)
  }

  /**
   * return the string corresponding the this type
   * may raise an exception for unsupported type so if can be catched and the caller can ignore this operation. 
   */
  def getTypeAsJavaType(multiplicityElement : MultiplicityElement) : String =  {
    var res: StringBuilder = new StringBuilder
    if (multiplicityElement.getUpper > 1 || multiplicityElement.getUpper == -1) {
      if (multiplicityElement.getIsOrdered != null && multiplicityElement.getIsOrdered) {
        res.append("org.eclipse.emf.common.util.EList<")
      } else {
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList<")
      }

      getTypeAsJavaType(multiplicityElement.getType(), res)
      res.append(">")

    } else {
      getTypeAsJavaType(multiplicityElement.getType(), res)
    }
    return res.toString
  }
  def getTypeAsJavaType(typ : Type, res: StringBuilder)  {
    throw new RuntimeException("type not supported for java generation "+ typ.toString)
  }
  def getTypeAsJavaType(clazz : Class, res: StringBuilder)  {
    res.append(getPQualifiedNamedBase(clazz.getTypeDefinition()))
  }
  
  //MODELTYPE ADDITION
  /*
   * getNames for type members and model type interfaces
   */
  def getTypeMemberName(td: ModelElementTypeDefinition): String = {
    return helper.getTypeMemberName(td)
  }
  def getModelTypeInterfaceName(td: ModelElementTypeDefinition): String = {
    return helper.getModelTypeInterfaceName(td)
  }
  def getModelTypeInterfaceQualifiedName(td: ModelElementTypeDefinition): String = {
    return helper.getModelTypeInterfaceQualifiedName(td)
  }

  /*
   * get names for factories
   */
  //Name of the objects containing the implementation of creation methods
  def getModelTypeFactoryTypeName(): String = {
    var res: StringBuilder = new StringBuilder
    res.append("ModelTypeFactory")
    return res.toString()
  }
  def getModelTypeFactoryTypeQualifiedName(mtd: ModelTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append(getQualifiedName(mtd))
    res.append(".")
    res.append(getModelTypeFactoryTypeName())
    return res.toString()
  }

  //Name of the variable referencing the factory
  def getModelTypeFactoryMainVariableName(): String = {
    var res: StringBuilder = new StringBuilder
    res.append("mtFactory")
    return res.toString()
  }

  //Name of the factory interfaces
  def getModelTypeFactoryInterfaceName(): String = {
    var res: StringBuilder = new StringBuilder
    res.append("TFactory")
    return res.toString()
  }
  def getModelTypeFactoryInterfaceQualifiedName(mtd: ModelTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append(getQualifiedName(mtd))
    res.append(".")
    res.append(getModelTypeFactoryInterfaceName())
    return res.toString()
  }

  //Name of the variables for classes and operations parameterized by ModelTypeVariables
  def getModelTypeFactoryParameterVariableName(mtv: ModelTypeVariable): String = {
    var res: StringBuilder = new StringBuilder
    res.append("f_")
    res.append(mtv.getName())
    return res.toString()
  }

  def needToAddFixedTypeMembers(cd: ClassDefinition, mm: Metamodel): Boolean = {
    var res: Boolean = true
    var mtd = mm.getOwnedModelTypeDefinitions().find(m => { m.getName() == mm.getName() })
    mtd match {
      case Some(m) => {
        return needToAddFixedTypeMembers(cd, m)
      }
      case None =>
    }
    return res
  }

  def needToAddFixedTypeMembers(cd: ClassDefinition, mtd: ModelTypeDefinition): Boolean = {
    var res: Boolean = true
    cd.getSuperType().foreach(st => {
      st match {
        case c: Class => {
          if (!Util.hasCompilerIgnoreTag(c.getTypeDefinition()) && (mtd.getTypeDefinitions().contains(c.getTypeDefinition()))) {
            return false
          }
        }
        case _ =>
      }
    })

    return res
  }

  def getAllOwnedModelElementTypeDefinitions(mm: Metamodel): java.util.Set[ModelElementTypeDefinition] = {
    var res = new java.util.HashSet[ModelElementTypeDefinition]
    mm.getPackages().foreach(p => {
      res.addAll(getAllOwnedModelElementTypeDefinitions(p))
    })
    return res
  }
  def getAllOwnedModelElementTypeDefinitions(p: Package): java.util.Set[ModelElementTypeDefinition] = {
    var res = new java.util.HashSet[ModelElementTypeDefinition]
    res.addAll(p.getOwnedTypeDefinition())
    p.getNestedPackage().foreach(np => {
      res.addAll(getAllOwnedModelElementTypeDefinitions(np))
    })
    return res
  }
  
  /*
   * Generate names of generated scala accessors (used in PropertyAspect and CallFeatureAspect)
   */
  def generateScalaAccessorName(thi: Property, res: StringBuilder) = {
    res.append(GlobalConfiguration.scalaPrefix + thi.getName())
  }
  def generateScalaAccessorName(thi: String, res: StringBuilder) = {
    res.append(GlobalConfiguration.scalaPrefix + thi)
  }  
  def getAccessorsPrefix(thi : Property) : String = {
    var res : String = ""
    if (!hasEcoreTag(thi)) {
      res = res + "Ker"
    }
    return res
  }
  
  def isCompilerIgnoreCall(thi : CallProperty) : Boolean = {
    return hasCompilerIgnoreTag(thi.getStaticProperty().getOwningClass())
  }
  
  def isCompilerIgnoreCall(thi : CallOperation) : Boolean = {    
    return hasCompilerIgnoreTag(thi.getStaticOperation().getOwningClass())
  }
  
   def generateBindingParameterClass(c : org.kermeta.language.structure.Class, res : StringBuilder) = {
     helper.generateBindingParameterClass(c, res)
   }
}

   

