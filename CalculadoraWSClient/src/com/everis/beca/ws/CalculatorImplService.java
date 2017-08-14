/**
 * CalculatorImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.everis.beca.ws;

public interface CalculatorImplService extends javax.xml.rpc.Service {
    public java.lang.String getCalculatorImplAddress();

    public com.everis.beca.ws.CalculatorImpl getCalculatorImpl() throws javax.xml.rpc.ServiceException;

    public com.everis.beca.ws.CalculatorImpl getCalculatorImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
