/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.persistence.validation;

import kermeta.persistence.Repository;

/**
 * A sample validator interface for {@link kermeta.persistence.Resource}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResourceValidator {
	boolean validate();

	boolean validateRepository(Repository value);

	boolean validateIsReadOnly(Boolean value);

	boolean validateMetaModelURI(String value);

	boolean validateUri(String value);
}
