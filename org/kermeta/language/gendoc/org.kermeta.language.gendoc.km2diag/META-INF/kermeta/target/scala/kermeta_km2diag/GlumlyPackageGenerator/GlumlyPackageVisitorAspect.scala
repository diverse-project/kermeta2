package `kermeta_km2diag`.GlumlyPackageGenerator
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait GlumlyPackageVisitorAspect  extends _root_.kermeta_km2diag.transform.Abstract_PackageVisitorAspect with `_root_`.`kermeta_km2diag`.GlumlyPackageGenerator.GlumlyPackageVisitor{
var fileContent : _root_.java.lang.StringBuilder= _
  def KergetFileContent() : _root_.java.lang.StringBuilder={this.fileContent}
  def KersetFileContent(arg:_root_.java.lang.StringBuilder)={ this.fileContent = arg}
  def ScalafileContent : _root_.java.lang.StringBuilder={this.KergetFileContent().asInstanceOf[_root_.java.lang.StringBuilder]}
  def ScalafileContent_=(`~value` : _root_.java.lang.StringBuilder):Unit={
	this.KersetFileContent(`~value`)  }
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

    override def visitPackage(p : _root_.org.kermeta.language.structure.Package):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).ScalafileContent = (_root_.k2.standard.KerRichFactory.createStringBuffer).asInstanceOf[_root_.java.lang.StringBuilder];
((p).ScalaownedTypeDefinition).each({(otd : _root_.org.kermeta.language.structure.ModelElementTypeDefinition)=>

{
(otd).accept(this)}
})
(_root_.k2.io.FileIO).writeTextFile(((((("file:").plus((this).ScalaoutputFolderUrl)).plus("/")).plus((p).getQualifiedName())).plus(".txt")).toURI(), _root_.k2.utils.UTilScala.toString(((this).ScalafileContent)))
((p).ScalanestedPackage).each({(subPack : _root_.org.kermeta.language.structure.Package)=>

{
(subPack).accept(this)}
})}
        }
 
}

    override def visitTypeDefinition(td : _root_.org.kermeta.language.structure.TypeDefinition):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
}
        }
 
}

    override def visitClassDefinition(cd : _root_.org.kermeta.language.structure.ClassDefinition):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
((this).ScalafileContent).append((("CO\t").plus((cd).Scalaname)).plus("\torange\n"))
((cd).ScalasuperType).each({(e : _root_.org.kermeta.language.structure.Type)=>

{
((this).ScalafileContent).append((((("H\t").plus((cd).Scalaname)).plus("\t")).plus((e).getTypeDef())).plus("\n"))}
})}
        }
 
}

    override def visitProperty(p : _root_.org.kermeta.language.structure.Property):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
if (((p).Scalatype).isInstanceOf[_root_.org.kermeta.language.structure.Class])

{
if ((p).ScalaisComposite)

{
((this).ScalafileContent).append((((("C\t").plus(((p).ScalaowningClass).Scalaname)).plus("\t")).plus(((p).Scalatype).getTypeDef())).plus("\n"))}
else 


{
((this).ScalafileContent).append((((("S\t").plus(((p).ScalaowningClass).Scalaname)).plus("\t")).plus(((p).Scalatype).getTypeDef())).plus("\n"))}
}
}
        }
 
}

    override def visitType(t : _root_.org.kermeta.language.structure.Type):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
}
        }
 
}

    override def visitClass(c : _root_.org.kermeta.language.structure.Class):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("GlumlyPackageGenerator.GlumlyPackageVisitor"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

