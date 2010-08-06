package org.kermeta.language.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.osgi.framework.Bundle;


/* KWORKBENCH DON'T ANY PORT - NO ART2 CORE DEPENDENCY */
@ThirdParties({
    @ThirdParty(name = "language.model", url = "mvn:org.kermeta.language/language.model")
})
@ComponentType(libName = "K2")
public class K2Core {

    private org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService coreService = null;
    private Bundle bundle = null;

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setCoreService(Art2ModelHandlerService coreService) {
        this.coreService = coreService;
    }



    public void init() {
        try {
            //FOUND XMI IN META-INF
            InputStream model = bundle.getResource("ART2-INF/art2Lib.art2").openStream();

            //LOAD XMI
            ContainerRoot root = Art2XmiHelper.loadStream(model);

            //INIT ART2 CORE WITH NEW MODEL
            coreService.updateModel(root);


        } catch (IOException ex) {
            Logger.getLogger(K2Core.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stop() {
        coreService.updateModel(Art2Factory.eINSTANCE.createContainerRoot());
    }
}
