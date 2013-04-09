package kermeta.persistence
object KerRichFactory {
 def createEMFRepository : kermeta.persistence.EMFRepository = { new kermeta.persistence.EMFRepository }
  def createEMFResource : kermeta.persistence.EMFResource = { new kermeta.persistence.EMFResource }
}

 