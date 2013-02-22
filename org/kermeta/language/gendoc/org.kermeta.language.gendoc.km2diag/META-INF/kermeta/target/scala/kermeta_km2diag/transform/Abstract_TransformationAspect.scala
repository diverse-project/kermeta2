package `kermeta_km2diag`.transform
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait Abstract_TransformationAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`kermeta_km2diag`.transform.`Abstract_Transformation`{

    def transform(input : _root_.`kermeta_km2diag`.transform.`Abstract_VisitableElement`):_root_.k2.standard.KermetaObject = {
var `~result` : _root_.k2.standard.KermetaObject = null.asInstanceOf[_root_.k2.standard.KermetaObject]; 
  { 
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("transform.Abstract_Transformation"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

