
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * документ, удостоверяющий личность физического лица
 * 
 * <p>Java class for individual_document_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individual_document_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doc_type" type="{}individual_document_type_t"/>
 *         &lt;element name="doc_ser" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="doc_num" type="{}text_t"/>
 *         &lt;element name="doc_date" type="{}date_t"/>
 *         &lt;element name="org" type="{}text_t"/>
 *         &lt;element name="place" type="{}text_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individual_document_t", propOrder = {
    "docType",
    "docSer",
    "docNum",
    "docDate",
    "org",
    "place"
})
public class IndividualDocumentT {

    @XmlElement(name = "doc_type", required = true)
    protected IndividualDocumentTypeT docType;
    @XmlElement(name = "doc_ser")
    protected String docSer;
    @XmlElement(name = "doc_num", required = true)
    protected String docNum;
    @XmlElement(name = "doc_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(required = true)
    protected String org;
    protected String place;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualDocumentTypeT }
     *     
     */
    public IndividualDocumentTypeT getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualDocumentTypeT }
     *     
     */
    public void setDocType(IndividualDocumentTypeT value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docSer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSer() {
        return docSer;
    }

    /**
     * Sets the value of the docSer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSer(String value) {
        this.docSer = value;
    }

    /**
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

}
