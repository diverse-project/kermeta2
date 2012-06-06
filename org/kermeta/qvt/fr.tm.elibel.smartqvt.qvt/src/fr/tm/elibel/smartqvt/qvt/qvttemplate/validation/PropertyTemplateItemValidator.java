/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate.validation;

import fr.tm.elibel.smartqvt.qvt.emof.Property;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyTemplateItemValidator {
	boolean validate();

	boolean validateObjContainer(ObjectTemplateExp value);
	boolean validateReferredProperty(Property value);
	boolean validateValue(OclExpression value);
}