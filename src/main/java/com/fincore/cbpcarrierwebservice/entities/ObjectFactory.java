
package com.fincore.cbpcarrierwebservice.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fincore.cbpcarrierwebservice.entities package. 
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

    private final static QName _SubmitReturnType_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "SubmitReturnType");
    private final static QName _ArrayOfFile_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "ArrayOfFile");
    private final static QName _File_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "File");
    private final static QName _ArrayOfTypedFile_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "ArrayOfTypedFile");
    private final static QName _TypedFile_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "TypedFile");
    private final static QName _FileType_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "FileType");
    private final static QName _CancelReturnType_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "CancelReturnType");
    private final static QName _CancelReturnTypeReason_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "Reason");
    private final static QName _SubmitReturnTypeIdentifier_QNAME = new QName("http://fincore.com/CBPCarrierWebService/entities", "Identifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fincore.cbpcarrierwebservice.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitReturnType }
     * 
     */
    public SubmitReturnType createSubmitReturnType() {
        return new SubmitReturnType();
    }

    /**
     * Create an instance of {@link ArrayOfFile }
     * 
     */
    public ArrayOfFile createArrayOfFile() {
        return new ArrayOfFile();
    }

    /**
     * Create an instance of {@link ArrayOfTypedFile }
     * 
     */
    public ArrayOfTypedFile createArrayOfTypedFile() {
        return new ArrayOfTypedFile();
    }

    /**
     * Create an instance of {@link CancelReturnType }
     * 
     */
    public CancelReturnType createCancelReturnType() {
        return new CancelReturnType();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link TypedFile }
     * 
     */
    public TypedFile createTypedFile() {
        return new TypedFile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "SubmitReturnType")
    public JAXBElement<SubmitReturnType> createSubmitReturnType(SubmitReturnType value) {
        return new JAXBElement<SubmitReturnType>(_SubmitReturnType_QNAME, SubmitReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "ArrayOfFile")
    public JAXBElement<ArrayOfFile> createArrayOfFile(ArrayOfFile value) {
        return new JAXBElement<ArrayOfFile>(_ArrayOfFile_QNAME, ArrayOfFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "File")
    public JAXBElement<File> createFile(File value) {
        return new JAXBElement<File>(_File_QNAME, File.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTypedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "ArrayOfTypedFile")
    public JAXBElement<ArrayOfTypedFile> createArrayOfTypedFile(ArrayOfTypedFile value) {
        return new JAXBElement<ArrayOfTypedFile>(_ArrayOfTypedFile_QNAME, ArrayOfTypedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "TypedFile")
    public JAXBElement<TypedFile> createTypedFile(TypedFile value) {
        return new JAXBElement<TypedFile>(_TypedFile_QNAME, TypedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "FileType")
    public JAXBElement<FileType> createFileType(FileType value) {
        return new JAXBElement<FileType>(_FileType_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "CancelReturnType")
    public JAXBElement<CancelReturnType> createCancelReturnType(CancelReturnType value) {
        return new JAXBElement<CancelReturnType>(_CancelReturnType_QNAME, CancelReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "Reason", scope = CancelReturnType.class)
    public JAXBElement<String> createCancelReturnTypeReason(String value) {
        return new JAXBElement<String>(_CancelReturnTypeReason_QNAME, String.class, CancelReturnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "Identifier", scope = SubmitReturnType.class)
    public JAXBElement<String> createSubmitReturnTypeIdentifier(String value) {
        return new JAXBElement<String>(_SubmitReturnTypeIdentifier_QNAME, String.class, SubmitReturnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fincore.com/CBPCarrierWebService/entities", name = "Reason", scope = SubmitReturnType.class)
    public JAXBElement<String> createSubmitReturnTypeReason(String value) {
        return new JAXBElement<String>(_CancelReturnTypeReason_QNAME, String.class, SubmitReturnType.class, value);
    }

}
