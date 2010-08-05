/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 5 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.logger_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.kermeta.utils.logger.eclipse.messages.ConsoleMessage;

public class LoggerConsole extends MessageConsole {
	
	
	/**
	 * Considering the IOConsole protocol, several output stream can be created.
	 * For the moment, we just need one. To get access to it, please use the accessor method.
	 */
	protected OutputStream outputStream = null;
	
	/**
	 * The reader is used to read strings from the keyboard. To get access to it, please use the accessor method.
	 */
	protected BufferedReader reader;
	
	/** 	max width of the lines in the console, if overflow, start a new line */
	public static final int CONSOLE_MAX_WIDTH = 5000;
	
	/**
	 * Constructor
	 * @param name : name of the console
	 * @param imageDescriptor : image descriptor of the console
	 */
	public LoggerConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		// TODO Auto-generated constructor stub
		init();
	}
	
	/**
	 * Initialize the console
	 */
	public void init () {
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ this });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this);
	}
	
	
	/**
	 * Retrieve the outputStream
	 * @return
	 */
	public OutputStream getOutputStream() {
		if ( this.outputStream == null )
			this.outputStream = this.newOutputStream();
		return this.outputStream;
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public BufferedReader getReader() {
		if ( reader == null )
			reader = new BufferedReader( new InputStreamReader( this.getInputStream() ) );
		return reader;
	}
	
	/**
	 * Display a string message into the console
	 * @param message : the message to display
	 */
	public void print(String message) {
		try {
			((IOConsoleOutputStream)getOutputStream()).write(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Display a string message into the console and go to a new line after
	 * @param message : the message to display
	 */
	public void println(String message) {
		try {
			((IOConsoleOutputStream)getOutputStream()).write(message +"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Display a ConsoleMessage on the console
	 * @param message : (ConsoleMessage) the message to display
	 */
	public void print(ConsoleMessage message) {
		changeColor(message.getColorMessage());
		String representation = getMessageRepresentation(message);
		String justified = justifyMessage(representation);
		try {
			((IOConsoleOutputStream)getOutputStream()).write(justified );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/** Display a ConsoleMessage on the console and go to a new line after
	 * @param message : (ConsoleMessage) the message to display
	 */
	public void println(ConsoleMessage message) {
		changeColor(message.getColorMessage());
		String representation = getMessageRepresentation(message);
		String justified = justifyMessage(representation);
		try {
			((IOConsoleOutputStream)getOutputStream()).write(justified + "\n" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Give the message representation in the console
	 * @param message : the message to display
	 * @return a string that correspond to the console representation of the message
	 */
	public String getMessageRepresentation (ConsoleMessage message) {
		String display = "["+ message.getLevel() + "]" + "	" + "[" + message.getQualifier()+ "]" + "	" + message.getMessage();
		if (message.getException() != null) {
			display += "	" + message.getException().getMessage();
		}
		return display;
	}
	
	
	/**
	 * this methods allow to change the color of futur message
	 * (this is because a simple change of current stream color, change the color for all messages, even previous ones ...) 
	 * @param c
	 */
	public void changeColor(Color c){
		Color previousColor = ((IOConsoleOutputStream) getOutputStream()).getColor();
		if(!c.equals(previousColor)){
			// need to change to another stream for the new color
			changeStream(); // reset the stream
			((IOConsoleOutputStream) getOutputStream()).setColor(c);
		}
	}
	/**
	 * allows to change stream, sometime needed if a stream is too full or when changing color
	 */
	public void changeStream(){
		try {
			if(outputStream != null)
				outputStream.close();
		} catch (IOException e) {
		}
		outputStream = null;
	}
	
	public static String justifyMessage(String message){
		StringBuffer justifiedMessage = new StringBuffer(message);
		int lastNLIndex = 0;
		int index = 0;
		while(index < justifiedMessage.length()){
			if(justifiedMessage.charAt(index) == '\n' || index == justifiedMessage.length()-1){
				if(index - lastNLIndex > CONSOLE_MAX_WIDTH){
					// need to insert a newline
					justifiedMessage.insert(lastNLIndex+CONSOLE_MAX_WIDTH, '\n');
					lastNLIndex=lastNLIndex+CONSOLE_MAX_WIDTH;
					// normally , since we have inserted a char we should fall on the same newline char again
				}
				else
					lastNLIndex=index;
			}
			index++;
		}
		
		return justifiedMessage.toString();
	}
	
	public String read() {
		this.activate();
		String line = "";
		System.out.println("begin read");
		BufferedReader reader = new BufferedReader( new InputStreamReader( this.getInputStream() ) ) ;
		try {
			line = reader.readLine();
			if ( line == null )
				line = "";
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		System.out.println("read " + line);
		return line;
	}
	
	
	

}

