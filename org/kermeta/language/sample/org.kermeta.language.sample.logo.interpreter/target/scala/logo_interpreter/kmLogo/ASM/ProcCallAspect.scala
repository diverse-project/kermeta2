package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait ProcCallAspect extends `logo_interpreter`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.ProcCall{
  def ScalaactualArgs : k2.standard.ReflectiveOrderedSet[`logo_interpreter`.kmLogo.ASM.ProcCallAspect,_root_.kmLogo.ASM.Expression]={    new k2.standard.RichReflectiveOrderedSet[`logo_interpreter`.kmLogo.ASM.ProcCallAspect,_root_.kmLogo.ASM.Expression](thisUpper = -1,value=this.getActualArgs())}
  def ScalaactualArgs_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.ASM.Expression]):Unit={
	this.getActualArgs().clear
	this.getActualArgs().addAll(`~value`)
	  }
  def Scaladeclaration : _root_.kmLogo.ASM.ProcDeclaration={this.getDeclaration().asInstanceOf[_root_.kmLogo.ASM.ProcDeclaration]}
  def Scaladeclaration_=(`~value` : _root_.kmLogo.ASM.ProcDeclaration):Unit={
	this.setDeclaration(`~value`)  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
`~result` = (null).asInstanceOf[_root_.java.lang.Integer];
(_root_.k2.io.StdIO).writeln(("Calling of : ").plus(((this).Scaladeclaration).Scalaname))
var params : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer] = _root_.k2.utils.KerRichFactory.createHashtable[_root_.java.lang.String,_root_.java.lang.Integer];


{var i : _root_.java.lang.Integer = 0;
while (!(((i) == (((this).ScalaactualArgs).size()))))


{
var currentArg : _root_.java.lang.Integer = (((this).ScalaactualArgs).elementAt(i)).eval(context);
(params).put(((((this).Scaladeclaration).Scalaargs).elementAt(i)).Scalaname, currentArg)
i = ((i).plus(1)).asInstanceOf[_root_.java.lang.Integer];}
}
(context).push(params)
(((this).Scaladeclaration).Scalainstructions).each({(instruction : _root_.kmLogo.ASM.Instruction)=>

{
`~result` = ((instruction).eval(context)).asInstanceOf[_root_.java.lang.Integer];}
})
(context).pop()}
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

