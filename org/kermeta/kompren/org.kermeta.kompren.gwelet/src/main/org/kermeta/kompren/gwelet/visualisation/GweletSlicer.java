package org.kermeta.kompren.gwelet.visualisation;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.gwelet.model.ModelUtils;
import org.kermeta.kompren.gwelet.view.InheritanceView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichVisualiserKermetaModel;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;

public class GweletSlicer extends RichVisualiserKermetaModel {
	protected IModelView view;

	public GweletSlicer(final IModelView view) {
		super();
		this.view = view;
	}
	
	
	@Override
	public void onClazzsuperClassesAdded(TypeDefinition srcClass, TypeDefinition tgtClass) {
		InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView(
				(ClassDefinition)srcClass, (ClassDefinition)tgtClass);
		if(iv!=null)
			iv.setVisibility(IComponentView.Visibility.STANDARD);
	}


	@Override
	public void onPropertyAdded(final Property prop) {
		Type type = prop.getType();
		if(type instanceof org.kermeta.language.structure.Class &&
				!ModelUtils.INSTANCE.isKermetaPrimitiveType(((org.kermeta.language.structure.Class)type).getName())) {
//			System.out.println(prop.getName());
			ModelViewMapper.getMapper().getRelationClassView(prop).setVisibility(IComponentView.Visibility.STANDARD);
		}
	}


	@Override
	public void onClassDefinitionAdded(final ClassDefinition cl) {
		String qname = ModelUtils.INSTANCE.getQualifiedName(cl);// EVAL

		if(!qname.startsWith("org.kermeta") && !qname.startsWith("kermeta") && !qname.startsWith("org.Dummy") &&
			ModelViewMapper.getMapper().getClassView(cl).getVisibility()==IComponentView.Visibility.HIDE_START) {
//			System.out.println(cl.getName());
				ModelViewMapper.getMapper().getClassView(cl).setVisibility(IComponentView.Visibility.STANDARD);
		}
	}



	@Override
	public void onEnd() {
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
				ent.setVisibility(IComponentView.Visibility.NONE);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==IComponentView.Visibility.HIDE_START)
				rel.setVisibility(IComponentView.Visibility.NONE);

		view.updateLayout();
		view.update();
	}



	@Override
	public void onStart() {
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.STANDARD)
				ent.setVisibility(IComponentView.Visibility.HIDE_START);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==IComponentView.Visibility.STANDARD)
				rel.setVisibility(IComponentView.Visibility.HIDE_START);
	}
}
