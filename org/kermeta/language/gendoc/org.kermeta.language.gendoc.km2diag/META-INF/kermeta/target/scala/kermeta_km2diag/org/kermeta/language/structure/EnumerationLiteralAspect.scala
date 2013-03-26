package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait EnumerationLiteralAspect extends `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.EnumerationLiteral{
  def Scalaenumeration : _root_.org.kermeta.language.structure.Enumeration={this.getEnumeration().asInstanceOf[_root_.org.kermeta.language.structure.Enumeration]}
  def Scalaenumeration_=(`~value` : _root_.org.kermeta.language.structure.Enumeration):Unit={
	this.setEnumeration(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.EnumerationLiteral"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
