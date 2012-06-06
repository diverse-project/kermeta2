/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.validation;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationBodyValidator {
	boolean validate();

	boolean validateContent(EList value);
	boolean validateOperation(ImperativeOperation value);
	boolean validateVariable(EList value);
}