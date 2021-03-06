/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl.validation;

import fr.tm.elibel.smartqvt.qvt.emof.Type;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.imperativeocl.DictionaryType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DictionaryTypeValidator {
	boolean validate();

	boolean validateKeyType(Type value);
}
