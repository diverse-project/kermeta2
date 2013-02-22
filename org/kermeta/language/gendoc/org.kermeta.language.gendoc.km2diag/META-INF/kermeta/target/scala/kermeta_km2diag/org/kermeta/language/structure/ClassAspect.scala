package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait ClassAspect extends `kermeta_km2diag`.org.kermeta.language.structure.ParameterizedTypeAspect with `kermeta_km2diag`.transform.`Abstract_VisitableElementAspect` with `_root_`.org.kermeta.language.structure.Class{
  def ScalaownedAttribute : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Property]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Property](thisUpper = -1,value=this.getOwnedAttribute())}
  def ScalaownedOperation : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Operation]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Operation](thisUpper = -1,value=this.getOwnedOperation())}
  def ScalasuperClass : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Class]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.ClassAspect,_root_.org.kermeta.language.structure.Class](thisUpper = -1,value=this.getSuperClass())}
  def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract().asInstanceOf[_root_.java.lang.Boolean]}
  def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}

    override def accept(v : _root_.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(v).visitClass(this)}
        }
 
}

    override def getTypeDef():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = (((this).ScalatypeDefinition).Scalaname).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    override def getClassname():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((this).Scalaname).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Class"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

