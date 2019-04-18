
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="counterparty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *                   &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="global_operation_status" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="security" type="{}security_info_t"/>
 *                   &lt;element name="processing_info">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                             &lt;element name="processing_reference" type="{}text_t"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
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
    "accountDtlsV02",
    "accountHolderV02",
    "counterparty",
    "globalOperationStatus",
    "addInfo"
})
@XmlRootElement(name = "GLOBAL_OPERATION_STATUS_ADVICE")
public class GLOBALOPERATIONSTATUSADVICE
    extends AnswerDocT
{

    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    protected GLOBALOPERATIONSTATUSADVICE.Counterparty counterparty;
    @XmlElement(name = "global_operation_status", required = true)
    protected List<GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus> globalOperationStatus;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

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
     * Gets the value of the counterparty property.
     * 
     * @return
     *     possible object is
     *     {@link GLOBALOPERATIONSTATUSADVICE.Counterparty }
     *     
     */
    public GLOBALOPERATIONSTATUSADVICE.Counterparty getCounterparty() {
        return counterparty;
    }

    /**
     * Sets the value of the counterparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALOPERATIONSTATUSADVICE.Counterparty }
     *     
     */
    public void setCounterparty(GLOBALOPERATIONSTATUSADVICE.Counterparty value) {
        this.counterparty = value;
    }

    /**
     * Gets the value of the globalOperationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalOperationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalOperationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus }
     * 
     * 
     */
    public List<GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus> getGlobalOperationStatus() {
        if (globalOperationStatus == null) {
            globalOperationStatus = new ArrayList<GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus>();
        }
        return this.globalOperationStatus;
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
     *       &lt;sequence>
     *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
     *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
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
        "accountDtlsV02",
        "accountHolderV02"
    })
    public static class Counterparty {

        @XmlElement(name = "account_dtls_v02", required = true)
        protected AccountDtlsV02T accountDtlsV02;
        @XmlElement(name = "account_holder_v02", required = true)
        protected PartyIdentificationT accountHolderV02;

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
     *         &lt;element name="security" type="{}security_info_t"/>
     *         &lt;element name="processing_info">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
     *                   &lt;element name="processing_reference" type="{}text_t"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
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
        "security",
        "processingInfo",
        "reconciliationInfo"
    })
    public static class GlobalOperationStatus {

        @XmlElement(required = true)
        protected SecurityInfoT security;
        @XmlElement(name = "processing_info", required = true)
        protected GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus.ProcessingInfo processingInfo;
        @XmlElement(name = "reconciliation_info", required = true)
        protected ReconciliationInfoT reconciliationInfo;

        /**
         * Gets the value of the security property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityInfoT }
         *     
         */
        public SecurityInfoT getSecurity() {
            return security;
        }

        /**
         * Sets the value of the security property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityInfoT }
         *     
         */
        public void setSecurity(SecurityInfoT value) {
            this.security = value;
        }

        /**
         * Gets the value of the processingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus.ProcessingInfo }
         *     
         */
        public GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus.ProcessingInfo getProcessingInfo() {
            return processingInfo;
        }

        /**
         * Sets the value of the processingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus.ProcessingInfo }
         *     
         */
        public void setProcessingInfo(GLOBALOPERATIONSTATUSADVICE.GlobalOperationStatus.ProcessingInfo value) {
            this.processingInfo = value;
        }

        /**
         * Gets the value of the reconciliationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReconciliationInfoT }
         *     
         */
        public ReconciliationInfoT getReconciliationInfo() {
            return reconciliationInfo;
        }

        /**
         * Sets the value of the reconciliationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReconciliationInfoT }
         *     
         */
        public void setReconciliationInfo(ReconciliationInfoT value) {
            this.reconciliationInfo = value;
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
            "processingDatetime",
            "processingReference"
        })
        public static class ProcessingInfo {

            @XmlElement(name = "processing_datetime", required = true)
            protected DateOrDatetimeT processingDatetime;
            @XmlElement(name = "processing_reference", required = true)
            protected String processingReference;

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

}
