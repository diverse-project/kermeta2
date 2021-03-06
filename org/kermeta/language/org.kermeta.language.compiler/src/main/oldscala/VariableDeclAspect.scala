package org.kermeta.language.compiler.aspects

import org.antlr.stringtemplate.StringTemplate
import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.Util

trait VariableDeclAspect extends ObjectAspect with LogAspect {

	
	override def generateScalaCode(res : StringBuilder) = {
		log.debug("VariableDecl={}",this.getIdentifier)
		var template = new StringTemplate("var $ident$ : $type$ = $init$;")
		var typeVal,initVal = new StringBuilder
		this.getListorType(typeVal)
                //this.getType().asInstanceOf[ObjectAspect].generateScalaCode(typeVal)
           	template.setAttribute("ident", Util.protectScalaKeyword(this.getIdentifier))
		template.setAttribute("type" , typeVal.toString)
		if(this.getInitialization !=  null){
                        //     println(" VariableDeclAspect " + this.getType + "  " + this.getInitialization())
	
			this.getInitialization().generateScalaCode(initVal)
		} else {
			initVal.append("null.asInstanceOf["+typeVal.toString+"]")
		}
		template.setAttribute("init" , initVal.toString)
		res.append(template.toString)
	}
	
    def getListorType(res:StringBuilder)={
	if (this.getType.getUpper>1 ||this.getType.getUpper == -1){
          if (this.getType.getIsOrdered.booleanValue){
                res.append("java.util.List[")
            }else{
                //TODO gestion des SETs
                res.append("java.util.List[")
            }
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
            res.append("]")
	} else {
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
	}


    }


}
