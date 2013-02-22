package `kermeta_km2diag`.mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.kermeta_km2diag.ImplicitConversion._
trait DiagGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`kermeta_km2diag`.mainPackage.DiagGenerator{

    def createDiag(inputModel : _root_.java.lang.String, outputFolder : _root_.java.lang.String):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(inputModel);
(resource).load(null)
((resource).kgetContents()).each({(elem : Any)=>

{
if ((elem).isInstanceOf[_root_.org.kermeta.language.structure.Metamodel])

{
var mm : _root_.org.kermeta.language.structure.Metamodel = (elem).asInstanceOf[_root_.org.kermeta.language.structure.Metamodel];
var t1 : _root_.`kermeta_km2diag`.GlumlyPackageGenerator.GlumlyPackageTransform = _root_.kermeta_km2diag.GlumlyPackageGenerator.KerRichFactory.createGlumlyPackageTransform;
(t1).setOutputfolder((outputFolder).plus("images/glumly/packages/"))
var t3 : _root_.`kermeta_km2diag`.GlumlyClassGenerator.GlumlyClassTransform = _root_.kermeta_km2diag.GlumlyClassGenerator.KerRichFactory.createGlumlyClassTransform;
(t3).setOutputfolder((outputFolder).plus("images/glumly/classes/"))
var t2 : _root_.`kermeta_km2diag`.YumlPackageGenerator.YumlPackageTransform = _root_.kermeta_km2diag.YumlPackageGenerator.KerRichFactory.createYumlPackageTransform;
(t2).setOutputfolder((outputFolder).plus("images/yuml/packages"))
var t4 : _root_.`kermeta_km2diag`.YumlClassGenerator.YumlClassTransform = _root_.kermeta_km2diag.YumlClassGenerator.KerRichFactory.createYumlClassTransform;
(t4).setOutputfolder((outputFolder).plus("images/yuml/classes/"))
((mm).Scalapackages).each({(pack : _root_.org.kermeta.language.structure.Package)=>

{
(t1).transform(pack)
(t3).transform(pack)
(t2).transform(pack)
(t4).transform(pack)}
})}
}
})
(_root_.k2.io.StdIO).writeln("Finish")}
        }
 
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.DiagGenerator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_km2diag.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

