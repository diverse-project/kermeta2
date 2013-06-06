package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait IfAspect extends `logo_interpreter`.kmLogo.ASM.ControlStructureAspect with `_root_`.kmLogo.ASM.If{
  def ScalathenPart : _root_.kmLogo.ASM.Block={this.getThenPart().asInstanceOf[_root_.kmLogo.ASM.Block]}
  def ScalathenPart_=(`~value` : _root_.kmLogo.ASM.Block):Unit={
	this.setThenPart(`~value`)  }
  def ScalaelsePart : _root_.kmLogo.ASM.Block={this.getElsePart().asInstanceOf[_root_.kmLogo.ASM.Block]}
  def ScalaelsePart_=(`~value` : _root_.kmLogo.ASM.Block):Unit={
	this.setElsePart(`~value`)  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
if (_root_.k2.utils.UTilScala.isNotEqual((((this).Scalacondition).eval(context)),0))

{
`~result` = (((this).ScalathenPart).eval(context)).asInstanceOf[_root_.java.lang.Integer];}
else 


{
`~result` = (((this).ScalaelsePart).eval(context)).asInstanceOf[_root_.java.lang.Integer];}

`~result` = (null).asInstanceOf[_root_.java.lang.Integer];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.If"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

