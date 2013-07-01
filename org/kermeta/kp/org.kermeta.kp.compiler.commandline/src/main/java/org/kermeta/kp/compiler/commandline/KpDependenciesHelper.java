/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : Nov 14, 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.maven.model.Dependency;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProject;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.ReusableResource;
import org.kermeta.kp.editor.analysis.helper.KermetaProjectHelper;
import org.kermeta.kp.editor.analysis.helper.KpResourceHelper;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.language.km2bytecode.embedded.maven.POMGeneratorHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Useful methods related to KP dependencies (including calculation of classpath)
 * @author dvojtise
 *
 */
public class KpDependenciesHelper {

	/**
	 * return a list of available jar on the file system corresponding to the kp dependencies that must be part of the classpath
	 * @param kp
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	static public LinkedHashSet<String> getDependentProjetsClasspath(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		LinkedHashSet<String> result = new LinkedHashSet<String>();
		// deal with importProjects
		for(ImportProject dep : kp.getImportedProjects()){
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(dep.getProjectResource());
			// add it in classpath	
			String currenEntryPath = convertUrlToclassPath(containerUrl);
			if( currenEntryPath.endsWith(".jar")){
				result.add(convertUrlToclassPath(containerUrl));
			}
			else{
				// detect binaryfolders and use them in the classpath
				for(String s : getBinaryFoldersForProject(currenEntryPath)){
					result.add(s);
				}
			}
			
			// if it is a kermeta project, add its DependentProjectsClassPath
			String kpFileURL = containerUrl.endsWith(".jar")|| containerUrl.endsWith("bundlefile")?	"jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER; 
			KermetaProject foundProject = KpResourceHelper.findKermetaProject( kpFileURL, kp.eResource());
			if(foundProject != null){
				KpVariableExpander innerVarExpander = new KpVariableExpander(kpFileURL, foundProject, varExpander.getFileSystemConverter(), varExpander.getLogger());				
				result.addAll(getDependentProjetsClasspath(foundProject, innerVarExpander));
			}
			
		}
		// deal with extends
		for(ImportProjectSources dep : kp.getImportedProjectSources()){
			// this is kermeta project, add its DependentProjectsClassPath but not the project itself
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(dep.getProjectResource());
						
			// if it is a kermeta project, add its DependentProjectsClassPath
			String kpFileURL = containerUrl.endsWith(".jar") || containerUrl.endsWith("bundlefile")?	"jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER; 
			KermetaProject foundProject = KpResourceHelper.findKermetaProject( kpFileURL, kp.eResource());
			if(foundProject != null){
				KpVariableExpander innerVarExpander = new KpVariableExpander(kpFileURL, foundProject, varExpander.getFileSystemConverter(), varExpander.getLogger());				
				result.addAll(getDependentProjetsClasspath(foundProject, innerVarExpander));
			}
			
		}
		
		// deal with EMFBytecode
		for(ImportFile importedFile : kp.getImportedFiles()){
			if (importedFile.getBytecodeFrom() != null){
				String containerUrl = varExpander.getSelectedUrl4ReusableResource(importedFile.getBytecodeFrom());
				
				String currenEntryPath = convertUrlToclassPath(containerUrl);
				if( currenEntryPath.endsWith(".jar")){
					result.add(convertUrlToclassPath(containerUrl));
				}
				else{
					// detect binaryfolders and use them in the classpath
					for(String s : getBinaryFoldersForProject(currenEntryPath)){
						result.add(s);
					}
				}
				
			}
		}
		return result;
	}
	
	/** 
	 * analyse the project to know where the binary folders are.
	 * if .classpath detected use its info for the path
	 * If project.kp detected, use DEFAULT_BINARY_LOCATION_IN_FOLDER and DEFAULT_EMFBINARY_LOCATION_IN_FOLDER
	 * @return
	 */
	static public List<String> getBinaryFoldersForProject(String currenPath){
		ArrayList<String> result = new ArrayList<String>();
		
		File theFile = new File(currenPath);
		if(theFile.isDirectory() && theFile.exists()){
			// is this an eclipse project ?		
			File classpathFile = new File(currenPath+"/.classpath");
			if(classpathFile.exists()){
				//todo
				//check if .classpath file exists, analyse it and retrieve its out	
				// typical entry will look like
				//   <classpathentry kind="output" path="target/classes"/>				
				// multi output entry will look like
				// <classpathentry kind="src" path="src/test/java" output="target/test-classes" including="**/*.scala|**/*.java|**/*.java"/>

				try{
					DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
					DocumentBuilder constructeur = fabrique.newDocumentBuilder();
					
					Document document = constructeur.parse(classpathFile);
					
					Element rootnode = document.getDocumentElement();
					String tag = "classpathentry";
					NodeList nodeList = rootnode.getElementsByTagName(tag);
					//rootnode.
					for(int i=0; i<nodeList.getLength(); i++){
						Element e = (Element)nodeList.item(i); 
						if(e.hasAttribute("kind") && e.getAttribute("kind").equals("output") && e.hasAttribute("path")){
							result.add(currenPath+"/"+e.getAttribute("path")+"/");
						}
						if(e.hasAttribute("kind") && e.getAttribute("kind").equals("src") && e.hasAttribute("output") ){
							result.add(currenPath+"/"+e.getAttribute("output")+"/");
						}  
					}
				
				}catch(ParserConfigurationException pce){
					System.out.println("Erreur de configuration du parseur DOM");
					System.out.println("lors de l'appel à fabrique.newDocumentBuilder();");
				}catch(SAXException se){
					System.out.println("Erreur lors du parsing du document");
					System.out.println("lors de l'appel à construteur.parse(xml)");
				}catch(IOException ioe){
					System.out.println("Erreur d'entrée/sortie");
					System.out.println("lors de l'appel à construteur.parse(xml)");
				}
			 
			}			 
			// is this a kermeta project ? check if project.kp file exists
			File kpFile = new File(currenPath+"/project.kp");
			if(kpFile.exists()){
				result.add(currenPath+KermetaProjectHelper.DEFAULT_BINARY_LOCATION_IN_FOLDER+"/");
				result.add(currenPath+KermetaProjectHelper.DEFAULT_EMFBINARY_LOCATION_IN_FOLDER+"/");
			}
		}
		
		return result;
	}
	
	/**
	 * return a list of available maven artefact corresponding to the kp dependencies that must be part of the maven dependencies
	 * @param kp
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	static public LinkedHashSet<Dependency> getDependentProjetsMavenArtefacts(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		LinkedHashSet<Dependency> result = new LinkedHashSet<Dependency>();
		// deal with importProjects
		for(ImportProject dep : kp.getImportedProjects()){
			Dependency mavenDep = getMavenDependencyForReusableResource(dep.getProjectResource());
			if(mavenDep != null) result.add(mavenDep);
		}
		// deal with extends
		for(ImportProjectSources dep : kp.getImportedProjectSources()){
			// this is kermeta project, add its DependentProjectsClassPath but not the project itself
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(dep.getProjectResource());
						
			// if it is a kermeta project, add its DependentProjectsClassPath
			String kpFileURL = containerUrl.endsWith(".jar") || containerUrl.endsWith("bundlefile")?	"jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER; 
			KermetaProject foundProject = KpResourceHelper.findKermetaProject( kpFileURL, kp.eResource());
			if(foundProject != null){
				KpVariableExpander innerVarExpander = new KpVariableExpander(kpFileURL, foundProject, varExpander.getFileSystemConverter(), varExpander.getLogger());				
				result.addAll(getDependentProjetsMavenArtefacts(foundProject, innerVarExpander));
			}
			
		}
		
		// deal with EMFBytecode
		for(ImportFile importedFile : kp.getImportedFiles()){
			if (importedFile.getBytecodeFrom() != null){
				Dependency mavenDep = getMavenDependencyForReusableResource(importedFile.getBytecodeFrom());
				if(mavenDep != null) result.add(mavenDep);
			}
		}
		return result;
	}
	
	
	static public Dependency getMavenDependencyForReusableResource(ReusableResource res){
		String url = res.getUrl();
		for(String s : res.allUrls()){
			if(s.startsWith("mvn:")){
				url = s;
				break;
			}
		}
		if(url.startsWith("mvn:")){
			url = url.substring(4);
			String[] part = url.split("/");
			if(part.length>2){
				return POMGeneratorHelper.createDependency(part[0], part[1], part[2]);
			}
		}
		return null;
	}
	
	static public String convertUrlToclassPath(String urlString){
		try {
			URL jarURL = new URL(urlString);
			/*if (jarURL.getProtocol().equals("jar") && jarURL.getFile().endsWith("!/")){
				// this is something like jar:file:/C:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20110912-0920.jar!/
				jarURL = new URL(jarURL.getFile().replaceAll("!/", ""));
			}*/
			if( jarURL.getProtocol().equals("file")){ 
				File theFile = new File(jarURL.toURI());
				if (theFile!=null) {
					if(theFile.exists()){
						if(theFile.getName().equals("bundlefile")){
							//some version of scala compiler doesn't accept classpath to jar that doesn't end with .jar
							// so bundlefile that are used by OSGI doesn't works correctly
							// create a copy with the correct name
							
							File outFile = new File(java.net.URI.create(jarURL+".jar"));
							if(!outFile.exists()){
								// copy the file to have the correct extension
								InputStream inputStream = new FileInputStream(theFile);					
								OutputStream out = new FileOutputStream(outFile);
								 
								int read = 0;
								byte[] bytes = new byte[1024];
							 
								while ((read = inputStream.read(bytes)) != -1) {
									out.write(bytes, 0, read);
								}
							 
								inputStream.close();
								out.flush();
								out.close();
							}
							theFile = outFile;
						}
						return theFile.getAbsolutePath();
					}
				}
			
			}
		} catch (URISyntaxException e) {}
		catch (java.net.MalformedURLException e) {}
		catch(IOException e){}
		// ignore URI that cannot be translated into a local file ...
		return urlString;
	}
}
