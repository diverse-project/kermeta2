/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.emof.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.emof.Class}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClassValidator {
	boolean validate();

	boolean validateIsAbstract(Boolean value);
	boolean validateOwnedAttribute(EList value);
	boolean validateOwnedOperation(EList value);
	boolean validateSuperClass(EList value);
}
