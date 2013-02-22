package `kermeta_km2diag`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait CallTypeLiteralAspect extends `kermeta_km2diag`.org.kermeta.language.behavior.LiteralAspect with `_root_`.org.kermeta.language.behavior.CallTypeLiteral{
  def Scalatyperef : _root_.org.kermeta.language.behavior.TypeReference={this.getTyperef().asInstanceOf[_root_.org.kermeta.language.behavior.TypeReference]}
  def Scalatyperef_=(`~value` : _root_.org.kermeta.language.behavior.TypeReference):Unit={
	this.setTyperef(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallTypeLiteral"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

