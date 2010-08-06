/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.messages;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.kermeta.language.api.KermetaMessage.Level;

/**
 * This class is used to determines what is the color to use with a given Level of KermetaMessage.
 * It is a singleton.
 * @author mgouyett
 *
 */
public class MapColorMessage {
	
	/**
	 * Instance of the singleton MapColorMessage
	 */
	public static MapColorMessage instance = new MapColorMessage();
	
	/**
	 * Map used to store association between Level and Color
	 */
	private Map<Level, Color> colorMap;
	
	/**
	 * Constructor
	 */
	private MapColorMessage() {
		colorMap = new HashMap<Level, Color>();
		colorMap.put(Level.DEBUG, ConsoleMessage.DEBUG);
		colorMap.put(Level.DEFAULT, ConsoleMessage.DEFAULT);
		colorMap.put(Level.ERROR, ConsoleMessage.ERROR);
		colorMap.put(Level.INFO, ConsoleMessage.INFO);
		colorMap.put(Level.WARNING, ConsoleMessage.WARNING);	
	}
	
	/**
	 * Retrieve the colorMap
	 * @return the map that contains associations between KermetaMessage level and color
	 */
	public Map<Level,Color> getMap() {
		return this.colorMap;
	}
	
	/**
	 * Retrieve the color corresponding to a given Level of a KermetaMessage
	 * @param level : the level of the KermetaMessage
	 * @return the color to display the KermetaMessage
	 */
	public Color getColor(Level level){
		Color color = colorMap.get(level);
		if (color == null) { // Level does not exist on the map
			color = ConsoleMessage.DEFAULT;
		}
		return color;
	}
	
	/**
	 * Retrieve the instance of the MapColorMessage.
	 * @return the instance
	 */
	public static MapColorMessage getInstance() {
		return instance;
	}
	
	

}

