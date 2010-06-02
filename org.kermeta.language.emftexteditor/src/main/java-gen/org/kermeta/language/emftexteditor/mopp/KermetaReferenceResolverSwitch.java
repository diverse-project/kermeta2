/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaReferenceResolverSwitch implements org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch {
	
	protected org.kermeta.language.emftexteditor.analysis.ClassDefinitionSuperTypeReferenceResolver classDefinitionSuperTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ClassDefinitionSuperTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TypedElementTypeReferenceResolver typedElementTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TypedElementTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.ParameterizedTypeTypeDefinitionReferenceResolver parameterizedTypeTypeDefinitionReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ParameterizedTypeTypeDefinitionReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.ObjectTagReferenceResolver objectTagReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ObjectTagReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TypeTypeContainerReferenceResolver typeTypeContainerReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TypeTypeContainerReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.ModelTypeIncludedTypeDefinitionReferenceResolver modelTypeIncludedTypeDefinitionReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ModelTypeIncludedTypeDefinitionReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TypeVariableBindingVariableReferenceResolver typeVariableBindingVariableReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TypeVariableBindingVariableReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TypeVariableBindingTypeReferenceResolver typeVariableBindingTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TypeVariableBindingTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.PrimitiveTypeInstanceTypeReferenceResolver primitiveTypeInstanceTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.PrimitiveTypeInstanceTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TagObjectReferenceResolver tagObjectReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TagObjectReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.TypeVariableSupertypeReferenceResolver typeVariableSupertypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.TypeVariableSupertypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.VirtualTypeClassDefinitionReferenceResolver virtualTypeClassDefinitionReferenceResolver = new org.kermeta.language.emftexteditor.analysis.VirtualTypeClassDefinitionReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.VirtualTypeModelTypeReferenceResolver virtualTypeModelTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.VirtualTypeModelTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.ProductTypeTypeReferenceResolver productTypeTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ProductTypeTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.FunctionTypeLeftReferenceResolver functionTypeLeftReferenceResolver = new org.kermeta.language.emftexteditor.analysis.FunctionTypeLeftReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.FunctionTypeRightReferenceResolver functionTypeRightReferenceResolver = new org.kermeta.language.emftexteditor.analysis.FunctionTypeRightReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.CallFeatureStaticPropertyReferenceResolver callFeatureStaticPropertyReferenceResolver = new org.kermeta.language.emftexteditor.analysis.CallFeatureStaticPropertyReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.CallFeatureStaticOperationReferenceResolver callFeatureStaticOperationReferenceResolver = new org.kermeta.language.emftexteditor.analysis.CallFeatureStaticOperationReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.CallFeatureStaticEnumLiteralReferenceResolver callFeatureStaticEnumLiteralReferenceResolver = new org.kermeta.language.emftexteditor.analysis.CallFeatureStaticEnumLiteralReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.ExpressionStaticTypeReferenceResolver expressionStaticTypeReferenceResolver = new org.kermeta.language.emftexteditor.analysis.ExpressionStaticTypeReferenceResolver();
	protected org.kermeta.language.emftexteditor.analysis.CallExpressionStaticTypeVariableBindingsReferenceResolver callExpressionStaticTypeVariableBindingsReferenceResolver = new org.kermeta.language.emftexteditor.analysis.CallExpressionStaticTypeVariableBindingsReferenceResolver();
	
	public org.kermeta.language.emftexteditor.analysis.ClassDefinitionSuperTypeReferenceResolver getClassDefinitionSuperTypeReferenceResolver() {
		return classDefinitionSuperTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TypedElementTypeReferenceResolver getTypedElementTypeReferenceResolver() {
		return typedElementTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.ParameterizedTypeTypeDefinitionReferenceResolver getParameterizedTypeTypeDefinitionReferenceResolver() {
		return parameterizedTypeTypeDefinitionReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.ObjectTagReferenceResolver getObjectTagReferenceResolver() {
		return objectTagReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TypeTypeContainerReferenceResolver getTypeTypeContainerReferenceResolver() {
		return typeTypeContainerReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.ModelTypeIncludedTypeDefinitionReferenceResolver getModelTypeIncludedTypeDefinitionReferenceResolver() {
		return modelTypeIncludedTypeDefinitionReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TypeVariableBindingVariableReferenceResolver getTypeVariableBindingVariableReferenceResolver() {
		return typeVariableBindingVariableReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TypeVariableBindingTypeReferenceResolver getTypeVariableBindingTypeReferenceResolver() {
		return typeVariableBindingTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.PrimitiveTypeInstanceTypeReferenceResolver getPrimitiveTypeInstanceTypeReferenceResolver() {
		return primitiveTypeInstanceTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TagObjectReferenceResolver getTagObjectReferenceResolver() {
		return tagObjectReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.TypeVariableSupertypeReferenceResolver getTypeVariableSupertypeReferenceResolver() {
		return typeVariableSupertypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.VirtualTypeClassDefinitionReferenceResolver getVirtualTypeClassDefinitionReferenceResolver() {
		return virtualTypeClassDefinitionReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.VirtualTypeModelTypeReferenceResolver getVirtualTypeModelTypeReferenceResolver() {
		return virtualTypeModelTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.ProductTypeTypeReferenceResolver getProductTypeTypeReferenceResolver() {
		return productTypeTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.FunctionTypeLeftReferenceResolver getFunctionTypeLeftReferenceResolver() {
		return functionTypeLeftReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.FunctionTypeRightReferenceResolver getFunctionTypeRightReferenceResolver() {
		return functionTypeRightReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.CallFeatureStaticPropertyReferenceResolver getCallFeatureStaticPropertyReferenceResolver() {
		return callFeatureStaticPropertyReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.CallFeatureStaticOperationReferenceResolver getCallFeatureStaticOperationReferenceResolver() {
		return callFeatureStaticOperationReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.CallFeatureStaticEnumLiteralReferenceResolver getCallFeatureStaticEnumLiteralReferenceResolver() {
		return callFeatureStaticEnumLiteralReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.ExpressionStaticTypeReferenceResolver getExpressionStaticTypeReferenceResolver() {
		return expressionStaticTypeReferenceResolver;
	}
	
	public org.kermeta.language.emftexteditor.analysis.CallExpressionStaticTypeVariableBindingsReferenceResolver getCallExpressionStaticTypeVariableBindingsReferenceResolver() {
		return callExpressionStaticTypeVariableBindingsReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		classDefinitionSuperTypeReferenceResolver.setOptions(options);
		typedElementTypeReferenceResolver.setOptions(options);
		parameterizedTypeTypeDefinitionReferenceResolver.setOptions(options);
		objectTagReferenceResolver.setOptions(options);
		typeTypeContainerReferenceResolver.setOptions(options);
		modelTypeIncludedTypeDefinitionReferenceResolver.setOptions(options);
		typeVariableBindingVariableReferenceResolver.setOptions(options);
		typeVariableBindingTypeReferenceResolver.setOptions(options);
		primitiveTypeInstanceTypeReferenceResolver.setOptions(options);
		tagObjectReferenceResolver.setOptions(options);
		typeVariableSupertypeReferenceResolver.setOptions(options);
		virtualTypeClassDefinitionReferenceResolver.setOptions(options);
		virtualTypeModelTypeReferenceResolver.setOptions(options);
		productTypeTypeReferenceResolver.setOptions(options);
		functionTypeLeftReferenceResolver.setOptions(options);
		functionTypeRightReferenceResolver.setOptions(options);
		callFeatureStaticPropertyReferenceResolver.setOptions(options);
		callFeatureStaticOperationReferenceResolver.setOptions(options);
		callFeatureStaticEnumLiteralReferenceResolver.setOptions(options);
		expressionStaticTypeReferenceResolver.setOptions(options);
		callExpressionStaticTypeVariableBindingsReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getClassDefinition().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("superType")) {
				classDefinitionSuperTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.ClassDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypedElement().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				typedElementTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.TypedElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getParameterizedType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.GenericTypeDefinition> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.GenericTypeDefinition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("typeDefinition")) {
				parameterizedTypeTypeDefinitionReferenceResolver.resolve(identifier, (org.kermeta.language.structure.ParameterizedType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getObject().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Tag> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Tag>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("tag")) {
				objectTagReferenceResolver.resolve(identifier, (org.kermeta.language.structure.Object) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeContainer> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeContainer>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("typeContainer")) {
				typeTypeContainerReferenceResolver.resolve(identifier, (org.kermeta.language.structure.Type) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeDefinition> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeDefinition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("includedTypeDefinition")) {
				modelTypeIncludedTypeDefinitionReferenceResolver.resolve(identifier, (org.kermeta.language.structure.ModelType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypeVariableBinding().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeVariable> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.TypeVariable>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("variable")) {
				typeVariableBindingVariableReferenceResolver.resolve(identifier, (org.kermeta.language.structure.TypeVariableBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypeVariableBinding().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				typeVariableBindingTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.TypeVariableBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getPrimitiveType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("instanceType")) {
				primitiveTypeInstanceTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.PrimitiveType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getTag().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Object> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Object>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("object")) {
				tagObjectReferenceResolver.resolve(identifier, (org.kermeta.language.structure.Tag) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypeVariable().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("supertype")) {
				typeVariableSupertypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.TypeVariable) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getVirtualType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.ClassDefinition> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.ClassDefinition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("classDefinition")) {
				virtualTypeClassDefinitionReferenceResolver.resolve(identifier, (org.kermeta.language.structure.VirtualType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getVirtualType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.ModelTypeVariable> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.ModelTypeVariable>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("modelType")) {
				virtualTypeModelTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.VirtualType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getProductType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				productTypeTypeReferenceResolver.resolve(identifier, (org.kermeta.language.structure.ProductType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getFunctionType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left")) {
				functionTypeLeftReferenceResolver.resolve(identifier, (org.kermeta.language.structure.FunctionType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.structure.StructurePackage.eINSTANCE.getFunctionType().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right")) {
				functionTypeRightReferenceResolver.resolve(identifier, (org.kermeta.language.structure.FunctionType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallFeature().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Property> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Property>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticProperty")) {
				callFeatureStaticPropertyReferenceResolver.resolve(identifier, (org.kermeta.language.behavior.CallFeature) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallFeature().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Operation> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Operation>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticOperation")) {
				callFeatureStaticOperationReferenceResolver.resolve(identifier, (org.kermeta.language.behavior.CallFeature) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallFeature().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.EnumerationLiteral> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.EnumerationLiteral>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticEnumLiteral")) {
				callFeatureStaticEnumLiteralReferenceResolver.resolve(identifier, (org.kermeta.language.behavior.CallFeature) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getExpression().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticType")) {
				expressionStaticTypeReferenceResolver.resolve(identifier, (org.kermeta.language.behavior.Expression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallExpression().isInstance(container)) {
			KermetaFuzzyResolveResult<org.kermeta.language.structure.Type> frr = new KermetaFuzzyResolveResult<org.kermeta.language.structure.Type>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticTypeVariableBindings")) {
				callExpressionStaticTypeVariableBindingsReferenceResolver.resolve(identifier, (org.kermeta.language.behavior.CallExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
}
