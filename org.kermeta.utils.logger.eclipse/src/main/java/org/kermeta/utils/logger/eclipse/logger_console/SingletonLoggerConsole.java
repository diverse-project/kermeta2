/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.logger_console;

public class SingletonLoggerConsole {
	
 private static  LoggerConsole  instance = new LoggerConsole("Log Console",null);
 private static SingletonLoggerConsole inst = new SingletonLoggerConsole();
 
 public static LoggerConsole getInstanceConsole() {
	 return instance;
 }
 
 public static SingletonLoggerConsole getInst () {
	 return inst;
 }

}

