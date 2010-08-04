/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 4 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.treatment;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.kermeta.language.api.KermetaMessage.Level;

public class ColorMessages {
	
	// some default colors that can be used
	public static final Color INFO = new Color(null, 0,0,255);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,100,0);
	public static final Color DEBUG = new Color(null, 0,0,0);
	public static final Color DEFAULT = new Color(null, 0,0,0);
	
	private Map<Level, Color> colorMap;
	private static ColorMessages instance = new ColorMessages();
	
	private ColorMessages() {
		colorMap = new HashMap<Level, Color>();
		colorMap.put(Level.DEBUG, ColorMessages.DEBUG);
		colorMap.put(Level.ERROR, ColorMessages.ERROR);
		colorMap.put(Level.INFO, ColorMessages.INFO);
		colorMap.put(Level.WARNING, ColorMessages.WARNING);
	}
	
	public Map getColorMap() {
		return this.colorMap;
	}
	
	public Color getColor (Level level){
		Color color = colorMap.get(level);
		if (color == null) { // Level does not exist on the map
			color = ColorMessages.DEFAULT;	
		}
		return color;
	}
	
	public static ColorMessages getInstance() {
		return instance;
	}

}

