package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait StringLiteralAspect extends ObjectAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {	
		res.append("\"")
    
                var stringlit = this.getValue
                var stringlitRes = new StringBuilder
                for (i <- 0 until stringlit.size) {
                  stringlit.charAt(i) match {
                    case '"'=> stringlitRes.append("\\");stringlitRes.append("\"")
                    case '\\' => stringlitRes.append("\\");stringlitRes.append("\\")
                    case '\n' => stringlitRes.append("\\n");
                    case '\t' => stringlitRes.append("\\t");
                    case _ @ c => stringlitRes.append(c)
        
        
                  }
                }
    
		res.append(stringlitRes.toString)//.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t") )
		res.append("\"")
	} 

}