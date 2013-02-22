package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait OperationBindingAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.OperationBinding{
  def Scalasource : _root_.org.kermeta.language.structure.Operation={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
  def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={
	this.setSource(`~value`)  }
  def Scalatarget : _root_.org.kermeta.language.structure.Operation={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
  def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={
	this.setTarget(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.OperationBinding"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

