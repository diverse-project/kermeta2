package `logo_compilerNXC`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_compilerNXC.ImplicitConversion._
trait ProcDeclarationAspect extends `logo_compilerNXC`.kmLogo.ASM.InstructionAspect with `_root_`.kmLogo.ASM.ProcDeclaration{
  def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
  def Scalaname_=(`~value` : _root_.java.lang.String):Unit={
	this.setName(`~value`)  }
  def Scalaargs : k2.standard.ReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcDeclarationAspect,_root_.kmLogo.ASM.Parameter]={    new k2.standard.RichReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcDeclarationAspect,_root_.kmLogo.ASM.Parameter](thisUpper = -1,value=this.getArgs())}
  def Scalaargs_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Parameter]):Unit={
	this.getArgs().clear
	this.getArgs().addAll(`~value`)
	  }
  def ScalaprocCall : k2.standard.ReflectiveOrderedSet[_root_.kmLogo.ASM.ProcDeclaration,_root_.kmLogo.ASM.ProcCall]={    new k2.standard.RichReflectiveOrderedSet[_root_.kmLogo.ASM.ProcDeclaration,_root_.kmLogo.ASM.ProcCall](thisUpper = -1,value=this.getProcCall())}
  def ScalaprocCall_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.ProcCall]):Unit={
	this.getProcCall().clear
	this.getProcCall().addAll(`~value`)
	  }
  def Scalainstructions : k2.standard.ReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcDeclarationAspect,_root_.kmLogo.ASM.Instruction]={    new k2.standard.RichReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcDeclarationAspect,_root_.kmLogo.ASM.Instruction](thisUpper = -1,value=this.getInstructions())}
  def Scalainstructions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Instruction]):Unit={
	this.getInstructions().clear
	this.getInstructions().addAll(`~value`)
	  }

    override def compileToNXC(context : _root_.`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompiler):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((("// Declaration of ").plus((this).Scalaname)).plus(" function")).asInstanceOf[_root_.java.lang.String];
var proc : _root_.java.lang.String = (("sub ").plus((this).Scalaname)).plus("(");


{var i : _root_.java.lang.Integer = 0;
while (!((i).isGreaterOrEqual(((this).Scalaargs).size())))


{
(proc).append(("int ").plus((((this).Scalaargs).elementAt(i)).Scalaname))
if ((i).isLower((((this).Scalaargs).size()).minus(1)))

{
(proc).append(", ")}

i = ((i).plus(1)).asInstanceOf[_root_.java.lang.Integer];}
}
(proc).append(")\n")
(proc).append("{\n")
var depth : _root_.java.lang.Integer = (context).Scaladepth;
(context).Scaladepth = (0).asInstanceOf[_root_.java.lang.Integer];
((this).Scalainstructions).each({(i : _root_.kmLogo.ASM.Instruction)=>

{
(proc).append((i).compileToNXC(context))}
})
(proc).append("}\n")
((context).Scalasubs).add(proc)
(context).Scaladepth = (depth).asInstanceOf[_root_.java.lang.Integer];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.ProcDeclaration"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

