package org.kermeta.extra.groovyembedded;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.util.Map;
import java.util.Map.Entry;

/**
 * Hello world!
 *
 */
public class GroovyEmbedder 
{
    public static Object run(String expression, Map<String,? extends Object> args )
    {

    	
    	Binding binding = new Binding();
    	
    	for (Entry<String ,? extends Object> e : args.entrySet())
        	binding.setVariable(e.getKey(), e.getValue());
    		
    	GroovyShell shell = new GroovyShell(binding);

    	return  shell.evaluate(expression);
    	
    
    }
}
