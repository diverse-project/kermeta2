package `logo_compilerNXC`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_compilerNXC.ImplicitConversion._
trait BlockAspect extends `logo_compilerNXC`.kmLogo.ASM.InstructionAspect with `_root_`.kmLogo.ASM.Block{
  def Scalainstructions : k2.standard.ReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction]={    new k2.standard.RichReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction](thisUpper = -1,value=this.getInstructions())}
  def Scalainstructions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Instruction]):Unit={
	this.getInstructions().clear
	this.getInstructions().addAll(`~value`)
	  }

    override def compileToNXC(context : _root_.`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompiler):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = (((context).Scalaprefix).plus("{\n")).asInstanceOf[_root_.java.lang.String];
(context).incDepth()
((this).Scalainstructions).each({(instruction : _root_.kmLogo.ASM.Instruction)=>

{
(`~result`).append((((context).Scalaprefix).plus((instruction).compileToNXC(context))).plus("\n"))}
})
(context).decDepth()
(`~result`).append(((context).Scalaprefix).plus("}"))}
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

