package org.kermeta.language.texteditor.eclipse;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.eclipse.pde.core.IModel;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.core.build.IBuildModelFactory;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.plugin.*;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.language.texteditor.eclipse"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// test auto declaration of plugin.xml
		String pluginLocation = "/instance_config/plugin.xml";
		URL pluginURL = context.getBundle().getEntry(pluginLocation);
		if(pluginURL!= null){
			// code inspired from http://www.ibm.com/developerworks/opensource/library/os-ecl-dynext/
			// TODO add bundle listener to make sure this is call only when the bundle is really started (see AbstractUIPlugin code )
			InputStream inputStream = pluginURL.openStream();
			
			IExtensionRegistry registry = RegistryFactory.getRegistry( );
			Object key = ((ExtensionRegistry) registry).getTemporaryUserToken( );
	
			boolean b = registry.addContribution(inputStream, ContributorFactoryOSGi.createContributor(context.getBundle()), false, null, null, key);
			
		}
		else{
			System.out.println("Cannot find " + pluginLocation);
		}
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
