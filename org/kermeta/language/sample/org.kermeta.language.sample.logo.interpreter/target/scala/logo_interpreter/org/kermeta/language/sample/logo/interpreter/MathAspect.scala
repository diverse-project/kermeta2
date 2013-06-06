package `logo_interpreter`.org.kermeta.language.sample.logo.interpreter
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait MathAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math{

    def sin(a : _root_.java.lang.Double):_root_.java.lang.Double = {
var `~result` : _root_.java.lang.Double = null.asInstanceOf[_root_.java.lang.Double]; 
  { 


{
try{
`~result` = _root_.k2.utils.UTilScala.getValue(java.lang.Math.sin(a)).asInstanceOf[_root_.java.lang.Double];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def cos(a : _root_.java.lang.Double):_root_.java.lang.Double = {
var `~result` : _root_.java.lang.Double = null.asInstanceOf[_root_.java.lang.Double]; 
  { 


{
try{
`~result` = _root_.k2.utils.UTilScala.getValue(java.lang.Math.cos(a)).asInstanceOf[_root_.java.lang.Double];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def toDegrees(a : _root_.java.lang.Double):_root_.java.lang.Double = {
var `~result` : _root_.java.lang.Double = null.asInstanceOf[_root_.java.lang.Double]; 
  { 


{
try{
`~result` = _root_.k2.utils.UTilScala.getValue(java.lang.Math.toDegrees(a)).asInstanceOf[_root_.java.lang.Double];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}

    def toRadians(a : _root_.java.lang.Double):_root_.java.lang.Double = {
var `~result` : _root_.java.lang.Double = null.asInstanceOf[_root_.java.lang.Double]; 
  { 


{
try{
`~result` = _root_.k2.utils.UTilScala.getValue(java.lang.Math.toRadians(a)).asInstanceOf[_root_.java.lang.Double];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.interpreter.Math"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

