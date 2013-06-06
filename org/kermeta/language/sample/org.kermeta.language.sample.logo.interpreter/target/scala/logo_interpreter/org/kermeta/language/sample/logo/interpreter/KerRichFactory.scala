package `logo_interpreter`.org.kermeta.language.sample.logo.interpreter
import ScalaImplicit.logo_interpreter.ImplicitConversion._
object KerRichFactory{
 def createContext() : `logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Context = { new _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.RichContext }
 def createMath() : `logo_interpreter`.org.kermeta.language.sample.logo.interpreter.Math = { new _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.RichMath }
 def createMainClass() : `logo_interpreter`.org.kermeta.language.sample.logo.interpreter.MainClass = { new _root_.`logo_interpreter`.org.kermeta.language.sample.logo.interpreter.RichMainClass }
}

