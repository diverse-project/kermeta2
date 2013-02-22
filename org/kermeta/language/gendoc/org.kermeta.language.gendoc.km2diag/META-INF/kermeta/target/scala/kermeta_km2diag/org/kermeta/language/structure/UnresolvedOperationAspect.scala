package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait UnresolvedOperationAspect extends `kermeta_km2diag`.org.kermeta.language.structure.AbstractOperationAspect with `kermeta_km2diag`.org.kermeta.language.structure.UnresolvedReferenceAspect with `kermeta_km2diag`.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.UnresolvedOperation{
  def ScalaoperationIdentifier : _root_.java.lang.String={this.getOperationIdentifier().asInstanceOf[_root_.java.lang.String]}
  def ScalaoperationIdentifier_=(`~value` : _root_.java.lang.String):Unit={
	this.setOperationIdentifier(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedOperation"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

