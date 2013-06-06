package `logo_interpreter`.kmLogo.VM
import ScalaImplicit.logo_interpreter.ImplicitConversion._
object KerRichFactory extends kmLogo.VM.impl.VMFactoryImpl{
 override def createTurtle() : kmLogo.VM.Turtle = { new _root_.`logo_interpreter`.kmLogo.VM.RichTurtle }
 override def createPoint() : kmLogo.VM.Point = { new _root_.`logo_interpreter`.kmLogo.VM.RichPoint }
 override def createSegment() : kmLogo.VM.Segment = { new _root_.`logo_interpreter`.kmLogo.VM.RichSegment }
}

