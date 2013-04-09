package kermeta.kunit
import fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation

object KerRichFactory extends  KunitImplicitConversion{
// def createMain : kermeta.kunit.Main = { new kermeta.kunit.RichMain }
 def createInvalidTestCaseNameException : kermeta.kunit.InvalidTestCaseNameException = { new kermeta.kunit.RichInvalidTestCaseNameException with DefaultObjectImplementation }
 def createInvalidParameterException : kermeta.kunit.InvalidParameterException = { new kermeta.kunit.RichInvalidParameterException with DefaultObjectImplementation}
 def createLog : kermeta.kunit.Log = { new kermeta.kunit.RichLog with DefaultObjectImplementation }
 def createFailure : kermeta.kunit.Failure = { new kermeta.kunit.RichFailure with DefaultObjectImplementation }
 def createError : kermeta.kunit.Error = { new kermeta.kunit.RichError with DefaultObjectImplementation }
 def createTestSuite : kermeta.kunit.TestSuite = { new kermeta.kunit.RichTestSuite with DefaultObjectImplementation }
 def createTestRunner : kermeta.kunit.TestRunner = { new kermeta.kunit.RichTestRunner with DefaultObjectImplementation }
 def createAssertionFailedError : kermeta.kunit.AssertionFailedError = { new kermeta.kunit.RichAssertionFailedError with DefaultObjectImplementation }
 def createAssert : kermeta.kunit.Assert = { new kermeta.kunit.RichAssert with DefaultObjectImplementation }}

