/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io


class StdIOClass extends k2.standard.EObjectImplForPrimitive {

    // by default _root_.org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem
    // in more complex environment, one can override it
    var _messagingSystem : _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem  = new _root_.org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem();
    def messagingSystem_=(arg : _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem) = {
      _messagingSystem = arg
    }

    // writebuffer is used to make sure we create an info message only when a \n is reached or another messages needs it to be flushed
    var _writeBuffer : StringBuffer = new  StringBuffer
    def write(obj : AnyRef) : Unit = {
      if(_messagingSystem != null){
         val message : String = obj.toString
        _writeBuffer.synchronized{         // basic way to handle buffer, flush if ends with \n
            _writeBuffer.append(message)
            if(message.endsWith("\n")){
                flushBuffers()
            }
        }
      }
      else{
        // should never happen
        System.out.print(obj.toString)
      }
    }

    def errorln(obj : AnyRef) : Unit = {
      if(_messagingSystem != null){
        flushBuffers()
        _messagingSystem.error(obj.toString,"")
      }
      else{
        // should never happen
        System.err.println(obj.toString)
      }
    }


    var _errorBuffer : StringBuffer = new  StringBuffer
    def error(obj : AnyRef) : Unit = {
      if(_messagingSystem != null){
        val message : String = obj.toString
        _errorBuffer.synchronized{         // basic way to handle error buffer, wait for
          _errorBuffer.append(message)
          if(message.endsWith("\n")){
              flushBuffers()
          }
        }
      }
      else{
        // should never happen
        System.err.print(obj.toString)
      }
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

    def writeln(obj : AnyRef) : Unit = {
        if(_messagingSystem != null){
          flushBuffers()
          _messagingSystem.info(obj.toString,"")
        }
        else{
        // should never happen
          System.out.println(obj.toString)
        }
    }

    def read(prompt : String) : String = {
        if(_messagingSystem != null){
          return _messagingSystem.readLine(prompt)
        }
        else{
          // should never happen
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
    }

}

object StdIO extends StdIOClass{
}
