
package com.everis.beca.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addReturn" type="{http://ws.beca.everis.com}CalculationResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addReturn"
})
@XmlRootElement(name = "addResponse")
public class AddResponse {

    @XmlElement(required = true)
    protected CalculationResult addReturn;

    /**
     * Obtiene el valor de la propiedad addReturn.
     * 
     * @return
     *     possible object is
     *     {@link CalculationResult }
     *     
     */
    public CalculationResult getAddReturn() {
        return addReturn;
    }

    /**
     * Define el valor de la propiedad addReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationResult }
     *     
     */
    public void setAddReturn(CalculationResult value) {
        this.addReturn = value;
    }

}
