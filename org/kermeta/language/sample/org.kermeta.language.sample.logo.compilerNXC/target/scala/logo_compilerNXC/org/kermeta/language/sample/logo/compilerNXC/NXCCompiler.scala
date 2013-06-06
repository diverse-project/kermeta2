package `logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC
trait NXCCompiler extends `_root_`.k2.standard.KermetaObject{

    def incDepth():_root_.scala.Unit
    def decDepth():_root_.scala.Unit
    def main():_root_.scala.Unit
    def compile(uri : _root_.java.lang.String, out : _root_.java.lang.String, api : _root_.java.lang.String):_root_.java.lang.String
    def compileToStdOut(uri : _root_.java.lang.String):_root_.java.lang.String
    def loadProgram(ecoreFile : _root_.java.lang.String):_root_.kmLogo.ASM.LogoProgram
}

