/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.kevent;

/**
 *
 * @author ffouquet
 */
public class KDocumentUpdate extends KEvent {

    private String document = "";

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }



}
