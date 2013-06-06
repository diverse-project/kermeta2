package `logo_compilerNXC`.kmLogo.ASM
import ScalaImplicit.logo_compilerNXC.ImplicitConversion._
object KerRichFactory extends kmLogo.ASM.impl.ASMFactoryImpl{
 override def createBack() : kmLogo.ASM.Back = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichBack }
 override def createForward() : kmLogo.ASM.Forward = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichForward }
 override def createLeft() : kmLogo.ASM.Left = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichLeft }
 override def createRight() : kmLogo.ASM.Right = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichRight }
 override def createPenDown() : kmLogo.ASM.PenDown = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichPenDown }
 override def createPenUp() : kmLogo.ASM.PenUp = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichPenUp }
 override def createClear() : kmLogo.ASM.Clear = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichClear }
 override def createConstant() : kmLogo.ASM.Constant = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichConstant }
 override def createProcCall() : kmLogo.ASM.ProcCall = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichProcCall }
 override def createProcDeclaration() : kmLogo.ASM.ProcDeclaration = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichProcDeclaration }
 override def createBlock() : kmLogo.ASM.Block = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichBlock }
 override def createIf() : kmLogo.ASM.If = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichIf }
 override def createControlStructure() : kmLogo.ASM.ControlStructure = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichControlStructure }
 override def createRepeat() : kmLogo.ASM.Repeat = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichRepeat }
 override def createWhile() : kmLogo.ASM.While = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichWhile }
 override def createParameter() : kmLogo.ASM.Parameter = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichParameter }
 override def createParameterCall() : kmLogo.ASM.ParameterCall = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichParameterCall }
 override def createPlus() : kmLogo.ASM.Plus = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichPlus }
 override def createMinus() : kmLogo.ASM.Minus = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichMinus }
 override def createMult() : kmLogo.ASM.Mult = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichMult }
 override def createDiv() : kmLogo.ASM.Div = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichDiv }
 override def createEquals() : kmLogo.ASM.Equals = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichEquals }
 override def createGreater() : kmLogo.ASM.Greater = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichGreater }
 override def createLower() : kmLogo.ASM.Lower = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichLower }
 override def createLogoProgram() : kmLogo.ASM.LogoProgram = { new _root_.`logo_compilerNXC`.kmLogo.ASM.RichLogoProgram }
}

