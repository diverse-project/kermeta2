/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import java.util.Collection;

/**
 *
 * @author ffouquet
 */
public interface PortKmWeaver {

    public ModelingUnit weave(Collection<ModelingUnit>  mus);

}
