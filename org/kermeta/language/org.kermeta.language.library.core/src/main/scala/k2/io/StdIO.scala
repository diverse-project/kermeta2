/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io

import java.net._;
import java.io._;
import org.kermeta.utils.systemservices.api.messaging.Request;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind

class StdIOClass extends k2.standard.EObjectImplForPrimitive {
  
	var out : ObjectOutputStream = null

    // writebuffer is used to make sure we create an info message only when a \n is reached or another messages needs it to be flushed
    var _writeBuffer : StringBuffer = new  StringBuffer
    def write(obj : AnyRef) : Unit = {

        System.out.print(obj.toString)

    }

    def errorln(obj : AnyRef) : Unit = {

        log(3,obj.toString,"")

    }


    var _errorBuffer : StringBuffer = new  StringBuffer
    def error(obj : AnyRef) : Unit = {

        System.err.print(obj.toString)

    }

    def flushBuffers() : Unit = {

    }

    def writeln(obj : AnyRef) : Unit = {

    	log(1,obj.toString,"");
      
    }

    def read(prompt : String) : String = {

          System.out.print(prompt)
          System.out.flush()
          Thread.`yield`()
          System.out.flush()
          Thread.`yield`()
          System.out.flush()
          Thread.`yield`()
          System.out.flush()
          Thread.`yield`()
          var ligne_lue:String =null;
          var lecteur: java.io.InputStreamReader =new java.io.InputStreamReader(System.in);
          var entree:java.io.BufferedReader =new java.io.BufferedReader(lecteur);
          ligne_lue=entree.readLine();
          return ligne_lue;

    }
    
    def log(kind : Int, message : String, messageGroup : String) : Unit = {

      var req : Request = new Request();
      req.message = message;
      req.messageGroup = messageGroup;
      req.calledMethod = Request.Method.log;
      kind match {
        case 1 => req.msgKind = Kind.UserINFO;
        case 2 => req.msgKind = Kind.UserWARNING;
        case 3 => req.msgKind = Kind.UserERROR;
        case 4 => req.msgKind = Kind.DevDEBUG;
        case 5 => req.msgKind = Kind.DevINFO;
        case 6 => req.msgKind = Kind.DevWARNING;
        case 7 => req.msgKind = Kind.DevERROR;
      }
      out.writeObject(req);
      out.flush();
    }
    
    def initProgress(progressGroup : String, message : String, messageGroup : String, nbWorkUnit : Int) : Unit = {
      var req : Request = new Request();
      req.message = message;
      req.progressGroup = progressGroup;
      req.messageGroup = messageGroup;
      req.calledMethod = Request.Method.initProgress;
      req.nbUnit = nbWorkUnit;
      out.writeObject(req);
      out.flush();
    }
		
	def progress(progressGroup : String, message : String, messageGroup : String, workedUnit : Int) : Unit = {
	  var req : Request = new Request();
      req.message = message;
      req.progressGroup = progressGroup;
      req.messageGroup = messageGroup;
      req.calledMethod = Request.Method.progress;
      req.nbUnit = workedUnit;
      out.writeObject(req);
      out.flush();
	}
		
	def doneProgress(progressGroup : String, message : String, messageGroup : String) : Unit = {
	  var req : Request = new Request();
      req.message = message;
      req.progressGroup = progressGroup;
      req.messageGroup = messageGroup;
      req.calledMethod = Request.Method.doneProgress;
      req.messageGroup = messageGroup;
      out.writeObject(req);
      out.flush();
	}
	
	def clearLog() : Unit = {
	  var req : Request = new Request();
      req.calledMethod = Request.Method.clearLog;
      out.writeObject(req);
      out.flush()
	}
	
}

object StdIO extends StdIOClass{
  var port : Int = 4444;
  var address : String = "localhost";
	try{   
		   var kkSocket : Socket = new Socket(address, port);
		   out = new ObjectOutputStream(kkSocket.getOutputStream()); 
		   
	} catch {
		case e: Exception => System.out.println("exception caught: " + e);
	}
}
