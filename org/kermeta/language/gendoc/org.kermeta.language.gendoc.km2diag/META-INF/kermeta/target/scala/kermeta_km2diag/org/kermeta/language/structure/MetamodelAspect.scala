package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait MetamodelAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `kermeta_km2diag`.org.kermeta.language.structure.ModelTypeDefinitionContainerAspect with `_root_`.org.kermeta.language.structure.Metamodel{
  def Scalapackages : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.MetamodelAspect,_root_.org.kermeta.language.structure.Package]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.MetamodelAspect,_root_.org.kermeta.language.structure.Package](thisUpper = -1,value=this.getPackages())}
  def Scalapackages_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Package]):Unit={
	this.getPackages().clear
	this.getPackages().addAll(`~value`)
	  }
  def Scalauri : _root_.java.lang.String={this.getUri().asInstanceOf[_root_.java.lang.String]}
  def Scalauri_=(`~value` : _root_.java.lang.String):Unit={
	this.setUri(`~value`)  }
  def ScalareferencedMetamodels : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.MetamodelAspect,_root_.org.kermeta.language.structure.FilteredMetamodelReference]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.MetamodelAspect,_root_.org.kermeta.language.structure.FilteredMetamodelReference](thisUpper = -1,value=this.getReferencedMetamodels())}
  def ScalareferencedMetamodels_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.FilteredMetamodelReference]):Unit={
	this.getReferencedMetamodels().clear
	this.getReferencedMetamodels().addAll(`~value`)
	  }
  def ScalaisResolved : _root_.java.lang.Boolean={this.isIsResolved().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaisResolved_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsResolved(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Metamodel"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

