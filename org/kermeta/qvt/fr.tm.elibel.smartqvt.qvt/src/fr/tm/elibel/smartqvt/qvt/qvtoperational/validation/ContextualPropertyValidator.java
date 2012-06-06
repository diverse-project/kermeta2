/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.validation;

import fr.tm.elibel.smartqvt.qvt.emof.Property;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContextualPropertyValidator {
	boolean validate();

	boolean validateContext(fr.tm.elibel.smartqvt.qvt.emof.Class value);
	boolean validateInitExpression(OclExpression value);
	boolean validateOverridden(Property value);
}