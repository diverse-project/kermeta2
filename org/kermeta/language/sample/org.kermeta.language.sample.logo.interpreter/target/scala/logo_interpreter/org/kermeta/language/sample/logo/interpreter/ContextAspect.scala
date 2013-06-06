package `logo_interpreter`.org.kermeta.language.sample.logo.interpreter
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait ContextAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context{
var stack : _root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]= _
  def KergetStack() : _root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]={this.stack}
  def KersetStack(arg:_root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]])={ this.stack = arg}
  def Scalastack : _root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]={this.KergetStack().asInstanceOf[_root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]]}
  def Scalastack_=(`~value` : _root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]):Unit={
	this.KersetStack(`~value`)  }
var turtle : _root_.kmLogo.VM.Turtle= _
  def KergetTurtle() : _root_.kmLogo.VM.Turtle={this.turtle}
  def KersetTurtle(arg:_root_.kmLogo.VM.Turtle)={ this.turtle = arg}
  def Scalaturtle : _root_.kmLogo.VM.Turtle={this.KergetTurtle().asInstanceOf[_root_.kmLogo.VM.Turtle]}
  def Scalaturtle_=(`~value` : _root_.kmLogo.VM.Turtle):Unit={
	this.KersetTurtle(`~value`)  }

    def initialize():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalastack = (_root_.k2.standard.KerRichFactory.createOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]).asInstanceOf[_root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]];
(this).Scalaturtle = (_root_.logo_interpreter.kmLogo.VM.KerRichFactory.createTurtle).asInstanceOf[_root_.kmLogo.VM.Turtle];
`~result` = (null).asInstanceOf[_root_.scala.Unit];}
        }
 
}

    def reset():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalastack = (_root_.k2.standard.KerRichFactory.createOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]).asInstanceOf[_root_.k2.standard.KermetaOrderedSet[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]];}
        }
 
}

    def peek():_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer] = {
var `~result` : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer] = null.asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]; 
  { 


{
`~result` = (((this).Scalastack).last()).asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]];}
        }
 return `~result`
}

    def pop():_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer] = {
var `~result` : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer] = null.asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]]; 
  { 


{
`~result` = (((this).Scalastack).last()).asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]];
((this).Scalastack).removeAt((((this).Scalastack).size()).minus(1))}
        }
 return `~result`
}

    def push(elem : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
((this).Scalastack).add(elem)}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.interpreter.Context"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

