package org.kermeta.kompren.gwelet.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IHandler;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.malai.picking.Pickable;

public class FooHand implements MouseListener, MouseMotionListener {
	protected IModelView diagram;

	protected IHandler draggedHandler;

	protected FloatingText draggedRole;

	protected double startX;

	protected double startY;

	protected List<IRelationView> visibleHandlers;



	public FooHand(final IModelView diagram) {
		super();

		visibleHandlers = new ArrayList<IRelationView>();
		this.diagram 	= diagram;
		reinit();
	}


	protected void reinit() {
		draggedHandler 	= null;
		draggedRole 	= null;
		startX 			= 0.;
		startY 			= 0.;
	}




	@Override
	public void mouseClicked(final MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON2) {
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IHandler handler = null;
			IRelationView rel = null;

			for(int i=0, nbRel = diagram.getNbRelations(); i<nbRel && handler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && rel.isHandlersVisible())
					handler = rel.getHandlersAt(px, py);
			}

			if(handler!=null && rel!=null && rel.getNbSegment()>1) {
				boolean ok = rel.removePoint(handler.getPoint());

				if(ok)
					diagram.refresh();
			}
		}
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		//
	}

	@Override
	public void mouseExited(final MouseEvent e) {
		//
	}


	@Override
	public void mousePressed(final MouseEvent e) {
		if(diagram.getZoom()<0.5) return;
		if(e.getButton()==MouseEvent.BUTTON1) {
			final int nbRel = diagram.getNbRelations();
			int i;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IRelationView rel;
			Pickable pickable;

			for(i=0; i<nbRel && draggedHandler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && !rel.isOptimHidden() && rel.isHandlersVisible())
					draggedHandler = rel.getHandlersAt(px, py);
			}

			if(diagram.getSelection().isEmpty() && draggedHandler==null) {
				for(i=0; i<nbRel && draggedHandler==null; i++) {
					rel = diagram.getRelationAt(i);

					if(rel.isVisible() && !rel.isOptimHidden() && rel.contains(px, py)) {
						pickable = rel.getPickableAt(px, py);

						if(pickable instanceof RoleView)
							draggedRole = ((RoleView)pickable).getFloatingTextAt(px, py);
						else {
							rel.addPoint(new Point2D.Double(px, py));
							rel.setHandlersVisible(true);
							draggedHandler = rel.getHandlersAt(px, py);
							diagram.refresh();
						}
					}
				}
			}

			startX = px;
			startY = py;
		}
	}


	@Override
	public void mouseReleased(final MouseEvent e) {
		reinit();
	}


	@Override
	public void mouseDragged(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		if(zoom<0.5) return;
		final double gapX = e.getX()/zoom - startX;
		final double gapY = e.getY()/zoom - startY;

		if(draggedHandler!=null) {
			draggedHandler.translate(gapX, gapY);

			if(draggedHandler.getPicker() instanceof IRelationView) {
				final IRelationView rel = (IRelationView) draggedHandler.getPicker();
				IEntityView entity;

				if(rel.getHandlers(-1)==draggedHandler)
					entity = rel.getEntityTar();
				else if(rel.getHandlers(0)==draggedHandler)
					entity = rel.getEntitySrc();
				else
					entity = null;

				if(entity!=null) {
					Point2D pt = entity.getClosestPoint(new Point2D.Double(e.getX()/zoom, e.getY()/zoom));

					if(pt!=null)
						draggedHandler.getPoint().setLocation(pt);
				}
			}

			diagram.updatePreferredSize();
			diagram.refresh();
		} 

		startX = e.getX()/zoom;
		startY = e.getY()/zoom;
	}


	@Override
	public void mouseMoved(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		if(zoom<0.5) return;
		final double x = e.getX()/zoom;
		final double y = e.getY()/zoom;
		boolean mustRefresh = !visibleHandlers.isEmpty();
		IRelationView relation=null;

		((MetamodelView)diagram).setToolTipText(null);
		
		for(final IRelationView rel : visibleHandlers)
			rel.setHandlersVisible(false);

		visibleHandlers.clear();

		for(int i=0, size=diagram.getNbRelations(); i<size  && relation==null; i++) {
			relation = diagram.getRelationAt(i);

			if(!relation.isOptimHidden() && relation.isVisible() && relation.contains(x, y)) {
				relation.setHandlersVisible(true);
				visibleHandlers.add(diagram.getRelationAt(i));
				mustRefresh = true;
			}else relation = null;
		}

		if(relation!=null) {
			ClassView oppClass = null;
			RoleView role = null;
			
			if(relation.getEntitySrc().isOptimHidden()) {
				oppClass = (ClassView) relation.getEntitySrc();
				if(relation instanceof RelationClassView)
					role = ((RelationClassView)relation).getRoleTar();
			}
			else
				if(relation.getEntityTar().isOptimHidden()) {
					oppClass = (ClassView) relation.getEntityTar();
					if(relation instanceof RelationClassView)
						role = ((RelationClassView)relation).getRoleSrc();
				}
			
			if(oppClass!=null) {
				String qname = oppClass.getQname();
				String txt = "<html>Opposite Class: <b><a href=\""+qname+"\">"+qname+"</a></b><br>";
				if(role!=null) {
					txt += "Opposite role: <b>"+role.getName()+"</b><br>Opposite cardinality: <b>"+role.getCardText()+"</b>";
				}
				
				txt += "</html>";
				((MetamodelView)diagram).setToolTipText(txt);
			}
		}
		
		if(mustRefresh)
			diagram.refresh();
	}
}
