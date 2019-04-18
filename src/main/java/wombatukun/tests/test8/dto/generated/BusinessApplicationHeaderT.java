
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * блок служебной информации
 * 
 * <p>Java class for business_application_header_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="business_application_header_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from" type="{}party_identification2_t"/>
 *         &lt;element name="to" type="{}party_identification2_t"/>
 *         &lt;element name="business_message_identifier" type="{}text_t"/>
 *         &lt;element name="message_definition_identifier" type="{}text_t"/>
 *         &lt;element name="business_service" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="creation_date" type="{}date_t"/>
 *         &lt;element name="copy_duplicate_code" type="{}copy_duplicate_code_et" minOccurs="0"/>
 *         &lt;element name="possible_duplicate" type="{}yes_no_t" minOccurs="0"/>
 *         &lt;element name="priority" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="signature" type="{}signature_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "business_application_header_t", propOrder = {
    "from",
    "to",
    "businessMessageIdentifier",
    "messageDefinitionIdentifier",
    "businessService",
    "creationDate",
    "copyDuplicateCode",
    "possibleDuplicate",
    "priority",
    "signature"
})
@XmlSeeAlso({
    BUSINESSAPPLICATIONHEADER.class
})
public class BusinessApplicationHeaderT {

    @XmlElement(required = true)
    protected PartyIdentification2T from;
    @XmlElement(required = true)
    protected PartyIdentification2T to;
    @XmlElement(name = "business_message_identifier", required = true)
    protected String businessMessageIdentifier;
    @XmlElement(name = "message_definition_identifier", required = true)
    protected String messageDefinitionIdentifier;
    @XmlElement(name = "business_service")
    protected String businessService;
    @XmlElement(name = "creation_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "copy_duplicate_code")
    @XmlSchemaType(name = "string")
    protected CopyDuplicateCodeEt copyDuplicateCode;
    @XmlElement(name = "possible_duplicate")
    @XmlSchemaType(name = "string")
    protected YesNoT possibleDuplicate;
    protected String priority;
    protected SignatureT signature;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2T }
     *     
     */
    public PartyIdentification2T getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2T }
     *     
     */
    public void setFrom(PartyIdentification2T value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2T }
     *     
     */
    public PartyIdentification2T getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2T }
     *     
     */
    public void setTo(PartyIdentification2T value) {
        this.to = value;
    }

    /**
     * Gets the value of the businessMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessMessageIdentifier() {
        return businessMessageIdentifier;
    }

    /**
     * Sets the value of the businessMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessMessageIdentifier(String value) {
        this.businessMessageIdentifier = value;
    }

    /**
     * Gets the value of the messageDefinitionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDefinitionIdentifier() {
        return messageDefinitionIdentifier;
    }

    /**
     * Sets the value of the messageDefinitionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDefinitionIdentifier(String value) {
        this.messageDefinitionIdentifier = value;
    }

    /**
     * Gets the value of the businessService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessService() {
        return businessService;
    }

    /**
     * Sets the value of the businessService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessService(String value) {
        this.businessService = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the copyDuplicateCode property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicateCodeEt }
     *     
     */
    public CopyDuplicateCodeEt getCopyDuplicateCode() {
        return copyDuplicateCode;
    }

    /**
     * Sets the value of the copyDuplicateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicateCodeEt }
     *     
     */
    public void setCopyDuplicateCode(CopyDuplicateCodeEt value) {
        this.copyDuplicateCode = value;
    }

    /**
     * Gets the value of the possibleDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoT }
     *     
     */
    public YesNoT getPossibleDuplicate() {
        return possibleDuplicate;
    }

    /**
     * Sets the value of the possibleDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoT }
     *     
     */
    public void setPossibleDuplicate(YesNoT value) {
        this.possibleDuplicate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureT }
     *     
     */
    public SignatureT getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureT }
     *     
     */
    public void setSignature(SignatureT value) {
        this.signature = value;
    }

}
