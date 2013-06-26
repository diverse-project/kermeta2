package org.kermeta.language.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.sample.deployer.Activator;

public class FsmExampleWizard extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(5);
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.model.zip", 			"org.kermeta.language.sample.fsm.model"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.extended.zip", 		"org.kermeta.language.sample.fsm.extended"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.checker.zip", 			"org.kermeta.language.sample.fsm.checker"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.simulation.zip", 		"org.kermeta.language.sample.fsm.simulation"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.determinization.zip", 	"org.kermeta.language.sample.fsm.determinization"));
		projects.add(new ProjectDescriptor("org.kermeta.language.sample.deployer", "zips/org.kermeta.language.sample.fsm.minimization.zip", 	"org.kermeta.language.sample.fsm.minimization"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}

}
