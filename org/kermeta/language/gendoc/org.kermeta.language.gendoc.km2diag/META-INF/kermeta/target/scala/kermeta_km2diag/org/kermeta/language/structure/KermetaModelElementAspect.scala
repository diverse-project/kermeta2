package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait KermetaModelElementAspect extends k2.standard.KermetaObjectAspect with `_root_`.org.kermeta.language.structure.KermetaModelElement{
  def ScalakTag : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.KermetaModelElement,_root_.org.kermeta.language.structure.Tag]={    new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.KermetaModelElement,_root_.org.kermeta.language.structure.Tag](thisUpper = -1,value=this.getKTag())}
  def ScalakTag_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]):Unit={
	this.getKTag().clear
	this.getKTag().addAll(`~value`)
	  }
  def ScalakOwnedTags : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect,_root_.org.kermeta.language.structure.Tag]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect,_root_.org.kermeta.language.structure.Tag](thisUpper = -1,value=this.getKOwnedTags())}
  def ScalakOwnedTags_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]):Unit={
	this.getKOwnedTags().clear
	this.getKOwnedTags().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.KermetaModelElement"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

