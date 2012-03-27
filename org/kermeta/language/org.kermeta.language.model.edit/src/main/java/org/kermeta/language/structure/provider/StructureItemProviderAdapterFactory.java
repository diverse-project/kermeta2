/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.kermeta.language.structure.util.StructureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureItemProviderAdapterFactory extends StructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.KermetaModelElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KermetaModelElementItemProvider kermetaModelElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.KermetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKermetaModelElementAdapter() {
		if (kermetaModelElementItemProvider == null) {
			kermetaModelElementItemProvider = new KermetaModelElementItemProvider(this);
		}

		return kermetaModelElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.TypeVariableBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVariableBindingItemProvider typeVariableBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeVariableBindingAdapter() {
		if (typeVariableBindingItemProvider == null) {
			typeVariableBindingItemProvider = new TypeVariableBindingItemProvider(this);
		}

		return typeVariableBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.MultiplicityElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementItemProvider multiplicityElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.MultiplicityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityElementAdapter() {
		if (multiplicityElementItemProvider == null) {
			multiplicityElementItemProvider = new MultiplicityElementItemProvider(this);
		}

		return multiplicityElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.TypeDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionItemProvider typeDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeDefinitionAdapter() {
		if (typeDefinitionItemProvider == null) {
			typeDefinitionItemProvider = new TypeDefinitionItemProvider(this);
		}

		return typeDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ClassDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionItemProvider classDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassDefinitionAdapter() {
		if (classDefinitionItemProvider == null) {
			classDefinitionItemProvider = new ClassDefinitionItemProvider(this);
		}

		return classDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ModelingUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitItemProvider modelingUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ModelingUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelingUnitAdapter() {
		if (modelingUnitItemProvider == null) {
			modelingUnitItemProvider = new ModelingUnitItemProvider(this);
		}

		return modelingUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.TypeDefinitionContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionContainerItemProvider typeDefinitionContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.TypeDefinitionContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeDefinitionContainerAdapter() {
		if (typeDefinitionContainerItemProvider == null) {
			typeDefinitionContainerItemProvider = new TypeDefinitionContainerItemProvider(this);
		}

		return typeDefinitionContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Require} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireItemProvider requireItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequireAdapter() {
		if (requireItemProvider == null) {
			requireItemProvider = new RequireItemProvider(this);
		}

		return requireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ObjectTypeVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeVariableItemProvider objectTypeVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ObjectTypeVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectTypeVariableAdapter() {
		if (objectTypeVariableItemProvider == null) {
			objectTypeVariableItemProvider = new ObjectTypeVariableItemProvider(this);
		}

		return objectTypeVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ModelType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeItemProvider modelTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelTypeAdapter() {
		if (modelTypeItemProvider == null) {
			modelTypeItemProvider = new ModelTypeItemProvider(this);
		}

		return modelTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ModelTypeVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeVariableItemProvider modelTypeVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ModelTypeVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelTypeVariableAdapter() {
		if (modelTypeVariableItemProvider == null) {
			modelTypeVariableItemProvider = new ModelTypeVariableItemProvider(this);
		}

		return modelTypeVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.VirtualType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualTypeItemProvider virtualTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.VirtualType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualTypeAdapter() {
		if (virtualTypeItemProvider == null) {
			virtualTypeItemProvider = new VirtualTypeItemProvider(this);
		}

		return virtualTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.UnresolvedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeItemProvider unresolvedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.UnresolvedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnresolvedTypeAdapter() {
		if (unresolvedTypeItemProvider == null) {
			unresolvedTypeItemProvider = new UnresolvedTypeItemProvider(this);
		}

		return unresolvedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.UnresolvedProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedPropertyItemProvider unresolvedPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.UnresolvedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnresolvedPropertyAdapter() {
		if (unresolvedPropertyItemProvider == null) {
			unresolvedPropertyItemProvider = new UnresolvedPropertyItemProvider(this);
		}

		return unresolvedPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.UnresolvedOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedOperationItemProvider unresolvedOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.UnresolvedOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnresolvedOperationAdapter() {
		if (unresolvedOperationItemProvider == null) {
			unresolvedOperationItemProvider = new UnresolvedOperationItemProvider(this);
		}

		return unresolvedOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.Using} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingItemProvider usingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsingAdapter() {
		if (usingItemProvider == null) {
			usingItemProvider = new UsingItemProvider(this);
		}

		return usingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.ProductType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeItemProvider productTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.ProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductTypeAdapter() {
		if (productTypeItemProvider == null) {
			productTypeItemProvider = new ProductTypeItemProvider(this);
		}

		return productTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.FunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeItemProvider functionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionTypeAdapter() {
		if (functionTypeItemProvider == null) {
			functionTypeItemProvider = new FunctionTypeItemProvider(this);
		}

		return functionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.VoidType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidTypeItemProvider voidTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.VoidType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVoidTypeAdapter() {
		if (voidTypeItemProvider == null) {
			voidTypeItemProvider = new VoidTypeItemProvider(this);
		}

		return voidTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.TypeMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMappingItemProvider typeMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.TypeMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeMappingAdapter() {
		if (typeMappingItemProvider == null) {
			typeMappingItemProvider = new TypeMappingItemProvider(this);
		}

		return typeMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.language.structure.UnresolvedInferredType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedInferredTypeItemProvider unresolvedInferredTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.language.structure.UnresolvedInferredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnresolvedInferredTypeAdapter() {
		if (unresolvedInferredTypeItemProvider == null) {
			unresolvedInferredTypeItemProvider = new UnresolvedInferredTypeItemProvider(this);
		}

		return unresolvedInferredTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (kermetaModelElementItemProvider != null) kermetaModelElementItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
		if (typeVariableBindingItemProvider != null) typeVariableBindingItemProvider.dispose();
		if (multiplicityElementItemProvider != null) multiplicityElementItemProvider.dispose();
		if (typeDefinitionItemProvider != null) typeDefinitionItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (primitiveTypeItemProvider != null) primitiveTypeItemProvider.dispose();
		if (tagItemProvider != null) tagItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (classDefinitionItemProvider != null) classDefinitionItemProvider.dispose();
		if (modelingUnitItemProvider != null) modelingUnitItemProvider.dispose();
		if (typeDefinitionContainerItemProvider != null) typeDefinitionContainerItemProvider.dispose();
		if (requireItemProvider != null) requireItemProvider.dispose();
		if (objectTypeVariableItemProvider != null) objectTypeVariableItemProvider.dispose();
		if (modelTypeItemProvider != null) modelTypeItemProvider.dispose();
		if (modelTypeVariableItemProvider != null) modelTypeVariableItemProvider.dispose();
		if (virtualTypeItemProvider != null) virtualTypeItemProvider.dispose();
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (unresolvedTypeItemProvider != null) unresolvedTypeItemProvider.dispose();
		if (unresolvedPropertyItemProvider != null) unresolvedPropertyItemProvider.dispose();
		if (unresolvedOperationItemProvider != null) unresolvedOperationItemProvider.dispose();
		if (usingItemProvider != null) usingItemProvider.dispose();
		if (productTypeItemProvider != null) productTypeItemProvider.dispose();
		if (functionTypeItemProvider != null) functionTypeItemProvider.dispose();
		if (voidTypeItemProvider != null) voidTypeItemProvider.dispose();
		if (typeMappingItemProvider != null) typeMappingItemProvider.dispose();
		if (unresolvedInferredTypeItemProvider != null) unresolvedInferredTypeItemProvider.dispose();
	}

}
