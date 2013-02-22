package `kermeta_km2diag`.YumlPackageGenerator
trait YumlPackageVisitor extends `_root_`.`kermeta_km2diag`.transform.`Abstract_PackageVisitor`{

    def setOutputfolder(ofp : _root_.java.lang.String):_root_.scala.Unit
    override def visitPackage(p : _root_.org.kermeta.language.structure.Package):_root_.scala.Unit
    override def visitTypeDefinition(td : _root_.org.kermeta.language.structure.TypeDefinition):_root_.scala.Unit
    override def visitClassDefinition(cd : _root_.org.kermeta.language.structure.ClassDefinition):_root_.scala.Unit
    override def visitProperty(p : _root_.org.kermeta.language.structure.Property):_root_.scala.Unit
    override def visitType(t : _root_.org.kermeta.language.structure.Type):_root_.scala.Unit
    override def visitClass(c : _root_.org.kermeta.language.structure.Class):_root_.scala.Unit
}

