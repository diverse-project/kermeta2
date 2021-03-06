/* $Id:$ 
 * Creation : 15 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Olivier Barais
 * Customize this class for your local configuration
 * This file is here as a template
 * Usually you are not supposed to commit your change here, except if you enhance the template
 * A future 
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomRunner {
	
	public static final String CUSTOM_PATH = "C:/Users/dvojtise/workspaces/kermetaV2_svn_5/";
	public static final String SUFFIX_SAVE = "_HelloWorldMiniframeworkAndRaise";
	public static final boolean CHECK = false; // Set this boolean to true if you wish to check your modeling units
	
	public static void main(String[] args) throws IOException {

		Main m = new Main();
		m.setCheck(CHECK);
			
		// Parse framework and test File
		List<String> uris = new ArrayList<String>();
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.api.tests/src/main/resources/KmResolver_Valid/valid_001/src/001_testHelloWorldAndRaise.kmt");
		//uris
		//		.add(CUSTOM_PATH+"org.kermeta.language.api.tests/src/main/resources/KmResolver_Valid/valid_001/src/001_testHelloWorld_standalone.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/emfpersistence/emfpersistence.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/io/io.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/standard/baseType.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/standard/collections.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/utils/hashtable.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/org/kermeta/language/structure/aspects.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/exceptions/exceptions.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.library.core/src/main/kmt/kermeta/exceptions/constraint_exceptions.kmt");
		uris
				.add(CUSTOM_PATH+"org.kermeta.language.model/src/main/ecore/kermeta.ecore");
		
		// use global main
		m.k2Compile(uris, null, null);
		
		// Use each main separately
			// Loader
			//List<ModelingUnit> loadModelingUnits =	 mainLoad.k2CompileLoadUnit(uris,null, null);
			
			// Merger
			//ModelingUnit mergedMU = mainMerger.k2CompileMerger(uris, null, null, loadModelingUnits);
			
			// Type Setter
			//mainTypeSetter.k2CompileTypeSetter(uris, null, null, mergedMU);
	}
}
