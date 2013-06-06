package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait BlockAspect extends `logo_interpreter`.kmLogo.ASM.InstructionAspect with `_root_`.kmLogo.ASM.Block{
  def Scalainstructions : k2.standard.ReflectiveOrderedSet[`logo_interpreter`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction]={    new k2.standard.RichReflectiveOrderedSet[`logo_interpreter`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction](thisUpper = -1,value=this.getInstructions())}
  def Scalainstructions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Instruction]):Unit={
	this.getInstructions().clear
	this.getInstructions().addAll(`~value`)
	  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
`~result` = (null).asInstanceOf[_root_.java.lang.Integer];
((this).Scalainstructions).each({(instruction : _root_.kmLogo.ASM.Instruction)=>

{
`~result` = ((instruction).eval(context)).asInstanceOf[_root_.java.lang.Integer];}
})}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Block"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

