package kermeta.exceptions
import fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation

object RichFactory {
 def createException : Exception = { new Throwable with Exception }
 def createConstraintViolatedInvException : ConstraintViolatedInv = { new Throwable with ConstraintViolatedInv  }
 def createNotImplementedException : NotImplementedException = { new Throwable with NotImplementedException  }
  def createCallOnVoidTarget:CallOnVoidTarget= {new Throwable with CallOnVoidTarget }
}

 