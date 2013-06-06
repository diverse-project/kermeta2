package `logo_interpreter`.org.kermeta.language.sample.logo.interpreter
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_interpreter.ImplicitConversion._
trait MainClassAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.MainClass{
var context : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context= _
  def KergetContext() : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context={this.context}
  def KersetContext(arg:_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context)={ this.context = arg}
  def Scalacontext : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context={this.KergetContext().asInstanceOf[_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context]}
  def Scalacontext_=(`~value` : _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context):Unit={
	this.KersetContext(`~value`)  }
var root : _root_.kmLogo.ASM.LogoProgram= _
  def KergetRoot() : _root_.kmLogo.ASM.LogoProgram={this.root}
  def KersetRoot(arg:_root_.kmLogo.ASM.LogoProgram)={ this.root = arg}
  def Scalaroot : _root_.kmLogo.ASM.LogoProgram={this.KergetRoot().asInstanceOf[_root_.kmLogo.ASM.LogoProgram]}
  def Scalaroot_=(`~value` : _root_.kmLogo.ASM.LogoProgram):Unit={
	this.KersetRoot(`~value`)  }

    def mainOperation():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scalacontext = (_root_.logo_interpreter.org.kermeta.language.sample.logo.interpreter.KerRichFactory.createContext).asInstanceOf[_root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context];
((this).Scalacontext).initialize()
(_root_.k2.io.StdIO).writeln("Loading logoasm file")
(this).Scalaroot = ((this).loadProgram("platform:/resource/org.kermeta.language.sample.logo.interpreter/test/test.logoasm")).asInstanceOf[_root_.kmLogo.ASM.LogoProgram];
(_root_.k2.io.StdIO).writeln("Logoasm file loaded")
(_root_.k2.io.StdIO).writeln("Interpretation running")
((this).Scalaroot).eval((this).Scalacontext)
(_root_.k2.io.StdIO).writeln("Ended Interpretation")}
        }
 
}

    def loadProgram(ecoreFile : _root_.java.lang.String):_root_.kmLogo.ASM.LogoProgram = {
var `~result` : _root_.kmLogo.ASM.LogoProgram = null.asInstanceOf[_root_.kmLogo.ASM.LogoProgram]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(ecoreFile, "platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.ecore");
(resource).load(null)
try{
`~result` = (((resource).kgetContents()).one()).asInstanceOf[_root_.kmLogo.ASM.LogoProgram];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.interpreter.MainClass"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

