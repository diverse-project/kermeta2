package kermeta.persistence
 
import kermeta.standard._

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore._;
import java.lang.String
import kermeta.standard.JavaConversions._

abstract class Resource  extends java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]{
    var dependentResources:Resource=_;
    //var contents:java.util.List[Object]=null;
    var repository:Repository=_;
    var metaModelURI:String="";
    var isReadOnly:Boolean=false;
    def save()
    def saveWithNewURI(new_uri : String)
    def findDanglingModelElements() :Set[Object]={null }
    def load()
    def instances() :Resource={return this}
    def normalizedUri() :String={return metaModelURI}
    def Scalacontents_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Object])={this.clear; this.addAll( arg)}
    def Scalacontents={this}
    def     Scalauri :String
    def Scalauri_=(arg :String)
    
	
} 
 

abstract class Repository {
    def createResource(uri : String, mm_uri : String) :Resource
    def normalizeUri(uri : String) :String={return uri}
    def findDanglingModelElements() :Set[Object]={return null}
    def getResource(uri : String) :Resource
}

class EMFRepository  extends Repository  {
    var rs:ResourceSetImpl = new ResourceSetImpl();
    var useInterpreterInternalResources:Boolean=true;
    var ignoreLoadErrorUnknownMetaclass:Boolean=true;
    var ignoreAllLoadErrors:Boolean=true;
    var ignoreLoadErrorUnknownProperty:Boolean=true;
    var f:org.eclipse.emf.ecore.resource.Resource.Factory.Registry = rs.getResourceFactoryRegistry();
    var m :java.util.Map[String,Object]  = f.getExtensionToFactoryMap();
    m.put("ecore",new EcoreResourceFactoryImpl());
    m.put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().putAll(EcorePackages.getPacks())

    def ScalaignoreLoadErrorUnknownMetaclass_=(arg : java.lang.Boolean):Unit={}
    
    def createResource(uri : String, mm_uri : String) :Resource={var res : EMFResource = new EMFResource()
                                                                 res.metaModelURI = mm_uri
                                                                 res.setResourceSet(rs)
                                                                 res.Scalauri_=(uri)
//                                                                 var uri1 :URI = URI.createURI(uri);
//                                                                 res.getEMFResource.setURI(uri1)
                                                                 rs.getResources.add(res.getEMFResource)
                                                                 return res
     }
     
    def registerEcoreFile(mm_uri : String)={mm_uri}
    def getResource(uri : String) :Resource={
      println("GetRessource URI="+uri)
        var res : EMFResource = new EMFResource()
        res.setResourceSet(rs)
        var uri1 :URI = URI.createURI(uri);
        res.getEMFResource.setURI(uri1)
        return res
    }
    
    def Scalaresources : java.util.List[EMFResource] ={
        //println("" + rs.getResources.size)
        org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(rs);
        
        //println("" + rs.getResources.size)

        var emfresources :org.eclipse.emf.common.util.EList[org.eclipse.emf.ecore.resource.Resource] =rs.getResources;
        var kermetaresources :java.util.List[EMFResource] =new java.util.ArrayList[EMFResource];
        emfresources.each(r => {
                 var kr : EMFResource = new EMFResource
                kr.setEMFResource(r)
                kermetaresources.add(kr)
        })
        
       
        
        return kermetaresources
        
    } 
    
    

}


class EMFResource  extends Resource  {
		

    
			
    var rs:ResourceSetImpl = _
     var resource :org.eclipse.emf.ecore.resource.Resource =_
			
    override def     Scalauri  :String= {return resource.getURI.toString}
    def Scalauri_=(arg :String) ={

                var uri1 :URI = URI.createURI(arg);
            if (resource ==null){
                resource = rs.createResource(uri1);
            }

         resource.setURI(uri1);
    }

   
    def setEResource(arg:EObject, resource:org.eclipse.emf.ecore.resource.Resource){
        var it = arg.eAllContents
        while (it.hasNext){
            var obj :EObject = it.next            
            resource.getContents.add(obj)
        }
    }
    
    def setEMFResource( resource1:org.eclipse.emf.ecore.resource.Resource){
        this.resource = resource1
        
    }
    
        def getEMFResource( ):org.eclipse.emf.ecore.resource.Resource={
     
            return this.resource;        
    }

    //override def remove(instance : Object)={super.remove(instance)}
    override  def save()={
//        println(this.iterator.)
       
        
      //  var uri1 :URI = URI.createURI(uri)//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
       // var resource :org.eclipse.emf.ecore.resource.Resource  = rs.createResource(uri1);
        /*this.setEResource(this.get(0),resource)
        resource.getContents.addAll(this)
        var cont = resource.getContents
        cont.each(obj=>{   
                var list =        obj.eCrossReferences.select(obj1=> !cont.contains(obj1))
                
                if (list.size>0){println("obj = " + obj) 
                                obj.asInstanceOf[org.eclipse.emf.ecore.EGenericType].setEClassifier(null)
                                 obj.eClass.getEStructuralFeatures.each(t => println( t+ " " + obj.eGet(t)))
                                 //obj.eClass.getEAllStructuralFeatures.each(t => println( t+ " " + obj.eGet(t)))

                                 println("crossRef " + list.size)
                                 list.each(e=> println("e = " + e))
                }
                        
            })*/
        
        
        resource.save(new java.util.HashMap());
    }
    
    def setResourceSet(rs1 :ResourceSetImpl)={
        this.rs=rs1
    }
    
    override def saveWithNewURI(new_uri : String)={ 
        this.Scalauri_=( new_uri)
                                                   this.save
    }


    def saveAndValidateWithEMF() :Boolean={save()
                                           return true}
    def load(){
			
       // var uri1 :URI = URI.createURI(uri)//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
       resource  .load(new java.util.HashMap[Any,Any])
       
        //resource.load(new java.util.HashMap)
/*        if (resource.isLoaded() && resource.getContents().size() > 0) {
            var it =  resource.getAllContents
            while (it.hasNext){
                var obj = it.next
                println("new object " + obj)
                this.add(obj.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object])
            }
            
        }
*/			
    }
    
def subList (x$1: Int,x$2: Int):java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]={return getAllObject().subList(x$1, x$2).asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]]}
def listIterator (x$1: Int):java.util.ListIterator[fr.irisa.triskell.kermeta.language.structure.Object]={return getAllObject().listIterator(x$1).asInstanceOf[java.util.ListIterator[fr.irisa.triskell.kermeta.language.structure.Object]]}
def listIterator ():java.util.ListIterator[fr.irisa.triskell.kermeta.language.structure.Object]={return getAllObject().listIterator().asInstanceOf[java.util.ListIterator[fr.irisa.triskell.kermeta.language.structure.Object]]}
def lastIndexOf (x$1: Any):Int ={return getAllObject().lastIndexOf(x$1)}
def indexOf (x$1: Any):Int ={return getAllObject().indexOf(x$1)}
def remove (x$1: Int):fr.irisa.triskell.kermeta.language.structure.Object ={
        var list = getAllObject();
        var res = list.get( x$1 )
        remove(res)
        return res.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
    }
def add (x$1: Int,x$2: fr.irisa.triskell.kermeta.language.structure.Object):Unit={
    add(x$2)} 
def set (x$1: Int,x$2: fr.irisa.triskell.kermeta.language.structure.Object):fr.irisa.triskell.kermeta.language.structure.Object ={resource.getContents.set(x$1, x$2).asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]}
def get (x$1: Int):fr.irisa.triskell.kermeta.language.structure.Object ={getAllObject().get(x$1).asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]}
def clear ():Unit ={resource.getContents.clear}
def retainAll (x$1: java.util.Collection[_]):Boolean ={
    getAllObject.retainAll(x$1)
    
    }
def removeAll (x$1: java.util.Collection[_]):Boolean ={
            var it = x$1.iterator
        while (it.hasNext){
            this.remove(it.next)
        }
        return true

}
def addAll (x$1: Int,x$2: java.util.Collection[_ <: fr.irisa.triskell.kermeta.language.structure.Object]):Boolean ={this.addAll(x$2)}
def addAll (x$1: java.util.Collection[_ <: fr.irisa.triskell.kermeta.language.structure.Object]):Boolean ={
                var it = x$1.iterator
        while (it.hasNext){
            this.add(it.next)
        }
        return true

        
        
}
def containsAll (x$1: java.util.Collection[_]):Boolean ={getAllObject().containsAll(x$1)}
def toArray [T](x$1: Array[T with java.lang.Object]):Array[T with java.lang.Object]={getAllObject().toArray[T](x$1)}
def toArray ():Array[java.lang.Object]={getAllObject().toArray}
def iterator ():java.util.Iterator[fr.irisa.triskell.kermeta.language.structure.Object]={getAllObject().iterator.asInstanceOf[java.util.Iterator[fr.irisa.triskell.kermeta.language.structure.Object]]}
def contains (x$1: Any):Boolean ={getAllObject().contains(x$1)}
def isEmpty ():Boolean ={getAllObject().isEmpty}
def size ():Int ={getAllObject().size}
def remove (x$1: Any):Boolean ={println("REMOVE " + x$1.toString)
             org.eclipse.emf.ecore.util.EcoreUtil.remove(x$1.asInstanceOf[org.eclipse.emf.ecore.EObject])
             return true
    }
def add (x$1: fr.irisa.triskell.kermeta.language.structure.Object):Boolean ={resource.getContents.add(x$1)}
                  
      def getAllObject():java.util.List[fr.irisa.triskell.kermeta.language.structure.Object] = {
          var it = resource.getAllContents
          var res = new java.util.ArrayList[fr.irisa.triskell.kermeta.language.structure.Object]
          while (it.hasNext)
              res.add(it.next.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]);
           return res
      }
                  
}
    
    
    
    

object EcorePackages{
    private var packs : java.util.HashMap[String,EPackage]= new java.util.HashMap[String,EPackage]()
	
    def getPacks() : java.util.HashMap[String,EPackage] = {
        packs
    }
    var workspaceURI : String = _
    var pluginURI : String = _

	
}
/*


 class DanglingDiagnostic  extends Object  with implicit1{
 var referencingElement:Object;
 var danglingElement:Object;
 var referencingProperty:Property;
 def toString() :String={var result : String=null;
 {
 result = danglingElement.toString().plus(" referenced by ").plus(referencingElement.toString()).plus(".").plus(referencingProperty.name).plus(" is dangling");
 }

 return result;
 }
 }

 }*/

