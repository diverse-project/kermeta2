
package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl


import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import org.antlr.stringtemplate.StringTemplate
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._


class ScalaFactoryAndImplicitVisitor extends IVisitor with LogAspect {

  
    var viewDef : StringBuilder = _
    var implicitDef : StringBuilder = _
    var actualPackage : String = _
    var factoryDefClass : StringBuilder =_
	
    def initForEclipseEcorePackage(parentpack : String,packNam:String):String={
        var res : StringBuilder = new StringBuilder
        var packNameUpper :String = packNam.substring(0,1).toUpperCase + packNam.substring(1,packNam.size)
        var packName :String = null
        if("".equals(parentpack)){
            packName=packNam
        }else{
            packName=parentpack+"."+packNam
        }
        packName= kermeta.utils.TypeEquivalence.getPackageEquivalence(packName)
        var impName = packName+ Util.getImplPackageSuffix(packName)+Util.getPackagePrefix(packNameUpper)+"PackageImpl"
       
    res.append(Util.protectScalaKeyword(impName +".init()"))        
 res.append(".setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+"."+GlobalConfiguration.factoryName+""))
            res.append(")")
            res.append("\n")        
        return res.toString()
        }
    
    def initForEcorePackage(parentpack : String,packNam:String):String={
        var res : StringBuilder = new StringBuilder
        var packNameUpper :String = packNam.substring(0,1).toUpperCase + packNam.substring(1,packNam.size)
        var packName :String = null
        if("".equals(parentpack)){
            packName=packNam
        }else{
            packName=parentpack+"."+packNam
        }
        packName= kermeta.utils.TypeEquivalence.getPackageEquivalence(packName)
        var impName = packName+ Util.getImplPackageSuffix(packName)+Util.getPackagePrefix(packNameUpper)+"PackageImpl"
       if (packName.equals("org.eclipse.emf.ecore")){
            //res.append("\n{\n\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
            //res.append("\tc.setAccessible(true);\n")
            res.append("\n{\n\tvar pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =  new org.eclipse.emf.ecore.impl.EcorePackageImpl with "+fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore.EPackageAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation\n")
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)\n")
                  
//            res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
            res.append("\tpack.setEFactoryInstance(" +GlobalConfiguration.scalaAspectPrefix+"."+ packName + "."+GlobalConfiguration.factoryName+")\n " )
            res.append("\tvar f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
            res.append("\tf.setAccessible(true)\n")
            if(packName.equals("org.eclipse.emf.ecore")){
                res.append("\tf.set(pack, "+ GlobalConfiguration.scalaAspectPrefix+"."+ packName + "."+GlobalConfiguration.factoryName+")\n")
            }
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\tkermeta.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\t"+impName +".init\n}\n")
            return res.toString
        }
        else {
            res.append("\n{\n\t")
            res.append("var pack : "+Util.protectScalaKeyword(packName+"."+ Util.getPackagePrefix( packNameUpper)+"Package")+" = "+Util.protectScalaKeyword(impName +".init")+"\n")
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\tkermeta.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\tpack.setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+"."+GlobalConfiguration.factoryName+""))
            res.append(")")
            res.append("\n}\n\n")
            return res.toString
        }
    
  /*      packName= kermeta.utils.TypeEquivalence.getPackageEquivalence(packName)
        if (packName.equals("org.eclipse.emf.ecore")){
            res.append("\n{\n\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
            res.append("\tc.setAccessible(true);\n")
            res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
            res.append("\tpack.setEFactoryInstance(" +GlobalConfiguration.scalaAspectPrefix+"."+ packName + ".RichFactory)\n " )
            res.append("\tvar f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
            res.append("\tf.setAccessible(true)\n")
            if(packName.equals("org.eclipse.emf.ecore")){
                res.append("\tf.set(pack, "+ GlobalConfiguration.scalaAspectPrefix+"."+ packName + ".RichFactory)\n")
            }
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\tkermeta.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\t"+impName +".init\n}\n")
            return res.toString
        }
        else {
            res.append("\n{\n")
            var protectedPackNameUpperPackage  = Util.protectScalaKeyword(packName+"."+ Util.getPackagePrefix( packNameUpper)+"Package")
            res.append("\tvar pack : org.eclipse.emf.ecore.EPackage = null\n")
            res.append("\tvar refObject : Object = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.get("+protectedPackNameUpperPackage+".eNS_URI)\n")
            res.append("\trefObject match {\n")
            res.append("\t\tcase x:org.eclipse.emf.ecore.EPackage.Descriptor => {pack = x.getEPackage}\n")
            res.append("\t\tcase x:org.eclipse.emf.ecore.EPackage => {pack = x }\n")
            res.append("\t\tcase _ => null\n")
            res.append("\t}\n")

            res.append("\tif( pack == null ){\n")
            res.append("\t// Set registry only if necessary\n")
            res.append("\t\tpack = "+Util.protectScalaKeyword(impName +".init")+"\n")
            res.append("\t\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\t}\n")
            res.append("\tif(kermeta.persistence.EcorePackages.getPacks().get("+protectedPackNameUpperPackage+".eNS_URI) == null){\n")
            res.append("\t// Set persistency support only if necessary\n")
            res.append("\t\tkermeta.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\t}\n")
            res.append("\tpack.setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+".RichFactory"))
            res.append(")")
            res.append("\n}\n\n")
            return res.toString
        }*/
    }
	
    def init {

    

        viewDef = new StringBuilder
        implicitDef = new StringBuilder
        implicitDef append "package "+GlobalConfiguration.frameworkGeneratedPackageName+"\n"
        implicitDef append "object "+GlobalConfiguration.implicitConvTraitName+" {\n"
/*        implicitDef.append(" implicit def richAspect(v : _root_.java.lang.Object) :fr.irisa.triskell.kermeta.language.structure.Object = v.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]\n")
//    implicitDef.append(" implicit def richAspect1(v : _root_.java.lang.Object) : ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect = v.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]\n")

        implicitDef.append("      implicit def richAspect1(o : _root_.java.lang.Object) : kermeta.standard.EObjectImplForPrimitive = {\n")
     
        implicitDef.append("     if (o != null && o.isInstanceOf[java.lang.String]){\n")
        implicitDef.append("       return new kermeta.standard.RichString(o.asInstanceOf[java.lang.String])\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.lang.Boolean]){\n")
        implicitDef.append("       return new kermeta.standard.RichJavaBoolean(o.asInstanceOf[java.lang.Boolean])\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.lang.Integer]){\n")
        implicitDef.append("       return new kermeta.standard.RichInteger(o.asInstanceOf[java.lang.Integer].intValue)\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.util.List[_]]){\n")
        implicitDef.append("       return new kermeta.standard.JavaConversions.RichKermetaList(o.asInstanceOf[java.util.List[_]])\n")
        implicitDef.append("     }\n")
        
        implicitDef.append("     if ( o.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object])\n")
        implicitDef.append("       return o.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]\n")
        implicitDef.append("     else if (o!=null)\n")
        implicitDef.append("     {\n")
        implicitDef.append("      return new kermeta.standard.RichEnum(o)\n}\n")
        implicitDef.append("     else\n")
        implicitDef.append("       null.asInstanceOf[kermeta.standard.EObjectImplForPrimitive]\n")
        implicitDef.append("   }\n")
        implicitDef.append("   implicit def richAspect2(o : _root_.java.lang.Object) : " + fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix + ".fr.irisa.triskell.kermeta.language.structure.ObjectAspect ={\n")
        implicitDef.append("   o.asInstanceOf["+fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".fr.irisa.triskell.kermeta.language.structure.ObjectAspect] \n \t } \n ")
*/
      implicitDef.append("implicit def richAspect(o : _root_.java.lang.Object)  =  o match {\n")
      implicitDef.append("  case s:String => new kermeta.standard.RichString(s)\n")
      implicitDef.append("   case s : java.lang.Boolean => new kermeta.standard.RichJavaBoolean(s)\n")
      implicitDef.append("   case s : java.lang.Integer =>\n")
      implicitDef.append(" new kermeta.standard.RichInteger(s.intValue)\n")
      implicitDef.append("   case s : java.util.List[_] => new kermeta.standard.JavaConversions.RichKermetaList(s)\n")
      implicitDef.append("   case s:  "+ fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".fr.irisa.triskell.kermeta.language.structure.ObjectAspect => s\n")
      implicitDef.append("   case _ =>  if (o!=null)\n")
      implicitDef.append("     new kermeta.standard.RichEnum(o)\n")
      implicitDef.append("    else\n")
      implicitDef.append("       null.asInstanceOf[kermeta.standard.EObjectImplForPrimitive]\n")
      implicitDef.append(" }\n")

        
        factoryDefClass = new StringBuilder
    }
    var packages : java.util.List[Package] = _
	
    def addPackage(packs : java.util.List[Package]):Unit={
        packs.foreach({e=> if (Util.hasEcoreTag(e))
            packages.add(e);
                       addPackage(e.getNestedPackage())})
    }
	 
    def visit(par : ModelingUnit){
        packages = new java.util.ArrayList[Package]()
        addPackage(par.getPackages());
		                                        
        var mainClass : String = par.getTag().filter{e=> "mainClass".equals(e.getName)}.first.getValue
        var mainOperation : String = par.getTag().filter{e=> "mainOperation".equals(e.getName)}.first.getValue
        var packageName :String= mainClass.substring(0,mainClass.lastIndexOf("::")).replace("::", ".")
        var className :String=mainClass.substring(mainClass.lastIndexOf("::")+2).replace("::", ".")
		
		
		
        var mainClassDef = par.eAllContents.filter{e=>e.isInstanceOf[ClassDefinition] }.filter(e=> e.asInstanceOf[ClassDefinition].getName.equals(className) ).toList.first
        var mainOperationSize = 0
        try{
            mainOperationSize = mainClassDef.asInstanceOf[ClassDefinition].getOwnedOperation.filter{e=>e.getName.equals(mainOperation)}.first.asInstanceOf[Operation].getOwnedParameter.size
        } catch {
            case e: java.util.NoSuchElementException => {}
        }
		
        //TODO gérer le cas des package venant d'ecore
        var res :StringBuilder= new StringBuilder
        var resinitEclipse :StringBuilder= new StringBuilder
        res.append("package "+GlobalConfiguration.scalaAspectPrefix+"runner \n")
        res.append("import java.io.PrintStream\n")
        res.append("import "+ GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n")

        res.append("object MainRunner  {\n")
        //res.append("def main(args : Array[String]) : Unit = {\n\t" )
        res.append("def init() : Unit = {\n\t" )
        if (GlobalConfiguration.isTest){
            res.append("System.setOut(new PrintStream(\"outputStream\"));\n")
        }
        res.append("kermeta.persistence.EcorePackages.workspaceURI = \"" + GlobalConfiguration.workspaceURI + "\"\n")
        res.append("kermeta.persistence.EcorePackages.pluginURI = \"" + GlobalConfiguration.pluginURI+ "\";\n")
        java.util.Collections.sort(packages, new java.util.Comparator[Package]{
                def compare(o1:Package , o2:Package):Int={
                    if ("ecore".equals(o1.getName))
                        return -1;
                    else if ("ecore".equals(o2.getName))
                        return 1;
                    else
                        return 0;
				
                };
                def equals(obj:Object):Boolean =false;
            }
				
        );
        packages.foreach(e=> //if (!(e.getQualifiedName.startsWith("kermeta")|| e.getQualifiedName.startsWith("language")))
            if (!(e.getOwnedTypeDefinition.size()==0 ||
                  e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(t=> Util.hasEcoreTag(t)).size==0	||
                  e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).forall(t=> Util.hasCompilerIgnoreTag(t)) )){
                if (!Util.hasEcoreFromAPITag(e)){
                    
                    if (e.getNestingPackage() == null ){
                        res.append(
                            initForEcorePackage("", e.getName()))
                           resinitEclipse.append(initForEclipseEcorePackage("", e.getName()))
                    }
                    else{
                        res.append(
                            initForEcorePackage(e.getNestingPackage().getQualifiedName(), e.getName()))
                        resinitEclipse.append(
                            initForEclipseEcorePackage(e.getNestingPackage().getQualifiedName(), e.getName()))
                        
                    }
                }
            }
        )
		
        res.append("\n\t kermeta.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
        res.append("}\n")
        res.append("def init4eclipse() : Unit = {\n\t" )
        res.append(resinitEclipse.toString)
        res.append("\n\t kermeta.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
        res.append("}\n")

        res.append("def main(args : Array[String]) : Unit = {\n")
        if (packages.exists(pac=> "ecore".equals(pac.getName))){
            res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
            CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
        }
        res.append("\t init() \n\t"+"_root_." )
        if (packages.filter{e=>  e.getQualifiedName().equals(packageName)}.size==1)
        {
            res.append(GlobalConfiguration.scalaAspectPrefix+".")

        }
        res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(packageName))
		

        res.append("."+GlobalConfiguration.factoryName+".create"+ className+"."+mainOperation )
		
        res.append("(")
        for(i <- 0 until mainOperationSize){
            if(i != 0){ res.append(" , ")}
            res.append("args("+i+")")
        }
        res.append(")")
		
        res.append("\n}\n}")
		
        Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner", "MainRunner", res.toString())
        this.genetateUtilObject
		
        par.getPackages().foreach(p => p.accept(this) )
    }
	  
    def visit(par : Package){

        if (Util.doesGeneratePackage(par.getQualifiedName)){

            actualPackage = kermeta.utils.TypeEquivalence.packageEquivelence.get(par.asInstanceOf[Package].getQualifiedName())
            if (actualPackage == null)
                actualPackage=par.getQualifiedName()
            if (Util.hasEcoreTag(par))
                actualPackage=GlobalConfiguration.scalaAspectPrefix+"."+actualPackage;

            if (!(par.getOwnedTypeDefinition.size()==0 || par.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).forall(t=> Util.hasCompilerIgnoreTag(t)) )){
                var factoryDef : StringBuilder =  new StringBuilder
			
      
                factoryDef append "package "+Util.protectScalaKeyword(actualPackage.toString)+"\n"
                factoryDef append "import "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n"

                factoryDef append "object "+GlobalConfiguration.factoryName
                //e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(t=> Util.hasEcoreTag(t)).size==0
                if (par.getOwnedTypeDefinition.size!= 0 &&  par.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(e=> Util.hasEcoreTag(e)).size>0 && !Util.hasEcoreFromAPITag(par)){
                    factoryDef.append (" extends " +Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.asInstanceOf[Package].getQualifiedName())+Util.getImplPackageSuffix(actualPackage)+ Util.getPackagePrefix(par.getName.substring(0,1).toUpperCase + par.getName.substring(1,par.getName.size))+"FactoryImpl"))
                }
                factoryDef append "{\n"
                viewDef append "package "+Util.protectScalaKeyword(actualPackage.toString)+"\n"
                //viewDef append "trait "+viewDefTraitName+"{\n"
				
                factoryDefClass.clear
                par.getOwnedTypeDefinition.filter(p => p.isInstanceOf[ClassDefinition]).foreach(p=> p.asInstanceOf[ClassDefinitionAspect].accept(this))
                factoryDef.append(factoryDefClass.toString())
                //viewDef append "}\n"
                factoryDef append "}\n"
                Util.generateFile(actualPackage, GlobalConfiguration.factoryName, factoryDef.toString())
                Util.generateFile(actualPackage, GlobalConfiguration.viewDefTraitName, viewDef.toString())
                viewDef.clear
                factoryDef.clear
            }
            par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
			
        }
		
    }

    def visit(par : ClassDefinition){
		
        if (!Util.hasCompilerIgnoreTag(par)){
            var genpackageName : StringBuilder= new StringBuilder
            var packageName : StringBuilder= new StringBuilder
            var viewDefTemp : StringBuilder= new StringBuilder
				
            genpackageName.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedName))
            packageName.append(genpackageName.toString)
            if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
                packageName.insert(0,GlobalConfiguration.scalaAspectPrefix+".")
            }
            genpackageName.append(".")
				
//            if (par.isIsAbstract())
//                viewDef.append( " abstract")
					
					
				
            var param : StringBuilder = new StringBuilder
            par.generateParamerterClass(param);
            
            if (Util.hasEcoreTag(par) ){
                var  implName:String = Util.getImplPackageSuffix(packageName.toString)
                viewDefTemp.append(" class Rich"+par.getName() + param.toString)
                if (Util.hasEcoreFromAPITag(par))
                    viewDefTemp.append(" extends "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString + par.getName()))+ param.toString)
                else
                    viewDefTemp.append(" extends "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+implName.substring(1,implName.size) + par.getName()+"Impl"))+ param.toString)
                viewDefTemp.append(" with "+Util.protectScalaKeyword(packageName.toString +"."+par.getName+"Aspect") + param.toString+ " ")



                if (!par.eContainer.asInstanceOf[NamedElement].getQualifiedNameCompilo.contains("fr.irisa.triskell.kermeta")){//!IsObjectClassChildren(par)){
                    viewDefTemp.append("with " + "fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation")
                    if (Util.hasEcoreFromAPITag(par))
                        viewDefTemp.append(" with kermeta.standard.EObjectImplForPrimitive")
                }
                viewDefTemp.append("\n")


                if("EObject".equals(par.getName)){
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName()))+ param.toString+") = v.asInstanceOf[fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect]\n"
                } else {
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName()))+ param.toString+") = v.asInstanceOf["+ (Util.protectScalaKeyword(packageName.toString)+"."+ par.getName+"Aspect").replace(GlobalConfiguration.scalaAspectPrefix + ".fr.irisa.triskell.kermeta.language.structure.ObjectAspect", "fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect"+ param.toString)+ param.toString+"]\n"
                }
                if (Util.hasEcoreFromAPITag(par) || par.isIsAbstract)
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(packageName.toString+"."+par.getName()+"Aspect") + param.toString+") = v.asInstanceOf["+ Util.protectScalaKeyword(par.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo+ "." + par.getName)+ param.toString+"]\n"                    
                else
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(packageName.toString+"."+par.getName()+"Aspect") + param.toString+") = v.asInstanceOf["+ Util.protectScalaKeyword(par.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo+ Util.getImplPackageSuffix(packageName.toString) + par.getName+"Impl")+ param.toString+"]\n"
            }else{

                //Tisse la class d'implem ecore hérité'
                var cd = getEcoreSuperClass(par)
					
                //cd.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo +".impl." + cd.getName +"Impl
                viewDefTemp.append(" class Rich"+par.getName()+ param.toString +" extends ")
                if (!IsAnExceptionChildren(par)){
                    viewDefTemp.append(cd.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo +".impl." + cd.getName +"Impl with ")
                }
                viewDefTemp.append( kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString +"."+ par.getName())+ param.toString +" with "+packageName.toString +"."+par.getName+"Aspect" + param.toString )
                var superClassName = cd.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo + "."+ cd.getName
                if (!(classOf[Object].getCanonicalName.equals(superClassName)
                      || classOf[fr.irisa.triskell.kermeta.language.structure.Constraint].getCanonicalName.equals(superClassName)) ){
                    viewDefTemp.append(" with " + "fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation")
                }else{
                    
                    //println(cd.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo + "."+ cd.getName)
                }
                viewDefTemp.append(" \n")

                implicitDef append " implicit def richAspect" + param.toString + "(v : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+ param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+"Aspect"+ param.toString +"]\n"
                implicitDef append " implicit def richAspect" + param.toString +"(v : "+ packageName.toString+"."+par.getName()+"Aspect" + param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+ param.toString +"]\n"
	
            }
				
            if (!par.isIsAbstract()){
                viewDef.append(viewDefTemp.toString)
                if (Util.hasEcoreTag(par)){
                    if (!Util.hasEcoreFromAPITag(par))
                        factoryDefClass append " override"
                    factoryDefClass append " def create"+par.getName()+ param.toString +"() : "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName())+param.toString)+" = { new "+ Util.protectScalaKeyword(packageName.toString)+".Rich"+par.getName + param.toString +" }\n"
                }
                else{
                    factoryDefClass append " def create"+par.getName()+ param.toString +"() : "+ Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+param.toString)+" = { new "+ Util.protectScalaKeyword(packageName.toString)+".Rich"+par.getName+ param.toString +" }\n"
                }
            }
        }
    }
	
    def getEcoreSuperClass(c:ClassDefinition):ClassDefinition={
        c.getSuperType.foreach(e=>
		
            {
                if (Util.hasEcoreTag(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]))
                {
                    return e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]
                }
            }
        )
        c.getSuperType.foreach(e=>
            return getEcoreSuperClass(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
		
		
		
        return null;
    }



    def IsObjectClassChildren(c:ClassDefinition):Boolean={
        c.getSuperType.foreach(e=>
		
            {
                if ("Object".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName))
                {
                    return true
                }
            }
        )
        c.getSuperType.foreach(e=>
            return IsObjectClassChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
		
		
		
        return false;
    }


    def IsAnExceptionChildren(c:ClassDefinition):Boolean={
        c.getSuperType.foreach(e=>
            {
                if ("Exception".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName))
                {
                    return true
                }
            }
        )
        c.getSuperType.foreach(e=>
            return IsAnExceptionChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
        return false;
    }

	
    def close {
        implicitDef append "}\n"
        Util.generateFile(GlobalConfiguration.frameworkGeneratedPackageName, GlobalConfiguration.implicitConvTraitName, implicitDef.toString())
    }

    def genetateUtilObject() = {
        var template = new StringTemplate("package scalaUtil\n object Util {\n    def getMetaClass(t:String):fr.irisa.triskell.kermeta.language.structure.Class={\n "+
                                          "var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   _root_.kermeta.utils.ReflexivityLoader.getMetaClass(t);\n"+
                                          "if (cd !=null){\n"+
                                          "            var cl = "+fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".fr.irisa.triskell.kermeta.language.structure. "+GlobalConfiguration.factoryName+".createClass\n"+
                                          "            cl.setTypeDefinition(cd)\n"+
                                          "          return cl\n"+
                                          "        }else\n"+
                                          "            return null;\n}\n"+
                                          "    def clone(t:fr.irisa.triskell.kermeta.language.structure.Class, o:Any):Any={return null;\n}\n"
                                          + "}\n")

        Util.generateFile("scalaUtil","Util", template.toString)


    }

	
}
