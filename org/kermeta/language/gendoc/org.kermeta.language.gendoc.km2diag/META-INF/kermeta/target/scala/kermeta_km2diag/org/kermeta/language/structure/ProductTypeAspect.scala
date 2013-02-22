package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ProductTypeAspect extends `kermeta_km2diag`.org.kermeta.language.structure.TypeContainerAspect with `kermeta_km2diag`.org.kermeta.language.structure.TypeAspect with `_root_`.org.kermeta.language.structure.ProductType{
  def Scalatype : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ProductTypeAspect,_root_.org.kermeta.language.structure.Type]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ProductTypeAspect,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getType())}
  def Scalatype_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Type]):Unit={
	this.getType().clear
	this.getType().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ProductType"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

