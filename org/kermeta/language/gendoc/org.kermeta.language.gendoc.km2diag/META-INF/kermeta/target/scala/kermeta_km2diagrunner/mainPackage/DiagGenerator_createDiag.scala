package kermeta_km2diagrunner.mainPackage 
import kermeta_km2diagrunner.DefaultRunner
import ScalaImplicit.kermeta_km2diag.ImplicitConversion._
object DiagGenerator_createDiag extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
    _root_.kermeta_km2diag.mainPackage.KerRichFactory.createDiagGenerator.createDiag(args(0) , args(1))
  }
}
