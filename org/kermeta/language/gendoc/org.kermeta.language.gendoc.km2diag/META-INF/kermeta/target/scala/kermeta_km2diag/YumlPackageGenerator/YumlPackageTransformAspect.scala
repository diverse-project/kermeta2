package `kermeta_km2diag`.YumlPackageGenerator
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait YumlPackageTransformAspect  extends _root_.kermeta_km2diag.transform.Abstract_TransformationAspect with `_root_`.`kermeta_km2diag`.YumlPackageGenerator.YumlPackageTransform{
var outputFolderUrl : _root_.java.lang.String= _
  def KergetOutputFolderUrl() : _root_.java.lang.String={this.outputFolderUrl}
  def KersetOutputFolderUrl(arg:_root_.java.lang.String)={ this.outputFolderUrl = arg}
  def ScalaoutputFolderUrl : _root_.java.lang.String={this.KergetOutputFolderUrl().asInstanceOf[_root_.java.lang.String]}
  def ScalaoutputFolderUrl_=(`~value` : _root_.java.lang.String):Unit={
	this.KersetOutputFolderUrl(`~value`)  }

    def setOutputfolder(ofp : _root_.java.lang.String):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).ScalaoutputFolderUrl = (ofp).asInstanceOf[_root_.java.lang.String];}
        }
 
}

    override def transform(input : _root_.`kermeta_km2diag`.transform.`Abstract_VisitableElement`):_root_.k2.standard.KermetaObject = {
var `~result` : _root_.k2.standard.KermetaObject = null.asInstanceOf[_root_.k2.standard.KermetaObject]; 
  { 


{
var visitor : _root_.`kermeta_km2diag`.YumlPackageGenerator.YumlPackageVisitor = _root_.kermeta_km2diag.YumlPackageGenerator.KerRichFactory.createYumlPackageVisitor;
(visitor).setOutputfolder((this).ScalaoutputFolderUrl)
(input).accept(visitor)
`~result` = ("").asInstanceOf[Any];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("YumlPackageGenerator.YumlPackageTransform"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

