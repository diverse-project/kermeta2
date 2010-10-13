/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure.validation;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Property;
import kermeta.language.structure.PropertyConstraint;

/**
 * A sample validator interface for {@link kermeta.language.structure.Property}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyValidator {
	boolean validate();

	boolean validateGetViolatedConstraintsMustDrillDownCache(Boolean value);

	boolean validateIsDerived(Boolean value);

	boolean validateOpposite(Property value);

	boolean validateGetterBody(Expression value);

	boolean validateSetterBody(Expression value);

	boolean validateIsSetterAbstract(Boolean value);

	boolean validateOwningClass(ClassDefinition value);

	boolean validateIsGetterAbstract(Boolean value);

	boolean validateIsComposite(Boolean value);

	boolean validate_default(String value);

	boolean validateIsReadOnly(Boolean value);

	boolean validatePropertyConstraint(PropertyConstraint value);

	boolean validateIsID(Boolean value);
}
