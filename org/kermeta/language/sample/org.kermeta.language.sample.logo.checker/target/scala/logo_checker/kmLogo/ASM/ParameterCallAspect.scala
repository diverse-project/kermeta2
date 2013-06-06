package `logo_checker`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait ParameterCallAspect extends `logo_checker`.kmLogo.ASM.ExpressionAspect with `_root_`.kmLogo.ASM.ParameterCall{
  def Scalaparameter : _root_.kmLogo.ASM.Parameter={this.getParameter().asInstanceOf[_root_.kmLogo.ASM.Parameter]}
  def Scalaparameter_=(`~value` : _root_.kmLogo.ASM.Parameter):Unit={
	this.setParameter(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.ParameterCall"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

