/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.behavior.validation;

import kermeta.language.behavior.Expression;
import kermeta.language.behavior.TypeReference;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.language.behavior.Rescue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RescueValidator {
	boolean validate();

	boolean validateBody(EList<Expression> value);

	boolean validateExceptionName(String value);

	boolean validateExceptionType(TypeReference value);
}
