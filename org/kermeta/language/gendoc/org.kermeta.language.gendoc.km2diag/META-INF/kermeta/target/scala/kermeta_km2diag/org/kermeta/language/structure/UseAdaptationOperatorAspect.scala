package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait UseAdaptationOperatorAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.UseAdaptationOperator{
  def Scalaparameters : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UseAdaptationOperatorAspect,_root_.org.kermeta.language.structure.KermetaModelElement]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UseAdaptationOperatorAspect,_root_.org.kermeta.language.structure.KermetaModelElement](thisUpper = -1,value=this.getParameters())}
  def Scalaparameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.KermetaModelElement]):Unit={
	this.getParameters().clear
	this.getParameters().addAll(`~value`)
	  }
  def ScalaownedUnresolved : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UseAdaptationOperatorAspect,_root_.org.kermeta.language.structure.UnresolvedReference]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UseAdaptationOperatorAspect,_root_.org.kermeta.language.structure.UnresolvedReference](thisUpper = -1,value=this.getOwnedUnresolved())}
  def ScalaownedUnresolved_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UnresolvedReference]):Unit={
	this.getOwnedUnresolved().clear
	this.getOwnedUnresolved().addAll(`~value`)
	  }
  def ScalausedOperator : _root_.org.kermeta.language.structure.AdaptationOperator={this.getUsedOperator().asInstanceOf[_root_.org.kermeta.language.structure.AdaptationOperator]}
  def ScalausedOperator_=(`~value` : _root_.org.kermeta.language.structure.AdaptationOperator):Unit={
	this.setUsedOperator(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UseAdaptationOperator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

