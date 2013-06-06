package `logo_interpreter`.kmLogo.VM
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait TurtleAspect extends k2.standard.KermetaObjectAspect with `_root_`.kmLogo.VM.Turtle{
  def Scalaposition : _root_.kmLogo.VM.Point={this.getPosition().asInstanceOf[_root_.kmLogo.VM.Point]}
  def Scalaposition_=(`~value` : _root_.kmLogo.VM.Point):Unit={
	this.setPosition(`~value`)  }
  def Scaladrawings : k2.standard.ReflectiveOrderedSet[`logo_interpreter`.kmLogo.VM.TurtleAspect,_root_.kmLogo.VM.Segment]={    new k2.standard.RichReflectiveOrderedSet[`logo_interpreter`.kmLogo.VM.TurtleAspect,_root_.kmLogo.VM.Segment](thisUpper = -1,value=this.getDrawings())}
  def Scaladrawings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.VM.Segment]):Unit={
	this.getDrawings().clear
	this.getDrawings().addAll(`~value`)
	  }
  def Scalaheading : _root_.java.lang.Integer={this.getHeading().asInstanceOf[_root_.java.lang.Integer]}
  def Scalaheading_=(`~value` : _root_.java.lang.Integer):Unit={
	this.setHeading(`~value`)  }
  def ScalapenUp : _root_.java.lang.Boolean={this.getPenUp().asInstanceOf[_root_.java.lang.Boolean]}
  def ScalapenUp_=(`~value` : _root_.java.lang.Boolean):Unit={
	this.setPenUp(`~value`)  }
  def Scalapoints : k2.standard.ReflectiveOrderedSet[`logo_interpreter`.kmLogo.VM.TurtleAspect,_root_.kmLogo.VM.Point]={    new k2.standard.RichReflectiveOrderedSet[`logo_interpreter`.kmLogo.VM.TurtleAspect,_root_.kmLogo.VM.Point](thisUpper = -1,value=this.getPoints())}
  def Scalapoints_=(`~value` : k2.standard.KermetaOrderedSet[_root_.kmLogo.VM.Point]):Unit={
	this.getPoints().clear
	this.getPoints().addAll(`~value`)
	  }
var math : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math= _
  def KergetMath() : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math={this.math}
  def KersetMath(arg:_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math)={ this.math = arg}
  def Scalamath : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math={this.KergetMath().asInstanceOf[_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math]}
  def Scalamath_=(`~value` : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math):Unit={
	this.KersetMath(`~value`)  }

    def reset():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalamath = (_root_.logo_interpreter.org.kermeta.language.sample.logo.interpreter.KerRichFactory.createMath).asInstanceOf[_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math];
(this).Scalaposition = (_root_.logo_interpreter.kmLogo.VM.KerRichFactory.createPoint).asInstanceOf[_root_.kmLogo.VM.Point];
((this).Scalaposition).Scalax = ((0).doubleValue()).asInstanceOf[_root_.java.lang.Double];
((this).Scalaposition).Scalay = ((0).doubleValue()).asInstanceOf[_root_.java.lang.Double];
(this).Scalaheading = (0).asInstanceOf[_root_.java.lang.Integer];
(this).ScalapenUp = (true).asInstanceOf[_root_.java.lang.Boolean];
((this).Scaladrawings).clear()}
        }
 
}

    def rotate(angle : _root_.java.lang.Integer):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalaheading = ((((this).Scalaheading).plus(angle)).mod(360)).asInstanceOf[_root_.java.lang.Integer];}
        }
 
}

    def move(dx : _root_.java.lang.Double, dy : _root_.java.lang.Double):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var newPos : _root_.kmLogo.VM.Point = ((this).Scalaposition).getDelta(dx, dy);
var trace : _root_.kmLogo.VM.Segment = null.asInstanceOf[_root_.kmLogo.VM.Segment];
if ((this).ScalapenUp)

{
(_root_.k2.io.StdIO).writeln(("Turtle move to ").plus(_root_.k2.utils.UTilScala.toString((newPos))))}
else 


{
(_root_.k2.io.StdIO).writeln(("Turtle trace to ").plus(_root_.k2.utils.UTilScala.toString((newPos))))
trace = (_root_.logo_interpreter.kmLogo.VM.KerRichFactory.createSegment).asInstanceOf[_root_.kmLogo.VM.Segment];
(trace).make((this).Scalaposition, newPos)
((this).Scaladrawings).add(trace)}

(this).Scalaposition = (newPos).asInstanceOf[_root_.kmLogo.VM.Point];}
        }
 
}

    def forward(steps : _root_.java.lang.Integer):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var radian : _root_.java.lang.Double = ((this).Scalamath).toRadians(((this).Scalaheading).doubleValue());
(this).move((this).scale(steps, ((this).Scalamath).sin(radian)), (this).scale(steps, ((this).Scalamath).cos(radian)))}
        }
 
}

    def scale(steps : _root_.java.lang.Integer, factor : _root_.java.lang.Double):_root_.java.lang.Double = {
var `~result` : _root_.java.lang.Double = null.asInstanceOf[_root_.java.lang.Double]; 
  { 


{
`~result` = ((((steps).doubleValue()).mult(factor)).asInstanceOf[_root_.java.lang.Double]).asInstanceOf[_root_.java.lang.Double];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("kmLogo.VM.Turtle"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

