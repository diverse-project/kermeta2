package `logo_checker`.org.kermeta.language.sample.logo.checkerPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_checker.ImplicitConversion._
trait MainClassAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_checker`.org.kermeta.language.sample.logo.checkerPackage.MainClass{

    def check():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).checkProgram("carre.logoasm")
(this).checkProgram("carre_faulty1.logoasm")
(this).checkProgram("carre_faulty2.logoasm")}
        }
 
}

    def checkProgram(prg : _root_.java.lang.String):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{


try {
 var program : _root_.kmLogo.ASM.LogoProgram = (this).loadProgram(("platform:/resource/org.kermeta.language.sample.logo.checker/test/").plus(prg));
(program).checkAllInvariants()
(_root_.k2.io.StdIO).writeln((("Program ").plus(prg)).plus(" seems ok. ")) 
} catch {
 case e:_root_.k2.exceptions.Exception => {(_root_.k2.io.StdIO).writeln(((("Error in program ").plus(prg)).plus(" : ")).plus((e).Scalamessage))
}
 }
}
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
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.checkerPackage.MainClass"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

