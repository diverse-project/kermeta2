/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io
import  _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;


class StdIOClass extends k2.standard.EObjectImplForPrimitive {

    // A MessagingSystem can be set. It will be used instead of StdioSimpleMessagingSystem
    var _messagingSystem :  _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem = new _root_.org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem
    def messagingSystem_=(arg : _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem) = {
      _messagingSystem = arg
    }

    // writebuffer is used to make sure we create an info message only when a \n is reached or another messages needs it to be flushed
    var _writeBuffer : StringBuffer = new  StringBuffer
    def write(obj : AnyRef) : Unit = {
      
         val message : String = obj.toString
        _writeBuffer.synchronized{         // basic way to handle buffer, flush if ends with \n
            _writeBuffer.append(message)
            if(message.endsWith("\n")){
                flushBuffers()
            }
        }
    }
    
    def errorln(obj : AnyRef) : Unit = {
      flushBuffers()
      _messagingSystem.error(obj.toString,"")
    }
    
    var _errorBuffer : StringBuffer = new  StringBuffer
    def error(obj : AnyRef) : Unit = {

        val message : String = obj.toString
        _errorBuffer.synchronized{         // basic way to handle error buffer, wait for
          _errorBuffer.append(message)
          if(message.endsWith("\n")){
              flushBuffers()
          }
        } 
    }
     
    def writeln(obj : AnyRef) : Unit = {
       flushBuffers()
       _messagingSystem.info(obj.toString,"")
    }


    def flushBuffers() : Unit = {

      _errorBuffer.synchronized{         // basic way to handle error buffer,
          if(_errorBuffer.length() != 0){
        	  _messagingSystem.error(_errorBuffer.toString,"")
              _errorBuffer = new  StringBuffer
          }
      }
      _writeBuffer.synchronized{         // basic way to handle write buffer,
          if(_writeBuffer.length() != 0){
        	  _messagingSystem.info(_writeBuffer.toString,"")
              _writeBuffer = new  StringBuffer
          }
      }
    }

    def read(prompt : String) : String = {
      return	_messagingSystem.readLine(prompt)
    }
    
    def log(kind: Int, message: String, messageGroup: String): Unit = {
      var realKind : Kind = null
	    kind match {
	      case 1 => realKind = Kind.UserINFO;
	      case 2 => realKind = Kind.UserWARNING;
	      case 3 => realKind = Kind.UserERROR;
	      case 4 => realKind = Kind.DevDEBUG;
	      case 5 => realKind = Kind.DevINFO;
	      case 6 => realKind = Kind.DevWARNING;
	      case 7 => realKind = Kind.DevERROR;
	    }
      _messagingSystem.log(realKind, message, messageGroup);
  }

  def initProgress(progressGroup: String, message: String, messageGroup: String, nbWorkUnit: Int): Unit = {
      _messagingSystem.initProgress(progressGroup, message, messageGroup, nbWorkUnit);
  }

  def progress(progressGroup: String, message: String, messageGroup: String, workedUnit: Int): Unit = {
      _messagingSystem.progress(progressGroup, message, messageGroup, workedUnit);
  }

  def doneProgress(progressGroup: String, message: String, messageGroup: String): Unit = {
      _messagingSystem.doneProgress(progressGroup, message, messageGroup);
  }

  def clearLog(): Unit = {
      _messagingSystem.clearLog();
  }
}

object StdIO extends StdIOClass{
}
