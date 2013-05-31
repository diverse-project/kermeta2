package org.kermeta.kompren.gwelet.actions;

import javax.swing.JScrollBar;

import org.malai.swing.action.library.MoveCamera;
import org.malai.undo.Undoable;

public class MoveCameraUndoable extends MoveCamera implements Undoable {

	protected int oldPositionX;
	protected int oldPositionY;
	
	
	public MoveCameraUndoable() {
		super();
	}
	

	@Override
	protected void doActionBody() {
		oldPositionX = scrollPane.getHorizontalScrollBar().getValue();
		oldPositionY = scrollPane.getVerticalScrollBar().getValue();
		super.doActionBody();
	}



	@Override
	public void undo() {
		moveScrollBar2(scrollPane.getHorizontalScrollBar(), oldPositionX);
		moveScrollBar2(scrollPane.getVerticalScrollBar(), oldPositionY);
	}

	@Override
	public void redo() {
		moveScrollBar2(scrollPane.getHorizontalScrollBar(), (int)px);
		moveScrollBar2(scrollPane.getVerticalScrollBar(), (int)py);
	}
	
	
	protected void moveScrollBar2(final JScrollBar bar, final int position) {
		bar.setValue(position);
	}
	

	@Override
	public String getUndoName() {
		return "Move camera";
	}
}
