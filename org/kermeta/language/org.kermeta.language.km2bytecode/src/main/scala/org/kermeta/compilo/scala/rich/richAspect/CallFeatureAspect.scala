package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends ObjectVisitor with LogAspect {

  def generateNew(thi: CallFeature, res: StringBuilder) = {
    if (thi.getTarget != null) {
      if (thi.getTarget.isInstanceOf[CallTypeLiteral]) {
        //MODELTYPE ADDITION
        if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[VirtualType]) {
          var vt: VirtualType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[VirtualType]
          res.append(Util.getModelTypeFactoryParameterVariableName(vt.getModelTypeVariable()))
          res.append(".create")
          res.append(vt.getTypeDefinition().getName())
          if (vt.getTypeParamBinding().size > 0) {
            res.append("[")
            generateScalaCodeEach(res, vt.getTypeParamBinding().filter(tvb => !tvb.getVariable().isInstanceOf[ModelTypeVariable]), ",")
            res.append("]")
          }
          //MODELTYPE ADDITION
        } else if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[ModelType]) {
          var mt: ModelType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ModelType]
          res.append("_root_.")
          res.append(Util.getModelTypeFactoryTypeQualifiedName(mt.getTypeDefinition()))
          res.append(".create_Model_")
          res.append(mt.getTypeDefinition().getName())

        } else if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]) {

          var ty: TypeDefinition = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
          res.append("_root_.")
          /*if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package])){
                        res.append(GlobalConfiguration.scalaAspectPrefix+".")
                    }*/

          if (Util.hasCompilerIgnoreTag(ty) && Util.hasScalaCompilerNameTag(ty)) {
            // calculate the name of the package by using the one of the type reduced
            res.append(k2.utils.TypeEquivalence.getPackageEquivalence(Util.getScalaCompilerNameTag(ty).substring(0, Util.getScalaCompilerNameTag(ty).lastIndexOf("."))))
          } else {
            res.append(k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNameCompilo(ty.eContainer())))
          }
          res.append("." + GlobalConfiguration.factoryName + ".create")
          res.append(ty.getName())
          var ty1: ParameterizedType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
          if (ty1.getTypeParamBinding().size > 0) {
            res.append("[")
            generateScalaCodeEach(res, ty1.getTypeParamBinding().filter(tvb => !tvb.getVariable().isInstanceOf[ModelTypeVariable]), ",")
            res.append("]")
          }
        } else {
          res.append("{")
          res.append("val name = " +
            "_root_.k2.utils.TypeEquivalence.getTypeEquivalenceReverse(" +
            "$" + getQualifiedNameCompilo(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType()) +
            ".erasure.getName" +
            ")\n" +
            "val c = scalaUtil.Util.getMetaClass(name)\n" +
            "if (c!=null){\n" +
            "_root_.k2.utils.UTilScala.newInstance(c).asInstanceOf[" +
            getQualifiedNameCompilo(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType()) +
            "]\n" +
            "}")
          res.append("else throw new RuntimeException(\"Impossible to instantiate a type parameter which is not a class\")\n")
          res.append("}")
        }
      } else {
        res.append("_root_.k2.utils.UTilScala.newInstance(")
        visit(thi.getTarget, res)
        res.append(")")

      }
    }
  }

  def generateTarget(thi: CallFeature, res: StringBuilder) {
    if (thi.getTarget() != null) {
      res.append("(")
      //            log.debug(""+thi.getTarget())
      visit(thi.getTarget(), res)
      res.append(")")
    } else {
      println("//TODODODODO " + thi.getName);
    }
  }
  def generateParam(thi: CallFeature, res: StringBuilder, openS: String, closeS: String) {
    res append openS
    generateScalaCodeEach(res, thi.getParameters, ", ")

    //MODELTYPE ADDITION: Add Factory parameters for modeltype parameterized operations and transformations
    generateFactoryParameters(thi, res)

    res append closeS
  }

  def generateFactoryParameters(thi: CallFeature, res: StringBuilder) = {
    if (thi.isInstanceOf[CallOperation]) {
      generateOperationFactoryParameters(thi.asInstanceOf[CallOperation], res)
    } else if (thi.isInstanceOf[CallModelTransformation]) {
      generateTransformationFactoryParemeters(thi.asInstanceOf[CallModelTransformation], res)
    }
  }

  def generateOperationFactoryParameters(co: CallOperation, res: StringBuilder) = {
    var first: Boolean = co.getParameters().size() == 0
    co.getStaticOperation().getTypeParameter().foreach(p => {
      if (p.isInstanceOf[ModelTypeVariable]) {
        var mtv: ModelTypeVariable = p.asInstanceOf[ModelTypeVariable]
        if (first) {
          first = false
        } else {
          res.append(", ")
        }
        res.append(Util.getModelTypeFactoryTypeQualifiedName(mtv.getSupertype().asInstanceOf[ModelType].getTypeDefinition()))
      }
    })
  }

  def generateTransformationFactoryParemeters(cmt: CallModelTransformation, res: StringBuilder) = {
    var first: Boolean = cmt.getParameters().size() == 0
    cmt.getStaticTransformation().getTypeParameters().foreach(p => {
      if (p.isInstanceOf[ModelTypeVariable]) {
        var mtv: ModelTypeVariable = p.asInstanceOf[ModelTypeVariable]
        if (first) {
          first = false
        } else {
          res.append(", ")
        }
        res.append(Util.getModelTypeFactoryTypeQualifiedName(mtv.getSupertype().asInstanceOf[ModelType].getTypeDefinition()))
      }
    })
  }

  def generatePropertyCall(thi: CallFeature, res: StringBuilder) {
    var TargetType: StringBuilder = new StringBuilder
    visit(thi.getTarget().getStaticType(), TargetType)
    res.append(GlobalConfiguration.scalaPrefix + k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName))

  }
  def generateOperationCall(thi: CallOperation, res: StringBuilder) {
    var TargetType: StringBuilder = new StringBuilder

    visit(thi.getTarget().getStaticType(), TargetType)

    if (thi.getTarget().getStaticType().isInstanceOf[Class]) {
      //          var ops : List[Operation] = thi.getTarget().getStaticType().asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName.equals(thi.getName))
      //          if (ops.size>0){
      //            res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
      //          }else{
      res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
      //          } 
    } else
      res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName())))
  }
  
  /*def generatePropertyCall(thi: CallProperty, res: StringBuilder) {
    var TargetType: StringBuilder = new StringBuilder
    visit(thi.getTarget().getStaticType(), TargetType)
    var prefix: String = ""
    if (isImplementingModelTypeInterface() && !Util.isCompilerIgnoreCall(thi)) {
      prefix = getCompilerConfiguration().modelTypeOperationsPrefix + prefix
    }
    res.append(prefix + k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName))
  }
  
  
  def generateOperationCall(thi: CallOperation, res: StringBuilder) {
    var TargetType: StringBuilder = new StringBuilder
    visit(thi.getTarget().getStaticType(), TargetType)
//    if (thi.getTarget().getStaticType().isInstanceOf[Class]) {
//      //          var ops : List[Operation] = thi.getTarget().getStaticType().asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName.equals(thi.getName))
//      //          if (ops.size>0){
//      //            res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
//      //          }else{
//      res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
//      //          } 
//    } else
//      res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName())))
//  }
    
    //MODELTYPE ADDITION
    var prefix: String = ""
    if (isImplementingModelTypeInterface() && !Util.isCompilerIgnoreCall(thi)) {
      prefix = getCompilerConfiguration().modelTypeOperationsPrefix + prefix
    }

    if (thi.getTarget().getStaticType().isInstanceOf[Class]) {
      res.append(Util.protectScalaKeyword(prefix + k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
    } else
      res.append(Util.protectScalaKeyword(prefix + k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName())))
  }*/

  //MODELTYPE ADDITION
  def generateModelTransformationCall(thi: CallModelTransformation, res: StringBuilder) = {
    var TargetType: StringBuilder = new StringBuilder
    visit(thi.getTarget().getStaticType(), TargetType)
    res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName())))
  }

  def generateName(thi: CallExpression, res: StringBuilder) {
    res.append(thi.getName())
  }
  def generatePropertyName(thi: CallFeature, res: StringBuilder) {
    res.append(GlobalConfiguration.scalaPrefix + thi.getName())
  }

  def generateEnumLiteralCall(thi: CallEnumLiteral, res: StringBuilder) {
    if (Util.hasEcoreTag(thi.getStaticEnumLiteral.getEnumeration)) {
      var res1: StringBuilder = new StringBuilder
      //generateName(thi,res1)
      res.append("getByName(\"" + thi.getStaticEnumLiteral().getName() + "\")")
    } else {
      res.append(thi.getStaticEnumLiteral().getName())
      //    generateName(thi,res)
    }
  }

  def generateKUnitCase(thi: CallFeature, res: StringBuilder) {
    visit(thi.getTarget(), res)
    res append ".run("
    var i = 0
    thi.getParameters.foreach(e => {
      if (i != 0) { res append ", " }
      res append "classOf["
      var className: StringBuilder = new StringBuilder
      visit(e, className)
      className.insert(className.lastIndexOf(".") + 1, "Rich")
      res.append(className.toString())
      res append "]"
      i = i + 1
    })
    res append ")"
  }

  def generateInstanceOf(thi: CallFeature, res: StringBuilder, o: org.kermeta.language.structure.KermetaModelElement) = {
    res.append("[")
    if (o.isInstanceOf[CallTypeLiteral]) {
      //res.append("_root_.")
      generateScalaCodeForInstanceOf(o.asInstanceOf[CallTypeLiteral], res)
    } else {
      visit(o, res)
    }
    res.append("]")

  }

  def generateIsInstanceOf(thi: CallFeature, res: StringBuilder, o: org.kermeta.language.structure.KermetaModelElement) = {
    o match {
      case o: CallTypeLiteral if (!(isCompiledToScalaType(o.getTyperef().getType()) && thi.getTarget.getStaticType() != o.getTyperef().getType()) // Avoid problem  like var o:Object:="toto" ; o.isInstanceOf[String] => false because o is a RichString and not a jl.String
        && !thi.getTarget().isInstanceOf[org.kermeta.language.behavior.Literal]) // Scala cannot call isInstanceOf on boolean and integer literals, void literal should be an instance of everything, and callType literal call reflexivity layer anyway => special treatment for literals (anyway, who would ask "toto".isInstanceOf(String) in a real case scenario where speed matters?)
        =>
        generateTarget(thi, res);
        res.append(".isInstanceOf[")
        generateScalaCodeForInstanceOf(o, res)
        res.append("]")
      case o =>
        res.append("_root_.k2.utils.UTilScala.isInstanceOf(")
        generateTarget(thi, res);
        res.append(",");
        visit(o, res)
        res.append(")")
    }
    //res.append("\n")    
  }

  def generateAsType(thi: CallFeature, res: StringBuilder, o: org.kermeta.language.structure.KermetaModelElement) = {
    o match {
      case o: CallTypeLiteral if (!(isCompiledToScalaType(o.getTyperef().getType()) && thi.getTarget.getStaticType() != o.getTyperef().getType())) // Avoid problem  like var o:Object:="toto" ; var s:String := o.asType(String) => error because o is a RichString and not a jl.String
      =>
        generateTarget(thi, res);
        res.append(".asInstanceOf[")
        generateScalaCodeForInstanceOf(o, res)
        res.append("]")
      case o: CallTypeLiteral =>
        res.append("_root_.k2.utils.UTilScala.getValue(")
        generateTarget(thi, res);
        res.append(").asInstanceOf[")
        generateScalaCodeForInstanceOf(o, res)
        res.append("]")
      case _ => throw new Exception("asType must have a type literal as a parameter. Please report this bug.")
    }
    //res.append("\n")    
  }

  def isCompiledToScalaType(thi: org.kermeta.language.structure.Type): java.lang.Boolean = {
    Array(
      "_root_.java.lang.String",
      "_root_.java.lang.Integer",
      "_root_.java.lang.Boolean",
      "_root_.java.lang.Double",
      "_root_.org.eclipse.emf.ecore.resource.ResourceSet",
      "_root_.org.eclipse.emf.ecore.resource.Resource",
      "_root_.java.lang.Character",
      "_root_.java.util.Date",
      "_root_.java.util.Random",
      "_root_.java.lang.Float",
      "_root_.java.util.Iterator",
      "_root_.java.lang.Long",
      "_root_.java.lang.StringBuilder",
      "_root_.java.util.Stack",
      "_root_.java.util.HashMap",
      "_root_.k2.standard.RichNumeric",
      "_root_.k2.standard.Comparable",
      "_root_.k2.standard.Summable").contains(getQualifiedNameCompilo(thi))
  }

  def generateIsNotEqual(thi: CallFeature, res: StringBuilder) {
    res.append("_root_.k2.utils.UTilScala.isNotEqual(")
    generateTarget(thi, res)
    res.append(",")
    generateParam(thi, res, "", "")
    res.append(")")
  }

  def generateToString(thi: CallFeature, res: StringBuilder) {
    if (Util.getEcoreRenameOperation(thi.asInstanceOf[CallOperation].getStaticOperation).equals("toString")) {
      res.append("_root_.k2.utils.UTilScala.toString(")
      generateTarget(thi, res)
      res.append(")")
    } else {
      res.append("{ val _tostring_val_ = ")
      generateTarget(thi, res)

      res.append("; if( _tostring_val_ ==null){\"void\"} else {_tostring_val_.")
      res.append(Util.getEcoreRenameOperation(thi.asInstanceOf[CallOperation].getStaticOperation))
      res.append("}}")
    }
  }

  def generateClone(thi: CallFeature, res: StringBuilder) {
    res.append("(scalaUtil.Util.clone("); generateTarget(thi, res); res.append(","); visit(thi.getParameters.get(0), res); res.append("))");
    if (thi.getTarget.isInstanceOf[CallTypeLiteral]) {
      res.append(".asInstanceOf[")
      // if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType.isInstanceOf[Class]){
      res.append("_root_." + k2.utils.TypeEquivalence.getTypeEquivalence(_root_.k2.utils.UTilScala.getQualifiedNameTypeJava(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType, ".")))
      res.append("]")
      //}else{
      //   res.append("_root_." + _root_.utils.UTilScala.getQualifiedNameType(thi.getTyperef().getType, "."))
      //}
    }
  }

  def visitCallOperation(thi: CallOperation, res: StringBuilder): Unit = {
    log.debug("Operation={}", thi.getName())
    thi.getName match {
      case "clone" => { generateClone(thi, res) }

      case "and" => { res.append("("); generateTarget(thi, res); res.append(").and"); generateParam(thi, res, "(", ")"); }
      case "toString" if (thi.getParameters().size() == 0) => generateToString(thi, res)
      case "isNotEqual" if (thi.getParameters().size() == 1) => generateIsNotEqual(thi, res)
      case "equals" if (thi.getParameters().size() == 1) => { res.append("("); generateTarget(thi, res); res.append(" == "); generateParam(thi, res, "(", ")"); res.append(")"); }
      //case "run" if(thi.getTarget != null) => generateKUnitCase(res)

      case "asType" if (thi.getParameters().size() == 1) => generateAsType(thi, res, thi.getParameters().get(0)) //{generateTarget(thi,res);res.append(".asInstanceOf");generateInstanceOf(thi,res, thi.getParameters.get(0))}
      case "isInstanceOf" if (thi.getParameters().size() == 1) => generateIsInstanceOf(thi, res, thi.getParameters.get(0))

      case "isVoid" => { res.append("_root_.k2.standard." + GlobalConfiguration.factoryName + ".isVoid("); generateTarget(thi, res); res.append(")"); }
      case "new" => {
        generateNew(thi, res)
        generateCallToInitializeFactories(thi, res)
      }
      case _ if (thi.getTarget != null && thi.getStaticOperation != null) => { generateTarget(thi, res); res.append("."); generateOperationCall(thi, res); generateParam(thi, res, "(", ")"); }
      case _ if (thi.getTarget == null && thi.getStaticOperation != null) => { res.append(Util.getEcoreRenameOperation(thi.getStaticOperation)); generateParam(thi, res, "(", ")") }
      case _ if (thi.getTarget != null && thi.getStaticOperation == null) => { generateTarget(thi, res); res.append("."); generateName(thi, res) }
      case _ => log.debug("!!! Uncatch case ")

    }
  }

  def visitCallModelTransformation(thi: CallModelTransformation, res: StringBuilder) = {
    thi.getName match {
      case "clone" => { generateClone(thi, res) }

      case "and" => { res.append("("); generateTarget(thi, res); res.append(").and"); generateParam(thi, res, "(", ")"); }
      case "toString" if (thi.getParameters().size() == 0) => generateToString(thi, res)
      case "isNotEqual" if (thi.getParameters().size() == 1) => generateIsNotEqual(thi, res)
      case "equals" if (thi.getParameters().size() == 1) => { res.append("("); generateTarget(thi, res); res.append(" == "); generateParam(thi, res, "(", ")"); res.append(")"); }
      case "asType" if (thi.getParameters().size() == 1) => generateAsType(thi, res, thi.getParameters().get(0)) //{generateTarget(thi,res);res.append(".asInstanceOf");generateInstanceOf(thi,res, thi.getParameters.get(0))}
      case "isInstanceOf" if (thi.getParameters().size() == 1) => generateIsInstanceOf(thi, res, thi.getParameters.get(0))

      case "isVoid" => { res.append("_root_.k2.standard." + GlobalConfiguration.factoryName + ".isVoid("); generateTarget(thi, res); res.append(")"); }
      case "new" => {
        generateNew(thi, res)
      }
      case _ if (thi.getTarget != null && thi.getStaticTransformation() != null) => {
        generateTarget(thi, res)
        res.append(".")
        generateModelTransformationCall(thi, res)
        generateParam(thi, res, "(", ")")
      }
      case _ if (thi.getTarget == null && thi.getStaticTransformation() != null) => {
        res.append(thi.getStaticTransformation().getName())
        generateParam(thi, res, "(", ")")
      }
      case _ if (thi.getTarget != null && thi.getStaticTransformation() == null) => {
        generateTarget(thi, res)
        res.append(".")
        generateName(thi, res)
      }
      case _ => log.debug("!!! Uncatch case ")

    }
  }

  //MODELTYPE ADDITION
  def generateCallToInitializeFactories(thi: CallOperation, res: StringBuilder) = {
    if (thi.getTarget.isInstanceOf[CallTypeLiteral]) {
      if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[VirtualType]) {
        var vt: VirtualType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[VirtualType]
        if (vt.getTypeParamBinding().filter(tvb => tvb.getVariable().isInstanceOf[ModelTypeVariable]).size > 0) {
          res.append("\n")
          generateTarget(thi, res)
          res.append(".initializeFactories(")
          var first = true
          vt.getTypeParamBinding().foreach(p => {
            if (p.isInstanceOf[ModelTypeVariable]) {
              if (first) {
                first = false
              } else {
                res.append(", ")
              }
              res.append(Util.getModelTypeFactoryTypeQualifiedName(p.asInstanceOf[ModelTypeVariable].getSupertype().asInstanceOf[ModelType].getTypeDefinition()))
            }
          })
          res.append(")\n")
        }
      } else if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]) {
        var ty1: ParameterizedType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
        if (ty1.getTypeParamBinding().filter(tvb => tvb.getVariable().isInstanceOf[ModelTypeVariable]).size > 0) {
          res.append("\n")
          generateTarget(thi, res)
          res.append(".initializeFactories(")
          var first = true
          ty1.getTypeParamBinding().foreach(p => {
            if (p.isInstanceOf[ModelTypeVariable]) {
              if (first) {
                first = false
              } else {
                res.append(", ")
              }
              res.append(Util.getModelTypeFactoryTypeQualifiedName(p.asInstanceOf[ModelTypeVariable].getSupertype().asInstanceOf[ModelType].getTypeDefinition()))
            }
          })
          res.append(")\n")
        }
      }
    }
  }

  def visitCallProperty(thi: CallProperty, res: StringBuilder): Unit = {
    log.debug("CallProperty={}", thi.getName())
    thi.getName match {
      case _ if (thi.getTarget != null && thi.getStaticProperty != null) => { generateTarget(thi, res); res.append("."); generatePropertyCall(thi, res) }
      case _ if (thi.getTarget == null && thi.getStaticProperty != null) => { generatePropertyName(thi, res) }
      case _ if (thi.getTarget != null && thi.getStaticProperty == null) => { generateTarget(thi, res); res.append("."); generateName(thi, res) }
      case _ => log.debug("!!! Uncatch case ")

    }
  }
  def visitCallEnumLiteral(thi: CallEnumLiteral, res: StringBuilder): Unit = {
    log.debug("CallEnumLiteral={}", thi.getName())
    thi.getName match {
      case _ if (thi.getStaticEnumLiteral != null) => {
        if (Util.hasEcoreTag(thi.getStaticEnumLiteral.getEnumeration)) {
          res.append(getPQualifiedNameCompilo(thi.getStaticEnumLiteral.getEnumeration)); res.append("."); generateEnumLiteralCall(thi, res);
        } else {
          res.append(getQualifiedNameCompilo(thi.getStaticEnumLiteral.getEnumeration)); res.append("."); generateEnumLiteralCall(thi, res);
        }
      }
      case _ => log.debug("!!! Uncatch case ")

    }
  }

}
