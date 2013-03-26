package `kermeta_km2diag`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait JavaStaticCallAspect extends `kermeta_km2diag`.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.JavaStaticCall{
  def Scalaparameters : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.behavior.JavaStaticCallAspect,_root_.org.kermeta.language.behavior.Expression]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.behavior.JavaStaticCallAspect,_root_.org.kermeta.language.behavior.Expression](thisUpper = -1,value=this.getParameters())}
  def Scalaparameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.Expression]):Unit={
	this.getParameters().clear
	this.getParameters().addAll(`~value`)
	  }
  def Scalajclass : _root_.java.lang.String={this.getJclass().asInstanceOf[_root_.java.lang.String]}
  def Scalajclass_=(`~value` : _root_.java.lang.String):Unit={
	this.setJclass(`~value`)  }
  def Scalajmethod : _root_.java.lang.String={this.getJmethod().asInstanceOf[_root_.java.lang.String]}
  def Scalajmethod_=(`~value` : _root_.java.lang.String):Unit={
	this.setJmethod(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.JavaStaticCall"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
