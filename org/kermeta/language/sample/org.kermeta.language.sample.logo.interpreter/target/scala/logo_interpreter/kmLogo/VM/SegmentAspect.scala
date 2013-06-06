package `logo_interpreter`.kmLogo.VM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait SegmentAspect extends k2.standard.KermetaObjectAspect with `_root_`.kmLogo.VM.Segment{
  def Scalaorigin : _root_.kmLogo.VM.Point={this.getOrigin().asInstanceOf[_root_.kmLogo.VM.Point]}
  def Scalaorigin_=(`~value` : _root_.kmLogo.VM.Point):Unit={
	this.setOrigin(`~value`)  }
  def Scaladestination : _root_.kmLogo.VM.Point={this.getDestination().asInstanceOf[_root_.kmLogo.VM.Point]}
  def Scaladestination_=(`~value` : _root_.kmLogo.VM.Point):Unit={
	this.setDestination(`~value`)  }

    def make(orig : _root_.kmLogo.VM.Point, dest : _root_.kmLogo.VM.Point):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalaorigin = (orig).asInstanceOf[_root_.kmLogo.VM.Point];
(this).Scaladestination = (dest).asInstanceOf[_root_.kmLogo.VM.Point];}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.VM.Segment"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

