/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 9 déc. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.callable.CallableGenmodelGenerator;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.TextReference;

/**
 * Helpers class for generating bytecode from a set of ecore
 * the operations are run in a threadExecutor in order to be parallelized
 * The normal sequence is ecore2java => ecorejava2bytecode => processDiagnostic in order to make sure to have the *.class at the end
 *
 */
public class Ecore2Bytecode {
	

	public MessagingSystem logger;
	public String baseProgressGroup = "";
	public KermetaProject kp; 
	public ArrayList<URL> ecoreForGenerationURLs; 
	public String targetGenmodelFolder;
	public String targetGeneratedJavaFolder;
	public String targetClassesFolder;
	public  List<String> additionalClassPath;
	
	protected DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
	protected JavaCompiler compiler;
    protected StandardJavaFileManager fileManager;
    protected Boolean runInEclipse = true;
	
	
	public Ecore2Bytecode(MessagingSystem logger, String baseProgressGroup,
			KermetaProject kp, ArrayList<URL> ecoreForGenerationURLs,
			String rootFolder,
			String targetGenmodelFolder, String targetGeneratedJavaFolder, String targetClassesFolder, List<String> additionalClassPath, boolean runInEclipse) {
		super();
		this.logger = logger;
		this.baseProgressGroup = baseProgressGroup;
		this.kp = kp;
		this.ecoreForGenerationURLs = ecoreForGenerationURLs;
		this.targetGenmodelFolder = targetGenmodelFolder.replaceAll("\\\\", "/");
		this.additionalClassPath = additionalClassPath;
		this.targetGeneratedJavaFolder = targetGeneratedJavaFolder.replaceAll("\\\\", "/");
		this.targetClassesFolder = targetClassesFolder.replaceAll("\\\\", "/");
		this.runInEclipse = runInEclipse;
		compiler = ToolProvider.getSystemJavaCompiler();
		if(compiler == null){
			// TODO eclipse run using a JRE instead of JDK, cannot compile generated emf java code
		}
		else{
			fileManager = compiler.getStandardFileManager(diagnostics, null, null);
		}
		if(!this.runInEclipse){
			logger.debug("runInEclipse = false", KermetaCompiler.LOG_MESSAGE_GROUP);
			logger.debug("EcorePlugin.getPlatformResourceMap().put(\""+getEclipseName(kp)+"\", URI.createURI(\"file:///"+rootFolder.replaceAll("\\\\", "/")+"\"));", KermetaCompiler.LOG_MESSAGE_GROUP);
			EcorePlugin.getPlatformResourceMap().put(getEclipseName(kp), URI.createURI("file:///"+rootFolder.replaceAll("\\\\", "/")));
			EcorePlugin.getPlatformResourceMap().put("org.eclipse.emf.codegen.ecore", URI.createURI("jar\\:file\\:/C:/Users/dvojtise/git/kermeta2/org/kermeta/kp/org.kermeta.kp.compiler.commandline.standalone/target/org.kermeta.kp.compiler.commandline.standalone-2.1.1-SNAPSHOT.jar\\!/"));
			logger.debug("ExtensibleURIConverterImpl.URI_MAP.put(platform\\:/plugin/org.eclipse.emf.codegen.ecore/ jar\\:file\\:/C:/Users/dvojtise/git/kermeta2/org/kermeta/kp/org.kermeta.kp.compiler.commandline.standalone/target/org.kermeta.kp.compiler.commandline.standalone-2.1.1-SNAPSHOT.jar\\!/", KermetaCompiler.LOG_MESSAGE_GROUP);
			
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform\\:/plugin/org.eclipse.emf.codegen.ecore/"),
					URI.createURI("jar\\:file\\:/C:/Users/dvojtise/git/kermeta2/org/kermeta/kp/org.kermeta.kp.compiler.commandline.standalone/target/org.kermeta.kp.compiler.commandline.standalone-2.1.1-SNAPSHOT.jar\\!/"));
			//platform\:/plugin/org.eclipse.emf.codegen.ecore/=jar\:file\:/C\:/eclipse_modeling_4.2/eclipse-modeling-juno-k2.0.7-snapshot/eclipse/plugins/org.eclipse.emf.codegen.ecore_2.8.1.v20120917-0436.jar\!/
			
			
			logger.debug("org.eclipse.core.runtime.Platform.isRunning() = "+org.eclipse.core.runtime.Platform.isRunning(), KermetaCompiler.LOG_MESSAGE_GROUP);
		}
	}
	/**
	 * 
	 * @param ecoreForGenerationURLs list of ecore that need to be generated
	 * @return may return null if there is nothing to do (ie. no input ecore to process)
	 */
	public Future<Boolean> ecore2java(ExecutorService threadExector){
		if(ecoreForGenerationURLs.size() == 0) return null;
		logger.initProgress(getMainProgressGroup(), "Generating java code for "+ecoreForGenerationURLs.size()+ " ecore file(s)...", KermetaCompiler.LOG_MESSAGE_GROUP, 2);;
		// launch ecore threads
		/* ArrayList<Future<Boolean>> genmodelFutures = new ArrayList<Future<Boolean>>();
		for(URL ecoreURL : ecoreForGenerationURLs){
			File inputEcoreFile = new File(ecoreURL.getFile());
			File genmodelFile = new File(targetFolder+"/genmodel/"+inputEcoreFile.getName().substring(0, inputEcoreFile.getName().lastIndexOf("."))+".genmodel");
			File generatedSourcePath = new File(targetFolder+"/java/");
			
			// TODO EMF isn't thread safe, cannot even run the same transfo in parallel ! => singleThreadExecutor
			genmodelFutures.add(singleThreadExector.submit(new CallableGenmodelGenerator(logger, inputEcoreFile, genmodelFile, generatedSourcePath)));
		}*/
		ArrayList<java.net.URI> inputEcoreFiles = new ArrayList<java.net.URI>();
		for(URL ecoreURL : ecoreForGenerationURLs){
			try{
				inputEcoreFiles.add(ecoreURL.toURI());
			}
			catch(java.net.URISyntaxException e){
				logger.error(e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
			}
		}
		File genmodelFile = new File(targetGenmodelFolder+File.separator+kp.getMetamodelName()+"internalEcores.genmodel");
		File generatedSourcePath = new File(targetGeneratedJavaFolder);
		return threadExector.submit(new CallableGenmodelGenerator(logger, inputEcoreFiles, genmodelFile, generatedSourcePath,getEclipseName(kp)));
				
	}
	public Future<Boolean> ecorejava2bytecode(Future<Boolean> genmodelFuture, ExecutorService threadExector){
		if(genmodelFuture == null) return null;
		
		
		
		// join the previously launched ecore2java()
		try {
			/*Boolean res =*/ genmodelFuture.get();
			 
		} catch (InterruptedException e) {
			logger.error("Generation of java code from ecore interrupted", KermetaCompiler.LOG_MESSAGE_GROUP, e);
		} catch (ExecutionException e) {
			logger.error("Generation of java code from ecore failed "+ e, KermetaCompiler.LOG_MESSAGE_GROUP, e);
		}
		logger.progress(getMainProgressGroup(), "Java code has been generated from "+ecoreForGenerationURLs.size()+" ecore(s)", KermetaCompiler.LOG_MESSAGE_GROUP, 1);

		if(compiler == null){
			logger.error("Eclipse run using a JRE instead of JDK, cannot compile generated emf java code.\n"+
		"support for external JDK declaration not implemented yet, please run eclipse using a JDK (-vm option in eclipse.ini)", KermetaCompiler.LOG_MESSAGE_GROUP);
			return null;
		}
		
		// launch javac		
	    Iterable<? extends JavaFileObject> compilationUnits =
	            fileManager.getJavaFileObjectsFromFiles(getJavaSources(new File(targetGeneratedJavaFolder)));
	    List<String> optionList = new ArrayList<String>();
		 // set compiler's classpath 
	    StringBuffer additionalClassPathStringBuffer = new StringBuffer();
	    String pathSep = System.getProperty("path.separator");
	    for(String aPath : additionalClassPath){
	    	if(additionalClassPathStringBuffer.length() != 0){
	    		additionalClassPathStringBuffer.append(pathSep);
	    	}
	    	additionalClassPathStringBuffer.append(aPath);
	    }
		optionList.add("-classpath");
		optionList.add(additionalClassPathStringBuffer.toString());
		optionList.add("-d");
		optionList.add(targetClassesFolder);

		try {
			File fo = new File(targetClassesFolder).getCanonicalFile();
			fo.mkdirs();
		} catch (IOException e) {
			logger.error(e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
		}
		
	    return threadExector.submit(compiler.getTask(null, fileManager, diagnostics, optionList, null, compilationUnits));

		
	}
	
	public boolean processDiagnostic(Future<Boolean> ecorejava2bytecodeFuture){
		if(ecorejava2bytecodeFuture == null) return false;
		// join the previously launched ecore2java()
		try {
			/* Boolean res =*/ ecorejava2bytecodeFuture.get();
			 
		} catch (InterruptedException e) {
			logger.error("Generation of bytecode code from java interrupted", KermetaCompiler.LOG_MESSAGE_GROUP, e);
		} catch (ExecutionException e) {
			logger.error("Generation of bytecode code from java failed "+ e, KermetaCompiler.LOG_MESSAGE_GROUP, e);
		}
		boolean hasError = false;
		for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics
				.getDiagnostics()) {
			try {
				if(diagnostic.getSource() != null){
					TextReference tr = new TextReference((new java.net.URI("file:///")).resolve(diagnostic.getSource().toUri()).toURL(), 
							new Long(diagnostic.getStartPosition()).intValue(), 
							new Long(diagnostic.getEndPosition()).intValue());
					logger.logProblem(MessagingSystem.Kind.UserERROR, diagnostic.getMessage(null), KermetaCompiler.LOG_MESSAGE_GROUP, tr);
					hasError =  true;
				}
				else{
					logger.info(diagnostic.getMessage(null), KermetaCompiler.LOG_MESSAGE_GROUP);
				}
			} catch (MalformedURLException e) {
				logger.error(e.getMessage()+" on "+ diagnostic.getSource().getName(), KermetaCompiler.LOG_MESSAGE_GROUP, e );
			} catch (URISyntaxException e) {
				logger.error(e.getMessage()+" on "+ diagnostic.getSource().getName(), KermetaCompiler.LOG_MESSAGE_GROUP, e );
			}
		}
		if(hasError){
			logger.error("Compilation of ecore java code has errors",  KermetaCompiler.LOG_MESSAGE_GROUP);
		}
		try {
			fileManager.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
		}
		logger.doneProgress(getMainProgressGroup(), "End of ecore 2 bytecode", KermetaCompiler.LOG_MESSAGE_GROUP);
		return hasError;
	}
	
	

	protected List<File> getJavaSources(File currentFolder){
		ArrayList<File> javaFiles= new ArrayList<File>();
		getJavaSources(javaFiles, currentFolder);
	    return javaFiles;
	}
	private void getJavaSources(ArrayList<File> javaFiles, File currentFolder){;
		for(File f : currentFolder.listFiles()){
			if(f.isDirectory()){
				getJavaSources(javaFiles, f);
			}
			else{
				if (f.getName().endsWith(".java")){
					javaFiles.add(f);
				}
			}
		}
	}
	
	public static String getEclipseName(KermetaProject kp){
		// the kp file is supposed to be directly contained by the eclipse folder
		if(kp.eResource() != null){
			List<String> sList = kp.eResource().getURI().segmentsList();
			if(sList.size() >= 2){
				return sList.get(sList.size()-2);
			}	
		}
		// else fallback 
		return "";
	}
	
	public String getMainProgressGroup(){
		return baseProgressGroup+".Ecore2Bytecode";
	}
}
