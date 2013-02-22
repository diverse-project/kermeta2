package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ClassDefinitionBindingAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.ClassDefinitionBinding{
  def ScalaownedPropertyBindings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassDefinitionBindingAspect,_root_.org.kermeta.language.structure.PropertyBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassDefinitionBindingAspect,_root_.org.kermeta.language.structure.PropertyBinding](thisUpper = -1,value=this.getOwnedPropertyBindings())}
  def ScalaownedPropertyBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.PropertyBinding]):Unit={
	this.getOwnedPropertyBindings().clear
	this.getOwnedPropertyBindings().addAll(`~value`)
	  }
  def ScalaownedOperationBindings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassDefinitionBindingAspect,_root_.org.kermeta.language.structure.OperationBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassDefinitionBindingAspect,_root_.org.kermeta.language.structure.OperationBinding](thisUpper = -1,value=this.getOwnedOperationBindings())}
  def ScalaownedOperationBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.OperationBinding]):Unit={
	this.getOwnedOperationBindings().clear
	this.getOwnedOperationBindings().addAll(`~value`)
	  }
  def Scalasource : _root_.org.kermeta.language.structure.ClassDefinition={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
  def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={
	this.setSource(`~value`)  }
  def Scalatarget : _root_.org.kermeta.language.structure.ClassDefinition={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
  def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={
	this.setTarget(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ClassDefinitionBinding"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

