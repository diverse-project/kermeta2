package `kermeta_km2diag`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait PackageAspect extends `kermeta_km2diag`.org.kermeta.language.structure.NamedElementAspect with `kermeta_km2diag`.org.kermeta.language.structure.ModelElementTypeDefinitionContainerAspect with `kermeta_km2diag`.transform.`Abstract_VisitableElementAspect` with `_root_`.org.kermeta.language.structure.Package{
  def ScalanestedPackage : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.Package]={    new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.Package](thisUpper = -1,value=this.getNestedPackage())}
  def ScalanestedPackage_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Package]):Unit={
	this.getNestedPackage().clear
	this.getNestedPackage().addAll(`~value`)
	  }
  def ScalanestingPackage : _root_.org.kermeta.language.structure.Package={this.getNestingPackage().asInstanceOf[_root_.org.kermeta.language.structure.Package]}
  def ScalanestingPackage_=(`~value` : _root_.org.kermeta.language.structure.Package):Unit={
	this.setNestingPackage(`~value`)  }
  def Scalauri : _root_.java.lang.String={this.getUri().asInstanceOf[_root_.java.lang.String]}
  def Scalauri_=(`~value` : _root_.java.lang.String):Unit={
	this.setUri(`~value`)  }
  def ScalaownedAdaptationOperators : k2.standard.ReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.PackageAspect,_root_.org.kermeta.language.structure.AdaptationOperator]={    new k2.standard.RichReflectiveOrderedSet[`kermeta_km2diag`.org.kermeta.language.structure.PackageAspect,_root_.org.kermeta.language.structure.AdaptationOperator](thisUpper = -1,value=this.getOwnedAdaptationOperators())}
  def ScalaownedAdaptationOperators_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.AdaptationOperator]):Unit={
	this.getOwnedAdaptationOperators().clear
	this.getOwnedAdaptationOperators().addAll(`~value`)
	  }

    override def accept(v : _root_.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(v).visitPackage(this)}
        }
 
}

    def getQualifiedName():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var parent : _root_.java.lang.String = "";
if ((_root_.k2.standard.KerRichFactory.isVoid(((this).container()))).not())

{
if (((this).container()).isInstanceOf[_root_.org.kermeta.language.structure.Package])

{
parent = (((((this).container()).asInstanceOf[_root_.org.kermeta.language.structure.Package]).getQualifiedName()).plus("::")).asInstanceOf[_root_.java.lang.String];}
}

`~result` = ((parent).plus((this).Scalaname)).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Package"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

