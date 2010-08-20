/*$Id: $
* Project : org.kermeta.language.texteditor.eclipse
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.texteditor.eclipse.art2.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortLog;
import org.osgi.framework.Bundle;


@ThirdParties({
	@ThirdParty(name="org.kermeta.language.model", url="mvn:org.kermeta.language/language.model"),
	@ThirdParty(name="org.kermeta.language.kp.model", url="mvn:org.kermeta.kp/kp.model"),
	@ThirdParty(name="org.kermeta.language.traceability.model", url="mvn:org.kermeta.traceability/traceability.model"),
	@ThirdParty(name="org.kermeta.language.api", url="mvn:org.kermeta.language/language.api"),
	@ThirdParty(name="org.kermeta.language.loader.scala", url="mvn:org.kermeta.language/language.loader.scala")
})

@Requires({
	/**
	 * Log port for sending technical messages
	 */
	//@RequiredPort(name = "log", type=PortType.MESSAGE)
	@RequiredPort(name = "log", type=PortType.SERVICE, className=MessagePort.class)
})
/**
 * ART2 component of a Text editor for Kermeta language running in eclipse
 */
@ComponentType(libName = "org.kermeta.language")
public class Art2ComponentTexteditorEclipse extends AbstractComponentType {

	protected MessagePort logPort=null;
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	protected String bundleSymbolicName="";
	
	/**
	 * method called when an instance of this component is instantiated and started
	 */
	@Start
	public void start(){
		System.out.println("Art2ComponentTexteditorEclipse.start ...");
		// store some useful data
		logPort = getPortByName("log", MessagePort.class);
		Bundle bundle = (Bundle) this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		
		
		try{
			String pluginLocation = "/instance_config/plugin.xml";
			URL pluginURL = bundle.getEntry(pluginLocation);
			if(pluginURL!= null){
				// code inspired from http://www.ibm.com/developerworks/opensource/library/os-ecl-dynext/
				// TODO add bundle listener to make sure this is call only when the bundle is really started (see AbstractUIPlugin code )
				InputStream inputStream = pluginURL.openStream();
				
				IExtensionRegistry registry = RegistryFactory.getRegistry( );
				Object key = ((ExtensionRegistry) registry).getTemporaryUserToken( );
		
				boolean b = registry.addContribution(inputStream, ContributorFactoryOSGi.createContributor(bundle), false, null, null, key);
				
			}
			else{
				logPort.process(mFactory.createErrorMessage("Failed to start Editor due to : Cannot find " + pluginLocation, bundleSymbolicName));
			}
			logPort.process(mFactory.createDebugMessage("Successfully added editor contribution to UI" + pluginLocation, bundleSymbolicName));
		}
		catch (Exception e) {
			logPort.process(mFactory.createErrorMessage("Failed to start Editor", bundleSymbolicName));
		}
	}
	
	
	/**
	 * method called when an instance of this component is stopped
	 */
	@Stop
	public void stop(){
		
	}
}
