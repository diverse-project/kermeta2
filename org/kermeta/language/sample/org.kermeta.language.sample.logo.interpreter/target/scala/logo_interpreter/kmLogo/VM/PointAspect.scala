package `logo_interpreter`.kmLogo.VM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait PointAspect extends k2.standard.KermetaObjectAspect with `_root_`.kmLogo.VM.Point{
  def Scalax : _root_.java.lang.Double={this.getX().asInstanceOf[_root_.java.lang.Double]}
  def Scalax_=(`~value` : _root_.java.lang.Double):Unit={
	this.setX(`~value`)  }
  def Scalay : _root_.java.lang.Double={this.getY().asInstanceOf[_root_.java.lang.Double]}
  def Scalay_=(`~value` : _root_.java.lang.Double):Unit={
	this.setY(`~value`)  }

    def getDelta(dx : _root_.java.lang.Double, dy : _root_.java.lang.Double):_root_.kmLogo.VM.Point = {
var `~result` : _root_.kmLogo.VM.Point = null.asInstanceOf[_root_.kmLogo.VM.Point]; 
  { 


{
`~result` = (_root_.logo_interpreter.kmLogo.VM.KerRichFactory.createPoint).asInstanceOf[_root_.kmLogo.VM.Point];
(`~result`).Scalax = (((this).Scalax).plus(dx)).asInstanceOf[_root_.java.lang.Double];
(`~result`).Scalay = (((this).Scalay).plus(dy)).asInstanceOf[_root_.java.lang.Double];}
        }
 return `~result`
}

    override def toString():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((((("[").plus(_root_.k2.utils.UTilScala.toString((((this).Scalax).intValue())))).plus(",")).plus(_root_.k2.utils.UTilScala.toString((((this).Scalay).intValue())))).plus("]")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.VM.Point"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

