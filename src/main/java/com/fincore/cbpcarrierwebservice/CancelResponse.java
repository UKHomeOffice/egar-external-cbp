
package com.fincore.cbpcarrierwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fincore.cbpcarrierwebservice.entities.CancelReturnType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelResult" type="{http://fincore.com/CBPCarrierWebService/entities}CancelReturnType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelResult"
})
@XmlRootElement(name = "CancelResponse")
public class CancelResponse {

    @XmlElementRef(name = "CancelResult", namespace = "http://fincore.com/CBPCarrierWebService/", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelReturnType> cancelResult;

    /**
     * Gets the value of the cancelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelReturnType }{@code >}
     *     
     */
    public JAXBElement<CancelReturnType> getCancelResult() {
        return cancelResult;
    }

    /**
     * Sets the value of the cancelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelReturnType }{@code >}
     *     
     */
    public void setCancelResult(JAXBElement<CancelReturnType> value) {
        this.cancelResult = value;
    }

}
