/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure.validation;

import kermeta.language.structure.Filter;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.Require;
import kermeta.language.structure.Using;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.language.structure.ModelingUnit}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelingUnitValidator {
	boolean validate();

	boolean validateUsings(EList<Using> value);

	boolean validateIncludeFilters(EList<Filter> value);

	boolean validatePackages(EList<kermeta.language.structure.Package> value);

	boolean validateExcludeFilters(EList<Filter> value);

	boolean validateReferencedModelingUnits(EList<ModelingUnit> value);

	boolean validateRequires(EList<Require> value);
}
