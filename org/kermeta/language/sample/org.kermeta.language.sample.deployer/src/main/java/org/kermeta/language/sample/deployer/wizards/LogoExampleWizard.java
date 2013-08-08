package org.kermeta.language.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.sample.deployer.Activator;

public class LogoExampleWizard extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.logo.model.zip", 		"org.kermeta.language.sample.logo.model"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.logo.checker.zip", 	"org.kermeta.language.sample.logo.checker"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.logo.interpreter.zip", "org.kermeta.language.sample.logo.interpreter"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.logo.compilerNXC.zip", "org.kermeta.language.sample.logo.compilerNXC"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}

}
