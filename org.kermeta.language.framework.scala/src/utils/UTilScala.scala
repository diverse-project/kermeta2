/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils

object UTilScala {
 
    def isInstanceOf(o:Object, typ:Object):Boolean={
        if (o.getClass.getName.equals(typ.getClass.getName))
            return true
        if (typ.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.PrimitiveType]){
            if ( typ.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.PrimitiveType].getName.equals("EString") && o.getClass.getName.equals("kermeta.standard.RichString") )
            return true
                
           // println("toto " + typ.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.PrimitiveType].getName)
        }
       // println(o + "" + typ)
        return false;
    }
    
    def newInstance(o:fr.irisa.triskell.kermeta.language.structure.Class): fr.irisa.triskell.kermeta.language.structure.Object ={
       // println("newInstance " + o + " " +o.getName)
        var name: String = getQualifiedNamePackage(o.getTypeDefinition.eContainer.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],".")
        var factoryName = "ScalaAspect." + kermeta.utils.TypeEquivalence.getPackageEquivalence(name) + ".RichFactory$"
        var methodName = "create" + o.getTypeDefinition.getName
          val clazz = java.lang.Class.forName(factoryName)
        val obj = clazz.getField("MODULE$").get(clazz)
        var meth :java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodName)).first
        //println(meth.getName + " " + meth.getParameterTypes.size)
        val numbers = Array()
        return meth.invoke(obj, numbers: _*).asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
    }


    
  def getQualifiedNamePackage(pack : fr.irisa.triskell.kermeta.language.structure.Package,sep: String):String ={
    var res : String=""
    if (pack.getNestingPackage !=null){
      res = getQualifiedNamePackage(pack.getNestingPackage,sep) +sep
    }
    res = res + pack.getName
    return res
  }

   def getQualifiedNameClass(pack : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition, sep: String):String ={
       return    kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep)) + sep+ pack.getName();
    }
 def getQualifiedNameType(pack : fr.irisa.triskell.kermeta.language.structure.Type, sep: String):String ={
     if (pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]){
         return getQualifiedNameClass(pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType]){
      return   kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep) )+ sep+ pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType].getName();
         
     }else
         return ""
    }

}
