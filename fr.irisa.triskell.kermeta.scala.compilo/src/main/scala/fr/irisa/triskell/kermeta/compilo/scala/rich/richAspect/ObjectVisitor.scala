package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect
import org.eclipse.emf.ecore.EObject
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition

trait ObjectVisitor {
  
  def visit(e:fr.irisa.triskell.kermeta.language.structure.Object,res : StringBuilder);
  
  
  def generateScalaCodeEach[A <:  fr.irisa.triskell.kermeta.language.structure.Object](res : StringBuilder,list : Iterable[A],sep : String )
    
    
    
  def generateProtectedScalaCodeEach[A <:  fr.irisa.triskell.kermeta.language.structure.Object](res : StringBuilder,list : Iterable[A],sep : String )
    
     
 

      	
  def whichBoolean(thi:PrimitiveType):String 
    
     
  def getQualifiedNameCompilo(thi: EObject):String 
	
  def getQualifiedName(thi: EObject):String 
	
  //def getQualifiedNameKermeta(thi: Package):String

   def generateScalaCodeForInstanceOf(thi:TypeLiteral,res : StringBuilder) : Unit;
	 def getQualifiedNamedBase(typD : GenericTypeDefinition) : String
	 
	 def getQualifiedNamedAspect(typD : GenericTypeDefinition) : String
        
	 
  
}