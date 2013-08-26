
package org.kermeta.language.sample.logo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LogoTextualSyntaxStandaloneSetup extends LogoTextualSyntaxStandaloneSetupGenerated{

	public static void doSetup() {
		new LogoTextualSyntaxStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

