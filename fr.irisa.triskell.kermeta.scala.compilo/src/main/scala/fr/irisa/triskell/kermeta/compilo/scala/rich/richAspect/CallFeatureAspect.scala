package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends ObjectVisitor with LogAspect {
	
	
    def generateNew(thi:CallFeature,res : StringBuilder) = {

        if (thi.getTarget!=null){
            if (thi.getTarget.isInstanceOf[TypeLiteral]){
                if (thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]){
				
                    var ty : TypeDefinition =thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
                    res.append("_root_.")
                    if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package])){
                        res.append(GlobalConfiguration.scalaAspectPrefix+".")
                    }
                    res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNameCompilo(ty.eContainer)))
                    res.append("."+GlobalConfiguration.factoryName+".create")
                    res.append(ty.getName())
                    var ty1 : ParameterizedType = thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
                    //var i = 0;
                    if (ty1.getTypeParamBinding().size > 0){
                        res.append("[")
                        generateScalaCodeEach(res,ty1.getTypeParamBinding(),",")
                        //ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
                        res.append("]")
                    }
                }
                else{//TODO gérer l'initialisation des types paramétrés
                    res.append("null.asInstanceOf[" + getQualifiedNameCompilo(thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType()) + "]")
                }
            }else{
                res.append("utils.UTilScala.newInstance(")
                visit(thi.getTarget,res)
                res.append(")")

            }
        }
    }
	
	
    def generateTarget(thi:CallFeature,res : StringBuilder){
        if (thi.getTarget()!=null){
            res.append("(")
            visit(thi.getTarget(),res)
            res.append(")")
        }else{
            println("//TODODODODO " + thi.getName);
        }
    }
    def generateParam(thi:CallFeature,res : StringBuilder,openS : String,closeS : String){
        res append openS
        generateScalaCodeEach(res,thi.getParameters,", ")
        res append closeS
    }
	
    def generatePropertyCall(thi:CallFeature,res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
        visit(thi.getTarget().getStaticType(),TargetType)
        res.append(GlobalConfiguration.scalaPrefix+kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName))
		
    }
    def generateOperationCall(thi:CallFeature,res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
    
        visit(thi.getTarget().getStaticType(),TargetType)
    
        if(thi.getName.contains("split")){
            println("call equivalence")
            //println(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName)))
        }
    
    
        var ops : List[Operation] = thi.getTarget().getStaticType().asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName.equals(thi.getName))
        if (ops.size>0){
            //if (ops.get(0).getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
            //  res.append(Util.protectScalaKeyword(ops.get(0).getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
            //}else{
            res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName)))

            //}
        }else{
            res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))

        }
    }
	
    def generateName(thi:CallFeature,res : StringBuilder){
        res.append(thi.getName())
    }
    def generatePropertyName(thi:CallFeature,res : StringBuilder){
        res.append(GlobalConfiguration.scalaPrefix + thi.getName())
    }

    def generateEnumLiteralCall(thi:CallFeature,res : StringBuilder){
        if (Util.hasEcoreTag(thi.getStaticEnumLiteral.getEnumeration)){
            var res1 : StringBuilder = new StringBuilder
            generateName(thi,res1)
            res.append("getByName(\""+res1.toString+"\")")
        }else{
            generateName(thi,res)
        }
    }

    def generateIsInstance(thi:CallFeature,res : StringBuilder){
        res.append(thi.getName())
    }

    def generateKUnitCase(thi:CallFeature,res : StringBuilder){
        visit(thi.getTarget(),res)
        res append ".run("
        var i = 0
        thi.getParameters.foreach(e=> {
                if(i != 0) { res append ", " }
                res append "classOf["
                var className :StringBuilder = new StringBuilder
                visit(e,className)
                className.insert(className.lastIndexOf(".")+1,"Rich")
                res.append(className.toString())
                res append "]"
                i = i + 1
            })
        res append ")"
    }

    def generateInstanceOf(thi:CallFeature,res:StringBuilder, o : fr.irisa.triskell.kermeta.language.structure.Object)={
        res.append("[")
        if (o.isInstanceOf[TypeLiteral]){
            //res.append("_root_.")
            generateScalaCodeForInstanceOf(o.asInstanceOf[TypeLiteral],res)
        }
        else{
            visit(o,res)
        }
        res.append("]")

    }
  
    /* TO MERGE */
    def generateIsInstanceOf(thi:CallFeature,res:StringBuilder, o : fr.irisa.triskell.kermeta.language.structure.Object)={
        if (o.isInstanceOf[TypeLiteral]){
            generateTarget(thi,res);
            res.append(".");
    
            res.append("isInstanceOf[")
            //res.append("_root_.")
            generateScalaCodeForInstanceOf(o.asInstanceOf[TypeLiteral],res)
            res.append("]")
        }
        else{
            res.append("utils.UTilScala.isInstanceOf(")

            generateTarget(thi,res);
            res.append(",");
    
            visit(o,res)
            res.append(")")
        }
        res.append("\n")    
    }  
  
  
    def generateClone(thi:CallFeature,res:StringBuilder){
        res.append("(scalaUtil.Util.clone(");generateTarget(thi,res);res.append(","); visit(thi.getParameters.get(0),res);res.append("))"); 
            if (thi.getTarget.isInstanceOf[TypeLiteral]){
                res.append(".asInstanceOf[")
               // if (thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType.isInstanceOf[Class]){
                    res.append("_root_." +kermeta.utils.TypeEquivalence.getTypeEquivalence(_root_.utils.UTilScala.getQualifiedNameTypeJava(thi.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType, ".")))
                    res.append("]")
                //}else{
                 //   res.append("_root_." + _root_.utils.UTilScala.getQualifiedNameType(thi.getTyperef().getType, "."))
                //}
            }
    }
    
    

            def visitCallFeature(thi:CallFeature,res : StringBuilder) : Unit = {
                log.debug("CallFeature={}",thi.getName())
                thi.getName match {
                    case "clone" =>  { generateClone(thi,res)  }
      
                    case "and" =>  { res.append("(");generateTarget(thi,res);res.append(").and");generateParam(thi,res,"(",")"); }
                        //case "isVoid" => { res.append("(");generateTarget(res);res.append("==null)")  }
                    case "toString" => { res.append("(");generateTarget(thi,res);res.append("+\"\")")  }
                    case "isNotEqual" => {generateTarget(thi,res);res.append(" != ");generateParam(thi,res,"(",")")}
                    case "isEqual" => {generateTarget(thi,res);res.append(" == ");generateParam(thi,res,"(",")")}
                    case "equals" => {res.append("(");generateTarget(thi,res);res.append(" == ");generateParam(thi,res,"(",")");res.append(")");}
                        //case "run" if(thi.getTarget != null) => generateKUnitCase(res)
        
        
                    case "asType" => {generateTarget(thi,res);res.append(".asInstanceOf");generateInstanceOf(thi,res, thi.getParameters.get(0))}
      
                    case "asKindOf" => {generateTarget(thi,res);res.append(".asInstanceOf");generateInstanceOf(thi,res, thi.getParameters.get(0))}
                    //case "isInstanceOf" => {generateTarget(res);res.append(".isInstanceOf");generateInstanceOf(res, thi.getParameters.get(0))}
                    case "isInstance" => {generateParam(thi,res,"","") ;res.append(".isInstanceOf");generateInstanceOf(thi,res, thi.getTarget)}
      
                    case "isKindOf" => generateTarget(thi,res);res.append(".Kermeta");generateOperationCall(thi,res);generateParam(thi,res,"(",")")
                    case "isInstanceOf" => generateIsInstanceOf(thi,res,thi.getParameters.get(0) )
        
      
                    case "isVoid" => { res.append("_root_.kermeta.standard."+GlobalConfiguration.factoryName+".isVoid("); generateTarget(thi,res);res.append(")");}
                    case "add"
                        if (thi.getTarget != null && thi.getTarget.getStaticType != null && thi.getTarget.getStaticType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]
                            && (thi.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("OrderedSet")
                                ||thi.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("Set")))
                                    =>{generateTarget(thi,res);res.append(".");res.append("addUnique");generateParam(thi,res,"(",")")}
                    case "addAll"
                        if (thi.getTarget != null && (thi.getTarget.getStaticType != null && thi.getTarget.getStaticType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]) //|| (thi.getStaticProperty != null && thi.getStaticProperty.getType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]))
                            && (thi.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("OrderedSet")
                                ||thi.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("Set")))
                                    =>{generateTarget(thi,res);res.append(".");res.append("addAllUnique");generateParam(thi,res,"(",")")}
                    case "new" => generateNew(thi,res)
                    case _ if(thi.getTarget != null && thi.getStaticOperation!=null && thi.getStaticProperty==null) => {generateTarget(thi,res);res.append(".");generateOperationCall(thi,res);generateParam(thi,res,"(",")")}
                    case _ if(thi.getTarget == null && thi.getStaticOperation!=null && thi.getStaticProperty==null) => {res.append(Util.getEcoreRenameOperation(thi.getStaticOperation));generateParam(thi,res,"(",")") }
                    case _ if(thi.getTarget != null && thi.getStaticProperty!=null && thi.getStaticOperation==null) => {generateTarget(thi,res);res.append(".");generatePropertyCall(thi,res) }
                    case _ if(thi.getTarget == null && thi.getStaticProperty!=null && thi.getStaticOperation==null) => {generatePropertyName(thi,res) }
                    case _ if(thi.getTarget != null && thi.getStaticProperty==null && thi.getStaticOperation==null && thi.getStaticEnumLiteral !=null ) => {generateTarget(thi,res);res.append(".");generateEnumLiteralCall(thi,res); }
                    case _ if(thi.getTarget != null && thi.getStaticProperty==null && thi.getStaticOperation==null && thi.getStaticEnumLiteral ==null) => {generateTarget(thi,res);res.append(".");generateName(thi,res) }
                    case _ => log.debug("!!! Uncatch case ")
 
                }
            }
	
	
        }
