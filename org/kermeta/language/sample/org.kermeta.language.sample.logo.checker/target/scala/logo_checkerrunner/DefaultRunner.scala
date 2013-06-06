package logo_checkerrunner 
import java.io.PrintStream
import ScalaImplicit.logo_checker.ImplicitConversion._
class DefaultRunner  {
  def init() : Unit = {
        k2.persistence.EcorePackages.workspaceURI = "null"
    k2.persistence.EcorePackages.pluginURI = "null";

    {
      var pack : _root_.org.kermeta.language.behavior.BehaviorPackage = _root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_standard`.org.kermeta.language.behavior.KerRichFactory)
    }


    {
      var pack : _root_.org.kermeta.language.structure.StructurePackage = _root_.org.kermeta.language.structure.impl.StructurePackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`kermeta_standard`.org.kermeta.language.structure.KerRichFactory)
    }


    {
      var pack : _root_.kmLogo.ASM.ASMPackage = _root_.kmLogo.ASM.impl.ASMPackageImpl.init
      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.kmLogo.ASM.ASMPackage.`eNS_URI`, pack)
      k2.persistence.EcorePackages.getPacks().put(_root_.kmLogo.ASM.ASMPackage.`eNS_URI`, pack)
      pack.setEFactoryInstance(`logo_checker`.kmLogo.ASM.KerRichFactory)
    }


      k2.utils.ReflexivityLoader.pref("logo_checker")

      k2.utils.UTilScala.setScalaAspectPrefix("logo_checker")
  }
  def init4eclipse() : Unit = {
	_root_.org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(`kermeta_standard`.org.kermeta.language.behavior.KerRichFactory)
_root_.org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(`kermeta_standard`.org.kermeta.language.structure.KerRichFactory)
_root_.kmLogo.ASM.impl.ASMPackageImpl.init().setEFactoryInstance(`logo_checker`.kmLogo.ASM.KerRichFactory)

    k2.utils.ReflexivityLoader.pref("logo_checker")

    k2.utils.UTilScala.setScalaAspectPrefix("logo_checker")
  }
}
object DefaultRunner extends DefaultRunner {
  def main(args : Array[String]) : Unit = {
    init() 
    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)

  }
}
