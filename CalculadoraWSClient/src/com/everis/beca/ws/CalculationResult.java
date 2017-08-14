/**
 * CalculationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.everis.beca.ws;

public class CalculationResult  implements java.io.Serializable {
    private java.lang.String calculationDifficulty;

    private double result;

    public CalculationResult() {
    }
    
    @Override
    public String toString() {
    	return Double.toString(result);
    }

    public CalculationResult(
           java.lang.String calculationDifficulty,
           double result) {
           this.calculationDifficulty = calculationDifficulty;
           this.result = result;
    }


    /**
     * Gets the calculationDifficulty value for this CalculationResult.
     * 
     * @return calculationDifficulty
     */
    public java.lang.String getCalculationDifficulty() {
        return calculationDifficulty;
    }


    /**
     * Sets the calculationDifficulty value for this CalculationResult.
     * 
     * @param calculationDifficulty
     */
    public void setCalculationDifficulty(java.lang.String calculationDifficulty) {
        this.calculationDifficulty = calculationDifficulty;
    }


    /**
     * Gets the result value for this CalculationResult.
     * 
     * @return result
     */
    public double getResult() {
        return result;
    }


    /**
     * Sets the result value for this CalculationResult.
     * 
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculationResult)) return false;
        CalculationResult other = (CalculationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calculationDifficulty==null && other.getCalculationDifficulty()==null) || 
             (this.calculationDifficulty!=null &&
              this.calculationDifficulty.equals(other.getCalculationDifficulty()))) &&
            this.result == other.getResult();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCalculationDifficulty() != null) {
            _hashCode += getCalculationDifficulty().hashCode();
        }
        _hashCode += new Double(getResult()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.beca.everis.com", "CalculationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculationDifficulty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.beca.everis.com", "calculationDifficulty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.beca.everis.com", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
