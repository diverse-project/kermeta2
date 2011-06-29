/* Main.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala
  
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import java.io.File
import java.io.FileInputStream
import java.io.PrintStream
import java.util.Properties
import java.util.ResourceBundle
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._
import fr.irisa.triskell.embedded._
import org.slf4j.{Logger,LoggerFactory}

object Main extends LogAspect {
//	def log = LoggerFactory.getLogger(this.getClass())

  var outputStream : java.io.OutputStream=null

  def init(propertyurl:String, projectName:String, classqname:String,  operationName:String, classpath:java.util.Collection[String], args:String, outputStream : java.io.OutputStream):Unit ={

    var v = new Properties
    v.load(new FileInputStream(new File(propertyurl)))
    GlobalConfiguration.load(v)
    additionalClassPath = classpath.toList
    this.outputStream = outputStream
  }
 


  var additionalClassPath: List[String] = List()

  var result : Int = -1;
  def getResult() : Int = result ;

  def main(args : Array[String]) : Unit = {

    //STEP 0 - LOAD PROPERTIES FILE
    if (!GlobalConfiguration.init)
    {
     var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler")
  //    var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler_binaryMerger")
 //     var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler_typeSetter")
     // var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler_ecore2km")
      GlobalConfiguration.load(resource)

    }
    
//   GlobalConfiguration.scalaAspectPrefix = "binaryMerger"
//   GlobalConfiguration.scalaAspectPrefix = "typeSetter"
 //  GlobalConfiguration.scalaAspectPrefix = "ecore2km"


//additionalClassPath = List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/MIK/core.jar") ++ additionalClassPath
//additionalClassPath = List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/MIK/directives.jar") ++ additionalClassPath
  //additionalClassPath = List("/home/barais/malai.jar") ++ additionalClassPath

//Derivation

//       additionalClassPath = List("/home/barais/workspaces/movida/fr.inria.featureDiagramEditor.derivation.fdext.ui/libForCompilo/featureadresolution.jar") ++ additionalClassPath
    /*additionalClassPath = List("/opt/obeoDesigner5.0/eclipse/dropins/fr.obeo.dsl.designer.sample.flow_1.0.0.jar") ++ additionalClassPath
    additionalClassPath = List("/opt/obeoDesigner5.0/eclipse/dropins/fr.inria.featureDiagramEditor.emf_1.0.1.jar") ++ additionalClassPath
    additionalClassPath = List("/opt/obeoDesigner5.0/eclipse/dropins/fr.inria.featureDiagramEditor.resolutionmodel_1.0.0.jar") ++ additionalClassPath
    additionalClassPath = List("/home/barais/workspaces/MovidaTuto/libs/movidaTuto.jar") ++ additionalClassPath
      */
//   additionalClassPath = List("/home/barais/workspaces/movida/lib/fr.inria.featureDiagramEditor.emf-0.0.1-SNAPSHOT.jar") ++ additionalClassPath
//UML
        /*  additionalClassPath = List("/home/barais/workspaces/movida2/TestUMLLoadJava/lib/org.eclipse.uml2.uml.resources_3.1.1.v201008191505.jar") ++ additionalClassPath
          additionalClassPath = List("/home/barais/workspaces/movida2/TestUMLLoadJava/lib/org.eclipse.uml2.uml_3.1.1.v201008191505.jar") ++ additionalClassPath
          additionalClassPath = List("/home/barais/workspaces/movida2/TestUMLLoadJava/lib/org.eclipse.uml2.common_1.5.0.v201005031530.jar") ++ additionalClassPath
          additionalClassPath = List("/home/barais/workspaces/movida2/TestUMLLoadJava/lib/org.eclipse.uml2_3.0.0.v201005031530.jar") ++ additionalClassPath
          */

        //Stereotype
   //     additionalClassPath = List("/home/barais/workspaces/movida2/Toto/dist/toto.jar") ++ additionalClassPath
   //  Vhess
   //  additionalClassPath = List("/home/barais/workspaces/movida2/Chess/dist/chess.jar") ++ additionalClassPath


//Thales
// additionalClassPath = List("/home/barais/workspaces/movida/lib/fr.inria.featureDiagramEditor.emf-0.0.1-SNAPSHOT.jar") ++ additionalClassPath
 //       additionalClassPath = List("/home/barais/workspaces/movida/fr.inria.featureDiagramEditor.derivation.fdext.ui/libForCompilo/featureadresolution.jar") ++ additionalClassPath
//additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/EMDE-ext/eclipse/plugins/com.thalesgroup.mde.emde_1.2.1.201012061534.jar") ++ additionalClassPath
/*
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/melody-data/eclipse/plugins/com.thalesgroup.mde.shared.data.behavior.gen_1.5.0.201101041151.jar") ++ additionalClassPath
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/melody-data/eclipse/plugins/com.thalesgroup.mde.shared.data.core.gen_1.5.0.201101041151.jar") ++ additionalClassPath
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/melody-data/eclipse/plugins/com.thalesgroup.mde.shared.data.activity.gen_1.5.0.201101041151.jar") ++ additionalClassPath
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/melody-data/eclipse/plugins/com.thalesgroup.mde.melody.data.gen_1.5.0.201101041151.jar") ++ additionalClassPath
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/melody-data/eclipse/plugins/com.thalesgroup.mde.shared.data.statemachine.gen_1.5.0.201101041151.jar") ++ additionalClassPath
additionalClassPath = List("/home/barais/app/IRISA-TRT-MOVIDA/M2/Shared-ext/eclipse/plugins/com.thalesgroup.mde.shared.patterns_1.5.0.201101041151.jar") ++ additionalClassPath */

//      additionalClassPath = List("/home/barais/workspaces/mopcom-i/TestCompiloV2ModMap/adapter_lab_corporate_apis2.jar") ++ additionalClassPath

        /*additionalClassPath = List("/home/barais/compilo/julien/fr.inria.aoste.annotation_1.0.1.jar") ++ additionalClassPath
  additionalClassPath = List("/home/barais/compilo/julien/fr.inria.aoste.marte.ccslmodel_1.1.0.013262.jar") ++ additionalClassPath
  additionalClassPath = List("/home/barais/compilo/julien/fr.inria.aoste.trace_1.0.0.jar") ++ additionalClassPath
  additionalClassPath = List("/home/barais/compilo/julien/jars.jar") ++ additionalClassPath*/
//  additionalClassPath = List("/home/barais/.m2/repository/org/kermeta/art/model/1.1.1-SNAPSHOT/model-1.1.1-SNAPSHOT.jar") ++ additionalClassPath
  //  additionalClassPath = List("/home/barais/cours/TAA20102011/language.model-2.0.1-SNAPSHOT.jar") ++ additionalClassPath
  //   additionalClassPath = List("/home/barais/workspaces/movida2/TestEcore2KM/lib/plugins/org.kermeta.traceability.model_2.0.2.SNAPSHOT.jar") ++ additionalClassPath

 //   additionalClassPath = List("/home/barais/cours/TAA20102011/diagnostic.model-2.0.1-SNAPSHOT.jar") ++ additionalClassPath


  /*  additionalClassPath = List("/home/barais/Desktop/CVL/plugins/ari_editor_1.0.0.jar") ++ additionalClassPath
    additionalClassPath = List("/home/barais/Desktop/CVL/plugins/CVLResolutionEditor_1.0.0.jar") ++ additionalClassPath
  additionalClassPath = List("/home/barais/Desktop/CVL/plugins/CVLVariabilityEditor_1.0.0.jar") ++ additionalClassPath
*/
/*
   additionalClassPath = List("/home/barais/mopcom-i/last/mapper_gmf.jar") ++ additionalClassPath
    additionalClassPath = List("/home/barais/mopcom-i/last/mapper.jar") ++ additionalClassPath
    additionalClassPath = List("/home/barais/mopcom-i/last/kompose.jar") ++ additionalClassPath
*/
      // additionalClassPath = List("/tmp/ram/plugins/RAMStructural_1.0.0.jar") ++ additionalClassPath

        var inputFile : String = ""
    var runnerParams = List[String]()
    var useFSC = false
    var scalacompile = true
	 	  
    for(a <- args){
      log.debug("Param : "+a)
    }

    for (i <- 0 until args.length) args(i).replaceAll("\"", "").trim() match {
      case "-help" | "-h" => println("Usage: scala Main [-help|-input INPUTFILE|-runp param1,param2|-fsc]")
      case "-input" | "-i" => {
          var nextI : Int = i + 1
          if(nextI < args.length){
            inputFile = args(nextI).replaceAll("\"", "").trim()
            log.debug("Input File : {}",inputFile)
          } else {
            log.warn("Parameter Error")
          }
        }
      case "-nocompile" =>{
          scalacompile = false
        }
      case "-runp" => {
          var nextI : Int = i + 1
          if(nextI < args.length){
            runnerParams =  args(nextI).split(",").toList
            log.debug("Runner Param : {}",args(nextI))
          } else {
            log.warn("Parameter Error")
          }
        }
      case "-fsc" => { useFSC = true }
      case _ =>
    }
	  
	   
    var compilo = new Compiler

//    inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/MIK/kompose_ecore.km"
   //   inputFile = "/home/barais/workspaces/malal/org.kermeta.ki.visual/kermeta/Visual.km"
   //   inputFile = "/home/barais/workspaces/movida/fr.inria.featureDiagramEditor.derivation.fdext.ui/src/kermeta/Derivation/TextualDerivation.km"
    //  inputFile = "/home/barais/workspaces/movida/TestCompilo/src/kermeta/010ValueTypeReflexion.km"
  //      inputFile = "/home/barais/compilo/julien/Launcher.km"
//   inputFile = "/home/barais/workspaces/compiloV2/smart@adaptor/src/main/kermeta/ArtCleaner.km"
  //      inputFile="/home/barais/workspaces/compiloV2/TestCompilo/src/kermeta/testReflexivity001.km"
  //      
//  inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/Selection/SelectionEngine.km"
   // inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/Derivation/DerivationEngine.km"

//    inputFile = "/home/barais/workspaces/movida3/TestKermeta/src/kermeta/toto.km"
//    inputFile = "/home/barais/workspaces/movida3/TestKermeta/model/MainChecker.km"
    //home/barais/cours/TAA20102011/MainChecker.km"
//    inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/InitSelection/InitSelectionEngine.km"
//      inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/require/require_engine.km"


  //inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/Selection/SelectionEngine.km"
//        inputFile = "/home/barais/workspaces/movida2/TestUMLLoadJava/model/new_file.km"
//  inputFile =   "/home/barais/workspaces/movida/fr.inria.product_derivation_engine/src/kermeta/Selection/SelectionEngine.km"
// inputFile ="/home/barais/workspaces/mopcom-i/TestCompiloV2ModMap/adapter2.km"
//inputFile ="/home/barais/workspaces/movida2/TestUMLLoadJava/model/marth/chessLoad.km"
//    inputFile ="/home/barais/workspaces/movida2/org.kermeta.language.ecore2km/src/main/kermeta/Ecore2km.km"
  //  inputFile ="/home/barais/workspaces/movida2/org.kermeta.language.merger.binarymerger/src/main/kmt/org/kermeta/language/merger/binarymerger/km_BinaryMerger.km"
 //   inputFile ="/home/barais/workspaces/movida2/org.kermeta.language.resolver/src/main/kermeta/org/kermeta/language/resolver/Resolver.km" 
//  inputFile = "/home/barais/workspaces/movida2/org.kermeta.language.resolver/src/main/kermeta/org/kermeta/language/resolver/FullStaticResolver.km"
  //  inputFile = "/home/barais/workspaces/Projets24_02_11/fr.inria.cvl_product_derivation_engine/src/kermeta/Derivation/DerivationEngine2.km"
    
//  inputFile ="/home/barais/mopcom-i/GMF2Mapper.km"
  //inputFile ="/home/barais/mopcom-i/mapper2km.km"
  //      inputFile ="/home/barais/mopcom-i/last/mapper2km.km"
    //inputFile = "/home/barais/workspaces/mopcom-i/org.kermeta.pramana.kermeta2alloy/src/kermeta/metamodel2AlloyModel.km"
//    inputFile = "/tmp/D.km"
     // inputFile = "/home/barais/workspaces/ram/RAM/src/kermeta/weaver.km"
        inputFile = "/home/barais/toto/Téléchargements/new_file.km"

          if(inputFile != ""){
      log.info("KM compilation begin on "+inputFile)
      compilo.compile(inputFile)
    } else {
      log.warn("No Input File Found ! ")
    }
    
    

    /* Scalac compilation step */


    if (scalacompile){
      if (false && GlobalConfiguration.exec && !GlobalConfiguration.createPackage ){
        var classpath =EmbettedScalaCompiler.getActualClasspath
        
        if (additionalClassPath != null)
          classpath = additionalClassPath ++ classpath
        //  classpath = classpath ++ List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo/target/kermeta.compilo.scala-0.0.1-SNAPSHOT.jar")
        var oldOut : java.io.OutputStream = System.out
        var oldErr : java.io.OutputStream = System.err

        if (outputStream != null){
          System.setOut(new java.io.PrintStream(outputStream))
          System.setErr(new java.io.PrintStream(outputStream))
        }
                
        var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
        result = compilationResult

        
        //Scala runner
        if(compilationResult == 0){

          EmbettedScalaRunner.run(classpath+File.pathSeparator+GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
        }
        if (outputStream != null){
          System.setOut(new PrintStream(oldOut))
          System.setErr(new PrintStream(oldErr))
        }
      }else{
        result = EmbeddedMavenHelper.run(GlobalConfiguration.clean,GlobalConfiguration.createPackage, GlobalConfiguration.standalone, GlobalConfiguration.exec,  additionalClassPath,outputStream)
      }
    }
  }
}
