/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaPrinter implements org.kermeta.language.emftexteditor.IKermetaTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected org.kermeta.language.emftexteditor.IKermetaTokenResolverFactory tokenResolverFactory = new org.kermeta.language.emftexteditor.mopp.KermetaTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private org.kermeta.language.emftexteditor.IKermetaTextResource resource;
	private java.util.Map<?, ?> options;
	
	public KermetaPrinter(java.io.OutputStream outputStream, org.kermeta.language.emftexteditor.IKermetaTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<java.lang.String, java.lang.Integer> featureCounter, java.util.Collection<java.lang.String> needed){
		int pos = 0;
		int neg = 0;
		
		for(java.lang.String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, java.lang.String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.kermeta.language.structure.ModelingUnit) {
			print_org_kermeta_language_structure_ModelingUnit((org.kermeta.language.structure.ModelingUnit) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Using) {
			print_org_kermeta_language_structure_Using((org.kermeta.language.structure.Using) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Require) {
			print_org_kermeta_language_structure_Require((org.kermeta.language.structure.Require) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Package) {
			print_org_kermeta_language_structure_Package((org.kermeta.language.structure.Package) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.ClassDefinition) {
			print_org_kermeta_language_structure_ClassDefinition((org.kermeta.language.structure.ClassDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Property) {
			print_org_kermeta_language_structure_Property((org.kermeta.language.structure.Property) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Operation) {
			print_org_kermeta_language_structure_Operation((org.kermeta.language.structure.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Parameter) {
			print_org_kermeta_language_structure_Parameter((org.kermeta.language.structure.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Class) {
			print_org_kermeta_language_structure_Class((org.kermeta.language.structure.Class) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Enumeration) {
			print_org_kermeta_language_structure_Enumeration((org.kermeta.language.structure.Enumeration) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.EnumerationLiteral) {
			print_org_kermeta_language_structure_EnumerationLiteral((org.kermeta.language.structure.EnumerationLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Constraint) {
			print_org_kermeta_language_structure_Constraint((org.kermeta.language.structure.Constraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Model) {
			print_org_kermeta_language_structure_Model((org.kermeta.language.structure.Model) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.ModelType) {
			print_org_kermeta_language_structure_ModelType((org.kermeta.language.structure.ModelType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.TypeVariableBinding) {
			print_org_kermeta_language_structure_TypeVariableBinding((org.kermeta.language.structure.TypeVariableBinding) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.PrimitiveType) {
			print_org_kermeta_language_structure_PrimitiveType((org.kermeta.language.structure.PrimitiveType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Tag) {
			print_org_kermeta_language_structure_Tag((org.kermeta.language.structure.Tag) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.ModelTypeVariable) {
			print_org_kermeta_language_structure_ModelTypeVariable((org.kermeta.language.structure.ModelTypeVariable) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.VirtualType) {
			print_org_kermeta_language_structure_VirtualType((org.kermeta.language.structure.VirtualType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.ProductType) {
			print_org_kermeta_language_structure_ProductType((org.kermeta.language.structure.ProductType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.FunctionType) {
			print_org_kermeta_language_structure_FunctionType((org.kermeta.language.structure.FunctionType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.VoidType) {
			print_org_kermeta_language_structure_VoidType((org.kermeta.language.structure.VoidType) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Block) {
			print_org_kermeta_language_behavior_Block((org.kermeta.language.behavior.Block) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Rescue) {
			print_org_kermeta_language_behavior_Rescue((org.kermeta.language.behavior.Rescue) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.TypeReference) {
			print_org_kermeta_language_behavior_TypeReference((org.kermeta.language.behavior.TypeReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Raise) {
			print_org_kermeta_language_behavior_Raise((org.kermeta.language.behavior.Raise) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.BooleanLiteral) {
			print_org_kermeta_language_behavior_BooleanLiteral((org.kermeta.language.behavior.BooleanLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.IntegerLiteral) {
			print_org_kermeta_language_behavior_IntegerLiteral((org.kermeta.language.behavior.IntegerLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.StringLiteral) {
			print_org_kermeta_language_behavior_StringLiteral((org.kermeta.language.behavior.StringLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Conditional) {
			print_org_kermeta_language_behavior_Conditional((org.kermeta.language.behavior.Conditional) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Loop) {
			print_org_kermeta_language_behavior_Loop((org.kermeta.language.behavior.Loop) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.VariableDecl) {
			print_org_kermeta_language_behavior_VariableDecl((org.kermeta.language.behavior.VariableDecl) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.TypeLiteral) {
			print_org_kermeta_language_behavior_TypeLiteral((org.kermeta.language.behavior.TypeLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.CallResult) {
			print_org_kermeta_language_behavior_CallResult((org.kermeta.language.behavior.CallResult) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.CallSuperOperation) {
			print_org_kermeta_language_behavior_CallSuperOperation((org.kermeta.language.behavior.CallSuperOperation) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.Assignment) {
			print_org_kermeta_language_behavior_Assignment((org.kermeta.language.behavior.Assignment) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.CallVariable) {
			print_org_kermeta_language_behavior_CallVariable((org.kermeta.language.behavior.CallVariable) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.SelfExpression) {
			print_org_kermeta_language_behavior_SelfExpression((org.kermeta.language.behavior.SelfExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.CallFeature) {
			print_org_kermeta_language_behavior_CallFeature((org.kermeta.language.behavior.CallFeature) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.CallValue) {
			print_org_kermeta_language_behavior_CallValue((org.kermeta.language.behavior.CallValue) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.EmptyExpression) {
			print_org_kermeta_language_behavior_EmptyExpression((org.kermeta.language.behavior.EmptyExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.JavaStaticCall) {
			print_org_kermeta_language_behavior_JavaStaticCall((org.kermeta.language.behavior.JavaStaticCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.LambdaExpression) {
			print_org_kermeta_language_behavior_LambdaExpression((org.kermeta.language.behavior.LambdaExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.LambdaParameter) {
			print_org_kermeta_language_behavior_LambdaParameter((org.kermeta.language.behavior.LambdaParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.behavior.VoidLiteral) {
			print_org_kermeta_language_behavior_VoidLiteral((org.kermeta.language.behavior.VoidLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.MultiplicityElement) {
			print_org_kermeta_language_structure_MultiplicityElement((org.kermeta.language.structure.MultiplicityElement) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.TypeDefinition) {
			print_org_kermeta_language_structure_TypeDefinition((org.kermeta.language.structure.TypeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.ObjectTypeVariable) {
			print_org_kermeta_language_structure_ObjectTypeVariable((org.kermeta.language.structure.ObjectTypeVariable) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.language.structure.Object) {
			print_org_kermeta_language_structure_Object((org.kermeta.language.structure.Object) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.kermeta.language.emftexteditor.mopp.KermetaReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.language.emftexteditor.mopp.KermetaReferenceResolverSwitch) new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kermeta.language.emftexteditor.IKermetaTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kermeta.language.emftexteditor.mopp.KermetaProblem(errorMessage, org.kermeta.language.emftexteditor.KermetaEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_kermeta_language_structure_ModelingUnit(org.kermeta.language.structure.ModelingUnit element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__PACKAGES));
		printCountingMap.put("packages", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__REQUIRES));
		printCountingMap.put("requires", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__USINGS));
		printCountingMap.put("usings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX));
		printCountingMap.put("namespacePrefix", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ModelingUnit_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ModelingUnit_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ModelingUnit_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_structure_ModelingUnit_0(org.kermeta.language.structure.ModelingUnit element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("requires");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__REQUIRES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requires", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_ModelingUnit_1(org.kermeta.language.structure.ModelingUnit element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("usings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__USINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("usings", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_ModelingUnit_2(org.kermeta.language.structure.ModelingUnit element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("packages");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODELING_UNIT__PACKAGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("packages", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Using(org.kermeta.language.structure.Using element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__QUALIFIED_NAME));
		printCountingMap.put("qualifiedName", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("using");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_structure_Using_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_structure_Using_0(org.kermeta.language.structure.Using element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifiedName"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"qualifiedName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("qualifiedName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__QUALIFIED_NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__QUALIFIED_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("qualifiedName", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
			count = printCountingMap.get("qualifiedName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__QUALIFIED_NAME));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.USING__QUALIFIED_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("qualifiedName", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_Require(org.kermeta.language.structure.Require element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.REQUIRE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.REQUIRE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.REQUIRE__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("require");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.REQUIRE__URI));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.REQUIRE__URI), element));
				out.print(" ");
			}
			printCountingMap.put("uri", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_org_kermeta_language_structure_Package(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION));
		printCountingMap.put("ownedTypeDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTED_PACKAGE));
		printCountingMap.put("nestedPackage", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTING_PACKAGE));
		printCountingMap.put("nestingPackage", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTypeDefinition"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_language_structure_Package_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_language_structure_Package_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_language_structure_Package_0(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("package");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Package_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_Package_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_structure_Package_0_0(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("nestingPackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTING_PACKAGE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPackageNestingPackageReferenceResolver().deResolve((org.kermeta.language.structure.Package) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTING_PACKAGE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTING_PACKAGE), element));
			}
			printCountingMap.put("nestingPackage", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_Package_0_1(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTypeDefinition"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTypeDefinition"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("{");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_language_structure_Package_0_1_1(element, localtab, out, printCountingMap);
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_structure_Package_0_1_1(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (LineBreak):
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("}");
				out.print(" ");
			}
			break;
			case 2:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("{");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_structure_Package_0_1_2(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (LineBreak):
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("}");
				out.print(" ");
			}
			break;
			default:			boolean iterate = true;
			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_language_structure_Package_0_1_0(element, localtab, out, printCountingMap);
			iterate = true;
			while (iterate) {
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_structure_Package_0_1_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					iterate = false;
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
			}
			//////////////DEFINITION PART BEGINS (LineBreak):
			out.println();
			out.print(localtab);
		}
	}
	public void print_org_kermeta_language_structure_Package_0_1_0(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedTypeDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTypeDefinition", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Package_0_1_1(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedTypeDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTypeDefinition", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Package_0_1_2(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("nestedPackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__NESTED_PACKAGE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nestedPackage", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Package_1(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_structure_Package_1_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Package_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_structure_Package_1_0(org.kermeta.language.structure.Package element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedTypeDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTypeDefinition", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_ClassDefinition(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(11);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__IS_ASPECT));
		printCountingMap.put("isAspect", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER));
		printCountingMap.put("typeParameter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__INV));
		printCountingMap.put("inv", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__IS_ABSTRACT));
		printCountingMap.put("isAbstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE));
		printCountingMap.put("ownedAttribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__OWNED_OPERATION));
		printCountingMap.put("ownedOperation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE));
		printCountingMap.put("superType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_ClassDefinition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_ClassDefinition_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("class");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_ClassDefinition_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ClassDefinition_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ClassDefinition_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ClassDefinition_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_structure_ClassDefinition_0(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("aspect");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ClassDefinition_1(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("abstract");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ClassDefinition_2(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("inherits");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("superType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassDefinitionSuperTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("superType", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ClassDefinition_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_structure_ClassDefinition_2_0(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("superType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassDefinitionSuperTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__SUPER_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("superType", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_ClassDefinition_3(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("inv");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__INV));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("inv", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_ClassDefinition_4(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedAttribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedAttribute", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_ClassDefinition_5(org.kermeta.language.structure.ClassDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedOperation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS_DEFINITION__OWNED_OPERATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedOperation", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Property(org.kermeta.language.structure.Property element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(20);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_ORDERED));
		printCountingMap.put("isOrdered", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_UNIQUE));
		printCountingMap.put("isUnique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__GETTER_BODY));
		printCountingMap.put("getterBody", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__SETTER_BODY));
		printCountingMap.put("setterBody", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_GETTER_ABSTRACT));
		printCountingMap.put("isGetterAbstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_SETTER_ABSTRACT));
		printCountingMap.put("isSetterAbstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__OWNING_CLASS));
		printCountingMap.put("owningClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__OPPOSITE));
		printCountingMap.put("opposite", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_READ_ONLY));
		printCountingMap.put("isReadOnly", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__DEFAULT));
		printCountingMap.put("default", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_COMPOSITE));
		printCountingMap.put("isComposite", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_DERIVED));
		printCountingMap.put("isDerived", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__IS_ID));
		printCountingMap.put("isID", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_structure_Property_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_language_structure_Property_0(org.kermeta.language.structure.Property element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		,
		"getterBody"		,
		"setterBody"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("property");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_structure_Property_0_2(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("getterBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__GETTER_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("getterBody", count - 1);
				}
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("setterBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__SETTER_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("setterBody", count - 1);
				}
			}
			break;
			default:			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_language_structure_Property_0_0(element, localtab, out, printCountingMap);
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__NAME));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Property_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_structure_Property_0_0(org.kermeta.language.structure.Property element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("reference");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("attribute");
			out.print(" ");
		}
	}
	public void print_org_kermeta_language_structure_Property_0_1(org.kermeta.language.structure.Property element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Property_0_2(org.kermeta.language.structure.Property element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PROPERTY__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Operation(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(18);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__IS_ORDERED));
		printCountingMap.put("isOrdered", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__IS_UNIQUE));
		printCountingMap.put("isUnique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__SUPER_OPERATION));
		printCountingMap.put("superOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__PRE));
		printCountingMap.put("pre", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__POST));
		printCountingMap.put("post", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__IS_ABSTRACT));
		printCountingMap.put("isAbstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__OWNING_CLASS));
		printCountingMap.put("owningClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE_PARAMETER));
		printCountingMap.put("typeParameter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__RAISED_EXCEPTION));
		printCountingMap.put("raisedException", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__OWNED_PARAMETER));
		printCountingMap.put("ownedParameter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("pre");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__PRE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("pre",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("post");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__POST));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("post",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("operation");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_Operation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("is");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_structure_Operation_2(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_language_structure_Operation_0(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedParameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__OWNED_PARAMETER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedParameter", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_Operation_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Operation_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_structure_Operation_0_0(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Operation_0_1(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedParameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__OWNED_PARAMETER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedParameter", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_structure_Operation_0_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_language_structure_Operation_0_1_0(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Operation_1(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	public void print_org_kermeta_language_structure_Operation_2(org.kermeta.language.structure.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"body"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("abstract");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("body");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OPERATION__BODY));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("body", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_Parameter(org.kermeta.language.structure.Parameter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(10);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__IS_ORDERED));
		printCountingMap.put("isOrdered", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__IS_UNIQUE));
		printCountingMap.put("isUnique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PARAMETER__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Class(org.kermeta.language.structure.Class element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(11);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_PARAM_BINDING));
		printCountingMap.put("typeParamBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_DEFINITION));
		printCountingMap.put("typeDefinition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__VIRTUAL_TYPE_BINDING));
		printCountingMap.put("virtualTypeBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__OWNED_ATTRIBUTE));
		printCountingMap.put("ownedAttribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__OWNED_OPERATION));
		printCountingMap.put("ownedOperation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__SUPER_CLASS));
		printCountingMap.put("superClass", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__IS_ABSTRACT));
		printCountingMap.put("isAbstract", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("typeDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_DEFINITION));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterizedTypeTypeDefinitionReferenceResolver().deResolve((org.kermeta.language.structure.GenericTypeDefinition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_DEFINITION)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CLASS__TYPE_DEFINITION), element));
				out.print(" ");
			}
			printCountingMap.put("typeDefinition", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Enumeration(org.kermeta.language.structure.Enumeration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__IS_ASPECT));
		printCountingMap.put("isAspect", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__OWNED_LITERAL));
		printCountingMap.put("ownedLiteral", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("enumeration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_structure_Enumeration_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_structure_Enumeration_0(org.kermeta.language.structure.Enumeration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedLiteral");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__OWNED_LITERAL));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedLiteral", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Enumeration_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_structure_Enumeration_0_0(org.kermeta.language.structure.Enumeration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ownedLiteral");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION__OWNED_LITERAL));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedLiteral", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_kermeta_language_structure_EnumerationLiteral(org.kermeta.language.structure.EnumerationLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__ENUMERATION));
		printCountingMap.put("enumeration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.ENUMERATION_LITERAL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Constraint(org.kermeta.language.structure.Constraint element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__STEREOTYPE));
		printCountingMap.put("stereotype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__LANGUAGE));
		printCountingMap.put("language", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__INV_OWNER));
		printCountingMap.put("invOwner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__PRE_OWNER));
		printCountingMap.put("preOwner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__POST_OWNER));
		printCountingMap.put("postOwner", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("stereotype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__STEREOTYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__STEREOTYPE), element));
				out.print(" ");
			}
			printCountingMap.put("stereotype", count - 1);
		}
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("language");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__LANGUAGE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.CONSTRAINT__LANGUAGE), element));
				out.print(" ");
			}
			printCountingMap.put("language", count - 1);
		}
	}
	
	public void print_org_kermeta_language_structure_Object(org.kermeta.language.structure.Object element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Object");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Object_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_Object_0(org.kermeta.language.structure.Object element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_Model(org.kermeta.language.structure.Model element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__CONTENTS));
		printCountingMap.put("contents", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Model");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Model_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_Model_0(org.kermeta.language.structure.Model element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_ModelType(org.kermeta.language.structure.ModelType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__IS_ASPECT));
		printCountingMap.put("isAspect", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION));
		printCountingMap.put("includedTypeDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("isAspect");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__IS_ASPECT));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__IS_ASPECT), element));
				out.print(" ");
			}
			printCountingMap.put("isAspect", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ModelType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ModelType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ModelType_0(org.kermeta.language.structure.ModelType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"includedTypeDefinition"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("includedTypeDefinition");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("includedTypeDefinition");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getModelTypeIncludedTypeDefinitionReferenceResolver().deResolve((org.kermeta.language.structure.TypeDefinition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION), element));
						out.print(" ");
					}
					printCountingMap.put("includedTypeDefinition", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_TypeVariableBinding(org.kermeta.language.structure.TypeVariableBinding element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("TypeVariableBinding");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_TypeVariableBinding_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_TypeVariableBinding_0(org.kermeta.language.structure.TypeVariableBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"variable"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("variable");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("variable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__VARIABLE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeVariableBindingVariableReferenceResolver().deResolve((org.kermeta.language.structure.TypeVariable) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__VARIABLE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__VARIABLE), element));
						out.print(" ");
					}
					printCountingMap.put("variable", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("type");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeVariableBindingTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_VARIABLE_BINDING__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_MultiplicityElement(org.kermeta.language.structure.MultiplicityElement element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED));
		printCountingMap.put("isOrdered", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE));
		printCountingMap.put("isUnique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("isOrdered");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED), element));
				out.print(" ");
			}
			printCountingMap.put("isOrdered", count - 1);
		}
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("isUnique");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE), element));
				out.print(" ");
			}
			printCountingMap.put("isUnique", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("MultiplicityElement");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_MultiplicityElement_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_MultiplicityElement_0(org.kermeta.language.structure.MultiplicityElement element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lower"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"upper"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("type");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("lower");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("lower");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__LOWER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__LOWER), element));
						out.print(" ");
					}
					printCountingMap.put("lower", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("upper");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("upper");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__UPPER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__UPPER), element));
						out.print(" ");
					}
					printCountingMap.put("upper", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MULTIPLICITY_ELEMENT__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_TypeDefinition(org.kermeta.language.structure.TypeDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__IS_ASPECT));
		printCountingMap.put("isAspect", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("isAspect");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__IS_ASPECT));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__IS_ASPECT), element));
				out.print(" ");
			}
			printCountingMap.put("isAspect", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("TypeDefinition");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_TypeDefinition_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_TypeDefinition_0(org.kermeta.language.structure.TypeDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TYPE_DEFINITION__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_PrimitiveType(org.kermeta.language.structure.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__IS_ASPECT));
		printCountingMap.put("isAspect", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE));
		printCountingMap.put("instanceType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("isAspect");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__IS_ASPECT));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__IS_ASPECT), element));
				out.print(" ");
			}
			printCountingMap.put("isAspect", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("PrimitiveType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_PrimitiveType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_PrimitiveType_0(org.kermeta.language.structure.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instanceType"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("instanceType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("instanceType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPrimitiveTypeInstanceTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("instanceType", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRIMITIVE_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_Tag(org.kermeta.language.structure.Tag element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OBJECT));
		printCountingMap.put("object", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Tag");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_Tag_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_Tag_0(org.kermeta.language.structure.Tag element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"object"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("value");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__VALUE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__VALUE), element));
						out.print(" ");
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("object");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("object");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OBJECT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTagObjectReferenceResolver().deResolve((org.kermeta.language.structure.Object) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OBJECT)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__OBJECT), element));
						out.print(" ");
					}
					printCountingMap.put("object", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.TAG__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_ObjectTypeVariable(org.kermeta.language.structure.ObjectTypeVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE));
		printCountingMap.put("supertype", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectTypeVariable");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ObjectTypeVariable_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ObjectTypeVariable_0(org.kermeta.language.structure.ObjectTypeVariable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"supertype"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("supertype");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("supertype");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeVariableSupertypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE), element));
						out.print(" ");
					}
					printCountingMap.put("supertype", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.OBJECT_TYPE_VARIABLE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_ModelTypeVariable(org.kermeta.language.structure.ModelTypeVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE));
		printCountingMap.put("supertype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE));
		printCountingMap.put("virtualType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ModelTypeVariable");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ModelTypeVariable_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ModelTypeVariable_0(org.kermeta.language.structure.ModelTypeVariable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"supertype"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"virtualType"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("supertype");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("supertype");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeVariableSupertypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE), element));
						out.print(" ");
					}
					printCountingMap.put("supertype", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("virtualType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("virtualType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("virtualType", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.MODEL_TYPE_VARIABLE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_VirtualType(org.kermeta.language.structure.VirtualType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__SUPERTYPE));
		printCountingMap.put("supertype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION));
		printCountingMap.put("classDefinition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__MODEL_TYPE));
		printCountingMap.put("modelType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING));
		printCountingMap.put("typeParamBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("VirtualType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_VirtualType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_VirtualType_0(org.kermeta.language.structure.VirtualType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"supertype"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"classDefinition"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"modelType"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeParamBinding"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("supertype");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("supertype");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__SUPERTYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeVariableSupertypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__SUPERTYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__SUPERTYPE), element));
						out.print(" ");
					}
					printCountingMap.put("supertype", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("classDefinition");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("classDefinition");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualTypeClassDefinitionReferenceResolver().deResolve((org.kermeta.language.structure.ClassDefinition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION), element));
						out.print(" ");
					}
					printCountingMap.put("classDefinition", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("modelType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("modelType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__MODEL_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualTypeModelTypeReferenceResolver().deResolve((org.kermeta.language.structure.ModelTypeVariable) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__MODEL_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__MODEL_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("modelType", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeParamBinding");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("typeParamBinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("typeParamBinding", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VIRTUAL_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_ProductType(org.kermeta.language.structure.ProductType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ProductType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_ProductType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_ProductType_0(org.kermeta.language.structure.ProductType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("type");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProductTypeTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.PRODUCT_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_FunctionType(org.kermeta.language.structure.FunctionType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("FunctionType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_FunctionType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_FunctionType_0(org.kermeta.language.structure.FunctionType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"left"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"right"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("left");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("left");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__LEFT));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionTypeLeftReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__LEFT)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__LEFT), element));
						out.print(" ");
					}
					printCountingMap.put("left", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("right");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("right");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__RIGHT));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionTypeRightReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__RIGHT)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__RIGHT), element));
						out.print(" ");
					}
					printCountingMap.put("right", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.FUNCTION_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_structure_VoidType(org.kermeta.language.structure.VoidType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TYPE_CONTAINER));
		printCountingMap.put("typeContainer", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("VoidType");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_structure_VoidType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_structure_VoidType_0(org.kermeta.language.structure.VoidType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"typeContainer"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("typeContainer");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("typeContainer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TYPE_CONTAINER));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeTypeContainerReferenceResolver().deResolve((org.kermeta.language.structure.TypeContainer) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TYPE_CONTAINER)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TYPE_CONTAINER), element));
						out.print(" ");
					}
					printCountingMap.put("typeContainer", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.structure.StructurePackage.VOID_TYPE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_Block(org.kermeta.language.behavior.Block element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__RESCUE_BLOCK));
		printCountingMap.put("rescueBlock", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("do");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_Block_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_Block_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("end");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_Block_0(org.kermeta.language.behavior.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 9;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"statement"		));
		if (tempMatchCount > matches) {
			alt = 10;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 9:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			case 10:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("statement");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("statement", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("statement");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__STATEMENT));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("statement", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_Block_1(org.kermeta.language.behavior.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rescueBlock");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BLOCK__RESCUE_BLOCK));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rescueBlock", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_Rescue(org.kermeta.language.behavior.Rescue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__BODY));
		printCountingMap.put("body", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__EXCEPTION_TYPE));
		printCountingMap.put("exceptionType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__EXCEPTION_NAME));
		printCountingMap.put("exceptionName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("rescue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_Rescue_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_Rescue_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_behavior_Rescue_0(org.kermeta.language.behavior.Rescue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("exceptionName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__EXCEPTION_NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__EXCEPTION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("exceptionName", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("exceptionType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__EXCEPTION_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exceptionType", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_Rescue_1(org.kermeta.language.behavior.Rescue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RESCUE__BODY));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_TypeReference(org.kermeta.language.behavior.TypeReference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__IS_ORDERED));
		printCountingMap.put("isOrdered", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__IS_UNIQUE));
		printCountingMap.put("isUnique", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__TYPE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_REFERENCE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_Raise(org.kermeta.language.behavior.Raise element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("raise");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.RAISE__EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_BooleanLiteral(org.kermeta.language.behavior.BooleanLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__VALUE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEAN");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.BOOLEAN_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_IntegerLiteral(org.kermeta.language.behavior.IntegerLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__VALUE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.INTEGER_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_StringLiteral(org.kermeta.language.behavior.StringLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__VALUE));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.STRING_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_Conditional(org.kermeta.language.behavior.Conditional element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
		printCountingMap.put("thenBody", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
		printCountingMap.put("elseBody", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("if");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Conditional_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("then");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Conditional_1(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_Conditional_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("end");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_Conditional_0(org.kermeta.language.behavior.Conditional element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"condition"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"condition"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("condition");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__CONDITION));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("condition", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("condition");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__CONDITION));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("condition", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_Conditional_1(org.kermeta.language.behavior.Conditional element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"thenBody"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("thenBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("thenBody", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("thenBody");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__THEN_BODY));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("thenBody", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_Conditional_2(org.kermeta.language.behavior.Conditional element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"elseBody"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("elseBody");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("elseBody", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("else");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("elseBody");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CONDITIONAL__ELSE_BODY));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("elseBody", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_Loop(org.kermeta.language.behavior.Loop element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__INITIALIZATION));
		printCountingMap.put("initialization", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__STOP_CONDITION));
		printCountingMap.put("stopCondition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("from");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_Loop_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("until");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("stopCondition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__STOP_CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("stopCondition", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_Loop_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_language_behavior_Loop_0(org.kermeta.language.behavior.Loop element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("initialization");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__INITIALIZATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initialization", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_Loop_1(org.kermeta.language.behavior.Loop element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("loop");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Loop_1_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_language_behavior_Loop_1_0(org.kermeta.language.behavior.Loop element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LOOP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_VariableDecl(org.kermeta.language.behavior.VariableDecl element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__INITIALIZATION));
		printCountingMap.put("initialization", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__IDENTIFIER));
		printCountingMap.put("identifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("var");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("identifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__IDENTIFIER));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__IDENTIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("identifier", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_VariableDecl_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_language_behavior_VariableDecl_0(org.kermeta.language.behavior.VariableDecl element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("init");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("initialization");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VARIABLE_DECL__INITIALIZATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initialization", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_TypeLiteral(org.kermeta.language.behavior.TypeLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__TYPEREF));
		printCountingMap.put("typeref", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("typeref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.TYPE_LITERAL__TYPEREF));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("typeref", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_CallResult(org.kermeta.language.behavior.CallResult element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__STATIC_TYPE_VARIABLE_BINDINGS));
		printCountingMap.put("staticTypeVariableBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_RESULT__IS_ATPRE));
		printCountingMap.put("isAtpre", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("result");
		out.print(" ");
	}
	
	public void print_org_kermeta_language_behavior_CallSuperOperation(org.kermeta.language.behavior.CallSuperOperation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__STATIC_TYPE_VARIABLE_BINDINGS));
		printCountingMap.put("staticTypeVariableBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("super(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_language_behavior_CallSuperOperation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_CallSuperOperation_0(org.kermeta.language.behavior.CallSuperOperation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallSuperOperation_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallSuperOperation_0_0(org.kermeta.language.behavior.CallSuperOperation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_SUPER_OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_Assignment(org.kermeta.language.behavior.Assignment element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__IS_CAST));
		printCountingMap.put("isCast", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Assignment_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_language_behavior_Assignment_0(org.kermeta.language.behavior.Assignment element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Assignment_0_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Assignment_0_1(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_Assignment_0_2(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_language_behavior_Assignment_0_0(org.kermeta.language.behavior.Assignment element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("target");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__TARGET));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("target", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_Assignment_0_1(org.kermeta.language.behavior.Assignment element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"isCast"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("isCast");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__IS_CAST));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("CASTED");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__IS_CAST), element));
						out.print(" ");
					}
					printCountingMap.put("isCast", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":=");
			out.print(" ");
		}
	}
	public void print_org_kermeta_language_behavior_Assignment_0_2(org.kermeta.language.behavior.Assignment element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 9;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			case 9:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.ASSIGNMENT__VALUE));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_CallVariable(org.kermeta.language.behavior.CallVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS));
		printCountingMap.put("staticTypeVariableBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__IS_ATPRE));
		printCountingMap.put("isAtpre", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__NAME));
			if (o != null) {
				org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VARIABLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_kermeta_language_behavior_SelfExpression(org.kermeta.language.behavior.SelfExpression element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.SELF_EXPRESSION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.SELF_EXPRESSION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.SELF_EXPRESSION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.SELF_EXPRESSION__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("self");
		out.print(" ");
	}
	
	public void print_org_kermeta_language_behavior_CallFeature(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(12);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS));
		printCountingMap.put("staticTypeVariableBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY));
		printCountingMap.put("staticProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
		printCountingMap.put("staticOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL));
		printCountingMap.put("staticEnumLiteral", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__IS_ATPRE));
		printCountingMap.put("isAtpre", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		,
		"parameters"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		,
		"parameters"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_language_behavior_CallFeature_2(element, localtab, out, printCountingMap);
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_3(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("==");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("parameters");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("parameters", count - 1);
				}
			}
			break;
			case 2:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_language_behavior_CallFeature_4(element, localtab, out, printCountingMap);
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_5(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_6(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("(");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_language_behavior_CallFeature_7(element, localtab, out, printCountingMap);
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_8(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_9(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(")");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_language_behavior_CallFeature_10(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			default:			boolean iterate = true;
			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("(");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_language_behavior_CallFeature_0(element, localtab, out, printCountingMap);
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			iterate = true;
			while (iterate) {
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_behavior_CallFeature_1(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					iterate = false;
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
			}
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("==");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("parameters");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("parameters", count - 1);
			}
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(")");
			out.print(" ");
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("target");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("target", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_1(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticEnumLiteral"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("(");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_behavior_CallFeature_1_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(")");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticEnumLiteral");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticEnumLiteralReferenceResolver().deResolve((org.kermeta.language.structure.EnumerationLiteral) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL), element));
						out.print(" ");
					}
					printCountingMap.put("staticEnumLiteral", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print(".");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("staticProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticPropertyReferenceResolver().deResolve((org.kermeta.language.structure.Property) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY), element));
					out.print(" ");
				}
				printCountingMap.put("staticProperty", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_1_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallFeature_1_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_1_0_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_2(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("target");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("target", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_3(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticEnumLiteral"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("(");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_behavior_CallFeature_3_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(")");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticEnumLiteral");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticEnumLiteralReferenceResolver().deResolve((org.kermeta.language.structure.EnumerationLiteral) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL), element));
						out.print(" ");
					}
					printCountingMap.put("staticEnumLiteral", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print(".");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("staticProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticPropertyReferenceResolver().deResolve((org.kermeta.language.structure.Property) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY), element));
					out.print(" ");
				}
				printCountingMap.put("staticProperty", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_3_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallFeature_3_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_3_0_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_4(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("target");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("target", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_5(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticEnumLiteral"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("(");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_behavior_CallFeature_5_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(")");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticEnumLiteral");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticEnumLiteralReferenceResolver().deResolve((org.kermeta.language.structure.EnumerationLiteral) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL), element));
						out.print(" ");
					}
					printCountingMap.put("staticEnumLiteral", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print(".");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("staticProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticPropertyReferenceResolver().deResolve((org.kermeta.language.structure.Property) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY), element));
					out.print(" ");
				}
				printCountingMap.put("staticProperty", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_5_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallFeature_5_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_5_0_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_6(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_CallFeature_6_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_6_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("-");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("/");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("*");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("+");
			out.print(" ");
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_7(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("target");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("target", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("target");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__TARGET));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("target", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_8(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticEnumLiteral"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticOperation"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("(");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_kermeta_language_behavior_CallFeature_8_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(")");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticEnumLiteral");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticEnumLiteralReferenceResolver().deResolve((org.kermeta.language.structure.EnumerationLiteral) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL), element));
						out.print(" ");
					}
					printCountingMap.put("staticEnumLiteral", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(".");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticOperation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticOperationReferenceResolver().deResolve((org.kermeta.language.structure.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_OPERATION), element));
						out.print(" ");
					}
					printCountingMap.put("staticOperation", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print(".");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("staticProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY));
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallFeatureStaticPropertyReferenceResolver().deResolve((org.kermeta.language.structure.Property) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY), element));
					out.print(" ");
				}
				printCountingMap.put("staticProperty", count - 1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_8_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallFeature_8_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_8_0_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_9(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_CallFeature_9_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_9_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("-");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("/");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("*");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("+");
			out.print(" ");
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_10(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_language_behavior_CallFeature_10_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_FEATURE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	public void print_org_kermeta_language_behavior_CallFeature_10_0(org.kermeta.language.behavior.CallFeature element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("-");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("/");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("*");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("+");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_language_behavior_CallValue(org.kermeta.language.behavior.CallValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE_VARIABLE_BINDINGS));
		printCountingMap.put("staticTypeVariableBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("CallValue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_CallValue_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_CallValue_0(org.kermeta.language.behavior.CallValue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticType"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"parameters"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticTypeVariableBindings"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("staticType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExpressionStaticTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("staticType", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("parameters");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("parameters");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__PARAMETERS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("parameters", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("staticTypeVariableBindings");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticTypeVariableBindings");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE_VARIABLE_BINDINGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCallExpressionStaticTypeVariableBindingsReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE_VARIABLE_BINDINGS)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__STATIC_TYPE_VARIABLE_BINDINGS), element));
						out.print(" ");
					}
					printCountingMap.put("staticTypeVariableBindings", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.CALL_VALUE__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_EmptyExpression(org.kermeta.language.behavior.EmptyExpression element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EmptyExpression");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_EmptyExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_EmptyExpression_0(org.kermeta.language.behavior.EmptyExpression element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticType"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("staticType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExpressionStaticTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("staticType", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.EMPTY_EXPRESSION__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_JavaStaticCall(org.kermeta.language.behavior.JavaStaticCall element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JCLASS));
		printCountingMap.put("jclass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JMETHOD));
		printCountingMap.put("jmethod", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("JavaStaticCall");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_JavaStaticCall_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_JavaStaticCall_0(org.kermeta.language.behavior.JavaStaticCall element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticType"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"parameters"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"jclass"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"jmethod"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("staticType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExpressionStaticTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("staticType", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("parameters");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("parameters");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("parameters", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("jclass");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("jclass");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JCLASS));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JCLASS), element));
						out.print(" ");
					}
					printCountingMap.put("jclass", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("jmethod");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("jmethod");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JMETHOD));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__JMETHOD), element));
						out.print(" ");
					}
					printCountingMap.put("jmethod", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.JAVA_STATIC_CALL__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_LambdaExpression(org.kermeta.language.behavior.LambdaExpression element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("LambdaExpression");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_LambdaExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_LambdaExpression_0(org.kermeta.language.behavior.LambdaExpression element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"containedType"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"staticType"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"parameters"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"body"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("containedType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("containedType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__CONTAINED_TYPE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("containedType", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("staticType");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("staticType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__STATIC_TYPE));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExpressionStaticTypeReferenceResolver().deResolve((org.kermeta.language.structure.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__STATIC_TYPE)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__STATIC_TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("staticType", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("parameters");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("parameters");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("parameters", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("body");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("body");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__BODY));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("body", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_EXPRESSION__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_LambdaParameter(org.kermeta.language.behavior.LambdaParameter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("LambdaParameter");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_language_behavior_LambdaParameter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_language_behavior_LambdaParameter_0(org.kermeta.language.behavior.LambdaParameter element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"tag"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedTags"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ownedTags");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("ownedTags");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__OWNED_TAGS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedTags", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__NAME));
					if (o != null) {
						org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("type");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print(":");
				out.print(" ");
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TYPE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("tag");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print(":");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("tag");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TAG));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTagReferenceResolver().deResolve((org.kermeta.language.structure.Tag) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TAG)), element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.LAMBDA_PARAMETER__TAG), element));
					out.print(" ");
				}
				printCountingMap.put("tag", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_language_behavior_VoidLiteral(org.kermeta.language.behavior.VoidLiteral element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VOID_LITERAL__TAG));
		printCountingMap.put("tag", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VOID_LITERAL__OWNED_TAGS));
		printCountingMap.put("ownedTags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VOID_LITERAL__CONTAINED_TYPE));
		printCountingMap.put("containedType", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.language.behavior.BehaviorPackage.VOID_LITERAL__STATIC_TYPE));
		printCountingMap.put("staticType", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Void");
		out.print(" ");
	}
	
}
