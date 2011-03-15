package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._

trait OperationAspect extends ObjectAspect with LogAspect {
	
  implicit def rich (xs : OperationAspect) = xs.asInstanceOf[Operation]

  def generateSignature(res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(this)){
      log.debug("Operation={}",this.getName)
      res.append("\n   ")
      //TODO in fact it should limit this case to operation that come from Kermeta Object
      if (this.getSuperOperation()!=null   && !Util.hasEcoreTag( this.getSuperOperation().asInstanceOf[Operation].getOwningClass )      ){
               res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
        res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(this)))
      //}
      this.generateParamerterOp( res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      this.getOwnedParameter.foreach(par => {
          if (i==0) {
            res.append(Util.protectScalaKeyword(par.getName()))
            res.append(" : ")
            this.getListorType(par, res)//par.getType.generateScalaCode(res)
          }else{
            res.append(", ")
            res.append(Util.protectScalaKeyword(par.getName()))
            res.append(" : ")
            this.getListorType(par, res)//					par.getType.generateScalaCode(res)
          }
          i=i + 1
        })
      res.append(") : ")
      var res1 = new StringBuilder
      this.getListorType(res1)
      if ("_root_.kermeta.standard.Void".equals(res1.toString)){
        res.append("Unit")
      }else{
        res.append(res1)
      }
    }
  }
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(this)){
      log.debug("Operation={}",this.getName)
      res.append("\n   ")
      if (this.getSuperOperation()!=null          ){
        res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
        res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(this)))
      //}
      this.generateParamerterOp( res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      this.getOwnedParameter.foreach(par => {
          if (i==0) {
            res.append(Util.protectScalaKeyword(par.getName()))
            res.append(" : ")
            this.getListorType(par, res)//par.getType.generateScalaCode(res)
          }else{
            res.append(", ")
            res.append(Util.protectScalaKeyword(par.getName()))
            res.append(" : ")
            this.getListorType(par, res)//					par.getType.generateScalaCode(res)
          }
          i=i + 1
        })
      res.append("):")
      /* Return Type Declaration */
     var res1 = new StringBuilder
      this.getListorType(res1)
      if ("_root_.kermeta.standard.Void".equals(res1.toString)){
        res.append("Unit")
      }else{
        res.append(res1)
      }
      //this.getType.generateScalaCode(res)
        res.append(" = {\n")
        res.append("var result : ")
        this.getListorType(res)
        //   this.getType.generateScalaCode(res)
        //res append "Any"
        res.append(" = null.asInstanceOf[")
        this.getListorType(res)
        //this.getType.generateScalaCode(res)
        res.append("]; \n")
      if (this.getBody!= null){
				
        this.getBody().asInstanceOf[ObjectAspect].generateScalaCode(res)
      }
        res append " return result\n}\n"
        //this.getType.generateScalaCode(res)
        //res append "]\n}\n"
        //res.append("}/*End_"+this.getName()+"*/\n")
      //} else {
      //  res.append("\n")
      //}
    }
  }
  def generateParamerterOp(res1:StringBuilder) = {
    if (this.getTypeParameter().size()>0){  res1.append("[")
                                          var ii = 0;
                                          this.getTypeParameter.foreach{param=>
        if (ii>0) {res1.append(",")}
        res1.append(param.asInstanceOf[ObjectAspect].getQualifiedNameCompilo())
        ii= ii+1
      }
                                          res1.append("]")
    }
  }

  def getListorType(res:StringBuilder)={

    var res1 : StringBuilder = new StringBuilder

    if (this.getUpper>1 ||this.getUpper == -1){
      if (this.getIsOrdered.booleanValue){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }

      this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
      res.append("]")

    } else {


      this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))

    }


  }

  def getListorType(param:Parameter,res:StringBuilder)={
    var res1 : StringBuilder = new StringBuilder
    if (param.getUpper>1 ||param.getUpper == -1){
      if (param.getIsOrdered.booleanValue){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      param.getType().asInstanceOf[ObjectAspect].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
      res.append("]")
    } else {
      param.getType().asInstanceOf[ObjectAspect].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
    }


  }

  def getLocalTypeEquivalence(t : String ) : String = {
    val booleanRegex = ".*Boolean".r
    t match {
        case "kermeta.standard.Void" => "Unit"
        case "Int" => "java.lang.Integer"
        //TO Improve
                /*case booleanRegex() if (this.getType().isInstanceOf[PrimitiveType]
                    && (
                        "org.kermeta.language.structure.Boolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) ||
                        "org.eclipse.emf.ecore.EBoolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) )
                ) => "Boolean"*/
        case booleanRegex() => "java.lang.Boolean"
        case _ => t
    }
  }


}
