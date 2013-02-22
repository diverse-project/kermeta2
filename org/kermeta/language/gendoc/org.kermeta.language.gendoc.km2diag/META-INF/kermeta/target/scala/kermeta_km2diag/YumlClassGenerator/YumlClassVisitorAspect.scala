package `kermeta_km2diag`.YumlClassGenerator
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait YumlClassVisitorAspect  extends _root_.kermeta_km2diag.transform.Abstract_PackageVisitorAspect with `_root_`.`kermeta_km2diag`.YumlClassGenerator.YumlClassVisitor{
var classContext : _root_.k2.standard.KermetaSet[_root_.java.lang.String]= _
  def KergetClassContext() : _root_.k2.standard.KermetaSet[_root_.java.lang.String]={this.classContext}
  def KersetClassContext(arg:_root_.k2.standard.KermetaSet[_root_.java.lang.String])={ this.classContext = arg}
  def ScalaclassContext : _root_.k2.standard.KermetaSet[_root_.java.lang.String]={this.KergetClassContext().asInstanceOf[_root_.k2.standard.KermetaSet[_root_.java.lang.String]]}
  def ScalaclassContext_=(`~value` : _root_.k2.standard.KermetaSet[_root_.java.lang.String]):Unit={
	this.KersetClassContext(`~value`)  }
var fileContent : _root_.java.lang.StringBuilder= _
  def KergetFileContent() : _root_.java.lang.StringBuilder={this.fileContent}
  def KersetFileContent(arg:_root_.java.lang.StringBuilder)={ this.fileContent = arg}
  def ScalafileContent : _root_.java.lang.StringBuilder={this.KergetFileContent().asInstanceOf[_root_.java.lang.StringBuilder]}
  def ScalafileContent_=(`~value` : _root_.java.lang.StringBuilder):Unit={
	this.KersetFileContent(`~value`)  }
var path : _root_.java.lang.String= _
  def KergetPath() : _root_.java.lang.String={this.path}
  def KersetPath(arg:_root_.java.lang.String)={ this.path = arg}
  def Scalapath : _root_.java.lang.String={this.KergetPath().asInstanceOf[_root_.java.lang.String]}
  def Scalapath_=(`~value` : _root_.java.lang.String):Unit={
	this.KersetPath(`~value`)  }
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
(this).Scalapath = (((p).getQualifiedName()).replaceAll("::", "/")).asInstanceOf[_root_.java.lang.String];
((p).ScalaownedTypeDefinition).each({(otd : _root_.org.kermeta.language.structure.ModelElementTypeDefinition)=>

{
(otd).accept(this)}
})
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
(this).ScalaclassContext = (_root_.k2.standard.KerRichFactory.createSet[_root_.java.lang.String]).asInstanceOf[_root_.k2.standard.KermetaSet[_root_.java.lang.String]];
(this).ScalafileContent = (_root_.k2.standard.KerRichFactory.createStringBuffer).asInstanceOf[_root_.java.lang.StringBuilder];
((this).ScalafileContent).append((("[").plus((cd).Scalaname)).plus("{bg:orange}]\n"))
((this).ScalaclassContext).add((cd).Scalaname)
((cd).ScalasuperType).each({(e : _root_.org.kermeta.language.structure.Type)=>

{
((this).ScalafileContent).append(((((("[").plus((cd).Scalaname)).plus("]")).plus("-^[")).plus((e).getTypeDef())).plus("]\n"))
((this).ScalaclassContext).add((e).getTypeDef())}
})
((cd).ScalaownedAttribute).each({(oa : _root_.org.kermeta.language.structure.Property)=>

{
(oa).accept(this)}
})
var visitedElem : _root_.k2.standard.KermetaSet[_root_.java.lang.String] = _root_.k2.standard.KerRichFactory.createSet[_root_.java.lang.String];
(visitedElem).add((cd).Scalaname)
((cd).ScalasuperType).each({(e : _root_.org.kermeta.language.structure.Type)=>

{
if ((e).isInstanceOf[_root_.org.kermeta.language.structure.Class])

{
var cl : _root_.org.kermeta.language.structure.Class = (e).asInstanceOf[_root_.org.kermeta.language.structure.Class];
(this).visitClass(cl)
(visitedElem).add((cl).Scalaname)}
}
})
((cd).ScalaownedAttribute).each({(oa : _root_.org.kermeta.language.structure.Property)=>

{
if (((oa).Scalatype).isInstanceOf[_root_.org.kermeta.language.structure.Class])

{
var cl : _root_.org.kermeta.language.structure.Class = ((oa).Scalatype).asInstanceOf[_root_.org.kermeta.language.structure.Class];
if (((visitedElem).exists({(elemName : _root_.java.lang.String)=>

{
((elemName) == ((cl).Scalaname))}
})).not())

{
(this).visitClass(cl)
(visitedElem).add((cl).Scalaname)}
}
}
})
(_root_.k2.io.FileIO).writeTextFile(((((((("file:").plus((this).ScalaoutputFolderUrl)).plus("/")).plus((this).Scalapath)).plus("/")).plus((cd).Scalaname)).plus(".txt")).toURI(), _root_.k2.utils.UTilScala.toString(((this).ScalafileContent)))}
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
((this).ScalafileContent).append(((((("[").plus(((p).ScalaowningClass).Scalaname)).plus("]")).plus("++->[")).plus(((p).Scalatype).getTypeDef())).plus("]\n"))}
else 


{
((this).ScalafileContent).append(((((("[").plus(((p).ScalaowningClass).Scalaname)).plus("]")).plus("->[")).plus(((p).Scalatype).getTypeDef())).plus("]\n"))}

((this).ScalaclassContext).add(((p).Scalatype).getTypeDef())}
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
((this).ScalaclassContext).each({(cc : _root_.java.lang.String)=>

{
((c).ScalasuperClass).each({(e : _root_.org.kermeta.language.structure.Class)=>

{
if ((((e).getTypeDef()) == (cc)))

{
((this).ScalafileContent).append(((((("[").plus((c).Scalaname)).plus("]")).plus("-^[")).plus((e).getTypeDef())).plus("]\n"))}
}
})
((c).ScalaownedAttribute).each({(oa : _root_.org.kermeta.language.structure.Property)=>

{
if (((((oa).Scalatype).getTypeDef()) == (cc)))

{
if ((oa).ScalaisComposite)

{
((this).ScalafileContent).append(((((("[").plus((c).Scalaname)).plus("]")).plus("++->[")).plus(((oa).Scalatype).getTypeDef())).plus("]\n"))}
else 


{
((this).ScalafileContent).append(((((("[").plus((c).Scalaname)).plus("]")).plus("->[")).plus(((oa).Scalatype).getTypeDef())).plus("]\n"))}
}
}
})}
})}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("YumlClassGenerator.YumlClassVisitor"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

