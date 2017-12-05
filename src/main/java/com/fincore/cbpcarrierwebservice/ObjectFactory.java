
package com.fincore.cbpcarrierwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.fincore.cbpcarrierwebservice.entities.ArrayOfFile;
import com.fincore.cbpcarrierwebservice.entities.ArrayOfTypedFile;
import com.fincore.cbpcarrierwebservice.entities.CancelReturnType;
import com.fincore.cbpcarrierwebservice.entities.SubmitReturnType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fincore.cbpcarrierwebservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubmitSTTXMLUsername_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "username");
    private final static QName _SubmitSTTXMLPassword_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "password");
    private final static QName _SubmitSTTXMLSttXml_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "stt_xml");
    private final static QName _SubmitSTTXMLResponseSubmitSTTXMLResult_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "SubmitSTTXMLResult");
    private final static QName _SubmitWithAttachmentsFiles_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "files");
    private final static QName _SubmitWithAttachmentsResponseSubmitWithAttachmentsResult_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "SubmitWithAttachmentsResult");
    private final static QName _SubmitFALWithTypedAttachmentsResponseSubmitFALWithTypedAttachmentsResult_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "SubmitFALWithTypedAttachmentsResult");
    private final static QName _CancelIdentifier_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "identifier");
    private final static QName _CancelReason_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "reason");
    private final static QName _CancelResponseCancelResult_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "CancelResult");
    private final static QName _VersionResponseVersionResult_QNAME = new QName("http://fincore.com/CBPCarrierWebService/", "VersionResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fincore.cbpcarrierwebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitSTTXML }
     * 
     */
    public SubmitSTTXML createSubmitSTTXML() {
        return new SubmitSTTXML();
    }

    /**
     * Create an instance of {@link SubmitSTTXMLResponse }
     * 
     */
    public SubmitSTTXMLResponse createSubmitSTTXMLResponse() {
        return new SubmitSTTXMLResponse();
    }

    /**
     * Create an instance of {@link SubmitWithAttachments }
     * 
     */
    public SubmitWithAttachments createSubmitWithAttachments() {
        return new SubmitWithAttachments();
    }

    /**
     * Create an instance of {@link SubmitWithAttachmentsResponse }
     * 
     */
    public SubmitWithAttachmentsResponse createSubmitWithAttachmentsResponse() {
        return new SubmitWithAttachmentsResponse();
    }

    /**
     * Create an instance of {@link SubmitFALWithTypedAttachments }
     * 
     */
    public SubmitFALWithTypedAttachments createSubmitFALWithTypedAttachments() {
        return new SubmitFALWithTypedAttachments();
    }

    /**
     * Create an instance of {@link SubmitFALWithTypedAttachmentsResponse }
     * 
     */
    public SubmitFALWithTypedAttachmentsResponse createSubmitFALWithTypedAttachmentsResponse() {
        return new SubmitFALWithTypedAttachmentsResponse();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link Heartbeat }
     * 
     */
    public Heartbeat createHeartbeat() {
        return new Heartbeat();
    }

    /**
     * Create an instance of {@link HeartbeatResponse }
     * 
     */
    public HeartbeatResponse createHeartbeatResponse() {
        return new HeartbeatResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = SubmitSTTXML.class)
    public JAXBElement<String> createSubmitSTTXMLUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, SubmitSTTXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = SubmitSTTXML.class)
    public JAXBElement<String> createSubmitSTTXMLPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, SubmitSTTXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "stt_xml", scope = SubmitSTTXML.class)
    public JAXBElement<String> createSubmitSTTXMLSttXml(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLSttXml_QNAME, String.class, SubmitSTTXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "SubmitSTTXMLResult", scope = SubmitSTTXMLResponse.class)
    public JAXBElement<SubmitReturnType> createSubmitSTTXMLResponseSubmitSTTXMLResult(SubmitReturnType value) {
        return new JAXBElement<SubmitReturnType>(_SubmitSTTXMLResponseSubmitSTTXMLResult_QNAME, SubmitReturnType.class, SubmitSTTXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = SubmitWithAttachments.class)
    public JAXBElement<String> createSubmitWithAttachmentsUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, SubmitWithAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = SubmitWithAttachments.class)
    public JAXBElement<String> createSubmitWithAttachmentsPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, SubmitWithAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "files", scope = SubmitWithAttachments.class)
    public JAXBElement<ArrayOfFile> createSubmitWithAttachmentsFiles(ArrayOfFile value) {
        return new JAXBElement<ArrayOfFile>(_SubmitWithAttachmentsFiles_QNAME, ArrayOfFile.class, SubmitWithAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "SubmitWithAttachmentsResult", scope = SubmitWithAttachmentsResponse.class)
    public JAXBElement<SubmitReturnType> createSubmitWithAttachmentsResponseSubmitWithAttachmentsResult(SubmitReturnType value) {
        return new JAXBElement<SubmitReturnType>(_SubmitWithAttachmentsResponseSubmitWithAttachmentsResult_QNAME, SubmitReturnType.class, SubmitWithAttachmentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = SubmitFALWithTypedAttachments.class)
    public JAXBElement<String> createSubmitFALWithTypedAttachmentsUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, SubmitFALWithTypedAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = SubmitFALWithTypedAttachments.class)
    public JAXBElement<String> createSubmitFALWithTypedAttachmentsPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, SubmitFALWithTypedAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTypedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "files", scope = SubmitFALWithTypedAttachments.class)
    public JAXBElement<ArrayOfTypedFile> createSubmitFALWithTypedAttachmentsFiles(ArrayOfTypedFile value) {
        return new JAXBElement<ArrayOfTypedFile>(_SubmitWithAttachmentsFiles_QNAME, ArrayOfTypedFile.class, SubmitFALWithTypedAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "SubmitFALWithTypedAttachmentsResult", scope = SubmitFALWithTypedAttachmentsResponse.class)
    public JAXBElement<SubmitReturnType> createSubmitFALWithTypedAttachmentsResponseSubmitFALWithTypedAttachmentsResult(SubmitReturnType value) {
        return new JAXBElement<SubmitReturnType>(_SubmitFALWithTypedAttachmentsResponseSubmitFALWithTypedAttachmentsResult_QNAME, SubmitReturnType.class, SubmitFALWithTypedAttachmentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = Cancel.class)
    public JAXBElement<String> createCancelUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = Cancel.class)
    public JAXBElement<String> createCancelPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "identifier", scope = Cancel.class)
    public JAXBElement<String> createCancelIdentifier(String value) {
        return new JAXBElement<String>(_CancelIdentifier_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "reason", scope = Cancel.class)
    public JAXBElement<String> createCancelReason(String value) {
        return new JAXBElement<String>(_CancelReason_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "CancelResult", scope = CancelResponse.class)
    public JAXBElement<CancelReturnType> createCancelResponseCancelResult(CancelReturnType value) {
        return new JAXBElement<CancelReturnType>(_CancelResponseCancelResult_QNAME, CancelReturnType.class, CancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = Version.class)
    public JAXBElement<String> createVersionUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, Version.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = Version.class)
    public JAXBElement<String> createVersionPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, Version.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "VersionResult", scope = VersionResponse.class)
    public JAXBElement<String> createVersionResponseVersionResult(String value) {
        return new JAXBElement<String>(_VersionResponseVersionResult_QNAME, String.class, VersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "username", scope = Heartbeat.class)
    public JAXBElement<String> createHeartbeatUsername(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLUsername_QNAME, String.class, Heartbeat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/", name = "password", scope = Heartbeat.class)
    public JAXBElement<String> createHeartbeatPassword(String value) {
        return new JAXBElement<String>(_SubmitSTTXMLPassword_QNAME, String.class, Heartbeat.class, value);
    }

}
