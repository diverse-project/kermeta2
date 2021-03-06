package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import scala.collection.mutable.StringBuilder

trait PropertyAspect extends ObjectVisitor with LogAspect {

  def visitProperty(thi: Property, res: StringBuilder): Unit = {
    
    var prefix: String = Util.getAccessorsPrefix(thi)
      
    if (isImplementingModelTypeInterface()) {      
      prefix = getCompilerConfiguration().modelTypeOperationsPrefix
      generateNonEcorePropertyAccessors(thi, res, prefix)
    } else if (Util.hasEcoreTag(thi.getOwningClass)) {
      if (Util.hasEcoreTag(thi)) {
        generateNonEcorePropertyScalaAccessors(thi, res, prefix)
      } else {
        if (!Util.hasCompilerIgnoreTag(thi)) {
          generateAttribute(thi, res)
          generateNonEcorePropertyAccessors(thi, res, prefix)
          generateNonEcorePropertyScalaAccessors(thi, res, prefix)
        }

        //TODO générer getter et setter si property ajoutée par un ecore
      }
      //		 		value.getGetterBody
      //		 		value.getSetterBody
    } else {
      if (!Util.hasCompilerIgnoreTag(thi)) {
        generateAttribute(thi, res)
        generateNonEcorePropertyAccessors(thi, res, prefix)
        generateNonEcorePropertyScalaAccessors(thi, res, prefix)
      }

    }
  }
  
  def generateNonEcorePropertyAccessors(thi: Property, res: StringBuilder, prefix: String) = {
    generateGet(thi, res, prefix)
    generateSet(thi, res, prefix)
  }

  def generateNonEcorePropertyScalaAccessors(thi: Property, res: StringBuilder, prefix: String) = {
    generateScalGet(thi, res, prefix)
    generateScalSet(thi, res, prefix)
  }

  def generatePropertySignatures(thi: Property, res: StringBuilder): Unit = {
    generatePropertySignatures(thi, res, false)
  }

  def generatePropertySignatures(thi: Property, res: StringBuilder, modelTypeInterface: Boolean): Unit = {

    if (modelTypeInterface) {
      var prefix: String = ""
      prefix = getCompilerConfiguration().modelTypeOperationsPrefix
      generateNonEcorePropertySignature(thi, res, prefix)
    } else if (Util.hasEcoreTag(thi.getOwningClass)) {
      if (Util.hasEcoreTag(thi)) {
        generateNonEcorePropertyScalaSignature(thi, res, "")
      } else {
        if (!Util.hasCompilerIgnoreTag(thi)) {
          generateNonEcorePropertySignature(thi, res, "Ker")
          generateNonEcorePropertyScalaSignature(thi, res, "Ker")
        }

        //TODO générer getter et setter si property ajoutée par un ecore
      }
      //		 		value.getGetterBody
      //		 		value.getSetterBody
    } else {
      if (!Util.hasCompilerIgnoreTag(thi)) {
        generateNonEcorePropertySignature(thi, res, "Ker")
        generateNonEcorePropertyScalaSignature(thi, res, "Ker")
      }
    }
  }

  def generateNonEcorePropertySignature(thi: Property, res: StringBuilder, prefix: String) = {
    generateGetSignature(thi, res, prefix)
    res.append("\n")
    generateSetSignature(thi, res, prefix)
    res.append("\n")
  }

  def generateNonEcorePropertyScalaSignature(thi: Property, res: StringBuilder, prefix: String) = {
    generateScalaGetSignature(thi, res, prefix)
    res.append("\n")
    generateScalaSetSignature(thi, res, prefix)
    res.append("\n")
  }

  def generateAttribute(thi: Property, res: StringBuilder): Unit = {
       
    res.append("var ")
    res.append(Util.protectScalaKeyword(thi.getName()))
    res.append(" : ")

    if (thi.getUpper > 1 || thi.getUpper == -1) {
      res.append("k2.standard.Kermeta")
      getCollectionType(thi, res)
      res.append("[")
      visitTypeParam(thi.getType, res)
      res.append("] = k2.standard.KerRichFactory.create")
      getCollectionType(thi, res)
      res.append("[")
      visitTypeParam(thi.getType, res)
      res.append("]")

    } else {
      visit(thi.getType, res)
      res.append("= _")

    }
    res.append("\n")
  }

  def generateGet(thi: Property, res: StringBuilder, prefix: String): Unit = {
        
    generateGetSignature(thi, res, prefix)

    var hasTypeEq: Boolean = false
    var baseName: String = "_root_."
    var aspectName: String = "_root_."
    if (thi.getType().isInstanceOf[Class]) {
      var cd: ClassDefinition = thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition]
      hasTypeEq = hasTypeEquivalence(cd)
      if (Util.hasEcoreTag(cd)) {
        baseName = baseName + getPQualifiedNamedBase(cd)
      } else {
        baseName = baseName + getQualifiedNamedBase(cd)
      }
      aspectName = aspectName + getQualifiedNamedAspect(cd)
    }

    if (isImplementingModelTypeInterface()) {
      var typeName: StringBuilder = new StringBuilder
      visit(thi.getType(), typeName)
      res.append("={")

      if (thi.getType().isInstanceOf[Class] && !hasTypeEq) {
        if (thi.getUpper > 1 || thi.getUpper == -1) {
          res.append("\n\tvar res : ")
          res.append("k2.standard.Kermeta")
          getCollectionType(thi, res)
          res.append("[")
          res.append(baseName)
          res.append("] = k2.standard.KerRichFactory.create")
          getCollectionType(thi, res)
          res.append("[")
          res.append(baseName)
          res.append("]\n")

          res.append("\tthis.")

          Util.generateScalaAccessorName(thi, res)
          res.append(".each(e => {")

          res.append("res.add(e.asInstanceOf[")
          res.append(aspectName)
          res.append("])})")

          res.append("\n\treturn res")

          res.append("\n  }")

        } else {
          res.append("\n\tif (!this.")
          Util.generateScalaAccessorName(thi, res)
          res.append(".isInstanceOf[")
          res.append(typeName.toString())
          res.append("]) {")
          res.append("richAspect(this.")
          Util.generateScalaAccessorName(thi, res)
          res.append(")")
          res.append("} else {")
          res.append("this.")
          Util.generateScalaAccessorName(thi, res)
          res.append("}")
          res.append("\n  }")
        }
      } else {
        res.append("this.")
        Util.generateScalaAccessorName(thi, res)
        res.append("}")
      }
    } else {
      res.append("={this." + Util.protectScalaKeyword(thi.getName()) + "}")
    }
    res.append("\n")
  }

  def generateGetSignature(thi: Property, res: StringBuilder, prefix: String) = {
    res.append("  def ")
    var s: StringBuilder = new StringBuilder
    visit(thi.getType(), s)
    if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean")) {
      res.append(prefix + "is")
    } else {
      res.append(prefix + "get")
    }

    res.append(thi.getName.substring(0, 1).toUpperCase + thi.getName.substring(1, thi.getName.size) + "()")
    res.append(" : ")
    getListorType(thi, res)
  }

  def getGetter(thi: Property, s: StringBuilder, res: StringBuilder, prefix: String) = {
    var currentname: String = thi.getName
    if ("class".equals(currentname) && Util.hasEcoreTag(thi)) {
      currentname = currentname + "_"
    }
    //Cas des collections uml
    if ((thi.getUpper > 1 || thi.getUpper == -1) && "uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) {
      currentname = getUmlExtension(thi)
    }

    if (Util.isAMapEntry(thi.getOwningClass()))
      res.append("wrappedvalue.")
    else
      res.append("this.")

    var baseName = currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
    var useIs = false
    var useGet = true
    if (Util.hasEcoreTag(thi)) {
      var s: StringBuilder = new StringBuilder
      visit(thi.getType(), s)
      if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("_root_.java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean") || s.toString.equals("_root_.kermeta.standard.Boolean")) {
        val classQualifiedName = getPQualifiedNamedBase(thi.eContainer.asInstanceOf[ClassDefinition])
        if (Util.doesMethodExists(classQualifiedName, "is" + baseName)) {
          useIs = true
          log.debug(classQualifiedName + "." + "is" + baseName + " found in additional classpath")
        } else {
          if (Util.doesMethodExists(classQualifiedName, "get" + baseName)) {
            useGet = true
            log.debug(classQualifiedName + "." + "get" + baseName + " found in additional classpath")
          } else {
            useGet = false
            // probably a UML case
            log.debug("neither " + classQualifiedName + "." + "is" + baseName + " nor " + classQualifiedName + "." + "get" + baseName + " found in additional classpath")
            // use to original attribute name
            baseName = currentname
          }
        }
      }
    }
    if (useIs) {
      res.append(prefix + "is")
    } else if (useGet) {
      res.append(prefix + "get")
    }
    if (useIs || useGet) {
      res.append(baseName + "()")
    } else {
      res.append(Util.protectScalaKeyword(baseName) + "()")
    }

  }

  def generateScalGet(thi: Property, res: StringBuilder, prefix: String): Unit = {

    val ownerType = new StringBuilder // Contains the type of thi owner, i.e. the type of opposite if there is one
    getOwnerType(thi, ownerType)

    val thiType: StringBuilder = new StringBuilder // Contains the type of thi
    visit(thi.getType(), thiType)

    generateScalaGetSignature(thi, res, prefix)

    res.append("={")
    if (thi.getGetterBody == null) {
      // For reflexivity

      if (thi.getUpper > 1 || thi.getUpper == -1) {

        //if (thi.getEmployees()==null) thi.setEmployees(new java.util.ArrayList[_root_.system.corporate.Employee]);
        if (Util.hasEcoreFromAPITag(thi.eContainer.asInstanceOf[KermetaModelElement])) {
          res.append(" if (")
          var res1 = new StringBuilder
          getGetter(thi, thiType, res1, prefix)
          res.append(res1.toString)
          res.append(" == null ) ")
          res.append(res1.toString.replace("this.get", "this.set").replace("()", "("))
          res.append("k2.standard.KerRichFactory.createKermeta")
          getCollectionType(thi, res)
          res.append("[")
          res.append(thiType.toString + "]);")
        }

        if (Util.isAMapEntry(thi.getType())) {
          val mapEntryQualifiedName = Util.getQualifiedNameForMapEntry(thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, true)
          res.append("  // force the convertion of Set of EObjects into list of KermetaObject")
          res.append("\n    var l : java.util.List[")
          res.append(mapEntryQualifiedName)
          res.append("] = new java.util.ArrayList[")
          res.append(mapEntryQualifiedName)
          res.append("]()\n")
          res.append("    l.addAll(")
          getGetter(thi, thiType, res, prefix) // Note doesn't work for mapEntry using UML style ...
          res.append(".entrySet().asInstanceOf[java.util.Set[")
          res.append(mapEntryQualifiedName)
          res.append("]])\n")
        }
        res.append("    new k2.standard.RichReflective")
        getCollectionType(thi, res)
        res.append("[" + ownerType.toString + ",")
        if (Util.isAMapEntry(thi.getType())) {
          res.append(Util.getQualifiedNameForMapEntry(thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, true))
        } else {
          visitTypeParam(thi.getType(), res)
        }
        res.append("](thisUpper = " + thi.getUpper + ",value=")
      }

      if ("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName) && (thiType.toString.equals("Boolean") || thiType.toString.equals("java.lang.Boolean") || thiType.toString.equals("kermeta.standard.Boolean"))) {
        if (thi.getName.startsWith("is"))
          res.append("this." + thi.getName + "()")
        else if (thi.getUpper > 1 || thi.getUpper == -1) {
          res.append("this.get")
          res.append(thi.getName.substring(0, 1).toUpperCase() + thi.getName.substring(1, thi.getName.length) + "s()")
        } else {
          res.append("this.is")
          res.append(thi.getName.substring(0, 1).toUpperCase() + thi.getName.substring(1, thi.getName.length) + "()")
        }

      } else if (Util.isAMapEntry(thi.getType())) {
        res.append("l")
      } else {
        getGetter(thi, thiType, res, prefix)
      } // For reflexivity
      if (thi.getUpper > 1 || thi.getUpper == -1) {
        if (thi.getOpposite() != null && !Util.hasEcoreTag(thi) && !Util.hasEcoreTag(thi.getOpposite())) {
          val opposite = thi.getOpposite().asInstanceOf[Property]

          res.append(",owner=this.asInstanceOf[" + ownerType.toString + "],hasOpposite=true")
          if (opposite.getUpper() == 1) {
            // opposite upper == 1
            res.append(",oppositeKerSetter={")
            res.append("(opp:" + thiType + ",thi:" + ownerType.toString)
            res.append(")=>opp.")
            res.append(prefix + "set" + opposite.getName().substring(0, 1).toUpperCase() + opposite.getName.substring(1, opposite.getName.size))
            res.append("(thi)}")
            res.append(",oppositeScalaSetter={(opp:" + thiType + ",thi:" + ownerType.toString)
            res.append(")=>opp.")
            res.append(GlobalConfiguration.scalaPrefix + opposite.getName())
            res.append("=thi}")
          } else {
            // opposite upper > 1 or == -1
            res.append(",oppositeUpper= " + opposite.getUpper())
            res.append(",oppositeScalaGetter={(opp:" + thiType + ")=>opp." + GlobalConfiguration.scalaPrefix + opposite.getName() + "}")
          }
        }
        res.append(")")
      } else {
        var typestring = new StringBuilder
        getListorType(thi, typestring)
        res.append(".asInstanceOf[" + typestring.toString + "]")
      }
      res.append("}")
    } else {
      res.append("var `~result` : ")
      getListorType(thi, res)
      //res append "Any"
      res.append(" = null.asInstanceOf[")
      getListorType(thi, res)
      res.append("]; \n")

      res.append(visit(thi.getGetterBody, res))
      res append " \n return `~result`\n}"

      //            res.append("\n}")
    }
    res.append("\n")

  }

  def generateScalaGetSignature(thi: Property, res: StringBuilder, prefix: String) = {

    val ownerType = new StringBuilder // Contains the type of thi owner, i.e. the type of opposite if there is one
    getOwnerType(thi, ownerType)

    val thiType: StringBuilder = new StringBuilder // Contains the type of thi

    visit(thi.getType(), thiType)

    res.append("  def ")

    Util.generateScalaAccessorName(thi, res)

    res.append(" : ")
    if (Util.isAMapEntry(thi.getType()) || thi.getGetterBody != null) { // MapEntry and derived properties doesn't use ReflectiveCollection
      getListorType(thi, res)
    } else if (thi.getUpper() > 1 || thi.getUpper() == -1) {
      res.append("k2.standard.Reflective")
      getCollectionType(thi, res)
      res.append("[" + ownerType.toString + ",")
      visitTypeParam(thi.getType(), res)
      res.append("]")
    } else
      res.append(thiType.toString)
  }

  def generateSet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    
    if (!(thi.getIsReadOnly() != null && thi.getIsReadOnly())) {
      generateSetSignature(thi, res, prefix)

      var hasTypeEq: Boolean = false
      var baseName: String = null
      var aspectName: String = null
      if (thi.getType().isInstanceOf[Class]) {
        var cd: ClassDefinition = thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition]
        hasTypeEq = hasTypeEquivalence(cd)
        if (Util.hasEcoreTag(cd)) {
          baseName = "_root_." + getPQualifiedNamedBase(cd)
        } else {
          baseName = "_root_." + getQualifiedNamedBase(cd)
        }
        aspectName = "_root_." + getQualifiedNamedAspect(cd)
      }

      if (isImplementingModelTypeInterface()) {
        var typeName: StringBuilder = new StringBuilder
        visit(thi.getType(), typeName)
        res.append("={")

        if (thi.getUpper > 1 || thi.getUpper == -1) {
          res.append("\n\tvar newArg : ")
          res.append("k2.standard.Kermeta")
          getCollectionType(thi, res)
          res.append("[")
          res.append(baseName)
          res.append("] = k2.standard.KerRichFactory.create")
          getCollectionType(thi, res)
          res.append("[")
          res.append(baseName)
          res.append("]\n")

          res.append("\targ")
          res.append(".each(e => {newArg.add(e")
          if (thi.getType().isInstanceOf[Class] && !hasTypeEq) {
            res.append(".asInstanceOf[")
            res.append(aspectName)
            res.append("]")
          }
          res.append(")})")

          res.append("\n\tthis.")
          Util.generateScalaAccessorName(thi, res)
          res.append("=(newArg)")

          res.append("\n  }")
        } else {
          res.append(" this.")
          Util.generateScalaAccessorName(thi, res)
          res.append("=(arg")
          if (thi.getType().isInstanceOf[Class] && !hasTypeEq) {
            res.append(".asInstanceOf[")
            res.append(aspectName)
            res.append("]")
          }
          res.append(")}")
        }
      } else {
        res.append("={ this." + Util.protectScalaKeyword(thi.getName()) + " = arg}")
      }
      res.append("\n")
    }
  }

  def generateSetSignature(thi: Property, res: StringBuilder, prefix: String): Unit = {
    if (!(thi.getIsReadOnly() != null && thi.getIsReadOnly())) {
      res.append("  def " + prefix + "set")
      res.append(thi.getName.substring(0, 1).toUpperCase + thi.getName.substring(1, thi.getName.size) + "(arg:")
      getListorType(thi, res)
      res.append(")")
    }
  }

  def getUmlExtension(thi: Property): String = {
    var currentname: String = thi.getName
    if (currentname.endsWith("s")) {
      currentname = currentname + "es"
    } else if (currentname.endsWith("coveredBy")) {
      currentname = currentname + "s"
    } else if (currentname.endsWith("data") || currentname.endsWith("Data")) {
    } else if (currentname.endsWith("y")) {
      currentname = currentname.substring(0, currentname.size - 1) + "ies"
    } else if (currentname.endsWith("ex")) {
      currentname = currentname.substring(0, currentname.size - 2) + "ices"
    } else {
      currentname = currentname + "s"
    }
    return currentname

  }

  def generateScalSet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    
    if (!(thi.getIsReadOnly() != null && thi.getIsReadOnly())) {
      var currentname: String = thi.getName

      var listType = new StringBuilder
      getListorType(thi, listType)

      generateScalaSetSignature(thi, res, prefix)

      if (("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) && ("class".equals(currentname))) {
        currentname = currentname + "_"
      }

      def kersetName: String = prefix + "set" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
      def kergetName: String = prefix + "get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
      var scalaName = GlobalConfiguration.scalaPrefix + thi.getName()

      res.append("={\n\t")

      if (thi.getGetterBody == null && thi.getSetterBody == null) {
        if (thi.getUpper > 1 || thi.getUpper == -1) {
          //Cas des collections uml
          if ("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) {
            currentname = getUmlExtension(thi)
          }
          res.append("this." + kergetName + "().clear\n\t")
          if (isCollectionOfObject(listType.toString) && Util.hasEcoreTag(thi))
            res.append("`~value`.each(e=> this.get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().add(e.asInstanceOf[org.kermeta.language.structure.Object]))\n\t")
          else if (Util.isAMapEntry(thi.getType())) {
            if (Util.isAMapEntry(thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition].getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType) && (thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition].getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getUpper().equals(-1))) {
              res.append("`~value`.each(e=>  {")
              res.append("var v : org.eclipse.emf.common.util.EMap[")
              var target: ClassDefinition = thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition].getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition]

              var res1 = new StringBuilder

              res1.append(this.getQualifiedNameEMap(target.getOwnedAttribute().filter(e => e.getName.equals("key")).get(0).getType))
              res1.append(",")
              res1.append(this.getQualifiedNameEMap(target.getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType))
              res.append(res1.toString())
              res.append("] =  new org.eclipse.emf.common.util.BasicEMap[")
              res.append(res1.toString())
              res.append("]\n\t v.putAll(e.wrappedvalue.getValue())\n\t")
              res.append("this.get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().put(e.wrappedvalue.getKey(),v)})")
            } else
              res.append("`~value`.each(e=>  this.get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().put(e.wrappedvalue.getKey(),e.wrappedvalue.getValue()))")
          } else
            res.append("this." + kergetName + "().addAll(`~value`)\n\t")
        } else if (Util.isAMapEntry(thi.getOwningClass()) && thi.getName().equals("key")) {
          res.append("wrappedvalue = new _root_.java.util.AbstractMap.SimpleEntry[")
          var typekey = thi.getOwningClass().getOwnedAttribute().filter(e => e.getName.equals("key")).get(0).getType
          var typevalue = thi.getOwningClass().getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType
          var typekeystring: String = null
          var typevaluestring: String = null
          if (Util.isAMapEntry(typekey)) {
            typekeystring = Util.getQualifiedNameForMapEntry(typekey.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, true)
          } else {
            typekeystring = this.getQualifiedNameCompilo(typekey)
          }
          if (Util.isAMapEntry(typevalue)) {
            if (thi.getOwningClass().getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getUpper().equals(1))
              typevaluestring = Util.getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, true)
            else
              typevaluestring = Util.getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, false)

          } else {
            typevaluestring = this.getQualifiedNameCompilo(typevalue)
          }

          res.append(typekeystring)
          res.append(",")
          res.append(typevaluestring)
          res.append("](`~value`, wrappedvalue.getValue())")
        } else {
          // Upper == 1
          if (thi.getOpposite() != null && thi.getOpposite().asInstanceOf[Property].getUpper() == 1
            && !Util.hasEcoreTag(thi) && !Util.hasEcoreTag(thi.getOpposite())) {
            // Opposite upper == 1
            var oppKersetName = prefix + "set" + thi.getOpposite.asInstanceOf[Property].getName().substring(0, 1).toUpperCase() + thi.getOpposite.asInstanceOf[Property].getName.substring(1, thi.getOpposite.asInstanceOf[Property].getName.size)
            var oppScalaName = GlobalConfiguration.scalaPrefix + thi.getOpposite().asInstanceOf[Property].getName()
            var oppType = new StringBuilder; getOwnerType(thi, oppType)

            res.append("\n\t  if(this." + kergetName + "!=null)\n\t")
            res.append("    this." + kergetName + "." + oppKersetName + "(null.asInstanceOf[" + oppType + "])\n\t")
            res.append("  if(`~value`!=null){\n")
            res.append("    `~value`." + oppScalaName + "=null.asInstanceOf[" + oppType + "]\n\t")
            res.append("    `~value`." + oppKersetName + "(this.asInstanceOf[" + oppType + "])\n\t")
            res.append("  }\n")
            res.append("  ")
          } else if (thi.getOpposite() != null && !Util.hasEcoreTag(thi) && !Util.hasEcoreTag(thi.getOpposite())) {
            // Opposite Upper > 1 or opposite Upper == -1
            var oppScalaName = GlobalConfiguration.scalaPrefix + thi.getOpposite().asInstanceOf[Property].getName()

            res.append("\n\t  if(this." + kergetName + "!=null)\n\t")
            res.append("    this." + kergetName + "." + oppScalaName + ".remove(this)\n\t")
            res.append("  if(`~value`!=null)\n\t")
            res.append("    `~value`." + oppScalaName + ".add(this)\n\t")
            res.append("  else\n\t")
            res.append("    ")
          }
          if (Util.isAMapEntry(thi.getOwningClass()))
            res.append("wrappedvalue.")
          else
            res.append("this.")
          res.append(kersetName + "(`~value`)")
        }
      } else {
        if (thi.getSetterBody != null) {
          visit(thi.getSetterBody, res)
        }

      }
      res.append("  }")
      res.append("\n")

    }
  }

  def generateScalaSetSignature(thi: Property, res: StringBuilder, prefix: String) = {    
    var currentname: String = thi.getName
    var listType = new StringBuilder
    getListorType(thi, listType)

    if (("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) && ("class".equals(currentname))) {
      currentname = currentname + "_"
    }

    def kersetName: String = prefix + "set" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
    def kergetName: String = prefix + "get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
    //var scalaName = prefix + GlobalConfiguration.scalaPrefix + thi.getName()

    res.append("  def ")
    Util.generateScalaAccessorName(thi, res)
    
    res.append("_=(")
    res.append("`~value` : ")
    res.append(listType.toString)
    res.append("):Unit")
  }

  def isCollectionOfObject(listType: String): Boolean = {
    listType.equals("k2.standard.KermetaOrderedSet[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaSequence[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaSet[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaBag[_root_.java.lang.Object]")
  }

  def getListorType(thi: Property, res: StringBuilder) = {
    if (thi.getUpper > 1 || thi.getUpper == -1) {
      res.append("k2.standard.Kermeta")
      getCollectionType(thi, res)
      res.append("[")
      if (Util.isAMapEntry(thi.getType()))
        res.append(Util.getQualifiedNameForMapEntry(thi.getType().asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], this, true))
      else
        visitTypeParam(thi.getType(), res)
      res.append("]")
    } else {
      visit(thi.getType(), res)
    }

  }

  /**
   * Append the right collection type to res,
   * based on unicity and orderedness
   */
  def getCollectionType(thi: Property, res: StringBuilder) = {
    if (thi.getIsOrdered == null || thi.getIsOrdered) {
      if (thi.getIsUnique() == null || thi.getIsUnique())
        res.append("OrderedSet")
      else
        res.append("Sequence")
    } else {
      if (thi.getIsUnique() == null || thi.getIsUnique())
        res.append("Set")
      else
        res.append("Bag")
    }
  }

  /**
   * Appends the type of thi owner, i.e. the type of opposite if there is one, to res
   */
  def getOwnerType(thi: Property, res: StringBuilder) = {
    if (thi.getOpposite() != null) {
      // If there is an opposite, use it to get the type, associated with the right type parameters
      res.append(getQualifiedNameCompilo(thi.getOpposite.asInstanceOf[Property].getType))
      val typeParamNumber = thi.getOpposite.asInstanceOf[Property].getType.asInstanceOf[Class].getTypeParamBinding.size
      if (typeParamNumber > 0) {
        res.append("[")
        for (i <- 0 until typeParamNumber) {
          if (i != 0)
            res.append(",")
          if (thi.getOpposite.asInstanceOf[Property].getType.asInstanceOf[Class].getTypeParamBinding.get(i).getType().isInstanceOf[TypeVariable])
            visit(thi.getOpposite.asInstanceOf[Property].getType.asInstanceOf[Class].getTypeParamBinding.get(i).getVariable, res)
          else
            visit(thi.getOpposite.asInstanceOf[Property].getType.asInstanceOf[Class].getTypeParamBinding.get(i), res)
        }
        res.append("]")
      }
      //visit(thi.getOpposite.asInstanceOf[Property].getType(),ownerType)
    } else {

      // Otherwise just put type variables for type parameters  
      if (Util.isAMapEntry(thi.getOwningClass)) {
        res.append(Util.protectScalaKeyword(getQualifiedNameCompilo(thi.getOwningClass)))
      } else {
        res.append(Util.protectScalaKeyword(getQualifiedNamedAspect(thi.getOwningClass)))
      }
      generateTypeParameterForClassDefinition(thi.getOwningClass(), res)
    }
  }
}
