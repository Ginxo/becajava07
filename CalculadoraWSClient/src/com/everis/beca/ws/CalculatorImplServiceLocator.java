/**
 * CalculatorImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.everis.beca.ws;

public class CalculatorImplServiceLocator extends org.apache.axis.client.Service implements com.everis.beca.ws.CalculatorImplService {

    public CalculatorImplServiceLocator() {
    }


    public CalculatorImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatorImpl
    private java.lang.String CalculatorImpl_address = "http://localhost:8080/CalculadoraWS/services/CalculatorImpl";

    public java.lang.String getCalculatorImplAddress() {
        return CalculatorImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatorImplWSDDServiceName = "CalculatorImpl";

    public java.lang.String getCalculatorImplWSDDServiceName() {
        return CalculatorImplWSDDServiceName;
    }

    public void setCalculatorImplWSDDServiceName(java.lang.String name) {
        CalculatorImplWSDDServiceName = name;
    }

    public com.everis.beca.ws.CalculatorImpl getCalculatorImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatorImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatorImpl(endpoint);
    }

    public com.everis.beca.ws.CalculatorImpl getCalculatorImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.everis.beca.ws.CalculatorImplSoapBindingStub _stub = new com.everis.beca.ws.CalculatorImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculatorImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatorImplEndpointAddress(java.lang.String address) {
        CalculatorImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.everis.beca.ws.CalculatorImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.everis.beca.ws.CalculatorImplSoapBindingStub _stub = new com.everis.beca.ws.CalculatorImplSoapBindingStub(new java.net.URL(CalculatorImpl_address), this);
                _stub.setPortName(getCalculatorImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatorImpl".equals(inputPortName)) {
            return getCalculatorImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.beca.everis.com", "CalculatorImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.beca.everis.com", "CalculatorImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatorImpl".equals(portName)) {
            setCalculatorImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
