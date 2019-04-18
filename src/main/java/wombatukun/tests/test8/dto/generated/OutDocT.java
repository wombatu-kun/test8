
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * общие элементы документов, инициируемых участником обмена
 * 
 * <p>Java class for out_doc_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="out_doc_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{}text_t"/>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="doc_num" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="doc_date" type="{}date_or_datetime_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_doc_t", propOrder = {
    "version",
    "header"
})
@XmlSeeAlso({
    SETTLEMENTTRANSACTIONALLEGEMENTREPORT.class,
    INSTRUCTIONTODELIVERV02 .class,
    FREEFORMATMESSAGEV02 .class,
    ACCOUNTCLOSINGREQUEST.class,
    CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER.class,
    LISTOFSECURITYREQUEST.class,
    CORPORATEACTIONCANCELLATIONREQUEST.class,
    CORPORATEACTIONNOTIFICATION.class,
    REQUESTFORSTATEMENT.class,
    INSTRUCTIONTODELIVER.class,
    TRANSACTIONCANCELLATIONREQUEST.class,
    ACCOUNTMODIFICATIONINSTRUCTION.class,
    STATUSCHANGEINSTRUCTION.class,
    REQUESTFORDAILYRECONCILIATION.class,
    SETTLEMENTTRANSACTIONINSTRUCTION.class
})
public class OutDocT {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected OutDocT.Header header;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link OutDocT.Header }
     *     
     */
    public OutDocT.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutDocT.Header }
     *     
     */
    public void setHeader(OutDocT.Header value) {
        this.header = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="doc_num" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="doc_date" type="{}date_or_datetime_t"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "docNum",
        "docDate"
    })
    public static class Header {

        @XmlElement(name = "doc_num", required = true)
        protected Object docNum;
        @XmlElement(name = "doc_date", required = true)
        protected DateOrDatetimeT docDate;

        /**
         * Gets the value of the docNum property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDocNum() {
            return docNum;
        }

        /**
         * Sets the value of the docNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDocNum(Object value) {
            this.docNum = value;
        }

        /**
         * Gets the value of the docDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public DateOrDatetimeT getDocDate() {
            return docDate;
        }

        /**
         * Sets the value of the docDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public void setDocDate(DateOrDatetimeT value) {
            this.docDate = value;
        }

    }

}
