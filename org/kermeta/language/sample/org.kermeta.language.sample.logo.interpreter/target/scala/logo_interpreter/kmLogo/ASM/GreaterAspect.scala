package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait GreaterAspect extends `logo_interpreter`.kmLogo.ASM.BinaryExpAspect with `_root_`.kmLogo.ASM.Greater{

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
if ((((this).Scalalhs).eval(context)).isGreater(((this).Scalarhs).eval(context)))

{
`~result` = (0).asInstanceOf[_root_.java.lang.Integer];}
else 


{
`~result` = (1).asInstanceOf[_root_.java.lang.Integer];}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Greater"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

