package org.kermeta.language.texteditor.eclipse.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.ui.IFileEditorInput;
import org.kermeta.language.behavior.Assignment;
import org.kermeta.language.behavior.Block;
import org.kermeta.language.behavior.CallOperation;
import org.kermeta.language.behavior.Conditional;
import org.kermeta.language.behavior.Expression;
import org.kermeta.language.behavior.LambdaExpression;
import org.kermeta.language.behavior.LambdaParameter;
import org.kermeta.language.behavior.Loop;
import org.kermeta.language.behavior.Rescue;
import org.kermeta.language.behavior.VariableDecl;
import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.util.ModelingUnit;

public class KermetaModelAccessor {

	/*
	 * Model representing the current kmt file.
	 */
	ModelingUnit currentModelingUnit = null;
	/*
	 * current kmt file.
	 */
	KermetaEditor currentKermetaEditor;
	

	protected boolean needUpdate = true;

	/*
	 * Association of model elements with their bounds in the current edited kmt
	 * file.
	 */
	HashMap<KermetaModelElement, Position> mappingElemPos = null;

	public void setEditor(KermetaEditor newEditor) {
		currentKermetaEditor = newEditor;
	}

	

	/*
	 * Generate positions markers from traceability_text_reference tags of the
	 * ModelingUnit
	 */
	public void setSourceModelingUnit(ModelingUnit aModelingUnit) {
		if (currentModelingUnit != aModelingUnit) {
			currentModelingUnit = aModelingUnit;
			needUpdate = true;
		}
	}

	/**
	 * conditional update, will be done only if required
	 */
	protected void updateAccessorForDocument() {
		if (needUpdate) {
			IDocument currentIDocument = currentKermetaEditor.getDocumentProvider().getDocument(currentKermetaEditor.getEditorInput());
			if (mappingElemPos == null) {
				currentIDocument.addPositionCategory("KermetaModel");
				currentIDocument.addPositionUpdater(new DefaultPositionUpdater(
						"KermetaModel"));
			} else {
				try {
					currentIDocument.removePositionCategory("KermetaModel"); // delete all Positions
					currentIDocument.addPositionCategory("KermetaModel");
				} catch (BadPositionCategoryException e) {
					Activator.getDefault().getMessaggingSystem().error(e.getMessage(), "autocompletion", e);
				}
			}

			mappingElemPos = new HashMap<KermetaModelElement, Position>();
			List<EObject> content = getBestModelingUnit().getAllMetamodelsContents();
			for (EObject obj : content) {
				// TODO possible optimization : drill down in the model into Package and classes of this file only (ie. avoid doing instanceof and string processing for elements not in this document)
				if (obj instanceof Tag) {
					Tag tag = (Tag) obj;

					if (tag.getName().equals("traceability_text_reference")) {
						String[] val = tag.getValue().split(";");
						if (    val.length == 3 &&
								val[0].equals(((IFileEditorInput)currentKermetaEditor.getEditorInput()).getFile().getLocationURI().toString())) {
							int begin = Integer.parseInt(val[1]);
							int end = Integer.parseInt(val[2]);

							Position pos = new Position(begin, end - begin
									+ 1);
							KermetaModelElement elem = (KermetaModelElement)tag.eContainer();
							mappingElemPos.put(elem, pos);

							//if (elem instanceof Conditional) {
							//	System.out.println("debug");
							//}

							try {
								currentIDocument.addPosition("KermetaModel", pos);
							} catch (BadLocationException e) {
								Activator.getDefault().getMessaggingSystem().error(e.getMessage(), "autocompletion", e);
							} catch (BadPositionCategoryException e) {
								Activator.getDefault().getMessaggingSystem().error(e.getMessage(), "autocompletion", e);
							}
						}
					}
				}
			}
		}
		needUpdate = false;
	}

	/**
	 * 
	 * @return the best ModelingUnit for the document, the latest version in
	 *         memory or will search for existing compiled km model files
	 */
	protected ModelingUnit getBestModelingUnit() {
		if (currentModelingUnit != null) {
			return currentModelingUnit;
		} else if (currentKermetaEditor != null) {
			// try to load km file that may have been built before
			setSourceModelingUnit(currentKermetaEditor.loadPrecompiledKMForFile());
			return currentModelingUnit;
		} else {
			return null;
		}
	}

	// -------------------------------------------------------------------------------------------------------
	// GET A PACKAGE
	// -------------------------------------------------------------------------------------------------------
	/*
	 * Search a package in metamodels of the modelingUnits.
	 * 
	 * Note: if two metamodels have a package which match @packageToFind, the
	 * first found is returned
	 * 
	 * @packageToFind Full name of the package wanted. (ie:
	 * "rootPack::subPack::subPack")
	 */
	public Package getNamedPackage(String packageToFind) {
		updateAccessorForDocument();
		String[] temp = packageToFind.split("::");

		List<Metamodel> mms = getBestModelingUnit().getMetamodels();
		for (Metamodel mm : mms) {
			List<Package> packs = mm.getPackages();
			for (Package p : packs) {
				Package result = deepSearchPackage(temp, 0, p);
				if (result != null)
					return result;
			}
		}

		return null;
	}

	/*
	 * Recursive function which search the wanted package in the nestedPackage
	 * tree
	 * 
	 * @names The package full name. names[i] is a sub package of names[i-1]
	 * 
	 * @pos The current position in names[]
	 * 
	 * @currentPackage Package which match names[pos]
	 */
	private Package deepSearchPackage(String[] names, int pos,
			Package currentPackage) {

		// End case
		if (pos == names.length - 1) {
			if (currentPackage.getName().equals(names[names.length - 1]))
				return currentPackage;
			else
				return null;
		}

		List<Package> nestedPacks = currentPackage.getNestedPackage();
		for (Package nextPackage : nestedPacks) {
			if (nextPackage.getName().equals(names[pos + 1]))
				return deepSearchPackage(names, pos + 1, nextPackage);
		}

		return null;
	}

	// -------------------------------------------------------------------------------------------------------
	// WHERE IS THE CURSOR IN THE MODEL
	// -------------------------------------------------------------------------------------------------------
	/*
	 * Find the closest package where the cursor is.
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 */
	public Package currentOffsetPackage(String fileUrl, int documentOffset) {
		updateAccessorForDocument();
		Package result = null;

		List<Metamodel> mms = getBestModelingUnit().getMetamodels();
		for (Metamodel mm : mms) {
			List<Package> packs = mm.getPackages();
			for (Package p : packs) {
				result = findClosestPackage(fileUrl, documentOffset, p);
				if (result != null)
					return result;
			}
		}

		return result;
	}

	/*
	 * Search for the deeper package which contain the offset
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @pack The current package inspected
	 */
	private Package findClosestPackage(String fileUrl, int documentOffset,
			Package pack) {

		Package result = null;

		if (containsThisOffset(fileUrl, documentOffset, pack)) {
			for (Package currentPackage : pack.getNestedPackage()) {
				result = findClosestPackage(fileUrl, documentOffset,
						currentPackage);
				if (result != null)
					return result;
			}
			result = pack;
		}

		return result;
	}

	/*
	 * Look at the traceability tag of the package
	 */
	public boolean containsThisOffset(String fileUrl, int documentOffset,
			KermetaModelElement elem) {
		updateAccessorForDocument();
		
		Position pos = mappingElemPos.get(elem);
		if(pos != null){
			// only elements in this file have a mappingElemPos
			int begin = pos.offset;
			int end = pos.offset + pos.length - 1;
			if ( begin <= documentOffset
					&& documentOffset <= end) {
				return true;
			}
		}		
		return false;
	}

	public int getBeginOffset(KermetaModelElement elem) {
		updateAccessorForDocument();
		Position pos = mappingElemPos.get(elem);
		if (pos != null)
			return pos.offset;

		return 0;
	}

	/*
	 * Return the class definition from a package where there is the cursor.
	 */
	private ClassDefinition getClosestClass(String fileUrl, int documentOffset,
			Package pack) {
		for (TypeDefinition typeDef : pack.getOwnedTypeDefinition()) {

			if (typeDef instanceof ClassDefinition) {

				if (containsThisOffset(fileUrl, documentOffset,
						(ClassDefinition) typeDef))
					return (ClassDefinition) typeDef;

			}

		}
		return null;
	}

	/*
	 * Return the operation from a class definition where there is the cursor.
	 */
	private Operation getClosestOperation(String fileUrl, int documentOffset,
			ClassDefinition classDef) {
		for (Operation op : classDef.getOwnedOperation()) {

			if (containsThisOffset(fileUrl, documentOffset, op))
				return op;

		}
		return null;
	}

	// -------------------------------------------------------------------------------------------------------
	// TYPE OF THE FIRST ELEMENT
	// -------------------------------------------------------------------------------------------------------

	/*
	 * The first element of the call is a variable, an operation parameter or a
	 * class attribute
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition getVariableType(String fileUrl, int documentOffset,
			String name) {

		Package pack = currentOffsetPackage(fileUrl, documentOffset);
		ClassDefinition classDef = getClosestClass(fileUrl, documentOffset,
				pack);
		Operation operation = getClosestOperation(fileUrl, documentOffset,
				classDef);

		// TODO:Search in variable declaration of the body
		TypeDefinition td = lookingExpr(fileUrl, documentOffset, name,
				operation.getBody());
		if (td != null)
			return td;

		// Search in operation parameters
		if (operation != null) {
			List<Parameter> params = operation.getOwnedParameter();
			for (Parameter p : params) {

				if (p.getName().equals(name)) {

					if (p.getType() instanceof Class)
						return ((Class) (p.getType())).getTypeDefinition();
				}

			}
		}
		// Search in class attributes
		if (classDef != null) {
			List<Property> properties = classDef.getOwnedAttribute();
			for (Property prop : properties) {

				if (prop.getName().equals(name)) {

					if (prop.getType() instanceof Class)
						return ((Class) (prop.getType())).getTypeDefinition();

				}

			}
		}

		// TODO:Search for a singleton class

		return null;
	}

	/*
	 * Search for a variable declaration in an expression typed Block
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingBlock(String fileUrl, int documentOffset,
			String name, Block currentBlock) {

		EList<Expression> statments = currentBlock.getStatement();
		// TODO: Statements are in the right order ?

		for (Expression currentExpr : statments) {

			if (!containsThisOffset(fileUrl, documentOffset, currentExpr)) {

				if (currentExpr instanceof VariableDecl) {

					VariableDecl varDecl = (VariableDecl) currentExpr;
					if (varDecl.getIdentifier().equals(name)) {

						Type typeVarDecl = varDecl.getType().getType();
						if (typeVarDecl instanceof Class) {

							return ((Class) typeVarDecl).getTypeDefinition();

						}
					}
				}
			} else {
				return lookingExpr(fileUrl, documentOffset, name, currentExpr);
			}
		}

		for (Rescue currentRescue : currentBlock.getRescueBlock()) {
			if (containsThisOffset(fileUrl, documentOffset, currentRescue))
				return lookingRescue(fileUrl, documentOffset, name,
						currentRescue);
		}

		return null;
	}

	private TypeDefinition lookingRescue(String fileUrl, int documentOffset,
			String name, Rescue currentRescue) {

		if (currentRescue.getExceptionName().equals(name)) {
			Type ty = currentRescue.getExceptionType().getType();
			if (ty instanceof Class)
				return ((Class) ty).getTypeDefinition();
		} else {
			for (Expression currentExpr : currentRescue.getBody()) {

				if (!containsThisOffset(fileUrl, documentOffset, currentExpr)) {

					if (currentExpr instanceof VariableDecl) {

						VariableDecl varDecl = (VariableDecl) currentExpr;
						if (varDecl.getIdentifier().equals(name)) {

							Type typeVarDecl = varDecl.getType().getType();
							if (typeVarDecl instanceof Class) {

								return ((Class) typeVarDecl)
										.getTypeDefinition();

							}
						}
					}
				} else {
					return lookingExpr(fileUrl, documentOffset, name,
							currentExpr);
				}
			}
		}

		return null;
	}

	/*
	 * Search for a variable declaration in an expression typed Conditional
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingIf(String fileUrl, int documentOffset,
			String name, Conditional currentConditional) {

		if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getThenBody())) {
			return lookingExpr(fileUrl, documentOffset, name,
					currentConditional.getThenBody());
		} else if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getElseBody())) {
			return lookingExpr(fileUrl, documentOffset, name,
					currentConditional.getElseBody());
		} else if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getCondition())) {
			return lookingExpr(fileUrl, documentOffset, name,
					currentConditional.getCondition());
		}

		return null;
	}

	/*
	 * Search for a variable declaration in an expression typed LamdaExpression
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingLamdaExpr(String fileUrl, int documentOffset,
			String name, LambdaExpression currentLambdaExpr) {

		EList<LambdaParameter> params = currentLambdaExpr.getParameters();
		for (LambdaParameter p : params) {
			if (p.getName().equals(name)) {

				Type ty = p.getType().getType();
				if (ty instanceof Class)
					return ((Class) ty).getTypeDefinition();

			}
		}

		if (containsThisOffset(fileUrl, documentOffset,
				currentLambdaExpr.getBody())) {

			return lookingExpr(fileUrl, documentOffset, name,
					currentLambdaExpr.getBody());

		}

		return null;
	}

	/*
	 * Search for a variable declaration in an expression typed Loop
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingLoop(String fileUrl, int documentOffset,
			String name, Loop currentLoop) {

		if (currentLoop.getInitialization() instanceof VariableDecl) {
			VariableDecl varDecl = (VariableDecl) currentLoop
					.getInitialization();
			if (varDecl.getIdentifier().equals(name)) {

				Type typeVarDecl = varDecl.getType().getType();
				if (typeVarDecl instanceof Class) {

					return ((Class) typeVarDecl).getTypeDefinition();

				}
			}
		}

		if (containsThisOffset(fileUrl, documentOffset, currentLoop.getBody())) {
			return lookingExpr(fileUrl, documentOffset, name,
					currentLoop.getBody());
		}

		return null;
	}

	/*
	 * Search for a variable declaration in the right part of a variable
	 * declaration expression
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingVarDecl(String fileUrl, int documentOffset,
			String name, VariableDecl currentVarDecl) {

		if (containsThisOffset(fileUrl, documentOffset,
				currentVarDecl.getInitialization())) {

			return lookingExpr(fileUrl, documentOffset, name,
					currentVarDecl.getInitialization());

		}

		return null;
	}

	/*
	 * Search for a variable declaration in the right part of an assignment
	 * expression
	 * 
	 * @fileUrl Name of the current edited file
	 * 
	 * @documentOffset Position of the cursor in the file
	 * 
	 * @name The name of the variable wanted
	 */
	private TypeDefinition lookingAssignment(String fileUrl,
			int documentOffset, String name, Assignment currentAssign) {

		if (containsThisOffset(fileUrl, documentOffset,
				currentAssign.getValue())) {

			return lookingExpr(fileUrl, documentOffset, name,
					currentAssign.getValue());

		}

		return null;
	}

	private TypeDefinition lookingCallOperation(String fileUrl,
			int documentOffset, String name, CallOperation currentCallOp) {

		for (Expression currentExpr : currentCallOp.getParameters()) {

			if (containsThisOffset(fileUrl, documentOffset, currentExpr)) {

				return lookingExpr(fileUrl, documentOffset, name, currentExpr);
			}
		}

		return null;
	}

	private TypeDefinition lookingExpr(String fileUrl, int documentOffset,
			String name, Expression currentExpr) {

		if (currentExpr instanceof Block) {
			return lookingBlock(fileUrl, documentOffset, name,
					(Block) currentExpr);
		} else if (currentExpr instanceof Loop) {
			return lookingLoop(fileUrl, documentOffset, name,
					(Loop) currentExpr);
		} else if (currentExpr instanceof Conditional) {
			return lookingIf(fileUrl, documentOffset, name,
					(Conditional) currentExpr);
		} else if (currentExpr instanceof LambdaExpression) {
			return lookingLamdaExpr(fileUrl, documentOffset, name,
					(LambdaExpression) currentExpr);
		} else if (currentExpr instanceof VariableDecl) {
			return lookingVarDecl(fileUrl, documentOffset, name,
					(VariableDecl) currentExpr);
		} else if (currentExpr instanceof Assignment) {
			return lookingAssignment(fileUrl, documentOffset, name,
					(Assignment) currentExpr);
		} else if (currentExpr instanceof CallOperation) {
			return lookingCallOperation(fileUrl, documentOffset, name,
					(CallOperation) currentExpr);
		}

		return null;
	}

	// -------------------------------------------------------------------------------------------------------
	// NAVIGATION WITH PROPERTIES AND OPERATIONS CALLS
	// -------------------------------------------------------------------------------------------------------
	/*
	 * Search for an attribute in currentType and get his type
	 * 
	 * @currentType The class watched
	 * 
	 * @opName The name of the attribute wanted
	 */
	public TypeDefinition getAttributeType(TypeDefinition currentType,
			String attName) {
		updateAccessorForDocument();
		if (currentType instanceof ClassDefinition) {

			List<Property> properties = ((ClassDefinition) currentType)
					.getOwnedAttribute();
			for (Property prop : properties) {

				if (prop.getName().equals(attName)) {

					if (prop.getType() instanceof Class)
						return ((Class) (prop.getType())).getTypeDefinition();

				}

			}

		}
		return null;
	}

	/*
	 * Search for an operation in currentType and get his return type
	 * 
	 * @currentType The class watched
	 * 
	 * @opName The name of the wanted operation
	 * 
	 * @nbArgs Number of arguments of the wanted operation
	 */
	public TypeDefinition getOperationType(TypeDefinition currentType,
			String opName, int nbArgs) {
		updateAccessorForDocument();
		if (currentType instanceof ClassDefinition) {

			List<Operation> operations = ((ClassDefinition) currentType)
					.getOwnedOperation();
			for (Operation op : operations) {

				if (op.getName().equals(opName)) {

					if (op.getOwnedParameter().size() == nbArgs) {

						if (op.getType() instanceof Class)
							return ((Class) (op.getType())).getTypeDefinition();

					}

				}

			}

		}
		return null;
	}

	// -------------------------------------------------------------------------------------------------------
	// ENTRY POINT
	// -------------------------------------------------------------------------------------------------------

	/*
	 * Get the return type of the call expression before the dot.
	 * 
	 * @callChain The tokens from the begin of the line to the offset
	 */
	public TypeDefinition getCallType(String fileUrl, int documentOffset,
			List<IKToken> callChain) {
		updateAccessorForDocument();
		int pos = 0; // current position in callChain

		// -----------------------------------------
		// Find the begin of the call in the line
		// -----------------------------------------
		pos = findBeginOfCall(callChain);

		// -----------------------------------------
		// Determine the type of the first element
		// -----------------------------------------
		TypeDefinition firstType = null;

		// "self." at the begin
		if (callChain.get(pos).getClass().getSimpleName().equals("Keyword")
				&& callChain.get(pos).toString().equals("self")) {

			if (callChain.get(pos + 1).getClass().getSimpleName()
					.equals("Delimiter")
					&& callChain.get(pos + 1).toString().equals(".")) {

				Package pack = currentOffsetPackage(fileUrl, documentOffset);
				firstType = getClosestClass(fileUrl, documentOffset, pack);
				pos = pos + 2;
			}
		} else {
			// Intended : Identifier, Delimiter "(", Something, Delimiter ")",
			// Delimiter "."
			// or Identifier, Delimiter "."
			if (callChain.get(pos).getClass().getSimpleName()
					.equals("Identifier")) {

				if (callChain.get(pos + 1).getClass().getSimpleName()
						.equals("Delimiter")) {

					if (callChain.get(pos + 1).toString().equals(".")) {

						firstType = getVariableType(fileUrl, documentOffset,
								callChain.get(pos).toString());
						pos = pos + 2;

					} else if (callChain.get(pos + 1).toString().equals("(")) {

						int endParenthese = endOfOperation(callChain, pos + 1);
						int nbArgs = countArgs(callChain, pos + 1,
								endParenthese);
						if (endParenthese != -1
								&& callChain.get(endParenthese + 1).toString()
										.equals(".")) {

							Package pack = currentOffsetPackage(fileUrl,
									documentOffset);
							ClassDefinition closestClassDef = getClosestClass(
									fileUrl, documentOffset, pack);

							firstType = getOperationType(closestClassDef,
									callChain.get(pos).toString(), nbArgs);
							pos = endParenthese + 2;

						}
					}
				}
			}
		}

		// -----------------------------------------
		// Then navigate in the calls
		// -----------------------------------------
		if (firstType != null) {

			TypeDefinition currentElem = firstType;

			while (pos + 1 < callChain.size()) {

				if (callChain.get(pos).getClass().getSimpleName()
						.equals("Identifier")) {

					if (callChain.get(pos + 1).getClass().getSimpleName()
							.equals("Delimiter")) {

						if (callChain.get(pos + 1).toString().equals(".")) {

							currentElem = getAttributeType(currentElem,
									callChain.get(pos).toString());
							pos = pos + 2;

						} else if (callChain.get(pos + 1).toString()
								.equals("(")) {

							int endParenthese = endOfOperation(callChain,
									pos + 1);
							int nbArgs = countArgs(callChain, pos + 1,
									endParenthese);
							if (endParenthese != -1
									&& callChain.get(endParenthese + 1)
											.toString().equals(".")) {

								currentElem = getOperationType(currentElem,
										callChain.get(pos).toString(), nbArgs);
								pos = endParenthese + 2;

							}
						}
					}
				}
			}
			return currentElem;
		}

		return null;
	}

	/*
	 * Find the position of the first element of the call in the list of tokens
	 */
	private int findBeginOfCall(List<IKToken> callChain) {
		int i = callChain.size() - 1;
		if (callChain.get(i).toString().equals(".")) {
			i--;
		}
		while (i - 1 > 0) {

			if (callChain.get(i).toString().equals(")")) {
				int count = 1; // Number of opened parentheses
				i--;
				while (count > 0 && i > 0) {
					if (callChain.get(i).toString().equals(")"))
						count++;
					else if (callChain.get(i).toString().equals("("))
						count--;
					i--;
				}
			} else if (callChain.get(i).getClass().getSimpleName()
					.equals("Identifier")) {
				if (callChain.get(i - 1).toString().equals(".")) {
					i = i - 2;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return i;
	}

	/*
	 * Return the end parenthese position of the current operation Return -1 if
	 * syntaxe error
	 * 
	 * @begin The position of the opening parentheses
	 */
	private int endOfOperation(List<IKToken> callChain, int begin) {

		int count = 1; // count opened parentheses
		int pos = begin;
		while (pos + 1 < callChain.size() && count > 0) {
			pos++;

			if (callChain.get(pos).toString().equals("("))
				count++;
			else if (callChain.get(pos).toString().equals(")"))
				count--;

		}

		if (count != 0)
			return -1;
		return pos;
	}

	/*
	 * Return the number of argument between two parentheses
	 * 
	 * @begin Position of the first parenthese
	 * 
	 * @end Position of the last parenthese
	 */
	private int countArgs(List<IKToken> callChain, int begin, int end) {

		if (begin == end - 1)
			return 0; // no arguments

		int res = 1;
		int depth = 0; // count opened parentheses

		for (int i = begin + 1; i < end; i++) {

			if (callChain.get(i).toString().equals("("))
				depth++;
			else if (callChain.get(i).toString().equals(")"))
				depth--;
			else if (callChain.get(i).toString().equals(",") && depth == 0)
				res++;
		}

		return res;

	}

	// -------------------------------------------------------------------------------------------------------
	// PROPOSALS FOR LOCAL VARIABLES
	// -------------------------------------------------------------------------------------------------------

	/*
	 * Get class attributes, operation parameters and local variables
	 * declarations Format result is "variableName:variableType"
	 */
	public List<String> getAccessibleVariable(String fileUrl, int documentOffset) {
		updateAccessorForDocument();
		List<String> result = new ArrayList<String>();

		Package currentPack = currentOffsetPackage(fileUrl, documentOffset);
		ClassDefinition currentClass = getClosestClass(fileUrl, documentOffset,
				currentPack);
		Operation operation = getClosestOperation(fileUrl, documentOffset,
				currentClass);

		for (Property prop : currentClass.getOwnedAttribute()) {
			Type type = prop.getType();
			String propType = extractTypeName(type);
			result.add(prop.getName() + ":" + propType);
		}

		for (Parameter param : operation.getOwnedParameter()) {
			Type type = param.getType();
			String paramType = extractTypeName(type);
			result.add(param.getName() + ":" + paramType);
		}

		getLocalVariables(fileUrl, documentOffset, operation.getBody(), result);

		return result;
	}

	private void getLocalVariables(String fileUrl, int documentOffset,
			Expression currentExpr, List<String> result) {
		if (currentExpr instanceof Block) {
			localVarBlock(fileUrl, documentOffset, (Block) currentExpr, result);
		} else if (currentExpr instanceof Loop) {
			localVarLoop(fileUrl, documentOffset, (Loop) currentExpr, result);
		} else if (currentExpr instanceof Conditional) {
			localVarIf(fileUrl, documentOffset, (Conditional) currentExpr,
					result);
		} else if (currentExpr instanceof LambdaExpression) {
			localVarLamdaExpr(fileUrl, documentOffset,
					(LambdaExpression) currentExpr, result);
		} else if (currentExpr instanceof VariableDecl) {
			VariableDecl decl = (VariableDecl) currentExpr;
			if (containsThisOffset(fileUrl, documentOffset,
					decl.getInitialization()))
				getLocalVariables(fileUrl, documentOffset,
						decl.getInitialization(), result);
		} else if (currentExpr instanceof Assignment) {
			Assignment assign = (Assignment) currentExpr;
			if (containsThisOffset(fileUrl, documentOffset, assign.getValue()))
				getLocalVariables(fileUrl, documentOffset, assign.getValue(),
						result);
		} else if (currentExpr instanceof CallOperation) {
			CallOperation callop = (CallOperation) currentExpr;
			for (Expression param : callop.getParameters()) {
				if (containsThisOffset(fileUrl, documentOffset, param))
					getLocalVariables(fileUrl, documentOffset, param, result);
			}
		}
	}

	private void localVarLamdaExpr(String fileUrl, int documentOffset,
			LambdaExpression currentLambdaExpr, List<String> result) {

		EList<LambdaParameter> params = currentLambdaExpr.getParameters();
		for (LambdaParameter p : params) {
			Type type = p.getType().getType();
			String paramType = extractTypeName(type);
			result.add(p.getName() + ":" + paramType);
		}

		if (containsThisOffset(fileUrl, documentOffset,
				currentLambdaExpr.getBody())) {

			getLocalVariables(fileUrl, documentOffset,
					currentLambdaExpr.getBody(), result);

		}

	}

	private void localVarIf(String fileUrl, int documentOffset,
			Conditional currentConditional, List<String> result) {

		if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getThenBody())) {
			getLocalVariables(fileUrl, documentOffset,
					currentConditional.getThenBody(), result);
		} else if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getElseBody())) {
			getLocalVariables(fileUrl, documentOffset,
					currentConditional.getElseBody(), result);
		} else if (containsThisOffset(fileUrl, documentOffset,
				currentConditional.getCondition())) {
			getLocalVariables(fileUrl, documentOffset,
					currentConditional.getCondition(), result);
		}
	}

	private void localVarLoop(String fileUrl, int documentOffset,
			Loop currentLoop, List<String> result) {

		if (currentLoop.getInitialization() instanceof VariableDecl) {
			VariableDecl varDecl = (VariableDecl) currentLoop
					.getInitialization();
			Type type = varDecl.getType().getType();
			String varType = extractTypeName(type);
			result.add(varDecl.getIdentifier() + ":" + varType);
		}

		if (containsThisOffset(fileUrl, documentOffset, currentLoop.getBody())) {
			getLocalVariables(fileUrl, documentOffset, currentLoop.getBody(),
					result);
		}
	}

	private void localVarBlock(String fileUrl, int documentOffset,
			Block currentBlock, List<String> result) {
		EList<Expression> statments = currentBlock.getStatement();
		// TODO: Statements are in the right order ?

		for (Expression currentExpr : statments) {

			if (documentOffset < getBeginOffset(currentExpr)) {
				return; // we are looking too far in the block
			} else if (!containsThisOffset(fileUrl, documentOffset, currentExpr)) {

				if (currentExpr instanceof VariableDecl) {

					VariableDecl varDecl = (VariableDecl) currentExpr;
					Type type = varDecl.getType().getType();

					String varType = extractTypeName(type);
					result.add(varDecl.getIdentifier() + ":" + varType);

				}
			} else {
				getLocalVariables(fileUrl, documentOffset, currentExpr, result);
				return;
			}
		}

		for (Rescue currentRescue : currentBlock.getRescueBlock()) {

			if (containsThisOffset(fileUrl, documentOffset, currentRescue)) {

				String varType = "";
				Type type = currentRescue.getExceptionType().getType();
				if (type instanceof Class)
					varType = ((Class) type).getTypeDefinition().getName();
				result.add(currentRescue.getExceptionName() + ":" + varType);

				for (Expression currentExpr : currentRescue.getBody()) {

					if (documentOffset < getBeginOffset(currentExpr)) {
						return; // we are looking too far in the block
					} else if (!containsThisOffset(fileUrl, documentOffset,
							currentExpr)) {

						if (currentExpr instanceof VariableDecl) {

							VariableDecl varDecl = (VariableDecl) currentExpr;
							type = varDecl.getType().getType();
							varType = extractTypeName(type);
							result.add(varDecl.getIdentifier() + ":" + varType);

						}
					} else {
						getLocalVariables(fileUrl, documentOffset, currentExpr,
								result);
						return;
					}
				}
			}
		}
	}

	public static String extractTypeName(Type type) {
		String res = "";

		if (type instanceof Class) {
			Class cl = (Class) type;
			StringBuffer tpsRes = new StringBuffer();
			tpsRes.append(cl.getTypeDefinition().getName());

			EList<TypeVariableBinding> params = cl.getTypeParamBinding();
			if (params != null && params.size() != 0) {
				tpsRes.append("<");
				for (int i = 0; i < params.size(); i++) {
					String typeName = extractTypeName(params.get(i).getType());
					tpsRes.append(typeName);

					if (i != params.size() - 1)
						tpsRes.append(",");
				}
				tpsRes.append(">");
			}
			return tpsRes.toString();
		} else if (type instanceof FunctionType) {
			FunctionType func = (FunctionType) type;
			return "<" + extractTypeName(func.getLeft()) + "->"
					+ extractTypeName(func.getRight()) + ">";
		} else if (type instanceof ProductType) {
			StringBuffer tpsRes = new StringBuffer();
			tpsRes.append("[");

			ProductType params = (ProductType) type;
			EList<Type> list = params.getType();
			for (int i = 0; i < list.size(); i++) {
				tpsRes.append(extractTypeName(list.get(i)));
				if (i != list.size() - 1)
					tpsRes.append(",");
			}

			tpsRes.append("]");
			return tpsRes.toString();
		} else if (type instanceof DataType) {
			DataType dataT = (DataType) type;
			return dataT.getName();
		} else if (type instanceof TypeVariable) {
			TypeVariable tyVar = (TypeVariable) type;
			return tyVar.getName();
		}

		return res;
	}
}