/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractKermetaInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.kermeta.language.behavior.VariableDecl) {
			result = interprete_org_kermeta_language_behavior_VariableDecl((org.kermeta.language.behavior.VariableDecl) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.SelfExpression) {
			result = interprete_org_kermeta_language_behavior_SelfExpression((org.kermeta.language.behavior.SelfExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Loop) {
			result = interprete_org_kermeta_language_behavior_Loop((org.kermeta.language.behavior.Loop) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.VoidLiteral) {
			result = interprete_org_kermeta_language_behavior_VoidLiteral((org.kermeta.language.behavior.VoidLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.TypeLiteral) {
			result = interprete_org_kermeta_language_behavior_TypeLiteral((org.kermeta.language.behavior.TypeLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.BooleanLiteral) {
			result = interprete_org_kermeta_language_behavior_BooleanLiteral((org.kermeta.language.behavior.BooleanLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.StringLiteral) {
			result = interprete_org_kermeta_language_behavior_StringLiteral((org.kermeta.language.behavior.StringLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.IntegerLiteral) {
			result = interprete_org_kermeta_language_behavior_IntegerLiteral((org.kermeta.language.behavior.IntegerLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.LambdaParameter) {
			result = interprete_org_kermeta_language_behavior_LambdaParameter((org.kermeta.language.behavior.LambdaParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.LambdaExpression) {
			result = interprete_org_kermeta_language_behavior_LambdaExpression((org.kermeta.language.behavior.LambdaExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.JavaStaticCall) {
			result = interprete_org_kermeta_language_behavior_JavaStaticCall((org.kermeta.language.behavior.JavaStaticCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.EmptyExpression) {
			result = interprete_org_kermeta_language_behavior_EmptyExpression((org.kermeta.language.behavior.EmptyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Literal) {
			result = interprete_org_kermeta_language_behavior_Literal((org.kermeta.language.behavior.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.TypeReference) {
			result = interprete_org_kermeta_language_behavior_TypeReference((org.kermeta.language.behavior.TypeReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Rescue) {
			result = interprete_org_kermeta_language_behavior_Rescue((org.kermeta.language.behavior.Rescue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Raise) {
			result = interprete_org_kermeta_language_behavior_Raise((org.kermeta.language.behavior.Raise) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Conditional) {
			result = interprete_org_kermeta_language_behavior_Conditional((org.kermeta.language.behavior.Conditional) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallValue) {
			result = interprete_org_kermeta_language_behavior_CallValue((org.kermeta.language.behavior.CallValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallResult) {
			result = interprete_org_kermeta_language_behavior_CallResult((org.kermeta.language.behavior.CallResult) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallSuperOperation) {
			result = interprete_org_kermeta_language_behavior_CallSuperOperation((org.kermeta.language.behavior.CallSuperOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallFeature) {
			result = interprete_org_kermeta_language_behavior_CallFeature((org.kermeta.language.behavior.CallFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallVariable) {
			result = interprete_org_kermeta_language_behavior_CallVariable((org.kermeta.language.behavior.CallVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Block) {
			result = interprete_org_kermeta_language_behavior_Block((org.kermeta.language.behavior.Block) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.CallExpression) {
			result = interprete_org_kermeta_language_behavior_CallExpression((org.kermeta.language.behavior.CallExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Assignment) {
			result = interprete_org_kermeta_language_behavior_Assignment((org.kermeta.language.behavior.Assignment) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.behavior.Expression) {
			result = interprete_org_kermeta_language_behavior_Expression((org.kermeta.language.behavior.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.VoidType) {
			result = interprete_org_kermeta_language_structure_VoidType((org.kermeta.language.structure.VoidType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.FunctionType) {
			result = interprete_org_kermeta_language_structure_FunctionType((org.kermeta.language.structure.FunctionType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ProductType) {
			result = interprete_org_kermeta_language_structure_ProductType((org.kermeta.language.structure.ProductType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.UnresolvedOperation) {
			result = interprete_org_kermeta_language_structure_UnresolvedOperation((org.kermeta.language.structure.UnresolvedOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.UnresolvedProperty) {
			result = interprete_org_kermeta_language_structure_UnresolvedProperty((org.kermeta.language.structure.UnresolvedProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.UnresolvedType) {
			result = interprete_org_kermeta_language_structure_UnresolvedType((org.kermeta.language.structure.UnresolvedType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Unresolved) {
			result = interprete_org_kermeta_language_structure_Unresolved((org.kermeta.language.structure.Unresolved) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.AbstractOperation) {
			result = interprete_org_kermeta_language_structure_AbstractOperation((org.kermeta.language.structure.AbstractOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Model) {
			result = interprete_org_kermeta_language_structure_Model((org.kermeta.language.structure.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.VirtualType) {
			result = interprete_org_kermeta_language_structure_VirtualType((org.kermeta.language.structure.VirtualType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ModelTypeVariable) {
			result = interprete_org_kermeta_language_structure_ModelTypeVariable((org.kermeta.language.structure.ModelTypeVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ModelType) {
			result = interprete_org_kermeta_language_structure_ModelType((org.kermeta.language.structure.ModelType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ObjectTypeVariable) {
			result = interprete_org_kermeta_language_structure_ObjectTypeVariable((org.kermeta.language.structure.ObjectTypeVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypeVariable) {
			result = interprete_org_kermeta_language_structure_TypeVariable((org.kermeta.language.structure.TypeVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ParameterizedType) {
			result = interprete_org_kermeta_language_structure_ParameterizedType((org.kermeta.language.structure.ParameterizedType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.GenericTypeDefinition) {
			result = interprete_org_kermeta_language_structure_GenericTypeDefinition((org.kermeta.language.structure.GenericTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Using) {
			result = interprete_org_kermeta_language_structure_Using((org.kermeta.language.structure.Using) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Require) {
			result = interprete_org_kermeta_language_structure_Require((org.kermeta.language.structure.Require) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ModelingUnit) {
			result = interprete_org_kermeta_language_structure_ModelingUnit((org.kermeta.language.structure.ModelingUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypeDefinitionContainer) {
			result = interprete_org_kermeta_language_structure_TypeDefinitionContainer((org.kermeta.language.structure.TypeDefinitionContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.ClassDefinition) {
			result = interprete_org_kermeta_language_structure_ClassDefinition((org.kermeta.language.structure.ClassDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Constraint) {
			result = interprete_org_kermeta_language_structure_Constraint((org.kermeta.language.structure.Constraint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.AbstractProperty) {
			result = interprete_org_kermeta_language_structure_AbstractProperty((org.kermeta.language.structure.AbstractProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Tag) {
			result = interprete_org_kermeta_language_structure_Tag((org.kermeta.language.structure.Tag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Parameter) {
			result = interprete_org_kermeta_language_structure_Parameter((org.kermeta.language.structure.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypedElement) {
			result = interprete_org_kermeta_language_structure_TypedElement((org.kermeta.language.structure.TypedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.PrimitiveType) {
			result = interprete_org_kermeta_language_structure_PrimitiveType((org.kermeta.language.structure.PrimitiveType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Package) {
			result = interprete_org_kermeta_language_structure_Package((org.kermeta.language.structure.Package) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Enumeration) {
			result = interprete_org_kermeta_language_structure_Enumeration((org.kermeta.language.structure.Enumeration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.DataType) {
			result = interprete_org_kermeta_language_structure_DataType((org.kermeta.language.structure.DataType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.EnumerationLiteral) {
			result = interprete_org_kermeta_language_structure_EnumerationLiteral((org.kermeta.language.structure.EnumerationLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.NamedElement) {
			result = interprete_org_kermeta_language_structure_NamedElement((org.kermeta.language.structure.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Class) {
			result = interprete_org_kermeta_language_structure_Class((org.kermeta.language.structure.Class) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypeDefinition) {
			result = interprete_org_kermeta_language_structure_TypeDefinition((org.kermeta.language.structure.TypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.MultiplicityElement) {
			result = interprete_org_kermeta_language_structure_MultiplicityElement((org.kermeta.language.structure.MultiplicityElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypeVariableBinding) {
			result = interprete_org_kermeta_language_structure_TypeVariableBinding((org.kermeta.language.structure.TypeVariableBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Type) {
			result = interprete_org_kermeta_language_structure_Type((org.kermeta.language.structure.Type) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Property) {
			result = interprete_org_kermeta_language_structure_Property((org.kermeta.language.structure.Property) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Operation) {
			result = interprete_org_kermeta_language_structure_Operation((org.kermeta.language.structure.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.TypeContainer) {
			result = interprete_org_kermeta_language_structure_TypeContainer((org.kermeta.language.structure.TypeContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.structure.Object) {
			result = interprete_org_kermeta_language_structure_Object((org.kermeta.language.structure.Object) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.language.DummyClass) {
			result = interprete_org_kermeta_language_DummyClass((org.kermeta.language.DummyClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.DummyClass) {
			result = interprete_org_kermeta_DummyClass((org.kermeta.DummyClass) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_kermeta_DummyClass(org.kermeta.DummyClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_DummyClass(org.kermeta.language.DummyClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Object(org.kermeta.language.structure.Object object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Operation(org.kermeta.language.structure.Operation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Property(org.kermeta.language.structure.Property object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Type(org.kermeta.language.structure.Type object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypeContainer(org.kermeta.language.structure.TypeContainer object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_EnumerationLiteral(org.kermeta.language.structure.EnumerationLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypeVariableBinding(org.kermeta.language.structure.TypeVariableBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_MultiplicityElement(org.kermeta.language.structure.MultiplicityElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypeDefinition(org.kermeta.language.structure.TypeDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Class(org.kermeta.language.structure.Class object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_DataType(org.kermeta.language.structure.DataType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Enumeration(org.kermeta.language.structure.Enumeration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_NamedElement(org.kermeta.language.structure.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Package(org.kermeta.language.structure.Package object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Parameter(org.kermeta.language.structure.Parameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_PrimitiveType(org.kermeta.language.structure.PrimitiveType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypedElement(org.kermeta.language.structure.TypedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Tag(org.kermeta.language.structure.Tag object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_AbstractProperty(org.kermeta.language.structure.AbstractProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Constraint(org.kermeta.language.structure.Constraint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ClassDefinition(org.kermeta.language.structure.ClassDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ModelingUnit(org.kermeta.language.structure.ModelingUnit object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypeDefinitionContainer(org.kermeta.language.structure.TypeDefinitionContainer object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Require(org.kermeta.language.structure.Require object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Using(org.kermeta.language.structure.Using object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_GenericTypeDefinition(org.kermeta.language.structure.GenericTypeDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ParameterizedType(org.kermeta.language.structure.ParameterizedType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_TypeVariable(org.kermeta.language.structure.TypeVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ObjectTypeVariable(org.kermeta.language.structure.ObjectTypeVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ModelType(org.kermeta.language.structure.ModelType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ModelTypeVariable(org.kermeta.language.structure.ModelTypeVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_VirtualType(org.kermeta.language.structure.VirtualType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Model(org.kermeta.language.structure.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_AbstractOperation(org.kermeta.language.structure.AbstractOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_UnresolvedType(org.kermeta.language.structure.UnresolvedType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_Unresolved(org.kermeta.language.structure.Unresolved object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_UnresolvedProperty(org.kermeta.language.structure.UnresolvedProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_UnresolvedOperation(org.kermeta.language.structure.UnresolvedOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_ProductType(org.kermeta.language.structure.ProductType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_FunctionType(org.kermeta.language.structure.FunctionType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_structure_VoidType(org.kermeta.language.structure.VoidType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Assignment(org.kermeta.language.behavior.Assignment object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Expression(org.kermeta.language.behavior.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallExpression(org.kermeta.language.behavior.CallExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Block(org.kermeta.language.behavior.Block object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallVariable(org.kermeta.language.behavior.CallVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallFeature(org.kermeta.language.behavior.CallFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallSuperOperation(org.kermeta.language.behavior.CallSuperOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallResult(org.kermeta.language.behavior.CallResult object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_CallValue(org.kermeta.language.behavior.CallValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Conditional(org.kermeta.language.behavior.Conditional object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Raise(org.kermeta.language.behavior.Raise object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Rescue(org.kermeta.language.behavior.Rescue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_TypeReference(org.kermeta.language.behavior.TypeReference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Literal(org.kermeta.language.behavior.Literal object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_EmptyExpression(org.kermeta.language.behavior.EmptyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_JavaStaticCall(org.kermeta.language.behavior.JavaStaticCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_LambdaExpression(org.kermeta.language.behavior.LambdaExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_LambdaParameter(org.kermeta.language.behavior.LambdaParameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_IntegerLiteral(org.kermeta.language.behavior.IntegerLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_StringLiteral(org.kermeta.language.behavior.StringLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_BooleanLiteral(org.kermeta.language.behavior.BooleanLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_TypeLiteral(org.kermeta.language.behavior.TypeLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_VoidLiteral(org.kermeta.language.behavior.VoidLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_Loop(org.kermeta.language.behavior.Loop object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_SelfExpression(org.kermeta.language.behavior.SelfExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_language_behavior_VariableDecl(org.kermeta.language.behavior.VariableDecl object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
