/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.validation;

import fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RealizedVariableValidator {
	boolean validate();

	boolean validateBottomPattern(BottomPattern value);
}
