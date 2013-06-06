package logo_compilerNXCrunner.org.kermeta.language.sample.logo.compilerNXC 
import logo_compilerNXCrunner.DefaultRunner
import ScalaImplicit.logo_compilerNXC.ImplicitConversion._
object NXCCompiler_main extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
    _root_.logo_compilerNXC.org.kermeta.language.sample.logo.compilerNXC.KerRichFactory.createNXCCompiler.main()
  }
}
