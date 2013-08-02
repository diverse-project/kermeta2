package org.kermeta.kp.compiler.commandline;

import java.awt.Color;

import org.kermeta.console.Console;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


/**
 * A console for StdIO of K1 compiled programs that redirect toward a MessagingSystem
 * @author dvojtise
 *
 */
public class MessagingSystemV1Console implements Console {

	MessagingSystem logger;
	
	StringBuffer sb = new StringBuffer();
	
	public MessagingSystemV1Console(MessagingSystem logger) {
		this.logger = logger;
	}

	@Override
	public void changeColor(Color arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void errorln(String message) {
		logger.error(message, "");
	}

	@Override
	public String readln() {
		return logger.readLine();
	}

	@Override
	public void write(String message) {
		sb.append(message);
		if(message.endsWith("\n")){
			String[] splittedMsg = sb.toString().split("\n");
			for (int i = 0; i < splittedMsg.length; i++) {
				logger.info(splittedMsg[i], "");
			}
			sb = new StringBuffer();
		}

	}

	@Override
	public void writeln(String message) {
		if(sb.length() > 0){
			sb.append(message);
			logger.info(sb.toString(), "");
			sb = new StringBuffer();
		}
		else{
			logger.info(message,"");
		}
	}

}
