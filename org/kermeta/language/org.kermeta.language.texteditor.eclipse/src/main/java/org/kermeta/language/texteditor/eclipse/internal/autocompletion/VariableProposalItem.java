package org.kermeta.language.texteditor.eclipse.internal.autocompletion;

import org.eclipse.swt.graphics.Image;


/**
 * Class used to struture the result of KermetaModelAccessor.getAccessibleVariable
 */
public class VariableProposalItem {

	public enum VariableKind { LOCAL, ATTRIBUTE, REFERENCE, DERIVED, PARAMETER, RESULT, SELF, SINGLETON };
	
	public enum LocalizationKind { IN_DOCUMENT, NOT_IN_DOCUMENT };
	
	protected LocalizationKind localizationKind = LocalizationKind.IN_DOCUMENT;
	
	protected VariableKind variableKind = VariableKind.LOCAL; 
	
	protected String name;
	
	protected String type = null;

	public VariableProposalItem(VariableKind variableKind, String name,
			String type) {
		super();
		this.variableKind = variableKind;
		this.name = name;
		this.type = type;
	}

	public VariableKind getVariableKind() {
		return variableKind;
	}

	public void setVariableKind(VariableKind variableKind) {
		this.variableKind = variableKind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public String getProposalText(){
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		if(type != null){
			sb.append(" : ");
			sb.append(type);
		}
		return sb.toString();
	}
	
	public Image getProposalImage(){
		String localizationColor;
		switch (localizationKind) {
		case IN_DOCUMENT:
			localizationColor = "red";
			break;
		default:
			localizationColor = "blue";
			break;
		}
		switch (variableKind) {
		case ATTRIBUTE:
			return KermetaImage.getImage("/icons/"+localizationColor+"/property_contained.png");
		case REFERENCE:
			return KermetaImage.getImage("/icons/"+localizationColor+"/property.png");
		case PARAMETER:
			return KermetaImage.getImage("/icons/specific/Parameter.gif");
		case RESULT:
			return KermetaImage.getImage("/icons/specific/CallResult.gif");
		case SELF:
			return KermetaImage.getImage("/icons/specific/SelfExpression.gif");
		default:
			return KermetaImage.getImage("/icons/specific/VariableDecl.gif");
		}
	}
	
}
