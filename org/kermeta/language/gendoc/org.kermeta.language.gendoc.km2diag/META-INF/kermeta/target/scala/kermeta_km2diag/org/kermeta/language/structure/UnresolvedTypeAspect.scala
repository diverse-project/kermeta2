package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait UnresolvedTypeAspect extends `kermeta_km2diag`.org.kermeta.language.structure.TypeAspect with `kermeta_km2diag`.org.kermeta.language.structure.UnresolvedReferenceAspect with `kermeta_km2diag`.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.UnresolvedType{
  def Scalausings : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UnresolvedTypeAspect,_root_.org.kermeta.language.structure.Using]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UnresolvedTypeAspect,_root_.org.kermeta.language.structure.Using](thisUpper = -1,value=this.getUsings())}
  def Scalausings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Using]):Unit={
	this.getUsings().clear
	this.getUsings().addAll(`~value`)
	  }
  def Scalagenerics : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UnresolvedTypeAspect,_root_.org.kermeta.language.structure.Type]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.UnresolvedTypeAspect,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getGenerics())}
  def Scalagenerics_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Type]):Unit={
	this.getGenerics().clear
	this.getGenerics().addAll(`~value`)
	  }
  def ScalatypeIdentifier : _root_.java.lang.String={this.getTypeIdentifier().asInstanceOf[_root_.java.lang.String]}
  def ScalatypeIdentifier_=(`~value` : _root_.java.lang.String):Unit={
	this.setTypeIdentifier(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedType"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
