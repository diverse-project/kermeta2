/*
 * This code has been generated to visit a kermeta model
 * Creation date: Fri Jun 18 16:12:23 CEST 2010
 * Template Created on feb. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
package fr.irisa.triskell.kermeta.visitor;

import java.lang.reflect.*;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KermetaVisitor {

	final static public Logger internalLog = LoggerFactory.getLogger("KMT.model");
			// This is a generic visit method.
			public Object genericVisitChildren(EObject node) {
				Object result = null;
				Iterator<EObject> children = node.eContents().iterator();
				while (children.hasNext()) {
					EObject child = children.next();
					accept(child);
				}
				return result;
			}
			
			public Object accept(EObject node) {
				Object result = null;
				String cname="";
				String methodName="";
				try {
					Class<?>[] ptypes = new Class[1];
					cname = node.getClass().getName();
					cname = cname.substring(0, cname.length()-4).replaceAll(".impl", "");
					ptypes[0] = Class.forName(cname);
					Method m = this.getClass().getMethod("visit", ptypes);
					methodName = m.getName();
					Object[] params = new Object[1];
					params[0] = node;
					result = m.invoke(this, params);
				}
				catch (Exception e) {
					if (e instanceof InvocationTargetException && ((InvocationTargetException)e).getTargetException() instanceof Error) throw (Error)((InvocationTargetException)e).getTargetException();
					Throwable cause = e.getCause();
					String message = "Kermeta visitor " + this.getClass().getName() +  ", error accepting a " + cname + " : " + e.getMessage();
		    		if (cause != null)				   
		        		if (cause.getClass().getName().compareTo("fr.irisa.triskell.kermeta.error.KermetaVisitorError")==0)
			    		{
		            		internalLog.error(message, e);
		            		// this Exception was due to a KermetaVisitorError create a new one with the precedent content
		            		throw new KermetaVisitorError(message, cause.getCause());
		        		}
		        		else
		        		{
							internalLog.error(message, e);
							throw	new KermetaVisitorError(e.getClass().getName() + " invoking "+ methodName + " on Class " +cname  ,e);
						}
		        	else
		        	{
						internalLog.error(message, e);
						throw	new KermetaVisitorError(e.getClass().getName() + " invoking "+ methodName + " on Class " +cname  ,e);
					}
				}
				return result;
			}

	public Object visit(org.kermeta.language.language.behavior.Assignment node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.Block node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.CallVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.CallFeature node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.CallSuperOperation node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.CallResult node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.CallValue node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.Conditional node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.Raise node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.Rescue node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.TypeReference node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.EmptyExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.JavaStaticCall node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.LambdaExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.LambdaParameter node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.IntegerLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.StringLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.BooleanLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.TypeLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.VoidLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.Loop node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.SelfExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.behavior.VariableDecl node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Object node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Operation node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Property node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.EnumerationLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.TypeVariableBinding node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.MultiplicityElement node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.TypeDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Class node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Enumeration node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Package node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Parameter node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.PrimitiveType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Tag node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Constraint node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ClassDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ModelingUnit node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Require node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Using node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ObjectTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ModelType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ModelTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.VirtualType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.Model node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.UnresolvedType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.UnresolvedProperty node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.UnresolvedOperation node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.ProductType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.FunctionType node) {
	return genericVisitChildren(node);
	}

	public Object visit(org.kermeta.language.language.structure.VoidType node) {
	return genericVisitChildren(node);
	}



}
