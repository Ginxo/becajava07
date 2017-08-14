package com.everis.beca.ws;

public class CalculatorImplProxy implements com.everis.beca.ws.CalculatorImpl {
  private String _endpoint = null;
  private com.everis.beca.ws.CalculatorImpl calculatorImpl = null;
  
  public CalculatorImplProxy() {
    _initCalculatorImplProxy();
  }
  
  public CalculatorImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorImplProxy();
  }
  
  private void _initCalculatorImplProxy() {
    try {
      calculatorImpl = (new com.everis.beca.ws.CalculatorImplServiceLocator()).getCalculatorImpl();
      if (calculatorImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorImpl != null)
      ((javax.xml.rpc.Stub)calculatorImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.everis.beca.ws.CalculatorImpl getCalculatorImpl() {
    if (calculatorImpl == null)
      _initCalculatorImplProxy();
    return calculatorImpl;
  }
  
  public com.everis.beca.ws.CalculationResult add(double a, double b) throws java.rmi.RemoteException{
    if (calculatorImpl == null)
      _initCalculatorImplProxy();
    return calculatorImpl.add(a, b);
  }
  
  
}