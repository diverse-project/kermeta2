/* $Id:$ 
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Francois Fouquet
 *            Didier Vojtisek
 * 
 */
package org.kermeta.language.gendoc.mavenplugin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * This class implement a maven plugin that compiles a kermeta project into scala files and then bytecode
 * 
 * Be careful annotations in the comments are used by maven...
 * 
 * @goal generate
 * @phase generate-resources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:ffouquet@irisa.fr">Francois Fouquet</a>
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * @version $Id$
 *
 */
public class KMDocGeneratorMojo extends AbstractMojo {

    /**
     * Location of the local repository.
     *
     * @parameter expression="${localRepository}"
     * @readonly
     * @required
     */
    protected org.apache.maven.artifact.repository.ArtifactRepository local;
    /**
     * POM
     *
     * @parameter expression="${project}"
     * @readonly
     * @required
     */
    protected MavenProject project;
    
    
    /**
     * Input kermeta model (km) file
     * @required
     * @parameter
     */
    private File kmFile;
    
    /**
    * The directory to place generated files. 
    * for apt.
    *
    * @parameter default-value="${project.build.directory}/documentation"
    */
   private File outputDirectory;
   
   /**
    * Package that are excluded from the html documentation generation
    * @parameter
    */
   private String[] excludedPackages;

       
    

    
    public void execute() throws MojoExecutionException, MojoFailureException {
    	try {
	        org.apache.log4j.BasicConfigurator.configure();
	
	        this.getLog().info("Generating documentation in "+outputDirectory.getAbsolutePath());
	        String kmFileURL = kmFile.toURI().toString();
	        this.getLog().info("kpFileURL= "+kmFileURL);
	        
	        checkFile(kmFile.getAbsolutePath().toString());
	        
	        
	        //Creates source code file in "Yuml" language and "Glumly" language for each model elements
	        org.kermeta.language.gendoc.km2diag.Km2Diag gen = new org.kermeta.language.gendoc.km2diag.Km2Diag();
	        gen.genModelDiag(kmFileURL, outputDirectory.toURI().toString());
	        
	        //Creates images files for each model element
	        final List<File> files 	= new ArrayList<File>();
	        getFiles(new File(outputDirectory.toURI()), files, filter);
	        
	        this.getLog().info("Converting Yuml files to PNG files: ");
	        for(File f : files){
	        	this.getLog().info("> " + f.getAbsolutePath());
	        	
	        	String myPath = f.getAbsolutePath();
	        	myPath = myPath.replaceAll("yuml$", "png");
	        	myPath = myPath.replaceAll("/img_src/yuml/", "/images/");
	        	File myNewImage = new File(myPath);
	        	File parentDir = new File(myNewImage.getParent());
	        	parentDir.mkdirs();
	        	myNewImage.createNewFile();
	        	
	        	Yuml2Png(f,myNewImage);
	        }
	        
	        
	        org.kermeta.language.gendoc.km2html.Km2Html generator = new org.kermeta.language.gendoc.km2html.Km2HtmlImpl4Eclipse();
			
	        StringBuilder excludedPackagesString = new StringBuilder();
	        if(excludedPackages != null)
		        for(String excludedPack : excludedPackages){
		        	excludedPackagesString.append(excludedPack+" ");
		        }
	        else excludedPackagesString.append("");
	        
	        
			generator.genHtmlDoc4File(kmFileURL, outputDirectory.toURI().toString(), excludedPackagesString.toString().trim(), "GeneratedDocumentation");	        
	        
    	} catch (Exception e) {
			this.getLog().error(e);
			throw new MojoFailureException(e.toString());
		}
        
    }
    
    protected boolean checkFile(String filePath) throws MojoExecutionException {
        File file = new File(filePath);
        if (!file.exists()) {
            this.getLog().error("File not found : " + filePath);
            throw new MojoExecutionException("Failed to generate documentation : File not found : " + filePath);

        }
        return true;
    }
    
    
    final FileFilter filter = new FileFilter() {
		@Override
		public boolean accept(File pathname) {
			return pathname!=null && pathname.getAbsolutePath().endsWith(".yuml");
		}
	};
	
	/**
	 * Search all files in @file directory (and sub directories) which match the @filter and put them in @result
	 */
    private static void getFiles(final File file, final List<File> result, final FileFilter filter) {
    	final String[] children = file.list();
    	final String base 		= file.getPath() + System.getProperty("file.separator");
    	File currentChildren;
    	
    	if(children!=null)
    	    for(int i=0; i<children.length; i++) {
    	    	currentChildren = new File(base + children[i]);
    	    	
    	    	//currentChildren is a directory
    	    	getFiles(currentChildren, result, filter);
    	    	
    	    	//currentChildren is a file
    	        if(filter.accept(currentChildren))
    	        	result.add(currentChildren);
    	    }
    }
    
    /**
     * Return the content of a char file
     */
    private static String getContent(File f){
    	
    	StringBuffer res = new StringBuffer();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String inString;
			
			while((inString = br.readLine()) != null){
				res.append(inString);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res.toString();
    }
    
    /**
     * Call the web site http://yuml.me/diagram/class/ to convert Yuml sources to PNG image.
     * @param in Source code file in Yuml format. See http://yuml.me/ .
     * @param out Image result in .png format
     */
    private static void Yuml2Png(File in, File out){
    	
    	URL 					website;
    	BufferedInputStream 	inByteStream;
    	BufferedOutputStream 	outByteStream;
    	
    	try {
    		//Ask for the url of the image
    		String diagram = URLEncoder.encode("dsl_text="+getContent(in),"UTF-8");
    		URL url = new URL("http://yuml.me/diagram/class/");
    		HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false); 
			connection.setRequestMethod("POST"); 
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
			connection.setRequestProperty("charset", "utf-8");
			connection.setRequestProperty("Content-Length", "" + Integer.toString(diagram.getBytes().length));
			connection.setUseCaches (false);
	
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
			wr.writeBytes(diagram);
			wr.flush();
			wr.close();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    String imgUrl = reader.readLine();
    		
    		//then get the file image
    		website = new URL("http://yuml.me/" + imgUrl);
			inByteStream = new BufferedInputStream(website.openStream());
			outByteStream = new BufferedOutputStream(new FileOutputStream(out));

			int inputByte;
			while ((inputByte = inByteStream.read()) != -1) {
				outByteStream.write(inputByte);
			}

			outByteStream.close();
			inByteStream.close();
			connection.disconnect();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
}