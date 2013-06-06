package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait BackAspect extends `logo_interpreter`.kmLogo.ASM.PrimitiveAspect with `_root_`.kmLogo.ASM.Back{
  def Scalasteps : _root_.kmLogo.ASM.Expression={this.getSteps().asInstanceOf[_root_.kmLogo.ASM.Expression]}
  def Scalasteps_=(`~value` : _root_.kmLogo.ASM.Expression):Unit={
	this.setSteps(`~value`)  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
((context).Scalaturtle).forward((((this).Scalasteps).eval(context)).uminus())
`~result` = (null).asInstanceOf[_root_.java.lang.Integer];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Back"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

