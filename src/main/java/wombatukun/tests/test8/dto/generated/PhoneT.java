
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * номер телефона
 * 
 * <p>Java class for phone_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phone_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_num" type="{}text_t"/>
 *         &lt;element name="phone_type" type="{}phone_type_et" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phone_t", propOrder = {
    "phoneNum",
    "phoneType"
})
public class PhoneT {

    @XmlElement(name = "phone_num", required = true)
    protected String phoneNum;
    @XmlElement(name = "phone_type")
    @XmlSchemaType(name = "string")
    protected PhoneTypeEt phoneType;

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneTypeEt }
     *     
     */
    public PhoneTypeEt getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneTypeEt }
     *     
     */
    public void setPhoneType(PhoneTypeEt value) {
        this.phoneType = value;
    }

}
