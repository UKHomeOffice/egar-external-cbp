
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
 *         &lt;element name="SubmitWithAttachmentsResult" type="{http://fincore.com/CBPCarrierWebService/entities}SubmitReturnType" minOccurs="0"/&gt;
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
    "submitWithAttachmentsResult"
})
@XmlRootElement(name = "SubmitWithAttachmentsResponse")
public class SubmitWithAttachmentsResponse {

    @XmlElementRef(name = "SubmitWithAttachmentsResult", namespace = "http://fincore.com/CBPCarrierWebService/", type = JAXBElement.class, required = false)
    protected JAXBElement<SubmitReturnType> submitWithAttachmentsResult;

    /**
     * Gets the value of the submitWithAttachmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}
     *     
     */
    public JAXBElement<SubmitReturnType> getSubmitWithAttachmentsResult() {
        return submitWithAttachmentsResult;
    }

    /**
     * Sets the value of the submitWithAttachmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}
     *     
     */
    public void setSubmitWithAttachmentsResult(JAXBElement<SubmitReturnType> value) {
        this.submitWithAttachmentsResult = value;
    }

}
