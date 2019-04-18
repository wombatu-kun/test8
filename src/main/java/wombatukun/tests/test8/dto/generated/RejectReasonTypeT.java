
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * формализованная причина отказа
 * 
 * <p>Java class for reject_reason_type_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reject_reason_type_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="processing_rejected" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="processing_rejected_reason" type="{}processing_rejected_reason_et"/>
 *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cancellation_rejected" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cancellation_rejected_reason" type="{}cancellation_rejected_reason_et"/>
 *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="unmatched" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="unmatched_reason" type="{}unmatched_reason_et"/>
 *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request_rejected">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="request_rejected_reason" type="{}request_rejected_reason_et"/>
 *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reject_reason_type_t", propOrder = {
    "processingRejected",
    "cancellationRejected",
    "unmatched",
    "requestRejected"
})
public class RejectReasonTypeT {

    @XmlElement(name = "processing_rejected")
    protected List<RejectReasonTypeT.ProcessingRejected> processingRejected;
    @XmlElement(name = "cancellation_rejected")
    protected List<RejectReasonTypeT.CancellationRejected> cancellationRejected;
    protected List<RejectReasonTypeT.Unmatched> unmatched;
    @XmlElement(name = "request_rejected")
    protected RejectReasonTypeT.RequestRejected requestRejected;

    /**
     * Gets the value of the processingRejected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingRejected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingRejected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReasonTypeT.ProcessingRejected }
     * 
     * 
     */
    public List<RejectReasonTypeT.ProcessingRejected> getProcessingRejected() {
        if (processingRejected == null) {
            processingRejected = new ArrayList<RejectReasonTypeT.ProcessingRejected>();
        }
        return this.processingRejected;
    }

    /**
     * Gets the value of the cancellationRejected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationRejected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationRejected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReasonTypeT.CancellationRejected }
     * 
     * 
     */
    public List<RejectReasonTypeT.CancellationRejected> getCancellationRejected() {
        if (cancellationRejected == null) {
            cancellationRejected = new ArrayList<RejectReasonTypeT.CancellationRejected>();
        }
        return this.cancellationRejected;
    }

    /**
     * Gets the value of the unmatched property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unmatched property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnmatched().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReasonTypeT.Unmatched }
     * 
     * 
     */
    public List<RejectReasonTypeT.Unmatched> getUnmatched() {
        if (unmatched == null) {
            unmatched = new ArrayList<RejectReasonTypeT.Unmatched>();
        }
        return this.unmatched;
    }

    /**
     * Gets the value of the requestRejected property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReasonTypeT.RequestRejected }
     *     
     */
    public RejectReasonTypeT.RequestRejected getRequestRejected() {
        return requestRejected;
    }

    /**
     * Sets the value of the requestRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReasonTypeT.RequestRejected }
     *     
     */
    public void setRequestRejected(RejectReasonTypeT.RequestRejected value) {
        this.requestRejected = value;
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
     *         &lt;element name="cancellation_rejected_reason" type="{}cancellation_rejected_reason_et"/>
     *         &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
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
        "cancellationRejectedReason",
        "reasonNarrative"
    })
    public static class CancellationRejected {

        @XmlElement(name = "cancellation_rejected_reason", required = true)
        @XmlSchemaType(name = "string")
        protected CancellationRejectedReasonEt cancellationRejectedReason;
        @XmlElement(name = "reason_narrative")
        protected String reasonNarrative;

        /**
         * Gets the value of the cancellationRejectedReason property.
         * 
         * @return
         *     possible object is
         *     {@link CancellationRejectedReasonEt }
         *     
         */
        public CancellationRejectedReasonEt getCancellationRejectedReason() {
            return cancellationRejectedReason;
        }

        /**
         * Sets the value of the cancellationRejectedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancellationRejectedReasonEt }
         *     
         */
        public void setCancellationRejectedReason(CancellationRejectedReasonEt value) {
            this.cancellationRejectedReason = value;
        }

        /**
         * Gets the value of the reasonNarrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonNarrative() {
            return reasonNarrative;
        }

        /**
         * Sets the value of the reasonNarrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonNarrative(String value) {
            this.reasonNarrative = value;
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
     *         &lt;element name="processing_rejected_reason" type="{}processing_rejected_reason_et"/>
     *         &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
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
        "processingRejectedReason",
        "reasonNarrative"
    })
    public static class ProcessingRejected {

        @XmlElement(name = "processing_rejected_reason", required = true)
        @XmlSchemaType(name = "string")
        protected ProcessingRejectedReasonEt processingRejectedReason;
        @XmlElement(name = "reason_narrative")
        protected String reasonNarrative;

        /**
         * Gets the value of the processingRejectedReason property.
         * 
         * @return
         *     possible object is
         *     {@link ProcessingRejectedReasonEt }
         *     
         */
        public ProcessingRejectedReasonEt getProcessingRejectedReason() {
            return processingRejectedReason;
        }

        /**
         * Sets the value of the processingRejectedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcessingRejectedReasonEt }
         *     
         */
        public void setProcessingRejectedReason(ProcessingRejectedReasonEt value) {
            this.processingRejectedReason = value;
        }

        /**
         * Gets the value of the reasonNarrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonNarrative() {
            return reasonNarrative;
        }

        /**
         * Sets the value of the reasonNarrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonNarrative(String value) {
            this.reasonNarrative = value;
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
     *         &lt;element name="request_rejected_reason" type="{}request_rejected_reason_et"/>
     *         &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
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
        "requestRejectedReason",
        "reasonNarrative"
    })
    public static class RequestRejected {

        @XmlElement(name = "request_rejected_reason", required = true)
        @XmlSchemaType(name = "string")
        protected RequestRejectedReasonEt requestRejectedReason;
        @XmlElement(name = "reason_narrative")
        protected String reasonNarrative;

        /**
         * Gets the value of the requestRejectedReason property.
         * 
         * @return
         *     possible object is
         *     {@link RequestRejectedReasonEt }
         *     
         */
        public RequestRejectedReasonEt getRequestRejectedReason() {
            return requestRejectedReason;
        }

        /**
         * Sets the value of the requestRejectedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestRejectedReasonEt }
         *     
         */
        public void setRequestRejectedReason(RequestRejectedReasonEt value) {
            this.requestRejectedReason = value;
        }

        /**
         * Gets the value of the reasonNarrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonNarrative() {
            return reasonNarrative;
        }

        /**
         * Sets the value of the reasonNarrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonNarrative(String value) {
            this.reasonNarrative = value;
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
     *         &lt;element name="unmatched_reason" type="{}unmatched_reason_et"/>
     *         &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
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
        "unmatchedReason",
        "reasonNarrative"
    })
    public static class Unmatched {

        @XmlElement(name = "unmatched_reason", required = true)
        @XmlSchemaType(name = "string")
        protected UnmatchedReasonEt unmatchedReason;
        @XmlElement(name = "reason_narrative")
        protected String reasonNarrative;

        /**
         * Gets the value of the unmatchedReason property.
         * 
         * @return
         *     possible object is
         *     {@link UnmatchedReasonEt }
         *     
         */
        public UnmatchedReasonEt getUnmatchedReason() {
            return unmatchedReason;
        }

        /**
         * Sets the value of the unmatchedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnmatchedReasonEt }
         *     
         */
        public void setUnmatchedReason(UnmatchedReasonEt value) {
            this.unmatchedReason = value;
        }

        /**
         * Gets the value of the reasonNarrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonNarrative() {
            return reasonNarrative;
        }

        /**
         * Sets the value of the reasonNarrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonNarrative(String value) {
            this.reasonNarrative = value;
        }

    }

}
