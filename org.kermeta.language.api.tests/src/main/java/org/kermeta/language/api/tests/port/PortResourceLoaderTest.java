/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import junit.framework.TestCase;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortResourceLoader.URIType;

/**
 *
 * @author ffouquet
 */
public class PortResourceLoaderTest extends TestCase {

    public File file;
    public Boolean valid;
    public org.kermeta.language.api.port.PortResourceLoader parser = null;

    public PortResourceLoaderTest(File file,Boolean _valid,Class parserclass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.file = file;
        this.valid = _valid;
        parser = (PortResourceLoader) parserclass.getConstructors()[0].newInstance();
    }

    public void test() {

        try{

            System.out.println("Test File => "+file.getAbsolutePath());

            parser.load(file.getAbsolutePath(), URIType.FILE);

            if(!this.valid){
                fail("Parse invalid kmt Sucess, Test fail : ");
            }

        } catch (Exception e ){

            if(this.valid){
                fail("Parse valid kmt Fail");
            }

        }

    }

    @Override
    public String getName() {
        return file.getName().substring(0,file.getName().indexOf(".kmt_"));
    }

    @Override
    public void runTest() {
        test();
    }

    @Override
    protected void tearDown() throws Exception {
         file.delete();
    }
}
