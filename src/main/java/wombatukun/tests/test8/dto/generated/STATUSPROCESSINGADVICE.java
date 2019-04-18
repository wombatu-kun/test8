
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}answer_doc_t">
 *       &lt;sequence>
 *         &lt;element name="status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="status_code" type="{}processing_status_code_et"/>
 *                     &lt;element name="xtnded_status_code" type="{}text_t"/>
 *                   &lt;/choice>
 *                   &lt;element name="status_datetime" type="{}datetime_t" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reason" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="reason_code" type="{}reason_code_et"/>
 *                   &lt;element name="xtnded_reason_code" type="{}text_t"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="add_info" type="{}any_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "reason",
    "addInfo"
})
@XmlRootElement(name = "STATUS_PROCESSING_ADVICE")
public class STATUSPROCESSINGADVICE
    extends AnswerDocT
{

    @XmlElement(required = true)
    protected STATUSPROCESSINGADVICE.Status status;
    protected List<STATUSPROCESSINGADVICE.Reason> reason;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSPROCESSINGADVICE.Status }
     *     
     */
    public STATUSPROCESSINGADVICE.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSPROCESSINGADVICE.Status }
     *     
     */
    public void setStatus(STATUSPROCESSINGADVICE.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STATUSPROCESSINGADVICE.Reason }
     * 
     * 
     */
    public List<STATUSPROCESSINGADVICE.Reason> getReason() {
        if (reason == null) {
            reason = new ArrayList<STATUSPROCESSINGADVICE.Reason>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnyT }
     *     
     */
    public AnyT getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyT }
     *     
     */
    public void setAddInfo(AnyT value) {
        this.addInfo = value;
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
     *       &lt;choice>
     *         &lt;element name="reason_code" type="{}reason_code_et"/>
     *         &lt;element name="xtnded_reason_code" type="{}text_t"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reasonCode",
        "xtndedReasonCode"
    })
    public static class Reason {

        @XmlElement(name = "reason_code")
        @XmlSchemaType(name = "string")
        protected ReasonCodeEt reasonCode;
        @XmlElement(name = "xtnded_reason_code")
        protected String xtndedReasonCode;

        /**
         * Gets the value of the reasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link ReasonCodeEt }
         *     
         */
        public ReasonCodeEt getReasonCode() {
            return reasonCode;
        }

        /**
         * Sets the value of the reasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReasonCodeEt }
         *     
         */
        public void setReasonCode(ReasonCodeEt value) {
            this.reasonCode = value;
        }

        /**
         * Gets the value of the xtndedReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXtndedReasonCode() {
            return xtndedReasonCode;
        }

        /**
         * Sets the value of the xtndedReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXtndedReasonCode(String value) {
            this.xtndedReasonCode = value;
        }

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
     *         &lt;choice>
     *           &lt;element name="status_code" type="{}processing_status_code_et"/>
     *           &lt;element name="xtnded_status_code" type="{}text_t"/>
     *         &lt;/choice>
     *         &lt;element name="status_datetime" type="{}datetime_t" minOccurs="0"/>
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
        "statusCode",
        "xtndedStatusCode",
        "statusDatetime"
    })
    public static class Status {

        @XmlElement(name = "status_code")
        @XmlSchemaType(name = "string")
        protected ProcessingStatusCodeEt statusCode;
        @XmlElement(name = "xtnded_status_code")
        protected String xtndedStatusCode;
        @XmlElement(name = "status_datetime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar statusDatetime;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link ProcessingStatusCodeEt }
         *     
         */
        public ProcessingStatusCodeEt getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcessingStatusCodeEt }
         *     
         */
        public void setStatusCode(ProcessingStatusCodeEt value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the xtndedStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXtndedStatusCode() {
            return xtndedStatusCode;
        }

        /**
         * Sets the value of the xtndedStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXtndedStatusCode(String value) {
            this.xtndedStatusCode = value;
        }

        /**
         * Gets the value of the statusDatetime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStatusDatetime() {
            return statusDatetime;
        }

        /**
         * Sets the value of the statusDatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStatusDatetime(XMLGregorianCalendar value) {
            this.statusDatetime = value;
        }

    }

}
