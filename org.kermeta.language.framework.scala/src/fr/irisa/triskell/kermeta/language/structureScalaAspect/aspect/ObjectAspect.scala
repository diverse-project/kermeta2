package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._
import kermeta.exceptions._
import scala.collection.JavaConversions._


trait ObjectAspect extends EObject  with Contracted {


  def isSuperTypeOf(cl : fr.irisa.triskell.kermeta.language.structure.Type) = {true}//this.getClass.asInstanceOf[EClass].isSuperTypeOf(cl)

  

	
//	 def getOwnedTags():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=null;
//	 def getTag():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=null;

    def getMetaClass() : fr.irisa.triskell.kermeta.language.structure.Class= null//this.eClass()
    //def classDefinition = this.asInstanceOf[EClass]
    //def ScalaclassDefinition = classDefinition
    def typedefinition = this
    def container() = this.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
    //override def equals(o : Any) : Boolean = o == this /*TODO*/
    def isNotEqual(o : Any) : Boolean = !equals(o)
    def isKindOf(cl : EClass) : Boolean = this.eClass().equals(cl)
    def get(prop : fr.irisa.triskell.kermeta.language.structure.Property) :fr.irisa.triskell.kermeta.language.structure.Object= {return this.getClass().getMethod("Scala"+prop.getName).invoke(this).asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]}
    def set(prop : fr.irisa.triskell.kermeta.language.structure.Property,o : java.lang.Object) = {
        var m : java.lang.reflect.Method = null
        m = this.getClass().getMethods.filter(m1=> m1.getName.equals("Scala"+prop.getName+"_$eq")).apply(0)
        if (m!= null){
           // println("found one")
           val numbers = Array(o)
            m.invoke(this,numbers: _*)
        }

    }

    def containingResource() : kermeta.persistence.Resource ={null}

    def isSet(prop : EStructuralFeature) =  this.eIsSet(prop)
    def unset(prop : fr.irisa.triskell.kermeta.language.structure.Property) = {
      var allStructualF = this.eClass.getEAllStructuralFeatures
      var sf = allStructualF.find({sf=> sf.getName.equals(prop.getName) })

    sf match {
      case Some(sf) => this.eUnset(sf)
      case None => println("Reflexivity Error KM FW")
    }


     // var structuralF = this.eClass.getEAllStructuralFeatures.toget(prop)
       //this.eUnset(structuralF);
    }
    def unset(prop : EStructuralFeature) = this.eUnset(prop);
    def oid() : Int = this.hashCode() /*TODO*/
    override def toString : String = super.toString()//"["+this.eClass().getName()+":"+oid.toString()+"]"
    //def isFrozen : Boolean  /*TODO*/
    def isVoid() : Boolean = false
    def hashcode : Int = this.hashCode()
    def getKerMetaClass(): java.lang.Class[_] =this.getClass
    //def freeze  /*TODO*/
    //def asType(t : EClass) = this.asInstanceOf[t.getName]
    //def isInstanceOf(t : EClass) = this.isInstanceOf(t.getMetaClass().getName)
	
    /*	def Scalatag : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]={this.getTag()}
     def Scalatag_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag])={this.getTag().clear
     this.getTag().addAll(arg)
     }
     def ScalaownedTags : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]={this.getOwnedTags()}
     def ScalaownedTags_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag])={this.getOwnedTags().clear
     this.getOwnedTags().addAll(arg)
     }
     */
	

    /* Contracted */
    type Condition = () => Boolean
    def checkParamInvariants(inv : scala.collection.immutable.HashMap[String,Condition]) = {
        if(inv !=  null ){
            for(cond <- inv){
                if(!cond._2()){
                    var constraintException = kermeta.exceptions.RichFactory.createConstraintViolatedInvException
                    constraintException.message = "Contraint Invariant Exception "+cond._1
                    throw constraintException
                }
            }
        }
    }
    def checkParamInvariants(inv : scala.collection.immutable.HashMap[String,Condition], diagnostic : kermeta.exceptions.ConstraintsDiagnostic) = {
        if (diagnostic == null)
          constraintDiagnostic = new Throwable with ConstraintsDiagnostic;
        if(inv !=  null ){
            for(cond <- inv){
                if(!cond._2()){
                    var constraintException = kermeta.exceptions.RichFactory.createConstraintViolatedInvException
                     constraintException.message = "Contraint Invariant Exception "+cond._1
                   constraintDiagnostic.add(constraintException)
                }
            }
        }
    }


    /* Default Method Overloaded in by each class definition */
    def checkInvariants() = {
        val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap[String,Condition]()
        checkParamInvariants(invariants)
    }
    def checkAllInvariants() = { /*TODO*/ //println("todo checkAllInvariant") }

       checkInvariants()

    }
    var constraintDiagnostic : kermeta.exceptions.ConstraintsDiagnostic = _

    def getViolatedConstraints() : kermeta.exceptions.ConstraintsDiagnostic={
    /*TODO*/ println("todo getViolatedConstraints "+ constraintDiagnostic); return constraintDiagnostic;
  }
	
	
}
