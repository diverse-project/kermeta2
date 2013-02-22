package kermeta_km2diagrunner 
import java.io.PrintStream
import ScalaImplicit.kermeta_km2diag.ImplicitConversion._
class DefaultRunner  {
  def init() : Unit = {
        k2.persistence.EcorePackages.workspaceURI = "null"
    k2.persistence.EcorePackages.pluginURI = "null";

    {
      var pack : _root_.org.kermeta.language.behavior.BehaviorPackage = _root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_km2diag`.org.kermeta.language.behavior.KerRichFactory)
    }


    {
      var pack : _root_.org.kermeta.language.structure.StructurePackage = _root_.org.kermeta.language.structure.impl.StructurePackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_km2diag`.org.kermeta.language.structure.KerRichFactory)
    }


      k2.utils.ReflexivityLoader.pref("kermeta_km2diag")

      k2.utils.UTilScala.setScalaAspectPrefix("kermeta_km2diag")
  }
  def init4eclipse() : Unit = {
	_root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(`kermeta_km2diag`.org.kermeta.language.behavior.KerRichFactory)
_root_.org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(`kermeta_km2diag`.org.kermeta.language.structure.KerRichFactory)

    k2.utils.ReflexivityLoader.pref("kermeta_km2diag")

    k2.utils.UTilScala.setScalaAspectPrefix("kermeta_km2diag")
  }
}
object DefaultRunner extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)

  }
}
