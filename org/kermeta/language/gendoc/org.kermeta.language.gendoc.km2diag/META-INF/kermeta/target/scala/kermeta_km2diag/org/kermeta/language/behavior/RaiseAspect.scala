package `kermeta_km2diag`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait RaiseAspect extends `kermeta_km2diag`.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Raise{
  def Scalaexpression : _root_.org.kermeta.language.behavior.Expression={this.getExpression().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
  def Scalaexpression_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={
	this.setExpression(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Raise"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
