package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait TypeAspect extends `kermeta_km2diag`.org.kermeta.language.structure.KermetaModelElementAspect with `kermeta_km2diag`.transform.`Abstract_VisitableElementAspect` with `_root_`.org.kermeta.language.structure.Type{
  def ScalatypeContainer : _root_.org.kermeta.language.structure.TypeContainer={this.getTypeContainer().asInstanceOf[_root_.org.kermeta.language.structure.TypeContainer]}
  def ScalatypeContainer_=(`~value` : _root_.org.kermeta.language.structure.TypeContainer):Unit={
	this.setTypeContainer(`~value`)  }

    override def accept(v : _root_.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(v).visitType(this)}
        }
 
}

    def getClassname():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def getTypeDef():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Type"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

