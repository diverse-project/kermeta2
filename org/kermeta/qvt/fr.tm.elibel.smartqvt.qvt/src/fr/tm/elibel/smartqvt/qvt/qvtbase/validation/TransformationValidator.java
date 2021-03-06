/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.validation;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransformationValidator {
	boolean validate();

	boolean validateExtends(Transformation value);
	boolean validateModelParameter(EList value);
	boolean validateOwnedTag(EList value);
	boolean validateRule(EList value);
}
