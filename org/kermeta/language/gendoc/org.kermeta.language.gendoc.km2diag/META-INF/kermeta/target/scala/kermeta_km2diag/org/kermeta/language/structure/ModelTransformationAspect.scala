package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ModelTransformationAspect extends `kermeta_km2diag`.org.kermeta.language.structure.MultiplicityElementAspect with `_root_`.org.kermeta.language.structure.ModelTransformation{
  def ScalatypeParameters : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.ModelTypeVariable]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.ModelTypeVariable](thisUpper = -1,value=this.getTypeParameters())}
  def ScalatypeParameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ModelTypeVariable]):Unit={
	this.getTypeParameters().clear
	this.getTypeParameters().addAll(`~value`)
	  }
  def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
  def Scalabody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={
	this.setBody(`~value`)  }
  def Scalarules : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.Operation]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.Operation](thisUpper = -1,value=this.getRules())}
  def Scalarules_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Operation]):Unit={
	this.getRules().clear
	this.getRules().addAll(`~value`)
	  }
  def ScalaowningModelTypeDefinition : _root_.org.kermeta.language.structure.ModelTypeDefinition={this.getOwningModelTypeDefinition().asInstanceOf[_root_.org.kermeta.language.structure.ModelTypeDefinition]}
  def ScalaowningModelTypeDefinition_=(`~value` : _root_.org.kermeta.language.structure.ModelTypeDefinition):Unit={
	this.setOwningModelTypeDefinition(`~value`)  }
  def ScalaownedParameter : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.Parameter]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ModelTransformationAspect,_root_.org.kermeta.language.structure.Parameter](thisUpper = -1,value=this.getOwnedParameter())}
  def ScalaownedParameter_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Parameter]):Unit={
	this.getOwnedParameter().clear
	this.getOwnedParameter().addAll(`~value`)
	  }
  def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaisAbstract_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsAbstract(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTransformation"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

