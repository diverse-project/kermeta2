package org.kermeta.utils.systemservices.api.impl;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.messaging.Request;

/*
 * Get request from a ClientMessagingSystem and
 * call corresponding methods of the real MessagingSystem
 */
public class Server4MessagingSystem implements Runnable{
	
	int port;
	
	MessagingSystem logger;
	
	ServerSocket serverSocket;

	public Server4MessagingSystem(int port, MessagingSystem ms) {	
		try {
			
			this.logger = ms;
			serverSocket = new ServerSocket(port);
			this.port = serverSocket.getLocalPort();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getPort(){
		return port;
	}

	@Override
	public void run() {
		
        ObjectInputStream reader = null;
        Object msg;
        
        try {
    		Socket clientSocket = serverSocket.accept();
    		
    		InputStream in = clientSocket.getInputStream();
        	reader = new ObjectInputStream(new BufferedInputStream(in));
        	
        	logger.log(Kind.DevINFO, "Messaging system server started on port "+port, "");	
        	
            while(true) {
            	msg = reader.readObject();
            	Request req = (Request)msg;
            	
            	switch (req.calledMethod) {
				case clearLog:
					logger.clearLog();
					break;
				case log:
					logger.log(req.msgKind, req.message, req.messageGroup);		
					break;
				case logProblem:
					//not implemented
					break;
				case initProgress:
					logger.initProgress(req.progressGroup, req.message, req.messageGroup, req.nbUnit);
					break;
				case progress:
					logger.progress(req.progressGroup, req.message, req.messageGroup, req.nbUnit);
					break;
				case doneProgress:
					logger.doneProgress(req.progressGroup, req.message, req.messageGroup);
					break;

				default:
					//do nothing
					break;
				}
            }
        }
        catch (EOFException e) {
        	try {
        		if(reader != null) reader.close();
			} catch (IOException e1) {
				logger.error(e1.getMessage(), "",e1);
			}
        }
        catch (Exception e) {
        	logger.error(e.getMessage(), "",e);
        }		
	}
	
}
