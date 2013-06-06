package `logo_checker`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait ConstantAspect extends `logo_checker`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.Constant{
  def ScalaintegerValue : _root_.java.lang.Integer={this.getIntegerValue().asInstanceOf[_root_.java.lang.Integer]}
  def ScalaintegerValue_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setIntegerValue(`~value`)  }
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

