package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait ControlStructureAspect extends `logo_interpreter`.kmLogo.ASM.InstructionAspect with `_root_`.kmLogo.ASM.ControlStructure{
  def Scalacondition : _root_.kmLogo.ASM.Expression={this.getCondition().asInstanceOf[_root_.kmLogo.ASM.Expression]}
  def Scalacondition_=(`~value` : _root_.kmLogo.ASM.Expression):Unit={
	this.setCondition(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.ControlStructure"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

