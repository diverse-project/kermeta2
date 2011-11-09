package fr.irisa.triskell.kermeta.compilo.scala.visitor

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait IVisitor {
	  
	def visit(par : ModelingUnit)
	 
	def visit(par : Package) 
	
	def visit(par : ClassDefinition)
 
	def init()
	
	def close()
}  
  


class AcceptablePackage(par: Package) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(par)
  }
}

class AcceptableClassDef(cl: ClassDefinition) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(cl)
  }
}

class AcceptableModelingUnit(cl: ModelingUnit) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(cl)
  }
}
