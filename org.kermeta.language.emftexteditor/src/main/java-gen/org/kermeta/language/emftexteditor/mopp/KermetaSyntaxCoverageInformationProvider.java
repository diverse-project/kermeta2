/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelingUnit(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getUsing(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getRequire(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getPackage(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getClassDefinition(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getProperty(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getOperation(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getParameter(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getClass_(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getEnumeration(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getEnumerationLiteral(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getConstraint(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getPrimitiveType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getUnresolvedType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getVoidType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getObject(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModel(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypeVariableBinding(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getMultiplicityElement(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getTypeDefinition(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getTag(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getObjectTypeVariable(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelTypeVariable(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getVirtualType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getProductType(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getFunctionType(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getBlock(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getRescue(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getTypeReference(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getRaise(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getBooleanLiteral(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getIntegerLiteral(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getStringLiteral(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getConditional(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getLoop(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getVariableDecl(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getTypeLiteral(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallResult(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallSuperOperation(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getAssignment(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallVariable(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getSelfExpression(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallFeature(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getJavaStaticCall(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getVoidLiteral(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getCallValue(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getEmptyExpression(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getLambdaExpression(),
			org.kermeta.language.behavior.BehaviorPackage.eINSTANCE.getLambdaParameter(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelingUnit(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModel(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getMultiplicityElement(),
		};
	}
	
}
