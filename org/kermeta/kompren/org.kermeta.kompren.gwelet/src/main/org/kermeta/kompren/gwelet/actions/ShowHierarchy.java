package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayDeque;
import java.util.Queue;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

public class ShowHierarchy extends SelectionBasedVisuAction {
	protected int radius;

	protected boolean superTypes;


	public ShowHierarchy() {
		super();
		superTypes = true;
		radius = 0;
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();
		
		if(superTypes)
			showSuperTypes();
		else
			showLowerTypes();
		done();
	}

	
	protected void showLowerTypes() {
		Queue<ClassView> q = new ArrayDeque<>();
		ClassView cv;
		
		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.NONE);
		
		for(ClassView cl : classes)
			q.add(cl);
		
		while(!q.isEmpty()) {
			cv = q.poll();
			cv.setVisibility(Visibility.STANDARD);
			for(ClassView cv2 : cv.getLowerTypes())
				if(!cv2.isVisible())
					q.add(cv2);
		}
		
		for(IEntityView ent : canvas.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
				ent.setVisibility(IComponentView.Visibility.NONE);

		canvas.updateLayout();
		canvas.update();
	}
	
	
	protected void showSuperTypes() {
		final BasicEList<ClassDefinition> cds = new BasicEList<>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.STANDARD);
		
		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), radius, superTypes, false, false);
		slicer.launch();
	}


	public void setSuperTypes(final boolean superTypes) {
		this.superTypes = superTypes;
	}


	@Override
	public String getUndoName() {
		return superTypes ? "Show super-classes" : "Show lower-classes";
	}


	public void setRadius(final int radius) {
		this.radius = radius;
	}
}
