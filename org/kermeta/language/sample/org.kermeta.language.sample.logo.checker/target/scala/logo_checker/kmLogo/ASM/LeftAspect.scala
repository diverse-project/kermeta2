package `logo_checker`.kmLogo.ASM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait LeftAspect extends `logo_checker`.kmLogo.ASM.PrimitiveAspect with `_root_`.kmLogo.ASM.Left{
  def Scalaangle : _root_.kmLogo.ASM.Expression={this.getAngle().asInstanceOf[_root_.kmLogo.ASM.Expression]}
  def Scalaangle_=(`~value` : _root_.kmLogo.ASM.Expression):Unit={
	this.setAngle(`~value`)  }
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.ASM.Left"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

