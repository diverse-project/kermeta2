package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait UsingAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.Using{
  def ScalafromQName : _root_.java.lang.String={this.getFromQName().asInstanceOf[_root_.java.lang.String]}
  def ScalafromQName_=(`~value` : _root_.java.lang.String):Unit={
	this.setFromQName(`~value`)  }
  def ScalatoName : _root_.java.lang.String={this.getToName().asInstanceOf[_root_.java.lang.String]}
  def ScalatoName_=(`~value` : _root_.java.lang.String):Unit={
	this.setToName(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Using"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
