package `logo_compilerNXC`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_compilerNXC.ImplicitConversion._
trait ProcCallAspect extends `logo_compilerNXC`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.ProcCall{
  def ScalaactualArgs : k2.standard.ReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcCallAspect,_root_.kmLogo.ASM.Expression]={    new k2.standard.RichReflectiveOrderedSet[`logo_compilerNXC`.kmLogo.ASM.ProcCallAspect,_root_.kmLogo.ASM.Expression](thisUpper = -1,value=this.getActualArgs())}
  def ScalaactualArgs_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Expression]):Unit={
	this.getActualArgs().clear
	this.getActualArgs().addAll(`~value`)
	  }
  def Scaladeclaration : _root_.kmLogo.ASM.ProcDeclaration={this.getDeclaration().asInstanceOf[_root_.kmLogo.ASM.ProcDeclaration]}
  def Scaladeclaration_=(`~value` : _root_.kmLogo.ASM.ProcDeclaration):Unit={
	this.setDeclaration(`~value`)  }

    override def compileToNXC(context : _root_.`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompiler):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((((this).Scaladeclaration).Scalaname).plus("(")).asInstanceOf[_root_.java.lang.String];


{var i : _root_.java.lang.Integer = 0;
while (!((i).isGreaterOrEqual(((this).ScalaactualArgs).size())))


{
(`~result`).append((((this).ScalaactualArgs).elementAt(i)).compileToNXC(context))
if ((i).isLower((((this).ScalaactualArgs).size()).minus(1)))

{
(`~result`).append(", ")}

i = ((i).plus(1)).asInstanceOf[_root_.java.lang.Integer];}
}
(`~result`).append(");")}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.ProcCall"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

