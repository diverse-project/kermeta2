package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait WhileAspect extends `logo_interpreter`.kmLogo.ASM.ControlStructureAspect with `_root_`.kmLogo.ASM.While{
  def Scalablock : _root_.kmLogo.ASM.Block={this.getBlock().asInstanceOf[_root_.kmLogo.ASM.Block]}
  def Scalablock_=(`~value` : _root_.kmLogo.ASM.Block):Unit={
	this.setBlock(`~value`)  }

    override def eval(context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):_root_.java.lang.Integer = {
var `~result` : _root_.java.lang.Integer = null.asInstanceOf[_root_.java.lang.Integer]; 
  { 


{
`~result` = (null).asInstanceOf[_root_.java.lang.Integer];


{var i : _root_.java.lang.Integer = ((this).Scalacondition).eval(context);
while (!(((i) == (0))))


{
`~result` = (((this).Scalablock).eval(context)).asInstanceOf[_root_.java.lang.Integer];
i = ((i).minus(1)).asInstanceOf[_root_.java.lang.Integer];}
}}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.While"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

