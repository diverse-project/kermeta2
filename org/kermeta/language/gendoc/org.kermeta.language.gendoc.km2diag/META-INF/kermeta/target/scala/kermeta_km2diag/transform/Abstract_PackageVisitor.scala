package `kermeta_km2diag`.transform
trait Abstract_PackageVisitor extends `_root_`.k2.standard.KermetaObject{

    def visitPackage(p : _root_.org.kermeta.language.structure.Package):_root_.scala.Unit
    def visitTypeDefinition(td : _root_.org.kermeta.language.structure.TypeDefinition):_root_.scala.Unit
    def visitClassDefinition(cd : _root_.org.kermeta.language.structure.ClassDefinition):_root_.scala.Unit
    def visitProperty(p : _root_.org.kermeta.language.structure.Property):_root_.scala.Unit
    def visitType(t : _root_.org.kermeta.language.structure.Type):_root_.scala.Unit
    def visitClass(c : _root_.org.kermeta.language.structure.Class):_root_.scala.Unit
}

