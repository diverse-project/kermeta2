/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.compiler.art2.impl;

import java.util.Properties;
import org.kermeta.art2.annotation.*;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.port.PortKm2ScalaCompiler;
import org.kermeta.language.compiler.GlobalConfiguration;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.compiler.Compiler;
import org.osgi.framework.Bundle;

/**
 *
 * @author ffouquet
 */
@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.kp.model", url = "mvn:org.kermeta.kp/kp.model"),
    @ThirdParty(name = "org.kermeta.language.traceability.model", url = "mvn:org.kermeta.traceability/traceability.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
//@ThirdParty(name="org.kermeta.language.loader.scala", url="mvn:org.kermeta.language/language.loader.scala")
})
@Provides({
    @ProvidedPort(name = "compiler", type = PortType.SERVICE, className = PortKm2ScalaCompiler.class)
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
/**
 * ART2 component of a Text editor for Kermeta language running in eclipse
 */
@Library(name = "org.kermeta.language")
@ComponentType
public class K2Compiler extends AbstractComponentType {

    protected String bundleSymbolicName = "";
    protected Bundle bundle;
    protected SimpleLogger logger;
    
    @Port(name = "compiler", method = "compile")
    public void compile(ModelingUnit model, String outputPath) {

//        Compiler compilo = new Compiler();
        GlobalConfiguration.outputFolder_$eq(outputPath);
        GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit.generated");
        GlobalConfiguration.props_$eq(new Properties());
        GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");
      //  compilo.compile(model.getAbsolutePath().toString());
        Compiler c = new Compiler(logger);
        c.compile(model);

    }

    @Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Succesfully started "+ bundleSymbolicName);
    }

    @Stop
    public void stop() {
    }
}
