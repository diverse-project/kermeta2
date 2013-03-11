package org.kermeta.language.texteditor.eclipse.internal;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.util.ModelingUnit;

public class KermetaModelAccessor {
	
	/*
	 * Model representing the current kmt file.
	 */
	ModelingUnit currentModelingUnit;

	/*
	 * Association of model elements with their bounds in the current edited kmt file.
	 */
	HashMap<KermetaModelElement, Position> mappingElemPos;
	
	DefaultPositionUpdater positionUpdater;
	
	public KermetaModelAccessor(ModelingUnit aModelingUnit, IDocument doc) {
		
		currentModelingUnit = aModelingUnit;
		
		if(mappingElemPos == null){
			doc.addPositionCategory("KermetaModel");
			mappingElemPos = new HashMap<KermetaModelElement, Position>();
			List<EObject> content = currentModelingUnit.getAllMetamodelsContents();
			for(EObject obj : content){
				if(obj instanceof KermetaModelElement){
					KermetaModelElement elem = (KermetaModelElement)obj;
					
					for(Tag tag : elem.getKOwnedTags()){
						if(tag.getName().equals("traceability_text_reference")){
							String[] val = tag.getValue().split(";");
							if(val.length == 3){
								int begin = Integer.parseInt(val[1]);
								int end = Integer.parseInt(val[2]);
								
								Position pos = new Position(begin, end-begin+1);
								mappingElemPos.put(elem, pos);
								
								try {
									doc.addPosition("KermetaModel",pos);
								} catch (BadLocationException e) {
									e.printStackTrace();
								} catch (BadPositionCategoryException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		if(positionUpdater == null){
			positionUpdater = new DefaultPositionUpdater("KermetaModel");
			doc.addPositionUpdater(positionUpdater);
		}
		
	}
	
	//-------------------------------------------------------------------------------------------------------
	// GET A PACKAGE
	//-------------------------------------------------------------------------------------------------------
		/*
		 * Search a package in metamodels of the modelingUnits.
		 * 
		 * Note: if two metamodels have a package which match @packageToFind, 
		 * the first found is returned
		 * 
		 * @packageToFind Full name of the package wanted. (ie: "rootPack::subPack::subPack")
		 */
		public Package getNamedPackage(String packageToFind) {
			
			String[] temp = packageToFind.split("::");
			
			List<Metamodel> mms = currentModelingUnit.getMetamodels();
			for(Metamodel mm : mms){
				List<Package> packs = mm.getPackages();
				for(Package p : packs){
					Package result = deepSearchPackage(temp, 0, p);
					if(result != null) return result;
				}
			}
			
			return null;		
		}
		
		/*
		 * Recursive function which search the wanted package in the nestedPackage tree
		 * 
		 * @names The package full name. names[i] is a sub package of names[i-1]
		 * @pos The current position in names[]
		 * @currentPackage Package which match names[pos]
		 */
		private Package deepSearchPackage(String[] names, int pos, Package currentPackage){
			
			//End case
			if(pos == names.length-1){
				if(currentPackage.getName().equals(names[names.length-1])) return currentPackage;
				else return null;
			}
			
			List<Package> nestedPacks = currentPackage.getNestedPackage();
			for(Package nextPackage : nestedPacks){
				if(nextPackage.getName().equals(names[pos+1])) return deepSearchPackage(names, pos+1, nextPackage);
			}
			
			return null;
		}
		
	//-------------------------------------------------------------------------------------------------------
	// WHERE IS THE CURSOR IN THE MODEL	
	//-------------------------------------------------------------------------------------------------------
		/*
		 * Find the closest package where the cursor is.
		 * 
		 * @fileUrl Name of the current edited file
		 * @documentOffset Position of the cursor in the file
		 */
		public Package currentOffsetPackage(String fileUrl, int documentOffset){
			
			Package result = null;
			
			List<Metamodel> mms = currentModelingUnit.getMetamodels();
			for(Metamodel mm : mms){
				List<Package> packs = mm.getPackages();
				for(Package p : packs){
					result = findClosestPackage(fileUrl, documentOffset, p);
					if(result != null) return result;
				}
			}
			
			return result;
		}
		
		
		/*
		 * Search for the deeper package which contain the offset
		 * 
		 * @fileUrl Name of the current edited file
		 * @documentOffset Position of the cursor in the file
		 * @pack The current package inspected
		 */
		private Package findClosestPackage(String fileUrl, int documentOffset, Package pack){
			
			Package result = null;
			
			if(containsThisOffset(fileUrl, documentOffset, pack)){
				for(Package currentPackage : pack.getNestedPackage()){
					result = findClosestPackage(fileUrl, documentOffset, currentPackage);
					if(result != null) return result;
				}
				result = pack;
			}
			
			return result;
		}
		
		/*
		 * Look at the traceability tag of the package
		 */
		public boolean containsThisOffset(String fileUrl, int documentOffset, KermetaModelElement elem){			
			for(Tag tag : elem.getKOwnedTags()){
				if(tag.getName().equals("traceability_text_reference")){
					String[] val = tag.getValue().split(";");
					if(val.length == 3){
//						int begin = Integer.parseInt(val[1]);
//						int end = Integer.parseInt(val[2]);
						Position pos = mappingElemPos.get(elem);
						int begin = pos.offset;
						int end = pos.offset + pos.length - 1;
						if(val[0].equals(fileUrl) && begin <= documentOffset && documentOffset <= end){
							return true;
						}
					}
				}
			}
			return false;
		}
		
		/*
		 * Return the class definition from a package where there is the cursor.
		 */
		private ClassDefinition getClosestClass(String fileUrl, int documentOffset, Package pack){
			for(TypeDefinition typeDef : pack.getOwnedTypeDefinition()){
				
				if(typeDef instanceof ClassDefinition){
					
					if(containsThisOffset(fileUrl, documentOffset, (ClassDefinition)typeDef)) return (ClassDefinition)typeDef;
					
				}
				
			}
			return null;
		}
		
		/*
		 * Return the operation from a class definition where there is the cursor.
		 */
		private Operation getClosestOperation(String fileUrl, int documentOffset, ClassDefinition classDef){
			for(Operation op : classDef.getOwnedOperation()){
				
				if(containsThisOffset(fileUrl, documentOffset, op)) return op;
				
			}
			return null;
		}
		
	//-------------------------------------------------------------------------------------------------------
	// TYPE OF THE FIRST ELEMENT
	//-------------------------------------------------------------------------------------------------------	
		/*
		 * The first element of the call is an operation.
		 * Find in which class the call is and find the operation in this.
		 * 
		 * @fileUrl Name of the current edited file
		 * @documentOffset Position of the cursor in the file
		 * @name The name of the operation wanted
		 */
		private TypeDefinition getReturnType(String fileUrl, int documentOffset, String name){
			
			Package pack = currentOffsetPackage(fileUrl, documentOffset);
			ClassDefinition classDef = getClosestClass(fileUrl, documentOffset, pack);
			
			List<Operation> operations = classDef.getOwnedOperation();
			for(Operation op : operations){
				
				if(op.getName().equals(name)){
					
					if(op.getType() instanceof Class) return ((Class)(op.getType())).getTypeDefinition();
				}
				
			}
			
			return null;
		}
		
		/*
		 * The first element of the call is a variable, an operation parameter or a class attribute 
		 * 
		 * @fileUrl Name of the current edited file
		 * @documentOffset Position of the cursor in the file
		 * @name The name of the variable wanted
		 */
		private TypeDefinition getVariableType(String fileUrl, int documentOffset, String name){
			
			Package pack = currentOffsetPackage(fileUrl, documentOffset);
			ClassDefinition classDef = getClosestClass(fileUrl, documentOffset, pack);
			Operation operation = getClosestOperation(fileUrl, documentOffset, classDef);
			
			//TODO:Search in variable declaration of the body
			
			//Search in operation parameters
			if(operation != null){
				List<Parameter> params = operation.getOwnedParameter();
				for(Parameter p: params){
					
					if(p.getName().equals(name)){
						
						if(p.getType() instanceof Class) return ((Class)(p.getType())).getTypeDefinition();
					}
					
				}
			}
			//Search in class attributes
			if(classDef != null){
				List<Property> properties = classDef.getOwnedAttribute();
				for(Property prop : properties){
					
					if(prop.getName().equals(name)){
						
						if(prop.getType() instanceof Class) return ((Class)(prop.getType())).getTypeDefinition();
	
					}
					
				}
			}
			
			//TODO:Search for a singleton class
			
			return null;
		}
		
	//-------------------------------------------------------------------------------------------------------
	// NAVIGATION WITH PROPERTIES AND OPERATIONS CALLS	
	//-------------------------------------------------------------------------------------------------------
		/*
		 * Search for an attribute in currentType and get his type
		 * 
		 * @currentType The class watched
		 * @opName The name of the attribute wanted
		 */
		public TypeDefinition getAttributeType(TypeDefinition currentType, String attName){
			
			if(currentType instanceof ClassDefinition){
				
				List<Property> properties = ((ClassDefinition)currentType).getOwnedAttribute();
				for(Property prop : properties){
					
					if(prop.getName().equals(attName)){
						
						if(prop.getType() instanceof Class) return ((Class)(prop.getType())).getTypeDefinition();
						
					}
					
				}
				
			}
			return null;
		}
		
		/*
		 * Search for an operation in currentType and get his return type
		 * 
		 * @currentType The class watched
		 * @opName The name of the operation wanted
		 */
		public TypeDefinition getOperationType(TypeDefinition currentType, String opName){
			
			if(currentType instanceof ClassDefinition){
				
				List<Operation> operations = ((ClassDefinition)currentType).getOwnedOperation();
				for(Operation op : operations){
					
					if(op.getName().equals(opName)){
						
						if(op.getType() instanceof Class) return ((Class)(op.getType())).getTypeDefinition();
					}
					
				}
				
			}
			return null;
		}
	
	//-------------------------------------------------------------------------------------------------------
	// ENTRY POINT
	//-------------------------------------------------------------------------------------------------------
		
		/*
		 * Get the return type of the call expression before the dot.
		 * 
		 * @callChain The tokens from the begin of the line to the offset
		 */
		public TypeDefinition getCallType(String fileUrl, int documentOffset, List<IKToken> callChain){
			
			int pos = 0; //current position in callChain
			
			//-----------------------------------------
			// Find the begin of the call in the line
			//-----------------------------------------
			pos = findBeginOfCall(callChain);
			
			//-----------------------------------------
			// Determine the type of the first element
			//-----------------------------------------
			TypeDefinition firstType = null;
			
			//"self." at the begin
			if(callChain.get(pos).getClass().getSimpleName().equals("Keyword") && callChain.get(pos).toString().equals("self")){
				
				if(callChain.get(pos+1).getClass().getSimpleName().equals("Delimiter") && callChain.get(pos+1).toString().equals(".")){
		
					Package pack = currentOffsetPackage(fileUrl, documentOffset);
					firstType = getClosestClass(fileUrl, documentOffset, pack);
					pos = pos + 2;
				}	
			}
			else{
				//Intended : Identifier, Delimiter "(", Something, Delimiter ")", Delimiter "."
				// or Identifier, Delimiter "."
				if(callChain.get(pos).getClass().getSimpleName().equals("Identifier")){
					
					if(callChain.get(pos+1).getClass().getSimpleName().equals("Delimiter")){
						
						if(callChain.get(pos+1).toString().equals(".")){
							
							firstType = getVariableType(fileUrl,documentOffset, callChain.get(pos).toString());
							pos = pos + 2;
							
						}
						else if(callChain.get(pos+1).toString().equals("(")){
							
							int endParenthese = endOfOperation(callChain, pos+1);
							if(endParenthese != -1  && callChain.get(endParenthese+1).toString().equals(".")){
								
								firstType = getReturnType(fileUrl,documentOffset, callChain.get(pos).toString());
								pos = endParenthese + 2;
								
							}
						}
					}
				}
			}
			
			//-----------------------------------------
			// Then navigate in the calls
			//-----------------------------------------
			if(firstType != null){
				
				TypeDefinition currentElem = firstType;
				
				while(pos+1 < callChain.size()){
					
					if(callChain.get(pos).getClass().getSimpleName().equals("Identifier")){
						
						if(callChain.get(pos+1).getClass().getSimpleName().equals("Delimiter")){
							
							if(callChain.get(pos+1).toString().equals(".")){
								
								currentElem = getAttributeType(currentElem, callChain.get(pos).toString() );
								pos = pos + 2;
								
							}
							else if(callChain.get(pos+1).toString().equals("(")){
								
								int endParenthese = endOfOperation(callChain, pos+1);
								if(endParenthese != -1  && callChain.get(endParenthese+1).toString().equals(".")){
									
									currentElem = getOperationType(currentElem, callChain.get(pos).toString() );
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
			if(callChain.get(i).toString().equals(".")){
				i--;
			}
			while( i-1 > 0){
		
				if(callChain.get(i).toString().equals(")")){
					int count = 1; //Number of opened parentheses
					i--;
					while(count > 0 && i > 0){
						if(callChain.get(i).toString().equals(")")) count++;
						else if(callChain.get(i).toString().equals("(")) count--;
						i--;
					}
				}
				else if(callChain.get(i).getClass().getSimpleName().equals("Identifier")){
					if(callChain.get(i-1).toString().equals(".")){
						i = i - 2;
					}
					else{
						break;
					}
				}
				else{
					break;
				}
			}
			return i;
		}
		
		/*
		 * Return the end parenthese position of the current operation
		 * Return -1 if syntaxe error
		 * 
		 * @begin The position of the opening parentheses
		 */
		private int endOfOperation(List<IKToken> callChain, int begin){
			
			int count = 1; //count opened parentheses
			int pos = begin;
			while(pos+1 < callChain.size() && count > 0){
				pos++;
				
				if(callChain.get(pos).toString().equals("(")) count++;
				else if(callChain.get(pos).toString().equals(")")) count--;	
				
			}
			
			if(count != 0) return -1;
			return pos;
		}		
}