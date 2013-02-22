package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait GenericTypeDefinitionAspect extends `kermeta_km2diag`.org.kermeta.language.structure.ModelElementTypeDefinitionAspect with `_root_`.org.kermeta.language.structure.GenericTypeDefinition{
  def ScalatypeParameter : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.GenericTypeDefinitionAspect,_root_.org.kermeta.language.structure.TypeVariable]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.GenericTypeDefinitionAspect,_root_.org.kermeta.language.structure.TypeVariable](thisUpper = -1,value=this.getTypeParameter())}
  def ScalatypeParameter_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariable]):Unit={
	this.getTypeParameter().clear
	this.getTypeParameter().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.GenericTypeDefinition"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

