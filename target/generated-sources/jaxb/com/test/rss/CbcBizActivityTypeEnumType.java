//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.04 at 10:51:52 AM EDT 
//


package com.test.rss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbcBizActivityType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbcBizActivityType_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CBC501"/>
 *     &lt;enumeration value="CBC502"/>
 *     &lt;enumeration value="CBC503"/>
 *     &lt;enumeration value="CBC504"/>
 *     &lt;enumeration value="CBC505"/>
 *     &lt;enumeration value="CBC506"/>
 *     &lt;enumeration value="CBC507"/>
 *     &lt;enumeration value="CBC508"/>
 *     &lt;enumeration value="CBC509"/>
 *     &lt;enumeration value="CBC510"/>
 *     &lt;enumeration value="CBC511"/>
 *     &lt;enumeration value="CBC512"/>
 *     &lt;enumeration value="CBC513"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CbcBizActivityType_EnumType")
@XmlEnum
public enum CbcBizActivityTypeEnumType {


    /**
     * Research and Development
     * 
     */
    @XmlEnumValue("CBC501")
    CBC_501("CBC501"),

    /**
     * Holding or Managing intellectual property
     * 
     */
    @XmlEnumValue("CBC502")
    CBC_502("CBC502"),

    /**
     * Purchasing or Procurement
     * 
     */
    @XmlEnumValue("CBC503")
    CBC_503("CBC503"),

    /**
     * Manufacturing or Production
     * 
     */
    @XmlEnumValue("CBC504")
    CBC_504("CBC504"),

    /**
     * Sales, Marketing or Distribution
     * 
     */
    @XmlEnumValue("CBC505")
    CBC_505("CBC505"),

    /**
     * Administrative, Management or Support Services
     * 
     */
    @XmlEnumValue("CBC506")
    CBC_506("CBC506"),

    /**
     * Provision of Services to unrelated parties
     * 
     */
    @XmlEnumValue("CBC507")
    CBC_507("CBC507"),

    /**
     * Internal Group Finance
     * 
     */
    @XmlEnumValue("CBC508")
    CBC_508("CBC508"),

    /**
     * Regulated Financial Services
     * 
     */
    @XmlEnumValue("CBC509")
    CBC_509("CBC509"),

    /**
     * Insurance
     * 
     */
    @XmlEnumValue("CBC510")
    CBC_510("CBC510"),

    /**
     * Holding shares or other equity instruments
     * 
     */
    @XmlEnumValue("CBC511")
    CBC_511("CBC511"),

    /**
     * Dormant
     * 
     */
    @XmlEnumValue("CBC512")
    CBC_512("CBC512"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("CBC513")
    CBC_513("CBC513");
    private final String value;

    CbcBizActivityTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbcBizActivityTypeEnumType fromValue(String v) {
        for (CbcBizActivityTypeEnumType c: CbcBizActivityTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
