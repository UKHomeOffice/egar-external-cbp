
package com.fincore.cbpcarrierwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fincore.cbpcarrierwebservice.entities.SubmitReturnType;


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
 *         &lt;element name="SubmitSTTXMLResult" type="{http://fincore.com/CBPCarrierWebService/entities}SubmitReturnType" minOccurs="0"/&gt;
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
    "submitSTTXMLResult"
})
@XmlRootElement(name = "SubmitSTTXMLResponse")
public class SubmitSTTXMLResponse {

    @XmlElementRef(name = "SubmitSTTXMLResult", namespace = "http://fincore.com/CBPCarrierWebService/", type = JAXBElement.class, required = false)
    protected JAXBElement<SubmitReturnType> submitSTTXMLResult;

    /**
     * Gets the value of the submitSTTXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}
     *     
     */
    public JAXBElement<SubmitReturnType> getSubmitSTTXMLResult() {
        return submitSTTXMLResult;
    }

    /**
     * Sets the value of the submitSTTXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}
     *     
     */
    public void setSubmitSTTXMLResult(JAXBElement<SubmitReturnType> value) {
        this.submitSTTXMLResult = value;
    }

}
