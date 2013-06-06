package `logo_checker`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait ParameterAspect extends k2.standard.KermetaObjectAspect with `_root_`.kmLogo.ASM.Parameter{
  def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
  def Scalaname_=(`~value` : _root_.java.lang.String):Unit={
	this.setName(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Parameter"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

