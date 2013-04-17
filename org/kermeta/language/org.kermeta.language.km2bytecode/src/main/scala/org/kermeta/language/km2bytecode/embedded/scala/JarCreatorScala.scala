package org.kermeta.language.km2bytecode.embedded.scala

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;


object JarCreatorScala {

  
	//var dir :File  =_
  	def run(_dir:String,outtputJar:String, km:String) =
	{
	  var manifest = new java.util.jar.Manifest();
	  manifest.getMainAttributes().put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0");
	  var target = new java.util.jar.JarOutputStream(new java.io.FileOutputStream(outtputJar), manifest);
	  val dir = new java.io.File(_dir);
	  addDir(dir, target);
	  addKM(new java.io.File(km) ,target)
	  target.close();
	}
	
	/**
	 * create a jar by supposing that the inputTargetDir use the classic structure of kermeta project
	 */
	def createForClassicKermetaTargetProject( inputTargetDir:String, outtputJar:String) =
	{
	  
	  var manifest = new java.util.jar.Manifest();
	  manifest.getMainAttributes().put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0");
	  var target = new java.util.jar.JarOutputStream(new java.io.FileOutputStream(outtputJar), manifest);
	  val scalaclassesDir = new java.io.File(inputTargetDir+"/scalaclasses/");
	  addDir(scalaclassesDir, target);
	  val emfclassesDir = new java.io.File(inputTargetDir+"/emfclasses/");
	  if(emfclassesDir != null && emfclassesDir.exists()){
		  addDir(emfclassesDir, target);
	  }
	 // val ressourcesDir = new java.io.File(inputTargetDir+"/resources");
	 // addDir(ressourcesDir, target);
	  target.close();
	  
	}

	def addDir(sourceDir:File, target:JarOutputStream ): Unit =
	{
  		add(sourceDir, sourceDir, target)
	}
	
	def add(source:File, rootDir:File, target:JarOutputStream ) : Unit =
	{
	  var in : BufferedInputStream= null
	  try
	  {
	    if (source.isDirectory() && !(source.getPath()equals(rootDir.getPath())) )
	    {
	      
	      var name = source.getPath().replace(rootDir.getPath() + File.separator ,"").replace("\\", "/");
	      if (!name.isEmpty())
	      {
	        if (!name.endsWith("/"))
	          name += "/";
	        var entry = new JarEntry(name);
	        entry.setTime(source.lastModified());
	        target.putNextEntry(entry);
	        target.closeEntry();
	      }
	      source.listFiles().foreach(nestedFile =>
	        add(nestedFile, rootDir, target))
	      return;
	    }

	    var entry = new JarEntry(source.getPath().replace(rootDir.getPath() + File.separator ,"").replace("\\", "/"));
	    entry.setTime(source.lastModified()); 
	    target.putNextEntry(entry);
	    in = new BufferedInputStream(new FileInputStream(source));

	    var buffer :Array[Byte]= new Array[Byte](1024)
	    var count = 0;
	    do 
	    {
	      count = in.read(buffer);
	      target.write(buffer, 0, count);
	    }while (count == -1);
	    
	    target.closeEntry();
	  }
	  finally
	  {
	    if (in != null)
	      in.close();
	  }
	}

	def addKM(source:File, target:JarOutputStream ) : Unit =
	{
	  var in : BufferedInputStream= null
	  try
	  {
	    var entry = new JarEntry(source.getName);
	    entry.setTime(source.lastModified());
	    target.putNextEntry(entry);
	    in = new BufferedInputStream(new FileInputStream(source));

	    var buffer :Array[Byte]= new Array[Byte](1024)
	    var count = 0;
	    do 
	    {
	      count = in.read(buffer);
	      target.write(buffer, 0, count);
	    }while (count == -1);
	    
	    target.closeEntry();
	  }
	  finally
	  {
	    if (in != null)
	      in.close();
	  }
	}

	
}