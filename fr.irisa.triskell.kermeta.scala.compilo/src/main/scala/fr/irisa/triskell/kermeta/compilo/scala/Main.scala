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
import fr.irisa.triskell.embedded.EmbettedScalaCompiler;
import fr.irisa.triskell.embedded.EmbettedScalaRunner;
import fr.irisa.triskell.embedded._
import org.slf4j.{Logger,LoggerFactory}

object Main extends LogAspect {

  var outputStream : java.io.OutputStream=null

  def init(propertyurl:String, projectName:String, args:String, outputStream : java.io.OutputStream):Unit ={

    var v = new Properties
    v.load(new FileInputStream(new File(propertyurl)))
    GlobalConfiguration.load(v)
    additionalClassPath = GlobalConfiguration.additionalClassPath
    this.outputStream = outputStream
  }
 


  var additionalClassPath: List[String] = List()

  var result : Int = -1;
  def getResult() : Int = result ;

  def main(args : Array[String]) : Unit = {


    var inputFile : String = ""
    var runnerParams = List[String]()
    var useFSC = false
    var scalacompile = true
	var propertyfile = "kermetaCompiler"
	 	  
    for(a <- args){
      log.debug("Param : "+a)
    }

    var input = false
    var property = false
    var help = false
    for (i <- 0 until args.length) args(i).replaceAll("\"", "").trim() match {
      case "-help" | "-h" => println("Usage: scala Main [-help|-input INPUTFILE|-property PROPERTYFILE|-runp param1,param2|-fsc]") 
    		  help = true
    		  return
      case "-input" | "-i" => {
          var nextI : Int = i + 1
          if(nextI < args.length){
            inputFile = args(nextI).replaceAll("\"", "").trim()
            input = true
            log.debug("Input File : {}",inputFile)
          } else {
            log.warn("Parameter Error")
          }
        }
      case "-property" | "-p" => {
          var nextI : Int = i + 1
          if(nextI < args.length){
            propertyfile = args(nextI).replaceAll("\"", "").trim()
            property =true
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
	  
    
    //STEP 0 - LOAD PROPERTIES FILE
    if (!GlobalConfiguration.init )
    {
      if (!(property && input)){
    	if (!help)
    		println("Usage: scala Main [-help|-input INPUTFILE|-property PROPERTYFILE|-runp param1,param2|-fsc]")    	  
      return      
    }
      
      if (property){
    	  var v = new Properties
    	  v.load(new FileInputStream(new File(propertyfile)))
    	  GlobalConfiguration.load(v)
    	  additionalClassPath = GlobalConfiguration.additionalClassPath
      }
      else{
    	  var resource : ResourceBundle = ResourceBundle.getBundle(propertyfile)
    			  GlobalConfiguration.load(resource)
      }
    }

    
    var compilo = new Compiler
    var time : Long = 0
     var endtime : Long = 0
     var endscalatime : Long = 0
    if(inputFile != ""){
      log.info("KM compilation begin on "+inputFile)
     time = System.currentTimeMillis()
      compilo.compile(inputFile)
      endtime = System.currentTimeMillis()
      println("time to generate scala : " + (endtime-time))
    } else {
      log.warn("No Input File Found ! ")
    }
    
    

    /* Scalac compilation step */


    if (scalacompile){
      if (!GlobalConfiguration.useMaven){
        var classpath =EmbettedScalaCompiler.getActualClasspath
        
        if (additionalClassPath != null)
          classpath = additionalClassPath ++ classpath
        var oldOut : java.io.OutputStream = System.out
        var oldErr : java.io.OutputStream = System.err

        if (outputStream != null){
          System.setOut(new java.io.PrintStream(outputStream))
          System.setErr(new java.io.PrintStream(outputStream))
        }
                
        var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
        endscalatime = System.currentTimeMillis()
        println("time to compile scala : " + (endscalatime - endtime))
        println("time to compile km : " + (endscalatime - time))

        result = compilationResult
        //Scala runner

        if (GlobalConfiguration.createPackage ){
        	var fo =  new File(GlobalConfiguration.outputProject +File.separator + "target").getCanonicalFile
        	fo.mkdirs
        	_root_.fr.irisa.triskell.embedded.JarCreatorScala.run(GlobalConfiguration.outputBinFolder, GlobalConfiguration.outputProject + File.separator + "target" +  File.separator  + GlobalConfiguration.getScalaAspectPrefix+".jar", GlobalConfiguration.outputFolder  +File.separator+".."+File.separator + "resources"+File.separator + GlobalConfiguration.scalaAspectPrefix + "Reflexivity.km" );
        }
        if(compilationResult == 0 && GlobalConfiguration.exec){

          EmbettedScalaRunner.run(classpath.mkString(File.pathSeparator)+File.pathSeparator+GlobalConfiguration.outputBinFolder, GlobalConfiguration.scalaAspectPrefix+ "runner.MainRunner", runnerParams)
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