
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * информация о регистрации юридического лица
 * 
 * <p>Java class for entity_reg_dtls_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity_reg_dtls_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reg_doc_type" type="{}entity_reg_doc_type_t"/>
 *         &lt;element name="reg_num" type="{}text_t"/>
 *         &lt;element name="reg_doc_part" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="date_of_incorporation" type="{}date_t"/>
 *         &lt;element name="reg_org" type="{}text_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity_reg_dtls_t", propOrder = {
    "regDocType",
    "regNum",
    "regDocPart",
    "dateOfIncorporation",
    "regOrg"
})
public class EntityRegDtlsT {

    @XmlElement(name = "reg_doc_type", required = true)
    protected EntityRegDocTypeT regDocType;
    @XmlElement(name = "reg_num", required = true)
    protected String regNum;
    @XmlElement(name = "reg_doc_part")
    protected String regDocPart;
    @XmlElement(name = "date_of_incorporation", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfIncorporation;
    @XmlElement(name = "reg_org", required = true)
    protected String regOrg;

    /**
     * Gets the value of the regDocType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRegDocTypeT }
     *     
     */
    public EntityRegDocTypeT getRegDocType() {
        return regDocType;
    }

    /**
     * Sets the value of the regDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRegDocTypeT }
     *     
     */
    public void setRegDocType(EntityRegDocTypeT value) {
        this.regDocType = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the regDocPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocPart() {
        return regDocPart;
    }

    /**
     * Sets the value of the regDocPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocPart(String value) {
        this.regDocPart = value;
    }

    /**
     * Gets the value of the dateOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIncorporation() {
        return dateOfIncorporation;
    }

    /**
     * Sets the value of the dateOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIncorporation(XMLGregorianCalendar value) {
        this.dateOfIncorporation = value;
    }

    /**
     * Gets the value of the regOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOrg() {
        return regOrg;
    }

    /**
     * Sets the value of the regOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOrg(String value) {
        this.regOrg = value;
    }

}
