package org.kermeta.kp.wizard.eclipse.helper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KpDependenciesHelper;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class PomGenerator4KP {

	
	
	public KermetaProject kp;
	public KpVariableExpander varExpander;
	public MessagingSystem messagingSystem;
	
	public PomGenerator4KP(KermetaProject kp, KpVariableExpander varExpander, MessagingSystem messagingSystem){
		this.kp = kp;
		this.varExpander = varExpander;
	}
	
	public MavenProject createProject(String projectGroupId, String projectArtefactId, String projectVersion){
		MavenProject project =  initProject(projectGroupId, projectArtefactId, projectVersion);
		updateProject4KP(project);
		return project;
	}
	
	public MavenProject initProject(String projectGroupId, String projectArtefactId, String projectVersion){
		MavenProject project = new MavenProject();
		
		project.setGroupId(projectGroupId);
        project.setArtifactId(projectArtefactId);
        project.setVersion(projectVersion);
        project.setModelVersion("4.0.0");
        project.setPackaging("jar");
		
        project.getProperties().put("project.build.sourceEncoding", "UTF-8");
        project.getProperties().put("project.reporting.outputEncoding", "UTF-8");
        project.getProperties().put("scala.version", "2.9.0-1");
                
		return project;
	}
	
	public void updateProject4KP(MavenProject project){
		enforceKPDependencies(project);
		enforceRepositories(project);
	}
	
	public void enforceKPDependencies(MavenProject project){
		try {
			List<Dependency> dependencies = project.getModel().getDependencies();
			for(Dependency mavenDep : KpDependenciesHelper.getDependentProjetsMavenArtefacts(kp, varExpander)){
				// TODO add only if not already there, optionally update the version
				dependencies.add(mavenDep);
			}
			project.getModel().setDependencies(dependencies);
		} catch (IOException e) {
			messagingSystem.error(e.getMessage(), "PomGenerator4KP", e);
		}
	}
	
	public void enforceRepositories(MavenProject project){
		Repository kermetaPublic = new Repository();
		kermetaPublic.setId("kermetaPublicRelease");
		kermetaPublic.setUrl("http://maven.irisa.fr/artifactory/public-release/");

		Repository kermetaPublicSnapshot = new Repository();
		kermetaPublicSnapshot.setId("kermetaPublicSnapshot");
		kermetaPublicSnapshot.setUrl("http://maven.irisa.fr/artifactory/public-snapshot/");

		Repository scalaRepo = new Repository();
        scalaRepo.setId("Scala-tools Maven2 Repository");
        scalaRepo.setUrl("http://scala-tools.org/repo-releases");

        List<Repository> repositories = project.getModel().getRepositories();
        // TODO add only if not already there,
        repositories.add(kermetaPublic);
        repositories.add(kermetaPublicSnapshot);
        project.getModel().setRepositories(repositories);
        
		/* INIT PLUGIN REPOSITORY */
        List<Repository> pluginRepositories = project.getModel().getPluginRepositories();
     // TODO add only if not already there,
        pluginRepositories.add(kermetaPublic);
        pluginRepositories.add(kermetaPublicSnapshot);
        project.getModel().setPluginRepositories(pluginRepositories);
	}
	
	public void saveToFile(MavenProject project, java.io.File file){
		try {
			FileWriter fw = new FileWriter(file);
            project.writeModel(fw);
            fw.flush();
            fw.close();
        } catch  (Exception e) {
        	messagingSystem.error(e.getMessage(), "PomGenerator4KP", e);
        }
	}
	
}
