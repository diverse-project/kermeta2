/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure.validation;

import kermeta.language.structure.TypeVariable;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.language.structure.GenericTypeDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GenericTypeDefinitionValidator {
	boolean validate();

	boolean validateTypeParameter(EList<TypeVariable> value);
}
