package kermeta.exceptions
import fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation

object KerRichFactory {
 def createException : Exception = {   
   try { 
	 throw new java.lang.Exception
 } catch {
     case e: java.lang.Exception => e.printStackTrace()
   }
 println("Exception");new Throwable with Exception }
 def createConstraintViolatedInvException : ConstraintViolatedInv = { println("ConstraintViolatedInv");new Throwable with ConstraintViolatedInv  }
  def createNotImplementedException : NotImplementedException = { println("NotImplementedException");new Throwable with NotImplementedException  }
  def createCallOnVoidTarget:CallOnVoidTarget= { println("CallOnVoidTarget"); new Throwable with CallOnVoidTarget }
}

 