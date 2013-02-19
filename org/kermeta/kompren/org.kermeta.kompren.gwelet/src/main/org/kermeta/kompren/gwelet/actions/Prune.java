package org.kermeta.kompren.gwelet.actions;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

public class Prune extends SelectionBasedVisuAction {
	protected int radius;

	protected boolean considerComposition;//TODO


	public Prune() {
		super();
		radius = 0;
		considerComposition = true;
	}


	@Override
	public String getUndoName() {
		return "Pruning";
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		final BasicEList<ClassDefinition> cds = new BasicEList<ClassDefinition>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), radius, true, true, true);
		slicer.launch();
		canvas.update();
		done();
	}


	@Override
	public boolean canDo() {
		return super.canDo() && ModelViewMapper.getMapper()!=null;
	}


	public void setRadius(final int radius) {
		this.radius = radius;
	}


	public void setConsiderComposition(final boolean considerComposition) {
		this.considerComposition = considerComposition;
	}
}