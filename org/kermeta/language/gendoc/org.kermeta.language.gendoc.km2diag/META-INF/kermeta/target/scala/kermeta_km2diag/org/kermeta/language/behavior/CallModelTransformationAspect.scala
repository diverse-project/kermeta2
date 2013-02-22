package `kermeta_km2diag`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait CallModelTransformationAspect extends `kermeta_km2diag`.org.kermeta.language.behavior.CallFeatureAspect with `_root_`.org.kermeta.language.behavior.CallModelTransformation{
  def ScalastaticTransformation : _root_.org.kermeta.language.structure.ModelTransformation={this.getStaticTransformation().asInstanceOf[_root_.org.kermeta.language.structure.ModelTransformation]}
  def ScalastaticTransformation_=(`~value` : _root_.org.kermeta.language.structure.ModelTransformation):Unit={
	this.setStaticTransformation(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallModelTransformation"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

