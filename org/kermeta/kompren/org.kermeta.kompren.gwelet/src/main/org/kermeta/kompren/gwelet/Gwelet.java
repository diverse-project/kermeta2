package org.kermeta.kompren.gwelet;

import javax.swing.ToolTipManager;
import javax.swing.UIManager;

import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicerrunner.MainRunner;

public class Gwelet {
	public static void main(final String[] args) {
		MainRunner.init();

		if(System.getProperty("os.name").toLowerCase().contains("linux"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }
		if(System.getProperty("os.name").toLowerCase().contains("win"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }

		GweletFrame frame = new GweletFrame();
		frame.getComposer().compose(null);
		frame.setVisible(true);
		ToolTipManager.sharedInstance().setInitialDelay(10);
		ToolTipManager.sharedInstance().setDismissDelay(100000);
		frame.open("src/resources/examples/UML.km");
		frame.getCanvas().requestFocusInWindow();
//		((GweletUIBuilder)frame.getComposer()).formular.setVisible(true);// EVAL
	}
}
