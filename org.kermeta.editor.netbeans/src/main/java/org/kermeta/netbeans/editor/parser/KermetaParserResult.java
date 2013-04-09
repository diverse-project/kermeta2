/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.parser;

import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser.Result;

/**
 *
 * @author ffouquet
 */
public class KermetaParserResult extends Result {

    private org.kermeta.scala.parser.KParser kmPaser;
    private boolean valid = true;

    KermetaParserResult(Snapshot snapshot, org.kermeta.scala.parser.KParser _kmPaser) {
        super(snapshot);
        this.kmPaser = _kmPaser;
    }

    @Override
    protected void invalidate() {
        valid = false;
    }

    public org.kermeta.scala.parser.KParser getParser()
            throws ParseException {
        if (!valid) {
            throw new ParseException();
        }
        return kmPaser;
    }
}
