package logo_checkerrunner.org.kermeta.language.sample.logo.checkerPackage 
import logo_checkerrunner.DefaultRunner
import ScalaImplicit.logo_checker.ImplicitConversion._
object MainClass_check extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
    _root_.logo_checker.org.kermeta.language.sample.logo.checkerPackage.KerRichFactory.createMainClass.check()
  }
}
