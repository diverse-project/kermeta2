package `logo_interpreter`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait BinaryExpAspect extends `logo_interpreter`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.BinaryExp{
  def Scalalhs : _root_.kmLogo.ASM.Expression={this.getLhs().asInstanceOf[_root_.kmLogo.ASM.Expression]}
  def Scalalhs_=(`~value` : _root_.kmLogo.ASM.Expression):Unit={
	this.setLhs(`~value`)  }
  def Scalarhs : _root_.kmLogo.ASM.Expression={this.getRhs().asInstanceOf[_root_.kmLogo.ASM.Expression]}
  def Scalarhs_=(`~value` : _root_.kmLogo.ASM.Expression):Unit={
	this.setRhs(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.BinaryExp"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

