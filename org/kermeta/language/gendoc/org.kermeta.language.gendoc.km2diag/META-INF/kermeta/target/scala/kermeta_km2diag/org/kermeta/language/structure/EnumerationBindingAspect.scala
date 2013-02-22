package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait EnumerationBindingAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.EnumerationBinding{
  def Scalasource : _root_.org.kermeta.language.structure.Enumeration={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.Enumeration]}
  def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.Enumeration):Unit={
	this.setSource(`~value`)  }
  def Scalatarget : _root_.org.kermeta.language.structure.Enumeration={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Enumeration]}
  def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Enumeration):Unit={
	this.setTarget(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.EnumerationBinding"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

