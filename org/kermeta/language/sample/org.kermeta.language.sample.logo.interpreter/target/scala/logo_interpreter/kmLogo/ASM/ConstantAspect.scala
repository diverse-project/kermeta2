package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait ConstantAspect extends `logo_interpreter`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.Constant{
  def ScalaintegerValue : _root_.java.lang.Integer={this.getIntegerValue().asInstanceOf[_root_.java.lang.Integer]}
  def ScalaintegerValue_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setIntegerValue(`~value`)  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
`~result` = ((this).ScalaintegerValue).asInstanceOf[_root_.java.lang.Integer];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Constant"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

