/**
 * <copyright>
 * </copyright>
 *
 * $Id: LambdaParameterValidator.java,v 1.2 2007-07-20 15:08:57 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.validation;

import fr.irisa.triskell.kermeta.language.behavior.TypeReference;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LambdaParameterValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateType(TypeReference value);
}
