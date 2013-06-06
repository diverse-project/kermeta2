package `logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaCollectionConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.logo_compilerNXC.ImplicitConversion._
trait NXCCompilerAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompiler{
var root : _root_.kmLogo.ASM.LogoProgram= _
  def KergetRoot() : _root_.kmLogo.ASM.LogoProgram={this.root}
  def KersetRoot(arg:_root_.kmLogo.ASM.LogoProgram)={ this.root = arg}
  def Scalaroot : _root_.kmLogo.ASM.LogoProgram={this.KergetRoot().asInstanceOf[_root_.kmLogo.ASM.LogoProgram]}
  def Scalaroot_=(`~value` : _root_.kmLogo.ASM.LogoProgram):Unit={
	this.KersetRoot(`~value`)  }
var subs : k2.standard.KermetaOrderedSet[_root_.java.lang.String] = k2.standard.KerRichFactory.createOrderedSet[_root_.java.lang.String]
  def KergetSubs() : k2.standard.KermetaOrderedSet[_root_.java.lang.String]={this.subs}
  def KersetSubs(arg:k2.standard.KermetaOrderedSet[_root_.java.lang.String])={ this.subs = arg}
  def Scalasubs : k2.standard.ReflectiveOrderedSet[`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompilerAspect,_root_.java.lang.String]={    new k2.standard.RichReflectiveOrderedSet[`logo_compilerNXC`.org.kermeta.language.sample.logo.compilerNXC.NXCCompilerAspect,_root_.java.lang.String](thisUpper = -1,value=this.KergetSubs())}
  def Scalasubs_=(`~value` : k2.standard.KermetaOrderedSet[_root_.java.lang.String]):Unit={
	this.KergetSubs().clear
	this.KergetSubs().addAll(`~value`)
	  }
var depth : _root_.java.lang.Integer= _
  def KergetDepth() : _root_.java.lang.Integer={this.depth}
  def KersetDepth(arg:_root_.java.lang.Integer)={ this.depth = arg}
  def Scaladepth : _root_.java.lang.Integer={this.KergetDepth().asInstanceOf[_root_.java.lang.Integer]}
  def Scaladepth_=(`~value` : _root_.java.lang.Integer):Unit={
	this.KersetDepth(`~value`)  }
var prefix : _root_.java.lang.String= _
  def KergetPrefix() : _root_.java.lang.String={this.prefix}
  def Scalaprefix : _root_.java.lang.String={var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((this).Scaladepth).times({(i : _root_.java.lang.Integer)=>

{
(`~result`).append("\t")}
})}
() 
 return `~result`
}

    def incDepth():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scaladepth = (((this).Scaladepth).plus(1)).asInstanceOf[_root_.java.lang.Integer];}
        }
 
}

    def decDepth():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(this).Scaladepth = (((this).Scaladepth).minus(1)).asInstanceOf[_root_.java.lang.Integer];}
        }
 
}

    def main():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var projectPath : _root_.java.lang.String = "platform:/resource/org.kermeta.language.sample.logo.compilerNXC";
(this).compile((projectPath).plus("/tests/k.xmi"), (projectPath).plus("/tests/k.nxc"), null)}
        }
 
}

    def compile(uri : _root_.java.lang.String, out : _root_.java.lang.String, api : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
(this).Scaladepth = (0).asInstanceOf[_root_.java.lang.Integer];
(this).Scalaroot = ((this).loadProgram(uri)).asInstanceOf[_root_.kmLogo.ASM.LogoProgram];
var nxc : _root_.java.lang.String = ((this).Scalaroot).compileToNXC(this);
`~result` = ((_root_.logo_compilerNXC.org.kermeta.language.sample.logo.compilerNXC.KerRichFactory.createNXCCodeGenerator).generate((this).Scalasubs, nxc)).asInstanceOf[_root_.java.lang.String];
(_root_.k2.io.FileIO).writeTextFile((out).toURI(), `~result`)}
        }
 return `~result`
}

    def compileToStdOut(uri : _root_.java.lang.String):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
(this).Scaladepth = (0).asInstanceOf[_root_.java.lang.Integer];
(this).Scalaroot = ((this).loadProgram(uri)).asInstanceOf[_root_.kmLogo.ASM.LogoProgram];
var nxc : _root_.java.lang.String = ((this).Scalaroot).compileToNXC(this);
`~result` = ((_root_.logo_compilerNXC.org.kermeta.language.sample.logo.compilerNXC.KerRichFactory.createNXCCodeGenerator).generate((this).Scalasubs, nxc)).asInstanceOf[_root_.java.lang.String];
(_root_.k2.io.StdIO).writeln(`~result`)}
        }
 return `~result`
}

    def loadProgram(ecoreFile : _root_.java.lang.String):_root_.kmLogo.ASM.LogoProgram = {
var `~result` : _root_.kmLogo.ASM.LogoProgram = null.asInstanceOf[_root_.kmLogo.ASM.LogoProgram]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(ecoreFile, "platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.ecore");
(resource).load(null)
try{
`~result` = (((resource).kgetContents()).one()).asInstanceOf[_root_.kmLogo.ASM.LogoProgram];
}catch { case e:ClassCastException => {}}
}
        }
 return `~result`
}
  override def getMetaClass():_root_.org.kermeta.language.structure.Class={
    var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.sample.logo.compilerNXC.NXCCompiler"); 
    if (cd !=null){ 
       var cl = _root_.kermeta_standard.org.kermeta.language.structure.KerRichFactory.createClass 
       cl.setTypeDefinition(cd) 
      return cl 
    } else 
      return null; 
  }
}

