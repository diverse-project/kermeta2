package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.compilo.scala.LogAspect
import org.antlr.stringtemplate.StringTemplate
import fr.irisa.triskell.kermeta.compilo.scala.Util
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichIterable
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.EObject
import fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration

import fr.irisa.triskell.kermeta.compilo.scala.rich.RichUtil._

class PackageVisitor extends ObjectVisitor with CallFeatureAspect with ClassDefinitionAspect with OperationAspect with PropertyAspect with LogAspect {

  def visit(e: fr.irisa.triskell.kermeta.language.structure.Object, res: StringBuilder) = {
    e match {
      case o: Assignment => {
        visitAssignement(o, res)
      }
      case o: Block => {
        visitBlock(o, res)
      }
      case o: BooleanLiteral => {
        visitBooleanLiteral(o, res)
      }
      case o: CallResult => {
        visitCallResult(o, res)
      }
      case o: CallSuperOperation => {
        visitCallSuperOperation(o, res)
      }
      case o: CallValue => {
        visitCallValue(o, res)
      }
      case o: CallVariable => {
        visitCallVariable(o, res)
      }
      case o: Class => {
        visitClass(o, res)
      }
      case o: Conditional => {
        visitConditional(o, res)
      }
      case o: Constraint => {
        visitConstraint(o, res)
      }

      case o: Enumeration => {
        visitEnumeration(o, res)
      }
      case o: EnumerationLiteral => {
        visitEnumerationLiteral(o, res)
      }
      case o: PrimitiveType => {
        visitPrimitiveType(o, res)
      }
      case o: DataType => {
        visitDataType(o, res)
      }
      case o: IntegerLiteral => {
        visitIntegerLiteral(o, res)
      }
      case o: FunctionType => {
        visitFunctionType(o, res)
      }
      case o: JavaStaticCall => {
        visitJavaStaticCall(o, res)
      }
      case o: LambdaExpression => {
        visitLambdaExpression(o, res)
      }
      case o: LambdaParameter => {
        visitLambdaParameter(o, res)
      }
      case o: Loop => {
        visitLoop(o, res)
      }

      case o: ProductType => {
        visitProductType(o, res)
      }

      case o: Raise => {
        visitRaise(o, res)
      }

      case o: Rescue => {
        visitRescue(o, res)
      }
      case o: SelfExpression => {
        visitSelfExpression(o, res)
      }
      case o: StringLiteral => {
        visitStringLiteral(o, res)
      }
      case o: TypeLiteral => {
        visitTypeLiteral(o, res)
      }
      case o: TypeReference => {
        visitTypeReference(o, res)
      }
      case o: TypeVariableBinding => {
        visitTypeVariableBinding(o, res)
      }
      case o: Using => {
        visitUsing(o, res)
      }
      case o: VariableDecl => {
        visitVariableDecl(o, res)
      }
      case o: VoidLiteral => {
        visitVoidLiteral(o, res)
      }
      case o: VoidType => {
        visitVoidType(o, res)
      }
      case o: ClassDefinition => {
        visitClassDefinition(o, res)
      }
      case o: CallFeature => {
        visitCallFeature(o, res)
      }
       case o: Operation => {
        visitOperation(o, res)
      }
        case o: Property => {
        visitProperty(o, res)
      }
      case o: CallExpression => {
        visitCallExpression(o, res)
      }
    }
  }

  def visitAssignement(thi: Assignment, res: StringBuilder) {
    log.debug("Assignment={}", thi.toString)
    if (thi.isIsCast()) {
      res append "try{\n"
    }
    visit(thi.getTarget(), res)
    res.append(" = ")
    res append "("
    visit(thi.getValue(), res)
    res append ")"
    /* Step looking for a cast */
    var targetClass: StringBuilder = new StringBuilder
    if (!thi.isIsCast()) {
      //if(thi.getValue().isInstanceOf[VoidLiteral]){
      visit(thi.getTarget.getStaticType, targetClass)
      //}
    } else {
      if (thi.getTarget.getStaticType.isInstanceOf[Class] || thi.getTarget.getStaticType.isInstanceOf[PrimitiveType]) {
        visit(thi.getTarget.getStaticType, targetClass)
      } else {
        if (thi.getTarget.getStaticType.isInstanceOf[NamedElement]) {
          targetClass.append(thi.getTarget.getStaticType.asInstanceOf[NamedElement].getName)
        } else {
          log.debug("TODO Assignment with Cast")
        }
      }
    }
    
    var rightClass: StringBuilder = new StringBuilder
    //if(thi.getValue().isInstanceOf[VoidLiteral]){
     visit(thi.getValue.getStaticType, rightClass)
    
    	
    //println("left " + rightClass + "\n right " + targetClass)
    if ("_root_.java.lang.Integer".equals(rightClass.toString()) && "_root_.java.lang.Short".equals(targetClass.toString()))
    {
      res append ".toShort"
    }
    else  if ("_root_.java.lang.Integer".equals(targetClass.toString()) && "_root_.java.lang.Short".equals(rightClass.toString()))
    {
      res append ".toInt"
    }
    if ("_root_.java.lang.Integer".equals(rightClass.toString()) && "_root_.java.lang.Byte".equals(targetClass.toString()))
    {
      res append ".toByte"
    }
    else  if ("_root_.java.lang.Integer".equals(targetClass.toString()) && "_root_.java.lang.Byte".equals(rightClass.toString()))
    {
      res append ".toInt"
    }
    if ("_root_.java.lang.String".equals(rightClass.toString()) && "_root_.java.lang.Short".equals(targetClass.toString()))
    {
    	res append ".toShort"
    }
    else if ("_root_.java.lang.String".equals(targetClass.toString()) && "_root_.java.lang.Short".equals(rightClass.toString()))
    {
    	res append ".toString"
    }
    
    
    
    /* Generate Cast if found */
    if (!targetClass.toString.equals("")) {
      res append ".asInstanceOf[" + targetClass.toString + "]"
    }

    res.append(";")
    if (thi.isIsCast()) {
      res append "\n}catch { case e:ClassCastException => {}}\n"
    }
  }

  def visitBlock(thi: Block, res: StringBuilder) = {
    log.debug("BlockAspect Generation ")
    res.append("\n\n")
    var template = new StringTemplate("try {\n $body$ \n} catch {\n $catchBody$ }\n")
    var body, catchBody = new StringBuilder

    generateScalaCodeEach(body, thi.getStatement(), "\n") //BODY GEN
    thi.getRescueBlock().foreach(b => { visit(b, catchBody) }) //CATCH GEN
    //RESULT GEN
    if (thi.getRescueBlock().size() > 0) {
      template.setAttribute("body", body.toString)
      template.setAttribute("catchBody", catchBody)
      res.append(template.toString)
    } else {
      res.append("{\n" + body.toString + "}\n")
    }
  }

  def visitBooleanLiteral(thi: BooleanLiteral, res: StringBuilder): Unit = {
    res.append(thi.isValue());
  }

  def visitCallExpression(thi: CallExpression, res: StringBuilder): Unit = {
    res.append(".")
    res.append(Util.protectScalaKeyword(thi.getName()))
    res.append("(")
    thi.getParameters().foreach(par => visit(par, res))
    res.append(")")
  }

  def visitCallResult(thi: CallResult, res: StringBuilder): Unit = {
    res.append("result")
  }

  def visitCallValue(thi: CallValue, res: StringBuilder): Unit = {
    res.append(Util.protectScalaKeyword(thi.getName()))
    if (thi.getParameters().size > 0) {
      res.append("(")
      thi.getParameters().foreach(par => visit(par, res))
      res.append(")")
    }
  }

  def visitCallVariable(thi: CallVariable, res: StringBuilder): Unit = {
    res.append(Util.protectScalaKeyword(thi.getName()))
    if (thi.getParameters() != null && thi.getParameters().size > 0) {
      res append "("
      generateScalaCodeEach(res, thi.getParameters(), ",")
      res append ")"
    }
  }

  def visitConditional(thi: Conditional, res: StringBuilder): Unit = {
    res.append("if (")
    visit(thi.getCondition(), res)
    res.append(")")
    visit(thi.getThenBody(), res)
    if (thi.getElseBody() != null) {
      res.append("else \n")
      visit(thi.getElseBody(), res)
    }
  }

  def visitConstraint(thi: Constraint, res: StringBuilder): Unit = {
    res.append("{\n")
    visit(thi.getBody(), res)
    res.append("}\n")
  }

  def visitDataType(thi: DataType, res: StringBuilder): Unit = {
    res.append(utils.UTilScala.getQualifiedNamePackage(thi.eContainer().asInstanceOf[Package], "."))
    res.append(".")
    res.append(thi.getName())
  }

  def visitEnumerationLiteral(thi: EnumerationLiteral, res: StringBuilder): Unit = {
    res.append(thi.getName())
  }

  def visitFunctionType(thi: FunctionType, res: StringBuilder): Unit = {
    visit(thi.getLeft(), res)
    res.append(" => ")
    visit(thi.getRight(), res)
  }

  def visitIntegerLiteral(thi: IntegerLiteral, res: StringBuilder): Unit = {
    res.append(thi.getValue().toString)
  }

  def visitJavaStaticCall(thi: JavaStaticCall, res: StringBuilder): Unit = {

    res.append(thi.getJclass.replace("::", ".") + "." + thi.getJmethod + "(")
    var i = 0
    thi.getParameters.foreach { par =>
      if (i != 0) { res append "," }
      visit(par, res)
      i = i + 1
    }
    res.append(")")
  }

  def visitLambdaExpression(thi: LambdaExpression, res: StringBuilder): Unit = {
    res append ("{(")
    generateProtectedScalaCodeEach(res, thi.getParameters(), ",")
    res append (")=>")
    visit(thi.getBody(), res)
    res.append("}")
  }

  def visitLambdaParameter(thi: LambdaParameter, res: StringBuilder): Unit = {
    res.append(thi.getName())
    if (thi.getType() != null) {
      res.append(" : ")
      visit(thi.getType(), res)
    }
  }

  def visitLoop(thi: Loop, res: StringBuilder): Unit = {
    res.append("\n\n{")
    visit(thi.getInitialization(), res)
    res.append("\n")
    res.append("while (!(")
    visit(thi.getStopCondition(), res)
    res.append("))\n")
    visit(thi.getBody(), res)
    res.append("}")
  }

  def ObjectTypeVariable(thi: ObjectTypeVariable, res: StringBuilder) = {
    res.append(thi.getName())
  }

  def visitProductType(thi: ProductType, res: StringBuilder): Unit = {
    res.append("(")
    generateScalaCodeEach(res, thi.getType, ",")
    res.append(")")
  }

  def visitRaise(thi: Raise, res: StringBuilder): Unit = {
    res.append("throw ")
    visit(thi.getExpression(), res)
  }

  def visitRescue(thi: Rescue, res: StringBuilder): Unit = {
    if (thi.getExceptionType != null) {
      res.append("case " + thi.getExceptionName() + ":")
      visit(thi.getExceptionType, res)
    } else {
      res.append("case _ ")
    }
    res.append(" => {")
    thi.getBody().foreach(b => { visit(b, res); res.append("\n") })
    res.append("}\n")
  }

  def visitPrimitiveType(thi: PrimitiveType, res: StringBuilder): Unit = {

    if (Util.hasEcoreTag(thi)) {
      var t1 = thi.getOwnedTags.filter(e => "ecore.EDataType_instanceClassName".equals(e.getName))
      var t =
        if (t1 != null && t1.size > 0) {
          t1.first.getValue;
        } else {
          thi.getName match {
            case "String" => "java.lang.String"
            case "Boolean" => "java.lang.Boolean"
            case "Integer" => "java.lang.Integer"
            case "UnlimitedNatural" => "java.lang.Integer"
            case _ => { println("default " + thi.getName); "java.lang.Object" }
          }
        }
      //   println("primitive " + t)
      res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
      log.debug("PrimitiveTypeComplement=" + kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
      /* Check Generique Param */
      try {
        var c = java.lang.Class.forName(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
        if (c.getTypeParameters.size > 0) {
          res.append("[")
          for (i <- 0 until c.getTypeParameters.length) {
            res.append("org.eclipse.emf.ecore.EObject")
            if (i < c.getTypeParameters.length - 1) {
              res.append(",")
            }
          }
          res.append("]")
        }

      } catch {
        case _ =>
      }

    } else {
      if (thi.getInstanceType != null) {
        visit(thi.getInstanceType, res)
      } else
        res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi.eContainer().asInstanceOf[Package])) + "." + thi.getName())
    }
  }

  def visitSelfExpression(thi: SelfExpression, res: StringBuilder): Unit = {
    res.append("this")
  }

  def visitStringLiteral(thi: StringLiteral, res: StringBuilder): Unit = {
    res.append("\"")
    var stringlit = thi.getValue
    var stringlitRes = new StringBuilder
    for (i <- 0 until stringlit.size) {
      stringlit.charAt(i) match {
        case '"' => stringlitRes.append("\\"); stringlitRes.append("\"")
        case '\\' => stringlitRes.append("\\"); stringlitRes.append("\\")
        case '\n' => stringlitRes.append("\\n");
        case '\t' => stringlitRes.append("\\t");
        case _@ c => stringlitRes.append(c)
      }
    }
    res.append(stringlitRes.toString) //.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t") )
    res.append("\"")
  }

  def visitTypeLiteral(thi: TypeLiteral, res: StringBuilder): Unit = {
    //if (thi.getTyperef().getType.isInstanceOf[Class]) {
      res.append("scalaUtil.Util.getMetaClass(\"")
      res.append(_root_.utils.UTilScala.getQualifiedNameTypeKermeta(thi.getTyperef().getType, "."))
    //}// else {
    //  res.append("_root_." + _root_.utils.UTilScala.getQualifiedNameTypeKermeta(thi.getTyperef().getType, "."))
    //}
    //this.getTyperef().getType.generateScalaCode(res)
    //if (thi.getTyperef().getType.isInstanceOf[Class]) {
      res.append("\")")
    //}
  }

  def generateScalaCodeForInstanceOf(thi: TypeLiteral, res: StringBuilder): Unit = {
    visit(thi.getTyperef().getType, res)
  }

  def visitTypeReference(thi: TypeReference, res: StringBuilder): Unit = {
    visit(thi.getType(), res)
  }

  def visitVariableDecl(thi: VariableDecl, res: StringBuilder) = {
    var template = new StringTemplate("var $ident$ : $type$ = $init$;")
    var typeVal, initVal = new StringBuilder
    getListorType(thi, typeVal)
    template.setAttribute("ident", Util.protectScalaKeyword(thi.getIdentifier))
    template.setAttribute("type", typeVal.toString)
    if (thi.getInitialization != null) {
      visit(thi.getInitialization(), initVal)
    } else {
      initVal.append("null.asInstanceOf[" + typeVal.toString + "]")
    }
    template.setAttribute("init", initVal.toString)
    res.append(template.toString)
  }

  def getListorType(thi: VariableDecl, res: StringBuilder) = {
    if (thi.getType.getUpper > 1 || thi.getType.getUpper == -1) {
      if (thi.getType.isIsOrdered) {
        res.append("java.util.List[")
      } else {
        res.append("java.util.List[")
      }
      visit(thi.getType(), res)
      res.append("]")
    } else {
      visit(thi.getType, res)
    }
  }

  def visitTypeVariableBinding(thi: TypeVariableBinding, res: StringBuilder) = {
    visit(thi.getType, res)
  }

  def visitUsing(thi: Using, res: StringBuilder) = {
    res.append("\n")
    res.append("import ")
    res.append(thi.getQualifiedName().replaceAll("::", "."))
    res.append("._\n")
  }

  def visitVoidLiteral(thi: VoidLiteral, res: StringBuilder): Unit = {
    res.append("null")
  }

  def visitVoidType(thi: VoidType, res: StringBuilder): Unit = {
    res.append("kermeta.standard.Void")
  }

  def visitClass(thi: Class, res: StringBuilder): Unit = {
    /*var pack : String = this.getTypeDefinition().eContainer().asInstanceOf[Package].getQualifiedName
         pack=kermeta.utils.TypeEquivalence.getPackageEquivalence(pack);
         var s : String = pack + "."+this.getTypeDefinition().asInstanceOf[ClassDefinition].getName
         //		if (Util.currentPackage.equals(pack))
         //				res.append(this.getTypeDefinition().asInstanceOf[ClassDefinition].getName )
         //		else
         res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(s))*/
    //                                                             typeEquivelence.put("fr.irisa.triskell.kermeta.language.structure.Object","java.lang.Object")

    var qualifiedName = getQualifiedNameCompilo(thi)
    if (qualifiedName.contains("fr.irisa.triskell.kermeta.language.structure.Object") && !qualifiedName.contains("ObjectTypeVariable")) {
      res.append(qualifiedName.replace("fr.irisa.triskell.kermeta.language.structure.Object", "java.lang.Object"))
    } else {
      res.append(qualifiedName)
    }
    /* Check Generique Param */

    if (thi.getTypeParamBinding.size() > 0) {

      var i: Int = 1
      res.append("[")
      thi.getTypeParamBinding.foreach(e => {
        //                    res.append("_<:")
        var res1: StringBuilder = new StringBuilder
        visit(e, res1)
        if (false && res1.toString.contains(classOf[fr.irisa.triskell.kermeta.language.structure.Object].getCanonicalName))
          //                        res.append("_ <: _root_.org.eclipse.emf.ecore.EObject")
          res.append("_ <: _root_.java.lang.Object")
        else
          res.append(res1.toString)
        if (i < thi.getTypeParamBinding.size()) {
          res.append(", ")
        }
        i = i + 1;
      })
      res.append("]")

      //TODO
    } else {

      try {
        var c = java.lang.Class.forName(getQualifiedNameCompilo(thi))
        if (c.getTypeParameters.size > 0) {
          res.append("[")
          for (i <- 0 until c.getTypeParameters.length) {
            res.append("_")
            if (i < c.getTypeParameters.length - 1) {
              res.append(",")
            }
          }
          res.append("]")
        }
      } catch {
        case _ =>
      }
    }

  }

  def visitCallSuperOperation(thi: CallSuperOperation, res: StringBuilder): Unit = {
    /* SEARCH FOR CONTAINER OPERATION */
    var actualEObject: EObject = thi
    while (!actualEObject.eClass().getName().equals("Operation")) {
      log.debug("Search For super Operation {}", actualEObject.eClass.getName)
      actualEObject = actualEObject.eContainer()
    }
    var actualOperation = actualEObject.asInstanceOf[Operation]
    /* Out EObject Iinstance of Operaiton */

    var superClassFromName = actualOperation.getSuperOperation().getOwningClass.getName
    var classFrom = actualOperation.getOwningClass

    //SEARCH THE FIRST LEVEL SUPER TYPE WHERE OPERATION COMING FROM
    var superTrait = classFrom.getSuperType.filter({ s => isSubTypeOf(s, superClassFromName) }).head
    /* var superTrait : Type = null
    var maxLevel : Int = 2
    classFrom.getSuperType.filter({s=>isSubTypeOf(s, superClassFromName)}).foreach{stype=>
      log.debug("Selecting classFrom {} or {}",stype.getQualifiedNameCompilo, classFrom.getQualifiedNameCompilo)
      if (stype.getQualifiedNameCompilo == classFrom.getQualifiedNameCompilo) {
        superTrait = stype
        maxLevel = 1
        log.debug("Found stype level 1 {}",superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)
      }
      else {
        if (maxLevel == 2 ){
          superTrait = stype
          log.debug("Found stype level 2 {}",superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)
        }
      }

    }*/

    log.debug("operation {} from {}", actualOperation.getName, superClassFromName)
    log.debug(" => {}", superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)
    res.append("super[" + superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName + "Aspect]")
    res.append("." + Util.getEcoreRenameOperation(actualOperation.getSuperOperation))
    res.append("(")
    generateScalaCodeEach(res, thi.getParameters, ",")
    //this.getParameters().foreach(par => par.generateScalaCode(res))
    res.append(")")
  }

  def visitEnumeration(thi: Enumeration, res: StringBuilder): Unit = {
    if (!Util.hasEcoreTag(thi)) {
      res.append("_root_." + kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi.eContainer())) + "." + thi.getName() + "." + thi.getName())
    } else {
      res.append("_root_." + kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi.eContainer())) + "." + thi.getName())
    }
  }

  def generateEnum(thi: Enumeration): Unit = {

    if (!Util.hasEcoreTag(thi)) {
      var res: StringBuilder = new StringBuilder
      res.append("package " + kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi.eContainer())) + "\n")
      res.append("import kermeta.io._\n")
      res.append("import kermeta.standard._\n")
      res.append("import kermeta.standard.JavaConversions._\n")
      res append "object " + thi.getName() + " extends Enumeration {\n"
      res append "type " + thi.getName() + " = Value\n"
      res append "val "
      var i = 0
      thi.getOwnedLiteral().foreach { e =>
        if (i != 0) res.append(",")
        res.append(Util.protectScalaKeyword(e.getName()))
        i = i + 1
      }
      res append " = Value\n" + "}"
      Util.generateFile(kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi.eContainer())), thi.getName, res.toString())
    }

  }

  def isSubTypeOf(typ: Type, superClassName: String): Boolean = {
    //log.error("ECHOECHO "+typ.getQualifiedNameCompilo + " "+superClassName)
    if (typ.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName.equals(superClassName)) {
      return true
    } else {

      typ.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getSuperType.exists({ s => isSubTypeOf(s, superClassName) })
    }
  }

  def generateScalaCodeEach[A <: fr.irisa.triskell.kermeta.language.structure.Object](res: StringBuilder, list: Iterable[A], sep: String) = {
    implicit def rich(xs: Iterable[A]) = new RichIterable(list)
    list.foreachCtx((e, ctx) => {
      if (!ctx.isFirst) { res.append(sep) }
      visit(e.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object], res)
    })
  }

  def generateProtectedScalaCodeEach[A <: fr.irisa.triskell.kermeta.language.structure.Object](res: StringBuilder, list: Iterable[A], sep: String) = {
    implicit def rich(xs: Iterable[A]) = new RichIterable(list)
    list.foreachCtx((e, ctx) => {
      if (!ctx.isFirst) { res.append(sep) }
      var temp = new StringBuilder
      visit(e, temp)
      res.append(Util.protectScalaKeyword(temp.toString))
    })
  }

  def whichBoolean(thi: PrimitiveType): String = {
    var res = kermeta.utils.TypeEquivalence.getTypeEquivalence(getQualifiedNameCompilo(thi.eContainer()) + "." + thi.getName())

    return res;
  }

  def getQualifiedNameCompilo(thi: EObject): String = {
    thi match {
      case (p: Package) => {
        return kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName(thi))
      }
      case c: Class => {
        var res = new StringBuilder
        var typename = Util.protectScalaKeyword(getQualifiedNamedBase(c.getTypeDefinition))
        if (typename.contains(".")) res.append("_root_.")
        res.append(typename)

        /*if (this.getTypeParamBinding.size>0){
	         var i = 0;
	         res.append("[")
	         this.getTypeParamBinding.foreach(ty => {
	         if (i>0) {res.append(",")}
	         ty.generateScalaCode(res)
	         i = i+1
	         })
	         res.append("]")
	
	         }*/
        return res.toString

      }
      case (pt: PrimitiveType) => {
        var res = new StringBuilder
        visit(pt, res)
        return res.toString()
      }
      case (c: Enumeration) => {
        return getQualifiedNameCompilo(c.eContainer()) + "." + c.getName();
      }
      case c: ClassDefinition => {
        return kermeta.utils.TypeEquivalence.getTypeEquivalence(getQualifiedNameCompilo(c.eContainer()) + "." + c.getName())
      }
    }
  }

  def getQualifiedName(thi: EObject): String = {
    var res = new StringBuilder
    thi match {
      case (p: Package) => {

        if (p.getNestingPackage != null) {
          res.append(getQualifiedName(p.getNestingPackage) + ".")
        }
        res.append(p.getName)
      }

      case _ =>
    }

    return res.toString()
  }

  def getQualifiedNameKermeta(thi: Package): String = {
    var res: String = ""
    if (thi.getNestingPackage != null) {
      res = getQualifiedName(thi.getNestingPackage) + "::"
    }
    res = res + thi.getName
    return res

  }

  def getQualifiedNameKermeta(thi: ClassDefinition): String = {
    getQualifiedNameKermeta(thi.eContainer().asInstanceOf[Package]) + "::" + thi.getName();
  }

  def getQualifiedNamedAspect(typD: GenericTypeDefinition): String = {
    var baseName = getQualifiedNameCompilo(typD)

    //if(baseName.equals("org.eclipse.emf.ecore.ENamedElementAspect")){
    log.debug(baseName + " - " + Util.hasEcoreTag(typD) + " - " + Util.hasEcoreTag(typD.eContainer().asInstanceOf[Object]))
    //}

    baseName = baseName match {
      //case _ if(!Util.hasEcoreTag(this) && Util.hasEcoreTag(this.eContainer().asInstanceOf[Object])) => { "ScalaAspect."+baseName }
      //case _ if(Util.hasEcoreTag(typD) && Util.hasEcoreTag(typD.eContainer().asInstanceOf[Object])) => baseName
      case _ if (!Util.hasEcoreTag(typD) && !Util.hasEcoreTag(typD.eContainer().asInstanceOf[Object])) => baseName
      case _ => { GlobalConfiguration.scalaAspectPrefix + "." + baseName }
    }
    return baseName + "Aspect"
  }

  def getQualifiedNamedBase(typD: GenericTypeDefinition): String = {
    var baseName = getQualifiedNameCompilo(typD)
    baseName = baseName match {
      case _ if (!Util.hasEcoreTag(typD) && Util.hasEcoreTag(typD.eContainer().asInstanceOf[Object]) && !baseName.equals("java.util.List")) => { GlobalConfiguration.scalaAspectPrefix + "." + baseName }
      case _ => { baseName }
    }
    return baseName
  }

}