package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait AdaptationOperatorAspect extends `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.AdaptationOperator{
  def Scalaparameters : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.AdaptationOperatorAspect,_root_.org.kermeta.language.structure.AdaptationParameter]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.AdaptationOperatorAspect,_root_.org.kermeta.language.structure.AdaptationParameter](thisUpper = -1,value=this.getParameters())}
  def Scalaparameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.AdaptationParameter]):Unit={
	this.getParameters().clear
	this.getParameters().addAll(`~value`)
	  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.AdaptationOperator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

