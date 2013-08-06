package org.kermeta.language.km2bytecode.embedded.scala



import java.io.File

object InternalCompilerHelper {
	
	var scalaExt = "scala"
	var javaExt = "java"
		
	def listScalaFile(f : File) : List[String] = {
		var result = List[String]()
		if (f.isDirectory()) {
			for(subf <- f.listFiles){ 
				result = result ++ listScalaFile(subf)
			}
		} else {
			if (f.getName().toLowerCase().endsWith("." + scalaExt)){
				result = result ++ List(f.getAbsolutePath)
			}
		}
		return result
	}
	def listJavaFile(f : File) : List[String] = {
		var result = List[String]()
		if (f.isDirectory()) {
			for(subf <- f.listFiles){ 
				result = result ++ listJavaFile(subf)
			}
		} else {
			if (f.getName().toLowerCase().endsWith("." + javaExt)){
				result = result ++ List(f.getAbsolutePath)
			}
		}
		return result
	}

	def deleteDirRecursive(f : File) : Unit = {
		if (f.isDirectory()) {
			for(subf <- f.listFiles){
				deleteDirRecursive(subf)
			}
		} else {
			f.delete
		}
	}
	
	
  
	
	
	
}
