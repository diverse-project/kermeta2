package org.kermeta.kompren.gwelet.actions;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

public class ShowHierarchy extends SelectionBasedVisuAction {
	protected boolean superTypes;


	public ShowHierarchy() {
		super();
		superTypes = true;
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		final BasicEList<ClassDefinition> cds = new BasicEList<ClassDefinition>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), superTypes, false, false);
		slicer.launch();
		canvas.update();
		done();
	}



	public void setSuperTypes(final boolean superTypes) {
		this.superTypes = superTypes;
	}


	@Override
	public String getUndoName() {
		return superTypes ? "Show super-classes" : "Show lower-classes";
	}
}