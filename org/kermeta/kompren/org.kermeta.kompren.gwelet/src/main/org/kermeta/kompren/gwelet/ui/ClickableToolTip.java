package org.kermeta.kompren.gwelet.ui;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JToolTip;
import javax.swing.LookAndFeel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.plaf.ToolTipUI;

import org.kermeta.kompren.gwelet.actions.MoveCameraUndoable;
import org.kermeta.kompren.gwelet.instruments.Completioner;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.malai.undo.UndoCollector;

public class ClickableToolTip extends JToolTip {
	private static final long serialVersionUID = 1L;

	protected JEditorPane theEditorPane;
	
	protected MetamodelView mmView;

	public ClickableToolTip(MetamodelView mmView) {
		super();
		this.mmView = mmView;
		setLayout(new BorderLayout());
		LookAndFeel.installBorder(this, "ToolTip.border");
		LookAndFeel.installColors(this, "ToolTip.background", "ToolTip.foreground");
		theEditorPane = new JEditorPane();
		theEditorPane.setContentType("text/html");
		theEditorPane.setEditable(false);

		theEditorPane.addHyperlinkListener(new HyperlinkListener() {
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
					MoveCameraUndoable action = new MoveCameraUndoable();
					Completioner.Interaction2MoveCamera.setAction(e.getDescription(), ClickableToolTip.this.mmView, action);
					
					if(action.canDo())
						action.doIt();
					UndoCollector.INSTANCE.add(action, null);
				}
			}
		});
		add(theEditorPane);
	}
	
	
	@Override
	public void setTipText(String tipText) {
		theEditorPane.setText(tipText);
	}

	@Override
	public void updateUI() {
		setUI(new ToolTipUI() {});
	}
}
