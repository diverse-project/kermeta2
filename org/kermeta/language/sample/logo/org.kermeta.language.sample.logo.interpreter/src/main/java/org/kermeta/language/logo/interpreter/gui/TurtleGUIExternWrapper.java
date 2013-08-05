/* $Id: TurtleGUIWrapper.java,v 1.3 2007-11-29 15:26:55 dvojtise Exp $
 * Project    : org.kermeta.kmLogo
 * File       : TurtleGUIWrapper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package org.kermeta.language.logo.interpreter.gui;

import logo_interpreter.kmLogo.gui.TurtleGUIAspect;

/**
 * This calls is used to provide access to the java object
 * it gives the static methods needed by Kermeta 
 *
 */
//TODO see why we need the TurtleGUIAspect instead of TurtleGUI
public class TurtleGUIExternWrapper {

	/**
	 * as call from kermeta using :
	 * 		extern org::kermeta::kmLogo::wrapper::TurtleGUIWrapper.initialize(self, name)
	 * @param self
	 * @param roname
	 * @return
	 */
	public static void initialize(TurtleGUIAspect self, String name)
    {
		// create the needed object in self
		// put the java object in the getData structure in order to manipulate only this one
		// and not a static object shared by all instances ...
		ITurtleGUI turtleGUI = new TurtleSimpleAWTGUI(name, 600);
		
		// the UserData is used to store the real Java Object
		self.KersetJavaObject(turtleGUI);
		
    }
	/**
	 * called from kermeta using
	 * 		extern org::kermeta::kmLogo::wrapper::TurtleGUIWrapper.drawLine(self, x1,y1, x2, y2)
	 * @param self
	 * @param rox1
	 * @param roy1
	 * @param rox2
	 * @param roy2
	 * @return
	 */
	public static void drawLine(TurtleGUIAspect self,
			int x1, int y1, 
			int x2, int y2)
    {
		ITurtleGUI turtleGUI = self.KergetJavaObject();
		turtleGUI.drawLine(x1, y1, x2, y2);
    }
	
	public static void drawTurtle(TurtleGUIAspect self,
			int x, int y, 
			double angle, boolean penUp)
    {
		ITurtleGUI turtleGUI = self.KergetJavaObject();
		turtleGUI.drawTurtle(x, y, angle, penUp);
		
    }
	
	public static void clearDrawing(TurtleGUIAspect self)
    {
		ITurtleGUI turtleGUI = self.KergetJavaObject();
		turtleGUI.clearDrawing();
		
    }
	
	
}
