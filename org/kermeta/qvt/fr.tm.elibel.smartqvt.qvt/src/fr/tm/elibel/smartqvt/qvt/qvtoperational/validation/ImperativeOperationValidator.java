/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.validation;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImperativeOperationValidator {
	boolean validate();

	boolean validateBody(OperationBody value);
	boolean validateContext(VarParameter value);
	boolean validateIsBlackbox(Boolean value);
	boolean validateOverridden(ImperativeOperation value);
	boolean validateResult(EList value);
}
