package org.kermeta.language.km2bytecode.embedded.scala


import org.kermeta.compilo.scala.LogAspect
import java.io.File
import scala.collection.JavaConversions._
import tools.nsc.reporters.ConsoleReporter
import tools.nsc.io.AbstractFile
import tools.nsc.Properties._
import java.io.File._
import scala.tools.nsc.interactive.{ RefinedBuildManager, SimpleBuildManager }
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem

class EmbeddedScalaCompiler {
	
  var log : MessagingSystem = new StdioSimpleMessagingSystem
   
  def getActualClasspath = {
    var classpath = List[String]()
    if(System.getProperty("java.classpath") != null ) {
      classpath = classpath ++ List(System.getProperty("java.classpath"))
    }
    if(System.getProperty("java.class.path") != null ) {
      classpath = classpath ++ List(System.getProperty("java.class.path"))
    }   
    classpath
  }
	
  def compile(srcScalaPATH : String, srcJavaPATH : String, outputPATH : String, cleanOutput : Boolean, jars : java.util.List[String], fsc : Boolean) : Int = {

    var startTime = System.currentTimeMillis
    var compilationResult = 0

    
    /* Cleaning step */
    if(cleanOutput){
      InternalCompilerHelper.deleteDirRecursive(new File(outputPATH))
      new File(outputPATH).mkdir
    }
    /* Src files collect step */
    var listSrcScalaFiles = InternalCompilerHelper.listScalaFile(new File(srcScalaPATH))
    var listSrcFiles = if(srcJavaPATH !=null){
    	var listSrcJavaFiles = InternalCompilerHelper.listJavaFile(new File(srcJavaPATH))
    	/* Build class path */
    	log.info("Scala2bytecode compilation step begin on "+(listSrcScalaFiles.size)+" scala files (+"+listSrcJavaFiles.size+" java)",this.getClass().getName())
	
    	listSrcScalaFiles ++ listSrcJavaFiles
    }
    else{
      log.info("Scala2bytecode compilation step begin on "+listSrcScalaFiles.size+" scala files ",this.getClass().getName())
	
      listSrcScalaFiles
    }
    	
    var classpath : StringBuilder = new StringBuilder("."+File.pathSeparator)
    for(path <- jars) {
      classpath.append(path+File.pathSeparator)
    }
		
    var compilParams = List("-nowarn","-encoding","UTF8","-g:none","-optimise","-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles

    //println(compilParams)
    /* Compilation step */
    if(fsc){
      try scala.tools.nsc.CompileClient.main(compilParams.toArray) catch { case e : Exception => compilationResult = 1 }
    } else {
      try {
        val nscMain = new NSCMain
        nscMain.log = log
        nscMain.process(compilParams.toArray)
        compilationResult = if (nscMain.reporter.hasErrors) 1 else 0
      }
      catch {
        case e : Exception =>
          compilationResult = 1
      }      
    }
		
    var endTime= System.currentTimeMillis() - startTime
    log.info("Scala2bytecode compilation step complete in "+(endTime)+" millisecondes ",this.getClass().getName())
		
    return compilationResult
  }




}
object  EmbeddedScalaCompiler extends EmbeddedScalaCompiler

