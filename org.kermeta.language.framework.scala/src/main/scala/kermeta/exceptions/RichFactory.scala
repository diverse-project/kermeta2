package kermeta.exceptions
import fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation

object RichFactory {
 def createException : Exception = { new Throwable with Exception with DefaultObjectImplementation}
 def createConstraintViolatedInvException : ConstraintViolatedInv = { new Throwable with ConstraintViolatedInv with DefaultObjectImplementation  }
 def createNotImplementedException : NotImplementedException = { new Throwable with NotImplementedException with DefaultObjectImplementation  }
  def createCallOnVoidTarget:CallOnVoidTarget= {new Throwable with CallOnVoidTarget with DefaultObjectImplementation}
}

 