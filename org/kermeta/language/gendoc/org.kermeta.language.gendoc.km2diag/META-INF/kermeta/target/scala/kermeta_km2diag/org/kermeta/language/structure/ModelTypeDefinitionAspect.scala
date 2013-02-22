package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ModelTypeDefinitionAspect extends `kermeta_km2diag`.org.kermeta.language.structure.TypeDefinitionAspect with `_root_`.org.kermeta.language.structure.ModelTypeDefinition{
  def Scalametamodel : _root_.org.kermeta.language.structure.Metamodel={this.getMetamodel().asInstanceOf[_root_.org.kermeta.language.structure.Metamodel]}
  def Scalametamodel_=(`~value` : _root_.org.kermeta.language.structure.Metamodel):Unit={
	this.setMetamodel(`~value`)  }
  def ScalaownedBindings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionAspect,_root_.org.kermeta.language.structure.ModelTypeDefinitionBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionAspect,_root_.org.kermeta.language.structure.ModelTypeDefinitionBinding](thisUpper = -1,value=this.getOwnedBindings())}
  def ScalaownedBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelTypeDefinitionBinding]):Unit={
	this.getOwnedBindings().clear
	this.getOwnedBindings().addAll(`~value`)
	  }
  def ScalaownedTransformations : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.ModelTypeDefinition,_root_.org.kermeta.language.structure.ModelTransformation]={    new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.ModelTypeDefinition,_root_.org.kermeta.language.structure.ModelTransformation](thisUpper = -1,value=this.getOwnedTransformations())}
  def ScalaownedTransformations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelTransformation]):Unit={
	this.getOwnedTransformations().clear
	this.getOwnedTransformations().addAll(`~value`)
	  }
  def ScalatypeDefinitions : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionAspect,_root_.org.kermeta.language.structure.ModelElementTypeDefinition]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionAspect,_root_.org.kermeta.language.structure.ModelElementTypeDefinition](thisUpper = -1,value=this.getTypeDefinitions())}
  def ScalatypeDefinitions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelElementTypeDefinition]):Unit={
	this.getTypeDefinitions().clear
	this.getTypeDefinitions().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTypeDefinition"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

