package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ModelTypeDefinitionBindingAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionContainerAspect with `_root_`.org.kermeta.language.structure.ModelTypeDefinitionBinding{
  def ScalaownedClassDefinitionBindings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.ClassDefinitionBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.ClassDefinitionBinding](thisUpper = -1,value=this.getOwnedClassDefinitionBindings())}
  def ScalaownedClassDefinitionBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ClassDefinitionBinding]):Unit={
	this.getOwnedClassDefinitionBindings().clear
	this.getOwnedClassDefinitionBindings().addAll(`~value`)
	  }
  def ScalausedAdaptationOperators : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.UseAdaptationOperator]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.UseAdaptationOperator](thisUpper = -1,value=this.getUsedAdaptationOperators())}
  def ScalausedAdaptationOperators_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UseAdaptationOperator]):Unit={
	this.getUsedAdaptationOperators().clear
	this.getUsedAdaptationOperators().addAll(`~value`)
	  }
  def ScalaownedEnumerationBindings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.EnumerationBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.EnumerationBinding](thisUpper = -1,value=this.getOwnedEnumerationBindings())}
  def ScalaownedEnumerationBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.EnumerationBinding]):Unit={
	this.getOwnedEnumerationBindings().clear
	this.getOwnedEnumerationBindings().addAll(`~value`)
	  }
  def ScalaboundModelTypeDefinition : _root_.org.kermeta.language.structure.ModelTypeDefinition={this.getBoundModelTypeDefinition().asInstanceOf[_root_.org.kermeta.language.structure.ModelTypeDefinition]}
  def ScalaboundModelTypeDefinition_=(`~value` : _root_.org.kermeta.language.structure.ModelTypeDefinition):Unit={
	this.setBoundModelTypeDefinition(`~value`)  }
  def ScalatargetedTransformations : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.ModelTransformation]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionBindingAspect,_root_.org.kermeta.language.structure.ModelTransformation](thisUpper = -1,value=this.getTargetedTransformations())}
  def ScalatargetedTransformations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelTransformation]):Unit={
	this.getTargetedTransformations().clear
	this.getTargetedTransformations().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTypeDefinitionBinding"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

