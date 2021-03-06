package org.kermeta.kompren.gwelet.view;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JToolTip;

import org.kermeta.kompren.diagram.view.impl.ModelView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.gwelet.ui.ClickableToolTip;
import org.kermeta.kompren.gwelet.view.RoleView.Cardinality;

public class MetamodelView extends ModelView {
	private static final long serialVersionUID = 1L;

	protected boolean operationsVisible;

	protected boolean propertiesVisible;


	public MetamodelView(final boolean withScrollPane) {
		super(withScrollPane);

		operationsVisible = true;
		propertiesVisible = true;
		FooHand foo = new FooHand(this);//FIXME
		addMouseListener(foo);
		addMouseMotionListener(foo);
	}

	@Override
	public JToolTip createToolTip() {
		JToolTip tip = new ClickableToolTip(this);
		tip.setComponent(this);
		return tip;
	}

	// Set tooltip location
	@Override
	public Point getToolTipLocation(MouseEvent event) {
		if(getToolTipText()!=null && getToolTipText().length()>0)
			return new Point(event.getX(), event.getY());
		return null;
	}

	@Override
	public List<IEntityView> getRootEntities() {
		List<IEntityView> roots = new ArrayList<>();
		boolean again;
		int i;
		final int size = relations.size();
		IRelationView relation;

		for(IEntityView entityView : entities)
			if(entityView.isVisible()) {
				i = 0;
				again = true;

				while(again && i<size) {
					relation = relations.get(i);

					if(relation instanceof InheritanceView && relation.getEntitySrc()==entityView && relation.getEntityTar().isVisible())
						again = false;

					i++;
				}

				if(again && !roots.contains(entityView))
					roots.add(entityView);
			}

		return roots;
	}


	public void setPropertiesVisible(final boolean visible) {
		propertiesVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setPropertiesVisible(visible);
	}


	public void setOperationsVisible(final boolean visible) {
		operationsVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setOperationsVisible(visible);
	}



	public InheritanceView removeInheritanceView(final IEntityView src, final IEntityView tar) {
		InheritanceView view = null;
		boolean again	= true;
		final int size	= relations.size();
		int i			= 0;
		IRelationView link;

		while(again && i<size) {
			link = relations.get(i);

			if(link instanceof InheritanceView) {
				view = (InheritanceView) link;

				if(view.getEntitySrc()==src && view.getEntityTar()==tar) {
					relations.remove(link);
					again = false;
				}
			}

			i++;
		}

		return again ? null : view;
	}


	public InheritanceView addInheritanceView(final ClassView src, final ClassView tar) {
		final InheritanceView view = new InheritanceView(src, tar);
		addRelation(view);
		return view;
	}


	public IRelationView getOppositeRelation(final ClassView srcClass, final ClassView tarClass,
						final String srcRole, final String targetRole, final String srcCard) {
		IRelationView oppositeRel = null;
		
		if(targetRole!=null) {
			//checking if the target relation has been already added by its opposite.
			int i 			= 0;
			final int size 	= relations.size();
			IRelationView link;
			
			RoleView role;

			while(oppositeRel==null && i<size) {
				link = relations.get(i);

				if(link.getEntitySrc()==tarClass && link.getEntityTar()==srcClass && link instanceof RelationClassView) {
					role = ((RelationClassView)link).getRoleTar();

					if(role!=null && role.name.text.equals(srcRole) && role.cardText.text.equals(srcCard))
						oppositeRel = link;
				}
				i++;
			}
		}
		
		return oppositeRel;
	}


	public IRelationView addRelation(final ClassView srcClass, final ClassView tarClass, final boolean isComposition, final boolean isCompoAtSrc,
						final String srcRole, final String targetRole, final String srcCard, final String targetCard) {
		if(getOppositeRelation(srcClass, tarClass, srcRole, targetRole, srcCard)!=null)
			return null;

		final IRelationView view = new RelationClassView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole,
														 Cardinality.getCardinality(srcCard), Cardinality.getCardinality(targetCard));
		addRelation(view);
		return view;
	}


//	public IEntityView addEntity(final String name, final String qname, final boolean isAbstract, final int position, final boolean isAspect) {
//		IEntityView view = null;
//		double xMax = -Double.MAX_VALUE;
//		double x;
//		IEntityView maxEntity = null;
//
//		if(isAspect) {
//			int i = 0;
//			final int size = entities.size();
//
//			while(view==null && i<size) {
//				if(((ClassView)entities.get(i)).getQname().equals(qname))
//					view = entities.get(i);
//				else
//					i++;
//			}
//
//			if(view==null)
//				System.err.println("ERROR: aspect added but not its reference class");
//
//			return view;
//		}
//
//		view = new ClassView(name, qname, isAbstract, this);
//
//		// entities must not located at the same position. Otherwise it may have problem
//		// during the anchoring of relations.
//		// So we search to maximal X-coordinate.
//		for(final IEntityView entityView : entities) {
//			x = entityView.getCentre().getX();
//
//			if(x>xMax) {
//				xMax 		= x;
//				maxEntity 	= entityView;
//			}
//		}
//
//		// The max coordinate plus a value is set to the view to be located
//		// at a unique position.
//		view.move(maxEntity==null ? 0. : xMax+maxEntity.getWidth(), view.getCentre().getY());
//		addEntity(position, view);
//
//		return view;
//	}


	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}
}
