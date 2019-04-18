
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * статусы и причины присвоения статусов обработки документов
 * 
 * <p>Java class for status_reason_dtls_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="status_reason_dtls_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="processing_status">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="accepted">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="processing_rejected" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="processing_rejected_reason" type="{}processing_rejected_reason_et"/>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cancellation_processing_status">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="accepted">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="completed">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="cancellation_rejected" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="cancellation_rejected_reason" type="{}cancellation_rejected_reason_et"/>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="matching_status">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="matched">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="unmatched" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="unmatched_reason" type="{}unmatched_reason_et"/>
 *                                 &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
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
@XmlType(name = "status_reason_dtls_t", propOrder = {
    "processingStatus",
    "cancellationProcessingStatus",
    "matchingStatus"
})
public class StatusReasonDtlsT {

    @XmlElement(name = "processing_status")
    protected StatusReasonDtlsT.ProcessingStatus processingStatus;
    @XmlElement(name = "cancellation_processing_status")
    protected StatusReasonDtlsT.CancellationProcessingStatus cancellationProcessingStatus;
    @XmlElement(name = "matching_status")
    protected StatusReasonDtlsT.MatchingStatus matchingStatus;

    /**
     * Gets the value of the processingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonDtlsT.ProcessingStatus }
     *     
     */
    public StatusReasonDtlsT.ProcessingStatus getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Sets the value of the processingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonDtlsT.ProcessingStatus }
     *     
     */
    public void setProcessingStatus(StatusReasonDtlsT.ProcessingStatus value) {
        this.processingStatus = value;
    }

    /**
     * Gets the value of the cancellationProcessingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonDtlsT.CancellationProcessingStatus }
     *     
     */
    public StatusReasonDtlsT.CancellationProcessingStatus getCancellationProcessingStatus() {
        return cancellationProcessingStatus;
    }

    /**
     * Sets the value of the cancellationProcessingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonDtlsT.CancellationProcessingStatus }
     *     
     */
    public void setCancellationProcessingStatus(StatusReasonDtlsT.CancellationProcessingStatus value) {
        this.cancellationProcessingStatus = value;
    }

    /**
     * Gets the value of the matchingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonDtlsT.MatchingStatus }
     *     
     */
    public StatusReasonDtlsT.MatchingStatus getMatchingStatus() {
        return matchingStatus;
    }

    /**
     * Sets the value of the matchingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonDtlsT.MatchingStatus }
     *     
     */
    public void setMatchingStatus(StatusReasonDtlsT.MatchingStatus value) {
        this.matchingStatus = value;
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
     *           &lt;element name="accepted">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="completed">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
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
    @XmlType(name = "", propOrder = {
        "accepted",
        "completed",
        "cancellationRejected"
    })
    public static class CancellationProcessingStatus {

        protected StatusReasonDtlsT.CancellationProcessingStatus.Accepted accepted;
        protected StatusReasonDtlsT.CancellationProcessingStatus.Completed completed;
        @XmlElement(name = "cancellation_rejected")
        protected List<StatusReasonDtlsT.CancellationProcessingStatus.CancellationRejected> cancellationRejected;

        /**
         * Gets the value of the accepted property.
         * 
         * @return
         *     possible object is
         *     {@link StatusReasonDtlsT.CancellationProcessingStatus.Accepted }
         *     
         */
        public StatusReasonDtlsT.CancellationProcessingStatus.Accepted getAccepted() {
            return accepted;
        }

        /**
         * Sets the value of the accepted property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusReasonDtlsT.CancellationProcessingStatus.Accepted }
         *     
         */
        public void setAccepted(StatusReasonDtlsT.CancellationProcessingStatus.Accepted value) {
            this.accepted = value;
        }

        /**
         * Gets the value of the completed property.
         * 
         * @return
         *     possible object is
         *     {@link StatusReasonDtlsT.CancellationProcessingStatus.Completed }
         *     
         */
        public StatusReasonDtlsT.CancellationProcessingStatus.Completed getCompleted() {
            return completed;
        }

        /**
         * Sets the value of the completed property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusReasonDtlsT.CancellationProcessingStatus.Completed }
         *     
         */
        public void setCompleted(StatusReasonDtlsT.CancellationProcessingStatus.Completed value) {
            this.completed = value;
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
         * {@link StatusReasonDtlsT.CancellationProcessingStatus.CancellationRejected }
         * 
         * 
         */
        public List<StatusReasonDtlsT.CancellationProcessingStatus.CancellationRejected> getCancellationRejected() {
            if (cancellationRejected == null) {
                cancellationRejected = new ArrayList<StatusReasonDtlsT.CancellationProcessingStatus.CancellationRejected>();
            }
            return this.cancellationRejected;
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
            "reasonNarrative"
        })
        public static class Accepted {

            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

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
            "reasonNarrative"
        })
        public static class Completed {

            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

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
     *           &lt;element name="matched">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
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
    @XmlType(name = "", propOrder = {
        "matched",
        "unmatched"
    })
    public static class MatchingStatus {

        protected StatusReasonDtlsT.MatchingStatus.Matched matched;
        protected List<StatusReasonDtlsT.MatchingStatus.Unmatched> unmatched;

        /**
         * Gets the value of the matched property.
         * 
         * @return
         *     possible object is
         *     {@link StatusReasonDtlsT.MatchingStatus.Matched }
         *     
         */
        public StatusReasonDtlsT.MatchingStatus.Matched getMatched() {
            return matched;
        }

        /**
         * Sets the value of the matched property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusReasonDtlsT.MatchingStatus.Matched }
         *     
         */
        public void setMatched(StatusReasonDtlsT.MatchingStatus.Matched value) {
            this.matched = value;
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
         * {@link StatusReasonDtlsT.MatchingStatus.Unmatched }
         * 
         * 
         */
        public List<StatusReasonDtlsT.MatchingStatus.Unmatched> getUnmatched() {
            if (unmatched == null) {
                unmatched = new ArrayList<StatusReasonDtlsT.MatchingStatus.Unmatched>();
            }
            return this.unmatched;
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
            "reasonNarrative"
        })
        public static class Matched {

            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

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
     *           &lt;element name="accepted">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "accepted",
        "processingRejected"
    })
    public static class ProcessingStatus {

        protected StatusReasonDtlsT.ProcessingStatus.Accepted accepted;
        @XmlElement(name = "processing_rejected")
        protected List<StatusReasonDtlsT.ProcessingStatus.ProcessingRejected> processingRejected;

        /**
         * Gets the value of the accepted property.
         * 
         * @return
         *     possible object is
         *     {@link StatusReasonDtlsT.ProcessingStatus.Accepted }
         *     
         */
        public StatusReasonDtlsT.ProcessingStatus.Accepted getAccepted() {
            return accepted;
        }

        /**
         * Sets the value of the accepted property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusReasonDtlsT.ProcessingStatus.Accepted }
         *     
         */
        public void setAccepted(StatusReasonDtlsT.ProcessingStatus.Accepted value) {
            this.accepted = value;
        }

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
         * {@link StatusReasonDtlsT.ProcessingStatus.ProcessingRejected }
         * 
         * 
         */
        public List<StatusReasonDtlsT.ProcessingStatus.ProcessingRejected> getProcessingRejected() {
            if (processingRejected == null) {
                processingRejected = new ArrayList<StatusReasonDtlsT.ProcessingStatus.ProcessingRejected>();
            }
            return this.processingRejected;
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
            "reasonNarrative"
        })
        public static class Accepted {

            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

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

    }

}
