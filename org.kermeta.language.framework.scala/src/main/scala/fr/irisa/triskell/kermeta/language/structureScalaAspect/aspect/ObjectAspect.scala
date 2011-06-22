package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._
import kermeta.exceptions._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._

trait ObjectAspect extends EObject  with Contracted {

    
    
  def isSuperTypeOf(cl : fr.irisa.triskell.kermeta.language.structure.Type):Boolean = {
    if (!(this.isInstanceOf[Class]  ))
      return false
    else
    {
      if (!cl .isInstanceOf[Class]){
        return false
      }
      var thisclass : Class =this.asInstanceOf[Class]
      var clclass : Class = cl.asInstanceOf[Class]

      if (_root_.utils.UTilScala.getQualifiedNameClassKermeta( clclass.asInstanceOf[Class].getTypeDefinition,"::").equals(_root_.utils.UTilScala.getQualifiedNameClassKermeta(thisclass.getTypeDefinition,"::") ))
        return true
      else
        return clclass.getTypeDefinition.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ClassDefinition].getSuperType.exists(e=> this.isSuperTypeOf(e))
      return false
    }

  }
  

	
//	 def getOwnedTags():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=null;
//	 def getTag():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=null;

  def getMetaClass() : fr.irisa.triskell.kermeta.language.structure.Class= null//this.eClass()
  //def classDefinition = this.asInstanceOf[EClass]
  //def ScalaclassDefinition = classDefinition
  def typedefinition = this
  def container() = this.eContainer().asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
  //override def equals(o : Any) : Boolean = o == this /*TODO*/
  def equals(o : _root_.fr.irisa.triskell.kermeta.language.structure.Object):java.lang.Boolean = o == this

  def isNotEqual(o : Any) : Boolean = !equals(o)

  def KermetaisKindOf(cl : fr.irisa.triskell.kermeta.language.structure.Class) : Boolean = {
	println(this.getMetaClass)
	println(cl)
	if (cl!= null && cl.getTypeDefinition != null && this.getMetaClass != null){
		return cl.getTypeDefinition.eq(this.getMetaClass.getTypeDefinition);		
	}else
		return false;
	
   }

  def get(prop : fr.irisa.triskell.kermeta.language.structure.Property) :java.lang.Object= {
    if (prop == null){
      println ("prop est null aie")
      return null
    }
         
        
    var meth : java.lang.reflect.Method = this.getClass().getMethod("Scala"+prop.getName)
    if (meth == null){
      println ("meth is null " + prop.getName + "  " + this + " " + this.getClass)
    }
    var o =  meth.invoke(this)
        return o;
/*    if (o != null && o.isInstanceOf[java.lang.String]){
      return new kermeta.standard.RichString(o.asInstanceOf[java.lang.String])
    }
    else if (o != null && o.isInstanceOf[java.lang.Boolean]){
      return new kermeta.standard.RichJavaBoolean(o.asInstanceOf[java.lang.Boolean])
    }
    else if (o != null && o.isInstanceOf[java.lang.Integer]){
      return new kermeta.standard.RichInteger(o.asInstanceOf[java.lang.Integer].intValue)
    }
        
    if ( o.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object])
      return o.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
    else if (o!=null)
    {println("cannot convert " + o.getClass + " for property " + prop.getName)
     null.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]}
    else
      null.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]*/
  }
    
  def set(prop : fr.irisa.triskell.kermeta.language.structure.Property,o : java.lang.Object) = {
    var m : java.lang.reflect.Method = null
    m = this.getClass().getMethods.filter(m1=>  { m1.getName.equals("Scala"+prop.getName+"_$eq")}).apply(0)
    if (m!= null){
      var numbers: Array[_<:java.lang.Object] = null
      if (o.isInstanceOf[kermeta.standard.RichValueType[_]])
        numbers = Array(o.asInstanceOf[kermeta.standard.RichValueType[_]].getValue)
      else if (m.getParameterTypes.first.getName.equals("int") && o == null){
        numbers = Array(new java.lang.Integer(0))
      }
      else if (o != null && o.isInstanceOf[kermeta.standard.RichInteger]){
        numbers = Array(o.asInstanceOf[kermeta.standard.RichInteger].getValue)
      }
      else
        numbers = Array(o)
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
	/*
  def Scalatag : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]={this.getTag()}
  def Scalatag_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag])={this.getTag().clear
                                                                                          this.getTag().addAll(arg)
  }
  def ScalaownedTags : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]={this.getOwnedTags()}
  def ScalaownedTags_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag])={this.getOwnedTags().clear
                                                                                                this.getOwnedTags().addAll(arg)
  }*/
 //def ScalaownedTags : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]={this.asInstanceOf[EModelElement].getEAnnotations}
 // this.asInstanceOf[EModelElement].e
 //
 //
 //

  def ScalaownedTags : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]
  def Scalatag : java.util.List[fr.irisa.triskell.kermeta.language.structure.Tag]


  /* Contracted */
  type Condition = () => Boolean
  def checkParamInvariants(inv : scala.collection.immutable.HashMap[String,Condition]) = {
    if(inv !=  null ){
      for(cond <- inv){
        if(!cond._2()){
          var constraintException = kermeta.exceptions.KerRichFactory.createConstraintViolatedInvException
          constraintException.message = "Contraint Invariant Exception "+cond._1
          throw constraintException
        }
      }
    }
  }
  def checkParamInvariants(inv : scala.collection.immutable.HashMap[String,Condition], diagnostic : kermeta.exceptions.ConstraintsDiagnostic) = {
    if (diagnostic == null)
      constraintDiagnostic = new Throwable with ConstraintsDiagnostic with DefaultObjectImplementation ;
    if(inv !=  null ){
      for(cond <- inv){
        if(!cond._2()){
          var constraintException = kermeta.exceptions.KerRichFactory.createConstraintViolatedInvException
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

    def getInvariants() :  scala.collection.immutable.HashMap[String,Condition]= {
    val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap[String,Condition]()
    return invariants;
  }

  def checkInvariant(invariant : Constraint) :Boolean  = {
      var cond : Condition = getInvariants().get(invariant.getName).getOrElse(null);
    if (cond == null)
      return true
    if (cond())
      return true
    else
    {
       var ex = kermeta.exceptions.KerRichFactory.createConstraintViolatedInvException
      ex.failedConstraint =invariant
      ex.constraintAppliedTo = this
      throw ex
    }
  }



  def checkAllInvariants() = { /*TODO*/ //println("todo checkAllInvariant") }

    checkInvariants()

  }
  var constraintDiagnostic : kermeta.exceptions.ConstraintsDiagnostic = _

  def getViolatedConstraints() : kermeta.exceptions.ConstraintsDiagnostic={
    /*TODO*/ println("todo getViolatedConstraints "+ constraintDiagnostic); return constraintDiagnostic;
  }
	
	
}
