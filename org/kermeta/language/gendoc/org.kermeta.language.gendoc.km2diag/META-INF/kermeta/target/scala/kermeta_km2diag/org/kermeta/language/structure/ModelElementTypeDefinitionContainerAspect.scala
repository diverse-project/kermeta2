package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ModelElementTypeDefinitionContainerAspect extends `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.ModelElementTypeDefinitionContainer{
  def ScalaownedTypeDefinition : k2.standard.ReflectiveSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelElementTypeDefinitionContainerAspect,_root_.org.kermeta.language.structure.ModelElementTypeDefinition]={    new k2.standard.RichReflectiveSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelElementTypeDefinitionContainerAspect,_root_.org.kermeta.language.structure.ModelElementTypeDefinition](thisUpper = -1,value=this.getOwnedTypeDefinition())}
  def ScalaownedTypeDefinition_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.ModelElementTypeDefinition]):Unit={
	this.getOwnedTypeDefinition().clear
	this.getOwnedTypeDefinition().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelElementTypeDefinitionContainer"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

