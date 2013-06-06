package `logo_checker`.kmLogo.ASM
import ScalaImplicit.logo_checker.ImplicitConversion._
object KerRichFactory extends kmLogo.ASM.impl.ASMFactoryImpl{
 override def createBack() : kmLogo.ASM.Back = { new _root_.`logo_checker`.kmLogo.ASM.RichBack }
 override def createForward() : kmLogo.ASM.Forward = { new _root_.`logo_checker`.kmLogo.ASM.RichForward }
 override def createLeft() : kmLogo.ASM.Left = { new _root_.`logo_checker`.kmLogo.ASM.RichLeft }
 override def createRight() : kmLogo.ASM.Right = { new _root_.`logo_checker`.kmLogo.ASM.RichRight }
 override def createPenDown() : kmLogo.ASM.PenDown = { new _root_.`logo_checker`.kmLogo.ASM.RichPenDown }
 override def createPenUp() : kmLogo.ASM.PenUp = { new _root_.`logo_checker`.kmLogo.ASM.RichPenUp }
 override def createClear() : kmLogo.ASM.Clear = { new _root_.`logo_checker`.kmLogo.ASM.RichClear }
 override def createConstant() : kmLogo.ASM.Constant = { new _root_.`logo_checker`.kmLogo.ASM.RichConstant }
 override def createProcCall() : kmLogo.ASM.ProcCall = { new _root_.`logo_checker`.kmLogo.ASM.RichProcCall }
 override def createProcDeclaration() : kmLogo.ASM.ProcDeclaration = { new _root_.`logo_checker`.kmLogo.ASM.RichProcDeclaration }
 override def createBlock() : kmLogo.ASM.Block = { new _root_.`logo_checker`.kmLogo.ASM.RichBlock }
 override def createIf() : kmLogo.ASM.If = { new _root_.`logo_checker`.kmLogo.ASM.RichIf }
 override def createControlStructure() : kmLogo.ASM.ControlStructure = { new _root_.`logo_checker`.kmLogo.ASM.RichControlStructure }
 override def createRepeat() : kmLogo.ASM.Repeat = { new _root_.`logo_checker`.kmLogo.ASM.RichRepeat }
 override def createWhile() : kmLogo.ASM.While = { new _root_.`logo_checker`.kmLogo.ASM.RichWhile }
 override def createParameter() : kmLogo.ASM.Parameter = { new _root_.`logo_checker`.kmLogo.ASM.RichParameter }
 override def createParameterCall() : kmLogo.ASM.ParameterCall = { new _root_.`logo_checker`.kmLogo.ASM.RichParameterCall }
 override def createPlus() : kmLogo.ASM.Plus = { new _root_.`logo_checker`.kmLogo.ASM.RichPlus }
 override def createMinus() : kmLogo.ASM.Minus = { new _root_.`logo_checker`.kmLogo.ASM.RichMinus }
 override def createMult() : kmLogo.ASM.Mult = { new _root_.`logo_checker`.kmLogo.ASM.RichMult }
 override def createDiv() : kmLogo.ASM.Div = { new _root_.`logo_checker`.kmLogo.ASM.RichDiv }
 override def createEquals() : kmLogo.ASM.Equals = { new _root_.`logo_checker`.kmLogo.ASM.RichEquals }
 override def createGreater() : kmLogo.ASM.Greater = { new _root_.`logo_checker`.kmLogo.ASM.RichGreater }
 override def createLower() : kmLogo.ASM.Lower = { new _root_.`logo_checker`.kmLogo.ASM.RichLower }
 override def createLogoProgram() : kmLogo.ASM.LogoProgram = { new _root_.`logo_checker`.kmLogo.ASM.RichLogoProgram }
}

