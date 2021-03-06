/* $Id: 
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2011
 * Authors : 
 *           Cédric Bouhours 
 */

package org.kermeta.language.texteditor.eclipse.internal.autocompletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.templates.DocumentTemplateContext;
import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.autocompletion.AutocompletionImpl;
import org.kermeta.language.autocompletion.api.Autocompletion;
import org.kermeta.language.behavior.CallExpression;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.loader.kmt.scala.Lexer;
import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.texteditor.eclipse.internal.Activator;
import org.kermeta.language.texteditor.eclipse.internal.ClosestElementFinder;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;
import org.kermeta.language.texteditor.eclipse.internal.KermetaModelAccessor;
import org.kermeta.language.util.ModelingUnit;

public class KermetaContentAssistProcessor implements IContentAssistProcessor {

	private KermetaEditor editor;
	private org.kermeta.language.loader.kmt.scala.api.Lexer theLexer = new Lexer();
	private Autocompletion myAutocompletion = null;
	private IDocument doc = null;
	private StringBuffer indentation = new StringBuffer();

	public KermetaContentAssistProcessor(KermetaEditor editor) {
		this.editor = editor;
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,	int documentOffset) {
		// Retrieve current document
		doc = viewer.getDocument();

		ArrayList<ICompletionProposal> propList = new ArrayList<ICompletionProposal>();

		// Retrieve qualifier
		List<IKToken> qualifier = getQualifier(doc, documentOffset);

		if (!getLast(qualifier).getClass().getSimpleName().equals("Comment") && !getLast(qualifier).getClass().getSimpleName().equals("MLComment")) {
			// Compute completion proposals only if it is not a comment
			computeProposals(qualifier, documentOffset, propList);
		}

		//Collections.sort(propList);
		
		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];

		// and fill with list elements
		propList.toArray(proposals);

		// Return the proposals
		return proposals; 
	}

	private void initializeIdentation(String line) {
		this.indentation = new StringBuffer();
		for (int i=0;i<line.length();i++) {
			if (line.charAt(i) == '\u0020' || line.charAt(i) == '\t') {
				this.indentation.append(line.charAt(i));
			} else {
				return;
			}
		}
		
	}
	
	private List<IKToken> getQualifier(IDocument doc, int documentOffset) {

		// Use string buffer to collect characters
		StringBuffer currentLine = new StringBuffer();
		try {
			char c = doc.getChar(--documentOffset);
			while (c != '\n' && c != '\r') {
				currentLine.append(c);
				c = doc.getChar(--documentOffset);
			}
		} catch (BadLocationException e1) {}

		currentLine = currentLine.reverse();

		initializeIdentation(currentLine.toString());
		List<IKToken> temp = theLexer.lex(currentLine.toString().trim());

		if (temp.size() == 0) {
			temp.add(new IKToken() {			
				@Override
				public Integer getOffset() {
					return null;
				}			
				@Override
				public Integer getLength() {
					return null;
				}
			});
		}

		return temp;	
	}

	private boolean isTerminatedbyKeyword(List<IKToken> qualifier) {
		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Keyword")) {
			return true;
		}
		return false;
	}

	private String getDelimiter(List<IKToken> qualifier) {
		int i = qualifier.size();
		while (--i >= 0) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
				return qualifier.get(i).toString();
			}
		}

		return "";
	}

	private IKToken getLast(List<IKToken> qualifier) {
		return qualifier.get(qualifier.size()-1);
	}
	
	private String getLastIdentifier(List<IKToken> qualifier) {
		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Identifier")) {
			return qualifier.get(qualifier.size()-1).toString();
		}

		return "";
	}

	private String getLastKeyword(List<IKToken> qualifier) {
		int i = qualifier.size();
		while (--i >= 0) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Keyword")) {
				return qualifier.get(i).toString();
			}
		}

		return "";
	}
	
	private String getLastCompletePackageChain(List<IKToken> qualifier, boolean withTheLast) {
		StringBuffer result = new StringBuffer();
		boolean current = false;
		for (int i = 0;i<qualifier.size();i++) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Identifier")) {
				if (i+1<qualifier.size()) {
					if (qualifier.get(i+1).getClass().getSimpleName().equals("Delimiter")) {
						if (qualifier.get(i+1).toString().equals("::")) {
							if (!current) {
								result = new StringBuffer();
							}
							current = true;
							result.append(qualifier.get(i));
							result.append(qualifier.get(i+1));
						} else {
							if (current) {
								current = false;
							}
						}
					} else {
						if (current) {
							current = false;
						}
					}
				}
			} else {
				if (current && !qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
					current = false;
				}
			}
		}
		
		if (!withTheLast && !result.toString().equals("")) {
			result = result.delete(result.lastIndexOf("::"), result.length());
			result = result.delete(result.lastIndexOf("::")+2, result.length());
		}
		
		return result.toString();
	}

	private void computeProposals(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList) { 

		int qlen = getLastIdentifier(qualifier).length();

		List<String> reserved = theLexer.getReservedWords();   
		List<String> theVariables = null;
		List<String> theClassDefinition = null;
		List<String> thePackages = null;
		
		ModelingUnit theCurrentMU = null;
		if (editor.getFile() != null) {	   
			String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());

			theCurrentMU = KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier); 
			
			if (theCurrentMU != null) {				
				myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));
			}
			/*else{ // time consuming ...
				
				IFile file = editor.getFile().getProject().getFile("target/beforeCheckingforScopeRESOLVED.km");
				if (file != null){
					try {
						ResourceSet resSet = new ResourceSetImpl();
						Resource res = resSet.getResource(org.kermeta.utils.helpers.emf.EMFUriHelper.convertToEMFUri(file.getLocationURI()), true);
						ModelingUnit rtNode = (ModelingUnit) res.getContents().get(0);	
						myAutocompletion =  new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),rtNode);
					} catch(RuntimeException e){
					}
				}
			}*/
		}

		if (getLastKeyword(qualifier).equals("using")) {
			if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") ) {
				//Proposal of ClassDef
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				propList.add(new KermetaCompletionProposal("*", documentOffset - qlen, qlen, 1, KermetaImage.getImage("/icons/kermeta.gif")));
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			} else if(qualifier.size() == 1){
				//Proposal of package or class def
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			} else if(getLast(qualifier).toString().equals("=>")){ 
				proposeRenaming(qualifier, documentOffset, propList, qlen);
			}
			else {
				propList.add(new KermetaCompletionProposal("=>", documentOffset, 0, 2, KermetaImage.getImage("/icons/kermeta.gif")));
			}
		} else if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") ) {
			//Proposal of ClassDef
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
		} else if (getDelimiter(qualifier).equals(".")) {
			
			TypeDefinition t = editor.myAccess.getCallType(editor.getFile().getLocationURI().toString(), documentOffset, qualifier);
			if(t instanceof ClassDefinition){
				String lastQualifier = getLastIdentifier(qualifier);
				classDefHierarchyProposals(lastQualifier, documentOffset, propList, (ClassDefinition)t, false);
			}
			
		} else if (! isTerminatedbyKeyword(qualifier)) {
			//Proposal of Keywords and Variables
			proposeVariable(qualifier, documentOffset, propList, qlen);
			//proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			//proposeKeywords(qualifier, documentOffset, propList, qlen, reserved);
		} else  if (getLastKeyword(qualifier).equals("init")) {
			//Proposal of ClassDef
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			proposeVariable(qualifier, documentOffset, propList, qlen);
		}
		else if(isTerminatedbyKeyword(qualifier)){
			proposeStructure(getLastKeyword(qualifier), documentOffset, propList, getLastKeyword(qualifier).length());
		}
	}
	
	/*
	 * Get proposals from the classDefinition and from his parents classDefinition
	 */
	private void classDefHierarchyProposals(String lastQualifier, 
			int documentOffset, List<ICompletionProposal> propList,
			ClassDefinition cd,
			boolean isParent){
		
		computeClassDefProposals(lastQualifier, documentOffset, propList, cd, isParent);
		
		for(Type t : cd.getSuperType()){
			if(t instanceof Class){
				classDefHierarchyProposals(lastQualifier, documentOffset, propList, ((ClassDefinition)((Class) t).getTypeDefinition()),true);
			}
		}
	}

	/*
	 * Get all properties and operations of the given class definition which start with lastQualifier
	 */
	private void computeClassDefProposals(String lastQualifier,
			int documentOffset, List<ICompletionProposal> propList,
			ClassDefinition cd,
			boolean isParent) {
		
		String containerClass = cd.getName();
		String colorSet = isParent ? "yellow":"blue";
		//List attr and methods for current class
		for(Property prop : cd.getOwnedAttribute()){
			if(prop.getName().startsWith(lastQualifier)){
				String type = KermetaModelAccessor.extractTypeName(prop.getType())+KermetaModelAccessor.getSimplifiedMultiplicityString(prop);							
				
				propList.add(
					new KermetaCompletionProposal(	prop.getName(),
													documentOffset-lastQualifier.length(),
													lastQualifier.length(),
													prop.getName().length(),
													prop.getIsComposite()?KermetaImage.getImage("/icons/"+colorSet+"/property_contained.png"):KermetaImage.getImage("/icons/"+colorSet+"/property.png"),
													prop.getName()+" : "+type+" - "+containerClass,
													null,
													null)
				);
			}
		}
		for(Operation op : cd.getOwnedOperation()){
			if(op.getName().startsWith(lastQualifier)){
				StringBuffer showedText = new StringBuffer();
				StringBuffer printedText = new StringBuffer();
				String type = KermetaModelAccessor.extractTypeName(op.getType())+KermetaModelAccessor.getSimplifiedMultiplicityString(op);
				
				showedText.append(op.getName());
				printedText.append(op.getName());
				
				//Show parameters
				List<Parameter> params = op.getOwnedParameter();
				if(params.size() == 1 && params.get(0).getType() instanceof FunctionType){
					// use simplified syntax for lambda with one param
					showedText.append("{");
					printedText.append("{");
					showedText.append(KermetaModelAccessor.extractTypeName(params.get(0).getType())+" ");
					showedText.append(params.get(0).getName());
					printedText.append(getProposedTextForFunctionParameter((FunctionType) params.get(0).getType(),params.get(0).getName()));
					showedText.append("}");
					printedText.append("}");
				}
				else{
					// normal syntax for operation call
					showedText.append("(");
					printedText.append("(");				
					for(int i = 0; i < params.size(); i++){
						Parameter p = params.get(i);
						showedText.append(KermetaModelAccessor.extractTypeName(p.getType())+" ");
						showedText.append(p.getName());
						printedText.append("${"+p.getName()+"}");
						if(i < params.size() - 1){
							showedText.append(",");
							printedText.append(",");
						}
					}
					showedText.append(")");
					printedText.append(")");
				}
				showedText.append(" : "+type);
				
				propList.add(
						createTemplateProp(showedText.toString(),
								containerClass,
								printedText.toString(), 
								documentOffset-lastQualifier.length(), 
								KermetaImage.getImage("/icons/"+colorSet+"/operation.png"))
					);
			}
		}
	}
	
	private String getProposedTextForFunctionParameter(FunctionType func, String paramName){
		StringBuffer result = new StringBuffer();
		if(func.getLeft() instanceof ProductType){
			ProductType pt = (ProductType)func.getLeft();
			for (int i = 0; i < pt.getType().size(); i++) {
				String tName = KermetaModelAccessor.extractTypeName(pt.getType().get(i));
				if(!tName.equals("Void")){
					result.append("a"+tName+i);
				}
				if(i < pt.getType().size() - 1){
					result.append(", ");
				}
			}
			result.append("|");
		}
		else{
			String tName = KermetaModelAccessor.extractTypeName(func.getLeft());
			if(!tName.equals("Void")){
				result.append("a"+tName);
				result.append("|");
			}
		}
		result.append("${"+paramName+"}");
		return result.toString();
	}
	
	private TemplateProposal createTemplateProp(String name, String description, String pattern, int docOffset, Image img){
		Template templ = new Template(name, description, "kermeta.context", pattern, true);
		TemplateContextType templType = new TemplateContextType("kermeta.context");
		templType.addResolver(new GlobalTemplateVariables.Cursor());
		DocumentTemplateContext context = new DocumentTemplateContext(templType, doc, docOffset, 0);
		
		return new TemplateProposal(templ, context, new Region(docOffset,0), img);
	}

	
	private void proposeRenaming(List<IKToken> qualifier, int documentOffset,
		List<ICompletionProposal> propList, int qlen) {
		// TODO propose a smart new name based on using
	}

	private void proposeKeywords(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen, List<String> reserved) {
		String lastQualifier = getLastIdentifier(qualifier);
		
		for (String oneWord : reserved) {
			int cursor = oneWord.length()+1;
			if (lastQualifier.length() > 0) {
				if (oneWord.startsWith(lastQualifier)) {
					if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {					
						propList.add(new KermetaCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
					}
				}
			} else {
				if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {
					propList.add(new KermetaCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
				}
			}
		}
	}

	private void proposeVariable(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen) {
		
		String lastQualifier = getLastIdentifier(qualifier);
		
		try {
			//Ensure offset is at the end of lastQualifier (ie: no whitespace)
			for(int i= 0; i < lastQualifier.length(); i++){
				if(lastQualifier.charAt(lastQualifier.length()-1 - i) != doc.getChar(documentOffset-1 - i)){
					lastQualifier = "";
					break;
				}				
			}
		} catch (BadLocationException e) {
			Activator.getDefault().getMessaggingSystem().error(e.getMessage(), "autocompletion", e);
		}
		
		List<VariableProposalItem> theVariables = editor.myAccess.getAccessibleVariable(editor.getFile().getLocationURI().toString(), documentOffset);	
		
		if (theVariables != null) {
			for (VariableProposalItem aVariable : theVariables) {
				int cursor = aVariable.getName().length();
				if (lastQualifier.length() > 0) {
					if (aVariable.getName().startsWith(lastQualifier)) {
						propList.add(
								new KermetaCompletionProposal(	aVariable.getName(),
																documentOffset-lastQualifier.length(),
																lastQualifier.length(),
																cursor,
																aVariable.getProposalImage(),
																aVariable.getProposalText(),
																null,
																null)
							);
					}
				} else {
					propList.add(
							new KermetaCompletionProposal(	aVariable.getName(),
															documentOffset-qlen,
															qlen,
															cursor,
															aVariable.getProposalImage(),
															aVariable.getProposalText(),
															null,
															null)
						);
				}
			}
		}
		
		
	}

	private void proposeClassDefinition(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen, List<String> theClassDefinition) {
		String lastQualifier = getLastIdentifier(qualifier);
		String thePackageToUse = getLastCompletePackageChain(qualifier,true);

		if (myAutocompletion != null) {

			theClassDefinition = myAutocompletion.getAllClassDefinition(thePackageToUse);
		}
		
		if (theClassDefinition != null) {
			for (String aClassDef : theClassDefinition) {
				int cursor = aClassDef.length();
				if (lastQualifier.length() > 0) {
					if (aClassDef.startsWith(lastQualifier)) {
						propList.add(new KermetaCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/ClassDefinition.gif")));
					}					   
				} else {			   
					propList.add(new KermetaCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/ClassDefinition.gif")));
				}
			}
		}
	}
	
	private void proposePackages(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen, List<String> thePackages) {
		String lastQualifier = getLastIdentifier(qualifier);
		String thePackageToUse = getLastCompletePackageChain(qualifier,true);
		
		if (myAutocompletion != null) {
			if (thePackageToUse.equals("")) {
				thePackages = myAutocompletion.getAllPackages();
			} else {
				thePackages = myAutocompletion.getSubPackages(thePackageToUse);
			}
		}
		
		if (thePackages != null) {
			for (String aPackage : thePackages) {
				int cursor = aPackage.length();
				if (lastQualifier.length() > 0) {
					if (aPackage.startsWith(lastQualifier)) {
						propList.add(new KermetaCompletionProposal(aPackage, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/red/package.png"),aPackage,null,null));
					}					   
				} else {			   
					propList.add(new KermetaCompletionProposal(aPackage, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/red/package.png"),aPackage,null,null));
				}
			}
		}
	}
	
	private ArrayList<String> explodeCallExpression(List<IKToken> elements) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		int i = elements.size()-1;
		
		while (i>=0) {
			if (elements.get(i).getClass().getSimpleName().equals("Delimiter")) {
				if (! elements.get(i).toString().equals(".")) {
					return result;
				}
			}
			if (elements.get(i).getClass().getSimpleName().equals("Identifier")) {
				result.add(elements.get(i).toString());
			}
			i--;
		}
		
		return result;
		
	}
	
	private void proposeCallExpression(List<IKToken> qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen) {
		HashMap<String,ArrayList<String>> theCallExpression = null;
		//if (myAutocompletion != null) {
			// disabled until we get a proper way to deal with it
			// idea : have an operation that compute the closest preceding/containing element based on tracability information in the model  
		//	theCallExpression = myAutocompletion.getCallExpression(explodeCallExpression(qualifier), getLastCompletePackageChain(qualifier, true));
			
			// 
		/*int lastElemOffset = documentOffset;
		if(getLast(qualifier).toString().equals(".") && qualifier.size() > 1){
			// get previous element offset which has more chances to be in the modeling unit
			lastElemOffset = qualifier.get(qualifier.size()-1).
		}*/
		
		ClosestElementFinder finder = new ClosestElementFinder(editor, documentOffset-(qlen+2));
		KermetaModelElement closestContainer = finder.findClosestContainerModelelement();
		
		if(closestContainer != null){
			if(closestContainer instanceof CallExpression){
				CallExpression ce = (CallExpression) closestContainer;
				ce.getStaticType();
			}
		}
		//}
		/*if (theCallExpression != null) {
			for (String currentMetaClass : theCallExpression.keySet()) {
				Image theImage = KermetaImage.getImage("/icons/specific/EmptyExpression.gif");
				if (currentMetaClass.equals("Operation")) {
					theImage = KermetaImage.getImage("/icons/red/operation.png");
				}
				if (currentMetaClass.equals("Property")) {
					theImage = KermetaImage.getImage("/icons/red/property.png");
				}
				for (String anElement : theCallExpression.get(currentMetaClass)) {
					int cursor = anElement.length();
					propList.add(new KermetaCompletionProposal(anElement, documentOffset - qlen, qlen, cursor, theImage));
				}
			}
		}*/
	}

	/*
	 * Propose a template structure which match the qualifier
	 */
	private boolean proposeStructure(String qualifier, int documentOffset, List<ICompletionProposal> propList, int qlen) {
		boolean result = false;
		String proposition = "";
		if (qualifier.equals("do")) {
			proposition = "do\n"+this.indentation+"\t${cursor}\n"+this.indentation+"end";
			propList.add(createTemplateProp("Block","do...end",proposition, documentOffset - qlen,KermetaImage.getImage("/icons/specific/Block.gif")));
			result = true;
		}
		if (qualifier.equals("if")) {
			proposition = "if (${condition}) then\n"+this.indentation+"\t${cursor}\n"+this.indentation+"end";
			propList.add(createTemplateProp("Conditional","if...then...end",proposition, documentOffset - qlen,KermetaImage.getImage("/icons/specific/Conditional.gif")));
			proposition = "if (${condition}) then\n"+this.indentation+"\t${cursor}\n"+this.indentation+"else\n"+this.indentation+"\t\n"+this.indentation+"end";
			propList.add(createTemplateProp("Conditional","if...then...else...end",proposition, documentOffset - qlen,KermetaImage.getImage("/icons/specific/Conditional.gif")));
			result = true;
		}
		if (qualifier.equals("loop")) {
			proposition = "loop\n"+this.indentation+"\t${cursor}\n"+this.indentation+"end";
			propList.add(createTemplateProp("Loop","loop...end",proposition, documentOffset - qlen,KermetaImage.getImage("/icons/specific/Loop.gif")));
			result = true;
		}
		if (qualifier.equals("from")) {
			proposition = "from ${initialization} \n"+this.indentation+"until ${condition}\n"+this.indentation+"loop\n"+this.indentation+"\t${cursor}\n"+this.indentation+"end";
			propList.add(createTemplateProp("Loop","from...loop...end",proposition, documentOffset - qlen,KermetaImage.getImage("/icons/specific/Loop.gif")));
			result = true;
		}
		return result;
	}
	

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer arg0,
			int arg1) {
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { }; // user must ask for completion with ctrl+space
		//return new char[] { '.', ' ', ':'};
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return "An error unables Kermeta to assist your content";
	}
	
	
}
