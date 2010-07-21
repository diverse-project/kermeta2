/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils

object UTilScala {


  def getQualifiedNamePackage(pack : fr.irisa.triskell.kermeta.language.structure.Package):String ={
    var res : String=""
    if (pack.getNestingPackage !=null){
      res = getQualifiedNamePackage(pack.getNestingPackage) +"::"
    }
    res = res + pack.getName
    return res
  }

   def getQualifiedNameClass(pack : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition):String ={
      return   getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package]) + "::"+ pack.getName();
    }


}
