
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * связанные ссылки (информация об инициирующем документе). В отсутствие инициирующего документа, блок link заполняется следующим образом:
 * 	out_doc_num = NONREF
 * 	out_doc_date\date = 1900-01-01 (т.н. условная дата)
 * 
 * <p>Java class for doc_link_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doc_link_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out_doc_num" type="{}text_t"/>
 *         &lt;element name="in_doc_num" type="{}text_t"/>
 *         &lt;element name="out_doc_date" type="{}date_or_datetime_t" minOccurs="0"/>
 *         &lt;element name="in_reg_date" type="{}date_or_datetime_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doc_link_t", propOrder = {
    "outDocNum",
    "inDocNum",
    "outDocDate",
    "inRegDate"
})
public class DocLinkT {

    @XmlElement(name = "out_doc_num", required = true)
    protected String outDocNum;
    @XmlElement(name = "in_doc_num", required = true)
    protected String inDocNum;
    @XmlElement(name = "out_doc_date")
    protected DateOrDatetimeT outDocDate;
    @XmlElement(name = "in_reg_date")
    protected DateOrDatetimeT inRegDate;

    /**
     * Gets the value of the outDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDocNum() {
        return outDocNum;
    }

    /**
     * Sets the value of the outDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDocNum(String value) {
        this.outDocNum = value;
    }

    /**
     * Gets the value of the inDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocNum() {
        return inDocNum;
    }

    /**
     * Sets the value of the inDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocNum(String value) {
        this.inDocNum = value;
    }

    /**
     * Gets the value of the outDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public DateOrDatetimeT getOutDocDate() {
        return outDocDate;
    }

    /**
     * Sets the value of the outDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public void setOutDocDate(DateOrDatetimeT value) {
        this.outDocDate = value;
    }

    /**
     * Gets the value of the inRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public DateOrDatetimeT getInRegDate() {
        return inRegDate;
    }

    /**
     * Sets the value of the inRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public void setInRegDate(DateOrDatetimeT value) {
        this.inRegDate = value;
    }

}
