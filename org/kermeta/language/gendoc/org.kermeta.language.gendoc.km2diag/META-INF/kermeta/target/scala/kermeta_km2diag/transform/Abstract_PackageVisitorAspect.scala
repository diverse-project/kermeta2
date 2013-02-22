package `kermeta_km2diag`.transform
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait Abstract_PackageVisitorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`{

    def visitPackage(p : _root_.org.kermeta.language.structure.Package):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}

    def visitTypeDefinition(td : _root_.org.kermeta.language.structure.TypeDefinition):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}

    def visitClassDefinition(cd : _root_.org.kermeta.language.structure.ClassDefinition):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}

    def visitProperty(p : _root_.org.kermeta.language.structure.Property):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}

    def visitType(t : _root_.org.kermeta.language.structure.Type):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}

    def visitClass(c : _root_.org.kermeta.language.structure.Class):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("transform.Abstract_PackageVisitor"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

