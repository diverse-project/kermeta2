package `kermeta_km2diag`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait RescueAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.behavior.Rescue{
  def Scalabody : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.behavior.RescueAspect,_root_.org.kermeta.language.behavior.Expression]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.behavior.RescueAspect,_root_.org.kermeta.language.behavior.Expression](thisUpper = -1,value=this.getBody())}
  def Scalabody_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.Expression]):Unit={
	this.getBody().clear
	this.getBody().addAll(`~value`)
	  }
  def ScalaexceptionType : _root_.org.kermeta.language.behavior.TypeReference={this.getExceptionType().asInstanceOf[_root_.org.kermeta.language.behavior.TypeReference]}
  def ScalaexceptionType_=(`~value` : _root_.org.kermeta.language.behavior.TypeReference):Unit={
	this.setExceptionType(`~value`)  }
  def ScalaexceptionName : _root_.java.lang.String={this.getExceptionName().asInstanceOf[_root_.java.lang.String]}
  def ScalaexceptionName_=(`~value` : _root_.java.lang.String):Unit={
	this.setExceptionName(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Rescue"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
