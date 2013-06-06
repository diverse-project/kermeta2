package `logo_checker`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait BlockAspect extends `logo_checker`.kmLogo.ASM.InstructionAspect with `_root_`.kmLogo.ASM.Block{
  def Scalainstructions : k2.standard.ReflectiveOrderedSet[`logo_checker`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction]={    new k2.standard.RichReflectiveOrderedSet[`logo_checker`.kmLogo.ASM.BlockAspect,_root_.kmLogo.ASM.Instruction](thisUpper = -1,value=this.getInstructions())}
  def Scalainstructions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Instruction]):Unit={
	this.getInstructions().clear
	this.getInstructions().addAll(`~value`)
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

