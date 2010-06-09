package org.kermeta.language.loader.ecore;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import org.kermeta.art2.annotation.*;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.KermetaError;
import org.kermeta.language.api.port.PortErrorHandler;
import org.kermeta.language.api.port.PortResourceLoader;

@Provides({
    @ProvidedPort(name="loader",className=PortResourceLoader.class),
})
@Requires({
    @RequiredPort(name="errorp",className=PortErrorHandler.class)
})
@ComponentType
public class EcoreLoaderComponentType extends AbstractComponentType implements PortResourceLoader
{

    @Override
    @Port(name="loader",method="load")
    public ModelingUnit load(String uri, URIType type) {

        KermetaError errormsg = new KermetaError();
        errormsg.setMessage("Not implemented");


        getPortByName("errorp", PortErrorHandler.class).send(errormsg);
        return null;
    }




}
