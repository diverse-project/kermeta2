package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait TypeDefinitionAspect extends `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `kermeta_km2diag`.org.kermeta.language.structure.TypeContainerAspect with `kermeta_km2diag`.transform.`Abstract_VisitableElementAspect` with `_root_`.org.kermeta.language.structure.TypeDefinition{
  def ScalasuperType : k2.standard.ReflectiveSet[`kermeta_km2diag`.org.kermeta.language.structure.TypeDefinitionAspect,_root_.org.kermeta.language.structure.Type]={    new k2.standard.RichReflectiveSet[`kermeta_km2diag`.org.kermeta.language.structure.TypeDefinitionAspect,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getSuperType())}
  def ScalasuperType_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Type]):Unit={
	this.getSuperType().clear
	this.getSuperType().addAll(`~value`)
	  }
  def ScalaisAspect : _root_.java.lang.Boolean={this.getIsAspect().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalaisAspect_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setIsAspect(`~value`)  }

    override def accept(v : _root_.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(v).visitTypeDefinition(this)}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeDefinition"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

