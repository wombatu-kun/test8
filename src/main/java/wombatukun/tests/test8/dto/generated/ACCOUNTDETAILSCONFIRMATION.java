
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="message_type" type="{}account_innstruction_type_et"/>
 *         &lt;element name="registrar_short" type="{}party_identification_t" maxOccurs="2"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="processing_info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operation_name" type="{}text_t"/>
 *                   &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                   &lt;element name="processing_reference" type="{}text_t"/>
 *                 &lt;/sequence>
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
    "messageType",
    "registrarShort",
    "accountDtlsV02",
    "issuerV02",
    "accountHolderV02",
    "processingInfo",
    "addInfo"
})
@XmlRootElement(name = "ACCOUNT_DETAILS_CONFIRMATION")
public class ACCOUNTDETAILSCONFIRMATION
    extends AnswerDocT
{

    @XmlElement(name = "message_type", required = true)
    @XmlSchemaType(name = "string")
    protected AccountInnstructionTypeEt messageType;
    @XmlElement(name = "registrar_short", required = true)
    protected List<PartyIdentificationT> registrarShort;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "issuer_V02", required = true, nillable = true)
    protected List<PartyIdentification2T> issuerV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "processing_info", required = true)
    protected ACCOUNTDETAILSCONFIRMATION.ProcessingInfo processingInfo;
    @XmlElementRef(name = "add_info", type = JAXBElement.class, required = false)
    protected JAXBElement<AnyT> addInfo;

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInnstructionTypeEt }
     *     
     */
    public AccountInnstructionTypeEt getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInnstructionTypeEt }
     *     
     */
    public void setMessageType(AccountInnstructionTypeEt value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the registrarShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrarShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrarShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationT }
     * 
     * 
     */
    public List<PartyIdentificationT> getRegistrarShort() {
        if (registrarShort == null) {
            registrarShort = new ArrayList<PartyIdentificationT>();
        }
        return this.registrarShort;
    }

    /**
     * Gets the value of the accountDtlsV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDtlsV02T }
     *     
     */
    public AccountDtlsV02T getAccountDtlsV02() {
        return accountDtlsV02;
    }

    /**
     * Sets the value of the accountDtlsV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDtlsV02T }
     *     
     */
    public void setAccountDtlsV02(AccountDtlsV02T value) {
        this.accountDtlsV02 = value;
    }

    /**
     * Gets the value of the issuerV02 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerV02 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerV02().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2T }
     * 
     * 
     */
    public List<PartyIdentification2T> getIssuerV02() {
        if (issuerV02 == null) {
            issuerV02 = new ArrayList<PartyIdentification2T>();
        }
        return this.issuerV02;
    }

    /**
     * Gets the value of the accountHolderV02 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationT }
     *     
     */
    public PartyIdentificationT getAccountHolderV02() {
        return accountHolderV02;
    }

    /**
     * Sets the value of the accountHolderV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationT }
     *     
     */
    public void setAccountHolderV02(PartyIdentificationT value) {
        this.accountHolderV02 = value;
    }

    /**
     * Gets the value of the processingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTDETAILSCONFIRMATION.ProcessingInfo }
     *     
     */
    public ACCOUNTDETAILSCONFIRMATION.ProcessingInfo getProcessingInfo() {
        return processingInfo;
    }

    /**
     * Sets the value of the processingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTDETAILSCONFIRMATION.ProcessingInfo }
     *     
     */
    public void setProcessingInfo(ACCOUNTDETAILSCONFIRMATION.ProcessingInfo value) {
        this.processingInfo = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnyT }{@code >}
     *     
     */
    public JAXBElement<AnyT> getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnyT }{@code >}
     *     
     */
    public void setAddInfo(JAXBElement<AnyT> value) {
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
     *       &lt;sequence>
     *         &lt;element name="operation_name" type="{}text_t"/>
     *         &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
     *         &lt;element name="processing_reference" type="{}text_t"/>
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
        "operationName",
        "processingDatetime",
        "processingReference"
    })
    public static class ProcessingInfo {

        @XmlElement(name = "operation_name", required = true)
        protected String operationName;
        @XmlElement(name = "processing_datetime", required = true)
        protected DateOrDatetimeT processingDatetime;
        @XmlElement(name = "processing_reference", required = true)
        protected String processingReference;

        /**
         * Gets the value of the operationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationName() {
            return operationName;
        }

        /**
         * Sets the value of the operationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationName(String value) {
            this.operationName = value;
        }

        /**
         * Gets the value of the processingDatetime property.
         * 
         * @return
         *     possible object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public DateOrDatetimeT getProcessingDatetime() {
            return processingDatetime;
        }

        /**
         * Sets the value of the processingDatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public void setProcessingDatetime(DateOrDatetimeT value) {
            this.processingDatetime = value;
        }

        /**
         * Gets the value of the processingReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessingReference() {
            return processingReference;
        }

        /**
         * Sets the value of the processingReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessingReference(String value) {
            this.processingReference = value;
        }

    }

}
