package `logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_compilerNXC.ImplicitConversion._
trait NXCCodeGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCodeGenerator{

    def generate(subs : org.eclipse.emf.common.util.EList[_root_.java.lang.String], nxc : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var `_res` : _root_.java.lang.StringBuilder = _root_.k2.standard.KerRichFactory.createStringBuffer;
(`_res`).append("\n\n/**\n * This is the implementation of a LOGO Turtle for NXT\n * Author : Franck FLEUREY\n * License : GPL\n *\n * The robot is suposed to have two wheels controled \n * by two separate motors. The distance between the two\n * wheels is D and the diameter of the wheel is d.\n * For this implementation to work D/d must be an integer.\n * A third motor controls a pen up and down. The Pen should\n * touch the paper right in the middle of the two wheels.\n *\n */\n\n#include \"NXCDefs.h\"\n\n// Correponds to D/d\n#define ANGLE_FACTOR 8\n\n// The Motors connections\n#define PEN_MOTOR OUT_A\n#define RIGHT_MOTOR OUT_B\n#define LEFT_MOTOR OUT_C\n#define MOVE_MOTORS OUT_BC\n\n// define step lenght in wheel rotation (degree)\n#define STEP 50\n\n// define the angle of which the pen motor has to move\n#define PEN_ANGLE 45\n\n// The motor spped to use (not two fast to avoid drifting)\n#define SPEED 50\n\n/**\n * The Robot will move straight forward for d steps\n */\nsub forward(int d)\n{\n// int angle = d * STEP;\n   int angle = d * STEP;\n  OnFwd(LEFT_MOTOR, SPEED);\n  OnFwd(RIGHT_MOTOR, SPEED);\n  Wait(angle);\n //ResetTachoCount(MOVE_MOTORS)\n // RotateMotorEx(ports, pwr, angle, turnpct, bSync, bStop)\n// RotateMotorEx(MOVE_MOTORS, SPEED, angle, 0, true, false);\n Off(MOVE_MOTORS);\n}\n\n/**\n * The Robot will turn by n degree around the pen (hopefuly)\n */\nsub turn(int n)\n{\n //RotateMotorEx(MOVE_MOTORS, SPEED, n * ANGLE_FACTOR, -100, false, false);\n \n \n if (n>0) {\n  OnRev(LEFT_MOTOR, SPEED);\n  OnFwd(RIGHT_MOTOR, SPEED);\n  Wait(n*ANGLE_FACTOR);\n  Off(MOVE_MOTORS);\n }\n else {\n  OnRev(RIGHT_MOTOR, SPEED);\n  OnFwd(LEFT_MOTOR, SPEED);\n  Wait((-n)*ANGLE_FACTOR);\n  Off(MOVE_MOTORS);\n }\n}\n\n/**\n * The Pen goes up\n */\nsub penUp()\n{\n RotateMotor(PEN_MOTOR, SPEED, -PEN_ANGLE);\n // SetSensorType(IN_1, IN_TYPE_LIGHT_INACTIVE);\n}\n\n/**\n * The Pen goes down\n */\nsub penDown()\n{\n RotateMotor(PEN_MOTOR, SPEED, PEN_ANGLE);\n // SetSensorType(IN_1, IN_TYPE_LIGHT_ACTIVE);\n}\n/************************************************************/\n/*  END OF THE API, THE COMPILED CODE GOES BELOW THIS LINE  */\n/************************************************************/\n\n")
(subs).each({(s : _root_.java.lang.String)=>

{
(`_res`).append(s)
(`_res`).append("\n")}
})
(`_res`).append("\ntask main()\n{\n")
(`_res`).append(nxc)
(`_res`).append("\n}\n\n\t\t\n")
`~result` = (_root_.k2.utils.UTilScala.toString((`_res`))).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.compilerNXC.NXCCodeGenerator"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

