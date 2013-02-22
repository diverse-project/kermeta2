package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait VirtualTypeAspect extends `kermeta_km2diag`.org.kermeta.language.structure.ObjectTypeVariableAspect with `_root_`.org.kermeta.language.structure.VirtualType{
  def ScalatypeDefinition : _root_.org.kermeta.language.structure.ModelElementTypeDefinition={this.getTypeDefinition().asInstanceOf[_root_.org.kermeta.language.structure.ModelElementTypeDefinition]}
  def ScalatypeDefinition_=(`~value` : _root_.org.kermeta.language.structure.ModelElementTypeDefinition):Unit={
	this.setTypeDefinition(`~value`)  }
  def ScalamodelTypeVariable : _root_.org.kermeta.language.structure.ModelTypeVariable={this.getModelTypeVariable().asInstanceOf[_root_.org.kermeta.language.structure.ModelTypeVariable]}
  def ScalamodelTypeVariable_=(`~value` : _root_.org.kermeta.language.structure.ModelTypeVariable):Unit={
	this.setModelTypeVariable(`~value`)  }
  def ScalatypeParamBinding : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.VirtualTypeAspect,_root_.org.kermeta.language.structure.TypeVariableBinding]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.VirtualTypeAspect,_root_.org.kermeta.language.structure.TypeVariableBinding](thisUpper = -1,value=this.getTypeParamBinding())}
  def ScalatypeParamBinding_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariableBinding]):Unit={
	this.getTypeParamBinding().clear
	this.getTypeParamBinding().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.VirtualType"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

