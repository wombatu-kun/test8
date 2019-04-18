
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ссылка на связанный документ
 * 
 * <p>Java class for ref_dtls_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ref_dtls_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ref_doc_num" type="{}text_t"/>
 *         &lt;element name="ref_doc_date" type="{}date_or_datetime_t" minOccurs="0"/>
 *         &lt;element name="ref_name" type="{}text_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ref_dtls_t", propOrder = {
    "refDocNum",
    "refDocDate",
    "refName"
})
public class RefDtlsT {

    @XmlElement(name = "ref_doc_num", required = true)
    protected String refDocNum;
    @XmlElement(name = "ref_doc_date")
    protected DateOrDatetimeT refDocDate;
    @XmlElement(name = "ref_name")
    protected String refName;

    /**
     * Gets the value of the refDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocNum() {
        return refDocNum;
    }

    /**
     * Sets the value of the refDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocNum(String value) {
        this.refDocNum = value;
    }

    /**
     * Gets the value of the refDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public DateOrDatetimeT getRefDocDate() {
        return refDocDate;
    }

    /**
     * Sets the value of the refDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public void setRefDocDate(DateOrDatetimeT value) {
        this.refDocDate = value;
    }

    /**
     * Gets the value of the refName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Sets the value of the refName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefName(String value) {
        this.refName = value;
    }

}
