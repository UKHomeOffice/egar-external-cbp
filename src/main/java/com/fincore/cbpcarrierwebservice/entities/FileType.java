
package com.fincore.cbpcarrierwebservice.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAL1"/&gt;
 *     &lt;enumeration value="FAL1Supporting"/&gt;
 *     &lt;enumeration value="FAL2"/&gt;
 *     &lt;enumeration value="FAL2Supporting"/&gt;
 *     &lt;enumeration value="FAL3"/&gt;
 *     &lt;enumeration value="FAL3Supporting"/&gt;
 *     &lt;enumeration value="FAL4"/&gt;
 *     &lt;enumeration value="FAL4Supporting"/&gt;
 *     &lt;enumeration value="FAL5and6_STT"/&gt;
 *     &lt;enumeration value="FAL5and6Supporting"/&gt;
 *     &lt;enumeration value="FAL7"/&gt;
 *     &lt;enumeration value="FAL7Supporting"/&gt;
 *     &lt;enumeration value="ISPSSecurityDeclaration"/&gt;
 *     &lt;enumeration value="ISPSSupporting"/&gt;
 *     &lt;enumeration value="WasteDeclaration"/&gt;
 *     &lt;enumeration value="WasteSupporting"/&gt;
 *     &lt;enumeration value="HealthDeclaration"/&gt;
 *     &lt;enumeration value="HealthSupporting"/&gt;
 *     &lt;enumeration value="Misc"/&gt;
 *     &lt;enumeration value="Excel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileType")
@XmlEnum
public enum FileType {

    @XmlEnumValue("FAL1")
    FAL_1("FAL1"),
    @XmlEnumValue("FAL1Supporting")
    FAL_1_SUPPORTING("FAL1Supporting"),
    @XmlEnumValue("FAL2")
    FAL_2("FAL2"),
    @XmlEnumValue("FAL2Supporting")
    FAL_2_SUPPORTING("FAL2Supporting"),
    @XmlEnumValue("FAL3")
    FAL_3("FAL3"),
    @XmlEnumValue("FAL3Supporting")
    FAL_3_SUPPORTING("FAL3Supporting"),
    @XmlEnumValue("FAL4")
    FAL_4("FAL4"),
    @XmlEnumValue("FAL4Supporting")
    FAL_4_SUPPORTING("FAL4Supporting"),
    @XmlEnumValue("FAL5and6_STT")
    FAL_5_AND_6_STT("FAL5and6_STT"),
    @XmlEnumValue("FAL5and6Supporting")
    FAL_5_AND_6_SUPPORTING("FAL5and6Supporting"),
    @XmlEnumValue("FAL7")
    FAL_7("FAL7"),
    @XmlEnumValue("FAL7Supporting")
    FAL_7_SUPPORTING("FAL7Supporting"),
    @XmlEnumValue("ISPSSecurityDeclaration")
    ISPS_SECURITY_DECLARATION("ISPSSecurityDeclaration"),
    @XmlEnumValue("ISPSSupporting")
    ISPS_SUPPORTING("ISPSSupporting"),
    @XmlEnumValue("WasteDeclaration")
    WASTE_DECLARATION("WasteDeclaration"),
    @XmlEnumValue("WasteSupporting")
    WASTE_SUPPORTING("WasteSupporting"),
    @XmlEnumValue("HealthDeclaration")
    HEALTH_DECLARATION("HealthDeclaration"),
    @XmlEnumValue("HealthSupporting")
    HEALTH_SUPPORTING("HealthSupporting"),
    @XmlEnumValue("Misc")
    MISC("Misc"),
    @XmlEnumValue("Excel")
    EXCEL("Excel");
    private final String value;

    FileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileType fromValue(String v) {
        for (FileType c: FileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
