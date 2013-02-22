package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ModelTypeDefinitionContainerAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.ModelTypeDefinitionContainer{
  def ScalaownedModelTypeDefinitions : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionContainerAspect,_root_.org.kermeta.language.structure.ModelTypeDefinition]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionContainerAspect,_root_.org.kermeta.language.structure.ModelTypeDefinition](thisUpper = -1,value=this.getOwnedModelTypeDefinitions())}
  def ScalaownedModelTypeDefinitions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelTypeDefinition]):Unit={
	this.getOwnedModelTypeDefinitions().clear
	this.getOwnedModelTypeDefinitions().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTypeDefinitionContainer"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

