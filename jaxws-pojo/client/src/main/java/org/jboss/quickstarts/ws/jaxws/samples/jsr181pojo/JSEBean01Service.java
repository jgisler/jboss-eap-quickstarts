/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.quickstarts.ws.jaxws.samples.jsr181pojo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-11-19T10:28:42.289-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "JSEBean01Service", 
                  wsdlLocation = "file:/tmp/JSEBean01Service.wsdl",
                  targetNamespace = "http://jsr181pojo.samples.jaxws.ws.quickstarts.jboss.org/")
public class JSEBean01Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jsr181pojo.samples.jaxws.ws.quickstarts.jboss.org/", "JSEBean01Service");
    public final static QName JSEBean01Port = new QName("http://jsr181pojo.samples.jaxws.ws.quickstarts.jboss.org/", "JSEBean01Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/tmp/JSEBean01Service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(JSEBean01Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/tmp/JSEBean01Service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public JSEBean01Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public JSEBean01Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JSEBean01Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JSEBean01Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JSEBean01Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JSEBean01Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns JSEBean01
     */
    @WebEndpoint(name = "JSEBean01Port")
    public org.jboss.quickstarts.ws.jaxws.samples.jsr181pojo.JSEBean01 getJSEBean01Port() {
        return super.getPort(JSEBean01Port, org.jboss.quickstarts.ws.jaxws.samples.jsr181pojo.JSEBean01.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JSEBean01
     */
    @WebEndpoint(name = "JSEBean01Port")
    public org.jboss.quickstarts.ws.jaxws.samples.jsr181pojo.JSEBean01 getJSEBean01Port(WebServiceFeature... features) {
        return super.getPort(JSEBean01Port, org.jboss.quickstarts.ws.jaxws.samples.jsr181pojo.JSEBean01.class, features);
    }

}
