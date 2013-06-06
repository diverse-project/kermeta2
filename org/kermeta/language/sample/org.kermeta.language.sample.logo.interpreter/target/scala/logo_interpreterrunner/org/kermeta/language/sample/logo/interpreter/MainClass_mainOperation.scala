package logo_interpreterrunner.org.kermeta.language.sample.logo.interpreter 
import logo_interpreterrunner.DefaultRunner
import ScalaImplicit.logo_interpreter.ImplicitConversion._
object MainClass_mainOperation extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
    _root_.logo_interpreter.org.kermeta.language.sample.logo.interpreter.KerRichFactory.createMainClass.mainOperation()
  }
}
