package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait FunctionTypeAspect extends `kermeta_km2diag`.org.kermeta.language.structure.TypeContainerAspect with `kermeta_km2diag`.org.kermeta.language.structure.TypeAspect with `_root_`.org.kermeta.language.structure.FunctionType{
  def Scalaleft : _root_.org.kermeta.language.structure.Type={this.getLeft().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
  def Scalaleft_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={
	this.setLeft(`~value`)  }
  def Scalaright : _root_.org.kermeta.language.structure.Type={this.getRight().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
  def Scalaright_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={
	this.setRight(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.FunctionType"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}
