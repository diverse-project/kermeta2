//$Id:$
/*
 * This code has been generated to visit a kermeta model
 * Creation date: Fri Jun 18 17:02:02 CEST 2010
 * Template Created on feb. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
package fr.irisa.triskell.kermeta.visitor;
import java.util.Hashtable;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.behavior.VariableDecl;
public class KermetaOptimizedVisitor {
  /*final static public Logger internalLog = LoggerFactory
			.getLogger("KMT.model");*/
  /** The parent of the node currently visited. */
  protected org.kermeta.language.structure.Object parent;
	private static Hashtable<String,AcceptCommand> acceptCmds = null;
 
  public void setParent(org.kermeta.language.structure.Object parent) {
    this.parent = parent; }
 
  public org.kermeta.language.structure.Object getParent() {
    return parent; }
	private synchronized static AcceptCommand getAcceptCmd(EObject node) {
		if (acceptCmds == null) {
			acceptCmds = new Hashtable<String,AcceptCommand>();
			acceptCmds.put("Assignment",
					new AssignmentAcceptCommand());
			acceptCmds.put("Block",
					new BlockAcceptCommand());
			acceptCmds.put("CallVariable",
					new CallVariableAcceptCommand());
			acceptCmds.put("CallFeature",
					new CallFeatureAcceptCommand());
			acceptCmds.put("CallSuperOperation",
					new CallSuperOperationAcceptCommand());
			acceptCmds.put("CallResult",
					new CallResultAcceptCommand());
			acceptCmds.put("CallValue",
					new CallValueAcceptCommand());
			acceptCmds.put("Conditional",
					new ConditionalAcceptCommand());
			acceptCmds.put("Raise",
					new RaiseAcceptCommand());
			acceptCmds.put("Rescue",
					new RescueAcceptCommand());
			acceptCmds.put("TypeReference",
					new TypeReferenceAcceptCommand());
			acceptCmds.put("EmptyExpression",
					new EmptyExpressionAcceptCommand());
			acceptCmds.put("JavaStaticCall",
					new JavaStaticCallAcceptCommand());
			acceptCmds.put("LambdaExpression",
					new LambdaExpressionAcceptCommand());
			acceptCmds.put("LambdaParameter",
					new LambdaParameterAcceptCommand());
			acceptCmds.put("IntegerLiteral",
					new IntegerLiteralAcceptCommand());
			acceptCmds.put("StringLiteral",
					new StringLiteralAcceptCommand());
			acceptCmds.put("BooleanLiteral",
					new BooleanLiteralAcceptCommand());
			acceptCmds.put("TypeLiteral",
					new TypeLiteralAcceptCommand());
			acceptCmds.put("VoidLiteral",
					new VoidLiteralAcceptCommand());
			acceptCmds.put("Loop",
					new LoopAcceptCommand());
			acceptCmds.put("SelfExpression",
					new SelfExpressionAcceptCommand());
			acceptCmds.put("VariableDecl",
					new VariableDeclAcceptCommand());
			acceptCmds.put("Object",
					new ObjectAcceptCommand());
			acceptCmds.put("Operation",
					new OperationAcceptCommand());
			acceptCmds.put("Property",
					new PropertyAcceptCommand());
			acceptCmds.put("EnumerationLiteral",
					new EnumerationLiteralAcceptCommand());
			acceptCmds.put("TypeVariableBinding",
					new TypeVariableBindingAcceptCommand());
			acceptCmds.put("MultiplicityElement",
					new MultiplicityElementAcceptCommand());
			acceptCmds.put("TypeDefinition",
					new TypeDefinitionAcceptCommand());
			acceptCmds.put("Class",
					new ClassAcceptCommand());
			acceptCmds.put("Enumeration",
					new EnumerationAcceptCommand());
			acceptCmds.put("Package",
					new PackageAcceptCommand());
			acceptCmds.put("Parameter",
					new ParameterAcceptCommand());
			acceptCmds.put("PrimitiveType",
					new PrimitiveTypeAcceptCommand());
			acceptCmds.put("Tag",
					new TagAcceptCommand());
			acceptCmds.put("Constraint",
					new ConstraintAcceptCommand());
			acceptCmds.put("ClassDefinition",
					new ClassDefinitionAcceptCommand());
			acceptCmds.put("ModelingUnit",
					new ModelingUnitAcceptCommand());
			acceptCmds.put("TypeDefinitionContainer",
					new TypeDefinitionContainerAcceptCommand());
			acceptCmds.put("Require",
					new RequireAcceptCommand());
			acceptCmds.put("Using",
					new UsingAcceptCommand());
			acceptCmds.put("ObjectTypeVariable",
					new ObjectTypeVariableAcceptCommand());
			acceptCmds.put("ModelType",
					new ModelTypeAcceptCommand());
			acceptCmds.put("ModelTypeVariable",
					new ModelTypeVariableAcceptCommand());
			acceptCmds.put("VirtualType",
					new VirtualTypeAcceptCommand());
			acceptCmds.put("Model",
					new ModelAcceptCommand());
			acceptCmds.put("UnresolvedType",
					new UnresolvedTypeAcceptCommand());
			acceptCmds.put("UnresolvedProperty",
					new UnresolvedPropertyAcceptCommand());
			acceptCmds.put("UnresolvedOperation",
					new UnresolvedOperationAcceptCommand());
			acceptCmds.put("ProductType",
					new ProductTypeAcceptCommand());
			acceptCmds.put("FunctionType",
					new FunctionTypeAcceptCommand());
			acceptCmds.put("VoidType",
					new VoidTypeAcceptCommand());

		}
		return acceptCmds.get(node.eClass().getName());
	}
	// This is a generic visit method.
	public Object genericVisitChildren(EObject node) {
		Object result = null;
		Iterator<EObject> children = node.eContents().iterator();
		while (children.hasNext()) {
			EObject child = children.next();
			accept(child);
		}
		return result;
	}
	public Object accept(EObject node) {
		// Throw an error if the node is null
      if (node == null) {
          String msg = "Error in visitor: visited node is null";
          if (parent!=null) {
             msg += "   (when visiting parent\n    '" + parent.getClass().getName() + "'";
             if (parent instanceof NamedElement) 
                msg += "\n    parent's name: '" + ((NamedElement)parent).getName() + "')\n";
             else if (parent instanceof VariableDecl) 
                msg += "\n    parent's name (it's a variable): '" + ((VariableDecl)parent).getIdentifier() + "')\n";
          }
          throw new Error(msg);
		}
		// Get the accept command
		AcceptCommand cmd = getAcceptCmd(node);
		// Throw an error is the command is null
		if (cmd == null) {
         String msg = "Error in visitor : no strategy to handle node of type "
                 + node.getClass().getName();
         if (parent!=null) {
             msg += "   (when visiting parent '" + parent.getClass().getName() + "'";
             if (parent instanceof NamedElement) msg += " named: '" + ((NamedElement)parent).getName() + "')";
             else if (parent instanceof VariableDecl) msg += " named: '" + ((VariableDecl)parent).getIdentifier() + "')";
          }
         throw new Error(msg);
		}
		// accept the node
		return cmd.accept(node, this);
	}
		public Object visitAssignment(org.kermeta.language.behavior.Assignment node) {
	return genericVisitChildren(node);
	}

	public Object visitBlock(org.kermeta.language.behavior.Block node) {
	return genericVisitChildren(node);
	}

	public Object visitCallVariable(org.kermeta.language.behavior.CallVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitCallFeature(org.kermeta.language.behavior.CallFeature node) {
	return genericVisitChildren(node);
	}

	public Object visitCallSuperOperation(org.kermeta.language.behavior.CallSuperOperation node) {
	return genericVisitChildren(node);
	}

	public Object visitCallResult(org.kermeta.language.behavior.CallResult node) {
	return genericVisitChildren(node);
	}

	public Object visitCallValue(org.kermeta.language.behavior.CallValue node) {
	return genericVisitChildren(node);
	}

	public Object visitConditional(org.kermeta.language.behavior.Conditional node) {
	return genericVisitChildren(node);
	}

	public Object visitRaise(org.kermeta.language.behavior.Raise node) {
	return genericVisitChildren(node);
	}

	public Object visitRescue(org.kermeta.language.behavior.Rescue node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeReference(org.kermeta.language.behavior.TypeReference node) {
	return genericVisitChildren(node);
	}

	public Object visitEmptyExpression(org.kermeta.language.behavior.EmptyExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitJavaStaticCall(org.kermeta.language.behavior.JavaStaticCall node) {
	return genericVisitChildren(node);
	}

	public Object visitLambdaExpression(org.kermeta.language.behavior.LambdaExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitLambdaParameter(org.kermeta.language.behavior.LambdaParameter node) {
	return genericVisitChildren(node);
	}

	public Object visitIntegerLiteral(org.kermeta.language.behavior.IntegerLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitStringLiteral(org.kermeta.language.behavior.StringLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitBooleanLiteral(org.kermeta.language.behavior.BooleanLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeLiteral(org.kermeta.language.behavior.TypeLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitVoidLiteral(org.kermeta.language.behavior.VoidLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitLoop(org.kermeta.language.behavior.Loop node) {
	return genericVisitChildren(node);
	}

	public Object visitSelfExpression(org.kermeta.language.behavior.SelfExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitVariableDecl(org.kermeta.language.behavior.VariableDecl node) {
	return genericVisitChildren(node);
	}

	public Object visitObject(org.kermeta.language.structure.Object node) {
	return genericVisitChildren(node);
	}

	public Object visitOperation(org.kermeta.language.structure.Operation node) {
	return genericVisitChildren(node);
	}

	public Object visitProperty(org.kermeta.language.structure.Property node) {
	return genericVisitChildren(node);
	}

	public Object visitEnumerationLiteral(org.kermeta.language.structure.EnumerationLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeVariableBinding(org.kermeta.language.structure.TypeVariableBinding node) {
	return genericVisitChildren(node);
	}

	public Object visitMultiplicityElement(org.kermeta.language.structure.MultiplicityElement node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeDefinition(org.kermeta.language.structure.TypeDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visitClass(org.kermeta.language.structure.Class node) {
	return genericVisitChildren(node);
	}

	public Object visitEnumeration(org.kermeta.language.structure.Enumeration node) {
	return genericVisitChildren(node);
	}

	public Object visitPackage(org.kermeta.language.structure.Package node) {
	return genericVisitChildren(node);
	}

	public Object visitParameter(org.kermeta.language.structure.Parameter node) {
	return genericVisitChildren(node);
	}

	public Object visitPrimitiveType(org.kermeta.language.structure.PrimitiveType node) {
	return genericVisitChildren(node);
	}

	public Object visitTag(org.kermeta.language.structure.Tag node) {
	return genericVisitChildren(node);
	}

	public Object visitConstraint(org.kermeta.language.structure.Constraint node) {
	return genericVisitChildren(node);
	}

	public Object visitClassDefinition(org.kermeta.language.structure.ClassDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visitModelingUnit(org.kermeta.language.structure.ModelingUnit node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeDefinitionContainer(org.kermeta.language.structure.TypeDefinitionContainer node) {
	return genericVisitChildren(node);
	}

	public Object visitRequire(org.kermeta.language.structure.Require node) {
	return genericVisitChildren(node);
	}

	public Object visitUsing(org.kermeta.language.structure.Using node) {
	return genericVisitChildren(node);
	}

	public Object visitObjectTypeVariable(org.kermeta.language.structure.ObjectTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitModelType(org.kermeta.language.structure.ModelType node) {
	return genericVisitChildren(node);
	}

	public Object visitModelTypeVariable(org.kermeta.language.structure.ModelTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitVirtualType(org.kermeta.language.structure.VirtualType node) {
	return genericVisitChildren(node);
	}

	public Object visitModel(org.kermeta.language.structure.Model node) {
	return genericVisitChildren(node);
	}

	public Object visitUnresolvedType(org.kermeta.language.structure.UnresolvedType node) {
	return genericVisitChildren(node);
	}

	public Object visitUnresolvedProperty(org.kermeta.language.structure.UnresolvedProperty node) {
	return genericVisitChildren(node);
	}

	public Object visitUnresolvedOperation(org.kermeta.language.structure.UnresolvedOperation node) {
	return genericVisitChildren(node);
	}

	public Object visitProductType(org.kermeta.language.structure.ProductType node) {
	return genericVisitChildren(node);
	}

	public Object visitFunctionType(org.kermeta.language.structure.FunctionType node) {
	return genericVisitChildren(node);
	}

	public Object visitVoidType(org.kermeta.language.structure.VoidType node) {
	return genericVisitChildren(node);
	}


}
abstract class AcceptCommand {
	public abstract Object accept(EObject node, KermetaOptimizedVisitor visitor);
}
class AssignmentAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitAssignment((org.kermeta.language.behavior.Assignment) node);
	}
}
class BlockAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitBlock((org.kermeta.language.behavior.Block) node);
	}
}
class CallVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallVariable((org.kermeta.language.behavior.CallVariable) node);
	}
}
class CallFeatureAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallFeature((org.kermeta.language.behavior.CallFeature) node);
	}
}
class CallSuperOperationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallSuperOperation((org.kermeta.language.behavior.CallSuperOperation) node);
	}
}
class CallResultAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallResult((org.kermeta.language.behavior.CallResult) node);
	}
}
class CallValueAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallValue((org.kermeta.language.behavior.CallValue) node);
	}
}
class ConditionalAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitConditional((org.kermeta.language.behavior.Conditional) node);
	}
}
class RaiseAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRaise((org.kermeta.language.behavior.Raise) node);
	}
}
class RescueAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRescue((org.kermeta.language.behavior.Rescue) node);
	}
}
class TypeReferenceAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeReference((org.kermeta.language.behavior.TypeReference) node);
	}
}
class EmptyExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEmptyExpression((org.kermeta.language.behavior.EmptyExpression) node);
	}
}
class JavaStaticCallAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitJavaStaticCall((org.kermeta.language.behavior.JavaStaticCall) node);
	}
}
class LambdaExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLambdaExpression((org.kermeta.language.behavior.LambdaExpression) node);
	}
}
class LambdaParameterAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLambdaParameter((org.kermeta.language.behavior.LambdaParameter) node);
	}
}
class IntegerLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitIntegerLiteral((org.kermeta.language.behavior.IntegerLiteral) node);
	}
}
class StringLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitStringLiteral((org.kermeta.language.behavior.StringLiteral) node);
	}
}
class BooleanLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitBooleanLiteral((org.kermeta.language.behavior.BooleanLiteral) node);
	}
}
class TypeLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeLiteral((org.kermeta.language.behavior.TypeLiteral) node);
	}
}
class VoidLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVoidLiteral((org.kermeta.language.behavior.VoidLiteral) node);
	}
}
class LoopAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLoop((org.kermeta.language.behavior.Loop) node);
	}
}
class SelfExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitSelfExpression((org.kermeta.language.behavior.SelfExpression) node);
	}
}
class VariableDeclAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVariableDecl((org.kermeta.language.behavior.VariableDecl) node);
	}
}
class ObjectAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitObject((org.kermeta.language.structure.Object) node);
	}
}
class OperationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitOperation((org.kermeta.language.structure.Operation) node);
	}
}
class PropertyAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitProperty((org.kermeta.language.structure.Property) node);
	}
}
class EnumerationLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEnumerationLiteral((org.kermeta.language.structure.EnumerationLiteral) node);
	}
}
class TypeVariableBindingAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeVariableBinding((org.kermeta.language.structure.TypeVariableBinding) node);
	}
}
class MultiplicityElementAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitMultiplicityElement((org.kermeta.language.structure.MultiplicityElement) node);
	}
}
class TypeDefinitionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeDefinition((org.kermeta.language.structure.TypeDefinition) node);
	}
}
class ClassAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitClass((org.kermeta.language.structure.Class) node);
	}
}
class EnumerationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEnumeration((org.kermeta.language.structure.Enumeration) node);
	}
}
class PackageAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitPackage((org.kermeta.language.structure.Package) node);
	}
}
class ParameterAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitParameter((org.kermeta.language.structure.Parameter) node);
	}
}
class PrimitiveTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitPrimitiveType((org.kermeta.language.structure.PrimitiveType) node);
	}
}
class TagAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTag((org.kermeta.language.structure.Tag) node);
	}
}
class ConstraintAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitConstraint((org.kermeta.language.structure.Constraint) node);
	}
}
class ClassDefinitionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitClassDefinition((org.kermeta.language.structure.ClassDefinition) node);
	}
}
class ModelingUnitAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelingUnit((org.kermeta.language.structure.ModelingUnit) node);
	}
}
class TypeDefinitionContainerAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeDefinitionContainer((org.kermeta.language.structure.TypeDefinitionContainer) node);
	}
}
class RequireAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRequire((org.kermeta.language.structure.Require) node);
	}
}
class UsingAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitUsing((org.kermeta.language.structure.Using) node);
	}
}
class ObjectTypeVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitObjectTypeVariable((org.kermeta.language.structure.ObjectTypeVariable) node);
	}
}
class ModelTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelType((org.kermeta.language.structure.ModelType) node);
	}
}
class ModelTypeVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelTypeVariable((org.kermeta.language.structure.ModelTypeVariable) node);
	}
}
class VirtualTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVirtualType((org.kermeta.language.structure.VirtualType) node);
	}
}
class ModelAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModel((org.kermeta.language.structure.Model) node);
	}
}
class UnresolvedTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitUnresolvedType((org.kermeta.language.structure.UnresolvedType) node);
	}
}
class UnresolvedPropertyAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitUnresolvedProperty((org.kermeta.language.structure.UnresolvedProperty) node);
	}
}
class UnresolvedOperationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitUnresolvedOperation((org.kermeta.language.structure.UnresolvedOperation) node);
	}
}
class ProductTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitProductType((org.kermeta.language.structure.ProductType) node);
	}
}
class FunctionTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitFunctionType((org.kermeta.language.structure.FunctionType) node);
	}
}
class VoidTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVoidType((org.kermeta.language.structure.VoidType) node);
	}
}

