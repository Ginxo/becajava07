
package com.everis.beca.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalculationResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalculationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationDifficulty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationResult", propOrder = {
    "calculationDifficulty",
    "result"
})
public class CalculationResult {

    @XmlElement(required = true, nillable = true)
    protected String calculationDifficulty;
    protected double result;

    /**
     * Obtiene el valor de la propiedad calculationDifficulty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationDifficulty() {
        return calculationDifficulty;
    }

    /**
     * Define el valor de la propiedad calculationDifficulty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationDifficulty(String value) {
        this.calculationDifficulty = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     */
    public double getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     */
    public void setResult(double value) {
        this.result = value;
    }

}
