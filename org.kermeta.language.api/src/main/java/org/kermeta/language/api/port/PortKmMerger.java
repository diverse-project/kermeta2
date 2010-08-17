/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import java.util.Collection;

import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortKmMerger {

    public ModelingUnit merge(ModelingUnit first_mu,ModelingUnit second_mu, Collection<String> directives);
}
