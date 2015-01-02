package org.wso2.carbon.mediator;

import org.apache.synapse.MessageContext;

import org.apache.synapse.Mediator;

import org.apache.axiom.om.OMElement;

import org.apache.axiom.om.OMAbstractFactory;

import org.apache.axiom.om.OMFactory;

import org.apache.axiom.soap.SOAPFactory;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;


import javax.xml.namespace.QName;


public class CustomMediator implements Mediator {


    private static final Log log = LogFactory.getLog(CustomMediator.class);



    public CustomMediator(){}


    public boolean mediate(MessageContext mc) {
        mc.setProperty("message","hello world!" );
        return true;
    }


    public String getType() {
        return null;
    }

    public void setTraceState(int i) {

    }

    public boolean isContentAware() {
        return false;
    }


    public int getTraceState() {

        return 0;

    }




    public void setDescription(String s) {

    }

    public String getDescription() {
        return null;
    }
}

