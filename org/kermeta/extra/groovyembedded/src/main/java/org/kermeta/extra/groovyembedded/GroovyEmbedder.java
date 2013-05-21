package org.kermeta.extra.groovyembedded;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hello world!
 *
 */
public class GroovyEmbedder 
{
	/**
	 * Simple Groovy runner
	 * It executes in a new shell
	 * @param expression
	 * @param args
	 * @return
	 */
    public static Object run(String expression, Map<String,? extends Object> args )
    {

    	
    	Binding binding = new Binding();
    	
    	for (Entry<String ,? extends Object> e : args.entrySet())
        	binding.setVariable(e.getKey(), e.getValue());
    		
    	GroovyShell shell = new GroovyShell(binding);

    	return  shell.evaluate(expression);
    	
    
    }
    /**
	 * Simple Groovy runner
	 * It executes in a new shell
	 * @param expression
	 * @param args
	 * @return
	 */
    public static Object run(String expression, HashMap<String,?> args )
    {

    	
    	Binding binding = new Binding();
    	
    	for (Entry<String ,? extends Object> e : args.entrySet())
        	binding.setVariable(e.getKey(), e.getValue());
    		
    	GroovyShell shell = new GroovyShell(binding);

    	return  shell.evaluate(expression);
    	
    
    }
    
    private static Binding sharedBinding = new Binding();
    private static GroovyShell sharedShell = new GroovyShell(new Binding());
    
    /**
     * Groovy runner that executes in the shared shell, variables and previous instructions can be shared between run
     * @param expression
     * @param args
     * @return
     */
    public static Object sharedShellRun(String expression, Map<String,? extends Object> args )
    {
    	for (Entry<String ,? extends Object> e : args.entrySet())
    		sharedBinding.setVariable(e.getKey(), e.getValue());
    		
    	return  sharedShell.evaluate(expression);
    }
    
    /**
     * initialize or reinitialize the shared shell and bindinds
     * @param args
     */
    public static void initializeSharedShell(Map<String,? extends Object> args )
    {
    	sharedBinding = new Binding();
    	for (Entry<String ,? extends Object> e : args.entrySet())
    		sharedBinding.setVariable(e.getKey(), e.getValue());
    		
    	sharedShell = new GroovyShell(new Binding());
    }
    
}
