package org.kermeta.kompren.gwelet.eval;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


public class Sniffer {
	protected FigureCanvas frame;
	
	protected RulerComposite ruler;

	protected Question currentQuestion;


	public Sniffer(final FigureCanvas control, final RulerComposite ruler){
		super();

		this.frame = control;
		this.ruler = ruler;

		control.getVerticalBar().addSelectionListener(new SniffScrollers());
		control.getHorizontalBar().addSelectionListener(new SniffScrollers());
		frame.addMouseListener(new SniffPresses());
		frame.addMouseMoveListener(new SniffMoves());
		frame.addMouseWheelListener(new SniffScrolls());
	}


	public void setQuestion(final Question question) {
		currentQuestion = question;
		if(question!=null)
			question.nbMouseDistance = 0l;
	}


	
	class SniffScrolls implements MouseWheelListener {
		public void mouseScrolled(MouseEvent e) {
			if(currentQuestion!=null)
				if((e.stateMask & SWT.MODIFIER_MASK)==0) // only scroll
					currentQuestion.nbScrolls++;
				else
					currentQuestion.nbZooms++;
		}
	}
	
	

	class SniffPresses implements MouseListener {
		public void mouseDoubleClick(MouseEvent e) {
			//
		}

		public void mouseDown(MouseEvent e) {
			if(currentQuestion!=null)
				currentQuestion.nbMousePress++;			
		}

		public void mouseUp(MouseEvent e) {
			//
		}
	}



	class SniffMoves implements MouseMoveListener {
		public void mouseMove(MouseEvent e) {
			if(currentQuestion!=null)
				currentQuestion.nbMouseDistance++;
		}
	}


	class SniffScrollers implements SelectionListener {
		public void widgetSelected(SelectionEvent e) {
			if(currentQuestion!=null)
				currentQuestion.nbScrolls++;			
		}

		public void widgetDefaultSelected(SelectionEvent e) {
			//
		}
	}
}
