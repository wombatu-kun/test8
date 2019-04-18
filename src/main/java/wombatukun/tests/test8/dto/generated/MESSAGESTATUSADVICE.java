
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
 *         &lt;element name="message_status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="accepted">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="message_rejected" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="message_rejected_reason" type="{}message_rejected_reason_et"/>
 *                             &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="message_pending" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="message_pending_reason" type="{}message_pending_reason_et"/>
 *                             &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status_datetime" type="{}datetime_t" minOccurs="0"/>
 *         &lt;element name="ref_dtls" type="{}ref_dtls_t" minOccurs="0"/>
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
    "messageStatus",
    "statusDatetime",
    "refDtls",
    "addInfo"
})
@XmlRootElement(name = "MESSAGE_STATUS_ADVICE")
public class MESSAGESTATUSADVICE
    extends AnswerDocT
{

    @XmlElement(name = "message_status", required = true)
    protected MESSAGESTATUSADVICE.MessageStatus messageStatus;
    @XmlElement(name = "status_datetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDatetime;
    @XmlElement(name = "ref_dtls")
    protected RefDtlsT refDtls;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MESSAGESTATUSADVICE.MessageStatus }
     *     
     */
    public MESSAGESTATUSADVICE.MessageStatus getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESSAGESTATUSADVICE.MessageStatus }
     *     
     */
    public void setMessageStatus(MESSAGESTATUSADVICE.MessageStatus value) {
        this.messageStatus = value;
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

    /**
     * Gets the value of the refDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RefDtlsT }
     *     
     */
    public RefDtlsT getRefDtls() {
        return refDtls;
    }

    /**
     * Sets the value of the refDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDtlsT }
     *     
     */
    public void setRefDtls(RefDtlsT value) {
        this.refDtls = value;
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
     *         &lt;element name="accepted">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="message_rejected" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="message_rejected_reason" type="{}message_rejected_reason_et"/>
     *                   &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="message_pending" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="message_pending_reason" type="{}message_pending_reason_et"/>
     *                   &lt;element name="reason_narrative" type="{}text_t" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "accepted",
        "messageRejected",
        "messagePending"
    })
    public static class MessageStatus {

        protected MESSAGESTATUSADVICE.MessageStatus.Accepted accepted;
        @XmlElement(name = "message_rejected")
        protected List<MESSAGESTATUSADVICE.MessageStatus.MessageRejected> messageRejected;
        @XmlElement(name = "message_pending")
        protected List<MESSAGESTATUSADVICE.MessageStatus.MessagePending> messagePending;

        /**
         * Gets the value of the accepted property.
         * 
         * @return
         *     possible object is
         *     {@link MESSAGESTATUSADVICE.MessageStatus.Accepted }
         *     
         */
        public MESSAGESTATUSADVICE.MessageStatus.Accepted getAccepted() {
            return accepted;
        }

        /**
         * Sets the value of the accepted property.
         * 
         * @param value
         *     allowed object is
         *     {@link MESSAGESTATUSADVICE.MessageStatus.Accepted }
         *     
         */
        public void setAccepted(MESSAGESTATUSADVICE.MessageStatus.Accepted value) {
            this.accepted = value;
        }

        /**
         * Gets the value of the messageRejected property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messageRejected property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessageRejected().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MESSAGESTATUSADVICE.MessageStatus.MessageRejected }
         * 
         * 
         */
        public List<MESSAGESTATUSADVICE.MessageStatus.MessageRejected> getMessageRejected() {
            if (messageRejected == null) {
                messageRejected = new ArrayList<MESSAGESTATUSADVICE.MessageStatus.MessageRejected>();
            }
            return this.messageRejected;
        }

        /**
         * Gets the value of the messagePending property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messagePending property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessagePending().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MESSAGESTATUSADVICE.MessageStatus.MessagePending }
         * 
         * 
         */
        public List<MESSAGESTATUSADVICE.MessageStatus.MessagePending> getMessagePending() {
            if (messagePending == null) {
                messagePending = new ArrayList<MESSAGESTATUSADVICE.MessageStatus.MessagePending>();
            }
            return this.messagePending;
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
         *         &lt;element name="message_pending_reason" type="{}message_pending_reason_et"/>
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
            "messagePendingReason",
            "reasonNarrative"
        })
        public static class MessagePending {

            @XmlElement(name = "message_pending_reason", required = true)
            @XmlSchemaType(name = "string")
            protected MessagePendingReasonEt messagePendingReason;
            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

            /**
             * Gets the value of the messagePendingReason property.
             * 
             * @return
             *     possible object is
             *     {@link MessagePendingReasonEt }
             *     
             */
            public MessagePendingReasonEt getMessagePendingReason() {
                return messagePendingReason;
            }

            /**
             * Sets the value of the messagePendingReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link MessagePendingReasonEt }
             *     
             */
            public void setMessagePendingReason(MessagePendingReasonEt value) {
                this.messagePendingReason = value;
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
         *         &lt;element name="message_rejected_reason" type="{}message_rejected_reason_et"/>
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
            "messageRejectedReason",
            "reasonNarrative"
        })
        public static class MessageRejected {

            @XmlElement(name = "message_rejected_reason", required = true)
            @XmlSchemaType(name = "string")
            protected MessageRejectedReasonEt messageRejectedReason;
            @XmlElement(name = "reason_narrative")
            protected String reasonNarrative;

            /**
             * Gets the value of the messageRejectedReason property.
             * 
             * @return
             *     possible object is
             *     {@link MessageRejectedReasonEt }
             *     
             */
            public MessageRejectedReasonEt getMessageRejectedReason() {
                return messageRejectedReason;
            }

            /**
             * Sets the value of the messageRejectedReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link MessageRejectedReasonEt }
             *     
             */
            public void setMessageRejectedReason(MessageRejectedReasonEt value) {
                this.messageRejectedReason = value;
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
