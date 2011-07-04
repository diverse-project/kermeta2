/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils

import org.eclipse.emf.ecore._

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
        var packName = kermeta.utils.TypeEquivalence.getPackageEquivalence(name)
        if (!(packName == "kermeta.exceptions" ||
          packName == "kermeta.io"||
          packName == "kermeta.kunit"||
          packName == "kermeta.persistence"||
          packName == "kermeta.standard"
        )){
          packName = scalaAspectPrefix +"." + packName
        }



        var factoryName = packName + ".KerRichFactory$"
        var methodName = "create" + o.getTypeDefinition.getName
          val clazz = java.lang.Class.forName(factoryName)
        val obj = clazz.getField("MODULE$").get(clazz)
        var meth :java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodName)).first
        //println(meth.getName + " " + meth.getParameterTypes.size)
        val numbers = Array()
        return meth.invoke(obj, numbers: _*).asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
    }
    
 @scala.reflect.BeanProperty
 var scalaAspectPrefix : String = "ScalaAspect"
  
  def getQualifiedNamePackage(pack : fr.irisa.triskell.kermeta.language.structure.Package,sep: String):String ={
    var res : String=""
    if (pack.getNestingPackage !=null){
      res = getQualifiedNamePackage(pack.getNestingPackage,sep) +sep
    }
    res = res + pack.getName
    return res
  }

   def getQualifiedNameClassJava(pack : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition, sep: String):String ={
       return    kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep)) + sep+ pack.getName();
    }
 def getQualifiedNameTypeJava(pack : fr.irisa.triskell.kermeta.language.structure.Type, sep: String):String ={
     if (pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]){
         return getQualifiedNameClassJava(pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType]){
      return   kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep) )+ sep+ pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType].getName();
         
     }else
         return ""
    }



   def getQualifiedNameClassKermeta(pack : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition, sep: String):String ={
       return    getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep) + sep+ pack.getName();
    }
 def getQualifiedNameTypeKermeta(pack : fr.irisa.triskell.kermeta.language.structure.Type, sep: String):String ={
     if (pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]){
         return getQualifiedNameClassKermeta(pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType]){
      return   getQualifiedNamePackage(pack.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Package],sep) + sep+ pack.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.DataType].getName();

     }else
         return ""
    }

}

object ConvertGenericType{
  def convert(r : EGenericType):EGenericType ={
      var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEGenericType;

    if (r.getEClassifier.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object])
      result.setEClassifier(r.getEClassifier)
    else{
      if (r.getEClassifier.isInstanceOf[EClass])
        result.setEClassifier(ConvertEClass.convert(r.getEClassifier.asInstanceOf[EClass]))
      else
        result.setEClassifier(ConvertDataType.convert(r.getEClassifier.asInstanceOf[EDataType]))
    }
    result.setELowerBound(r.getELowerBound)
    result.setETypeParameter(r.getETypeParameter)
    result.setEUpperBound(r.getEUpperBound)
    result.getETypeArguments.clear
    result.getETypeArguments.addAll(r.getETypeArguments)
   
    if (r.eContainer.isInstanceOf[EClass]){
      var c = r.eContainer.asInstanceOf[EClass]
      c.getEGenericSuperTypes.remove(r)
      c.getEGenericSuperTypes.add(result)
    }else if (r.eContainer.isInstanceOf[EStructuralFeature]){
      var c = r.eContainer.asInstanceOf[EStructuralFeature]
      c.setEGenericType(result)
    }else if (r.eContainer.isInstanceOf[EGenericType]){
      var c = r.eContainer.asInstanceOf[EGenericType]
      if (r == c.getELowerBound)
        c.setELowerBound(result)
      else if (r == c.getEUpperBound)
        c.setEUpperBound(result)
    }else if (r.eContainer.isInstanceOf[ETypeParameter]){
      var c = r.eContainer.asInstanceOf[ETypeParameter]
            c.getEBounds.remove(r)
            c.getEBounds.add(result)
    }
    return result

  }
}

  object ConvertDataType{
  def convert(r : EDataType):EDataType ={
    println("TOTO" + r)
      var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEDataType;

    result.setInstanceClass(r.getInstanceClass);
    result.setName(r.getName);
    result.setInstanceClassName(r.getInstanceClassName);
    result.setInstanceTypeName(r.getInstanceTypeName);
    result.setSerializable(r.isSerializable)
    result.getEAnnotations.clear
    result.getEAnnotations.addAll(r.getEAnnotations)

    if (r.eContainer.isInstanceOf[EPackage]){
      var c = r.eContainer.asInstanceOf[EPackage]
      c.getEClassifiers.remove(r)
      c.getEClassifiers.add(result)
    }
    return result

  }

}

object ConvertEClass{
def convert(r : EClass):EClass ={
   var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEClass;
  result.setInstanceClass(r.getInstanceClass);
  result.setName(r.getName);
  result.setInstanceClassName(r.getInstanceClassName);
  result.setInstanceTypeName(r.getInstanceTypeName);
  result.setInterface(r.isInterface)
  result.setAbstract(r.isAbstract)
  result.getEStructuralFeatures.clear
  result.getEStructuralFeatures.addAll(r.getEStructuralFeatures)
  result.getEGenericSuperTypes.clear
  result.getEGenericSuperTypes.addAll(r.getEGenericSuperTypes)
  result.getEOperations.clear
  result.getEOperations.addAll(r.getEOperations)
  result.getESuperTypes.clear
  result.getESuperTypes.addAll(r.getESuperTypes)
  result.getEAnnotations.clear
  result.getEAnnotations.addAll(r.getEAnnotations)


  if (r.eContainer.isInstanceOf[EPackage]){
    var c = r.eContainer.asInstanceOf[EPackage]
    c.getEClassifiers.remove(r)
    c.getEClassifiers.add(result)
  }
  return result

}

}

