
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
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
 *         &lt;element name="total_linked_instructions" type="{}number_t"/>
 *         &lt;element name="transaction_status" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="security" type="{}security_info_t"/>
 *                   &lt;element name="reconciliation_status" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
 *                             &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
 *                             &lt;element name="based_info" type="{}based_info_t" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "totalLinkedInstructions",
    "transactionStatus",
    "addInfo"
})
@XmlRootElement(name = "SETTLEMENT_TRANSACTION_STATUS_ADVICE")
public class SETTLEMENTTRANSACTIONSTATUSADVICE
    extends AnswerDocT
{

    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "total_linked_instructions", required = true)
    protected BigDecimal totalLinkedInstructions;
    @XmlElement(name = "transaction_status", required = true)
    protected List<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus> transactionStatus;
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
     * Gets the value of the totalLinkedInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLinkedInstructions() {
        return totalLinkedInstructions;
    }

    /**
     * Sets the value of the totalLinkedInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLinkedInstructions(BigDecimal value) {
        this.totalLinkedInstructions = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus }
     * 
     * 
     */
    public List<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus> getTransactionStatus() {
        if (transactionStatus == null) {
            transactionStatus = new ArrayList<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus>();
        }
        return this.transactionStatus;
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
     *         &lt;element name="security" type="{}security_info_t"/>
     *         &lt;element name="reconciliation_status" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
     *                   &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
     *                   &lt;element name="based_info" type="{}based_info_t" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "security",
        "reconciliationStatus"
    })
    public static class TransactionStatus {

        @XmlElement(required = true)
        protected SecurityInfoT security;
        @XmlElement(name = "reconciliation_status", required = true)
        protected List<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus.ReconciliationStatus> reconciliationStatus;

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
         * Gets the value of the reconciliationStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reconciliationStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReconciliationStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus.ReconciliationStatus }
         * 
         * 
         */
        public List<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus.ReconciliationStatus> getReconciliationStatus() {
            if (reconciliationStatus == null) {
                reconciliationStatus = new ArrayList<SETTLEMENTTRANSACTIONSTATUSADVICE.TransactionStatus.ReconciliationStatus>();
            }
            return this.reconciliationStatus;
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
         *         &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
         *         &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
         *         &lt;element name="based_info" type="{}based_info_t" maxOccurs="unbounded" minOccurs="0"/>
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
            "processingDtlsV02",
            "reconciliationInfo",
            "basedInfo"
        })
        public static class ReconciliationStatus {

            @XmlElement(name = "processing_dtls_v02", required = true)
            protected ProcessingDtlsV02T processingDtlsV02;
            @XmlElement(name = "reconciliation_info", required = true)
            protected ReconciliationInfoT reconciliationInfo;
            @XmlElement(name = "based_info")
            protected List<BasedInfoT> basedInfo;

            /**
             * Gets the value of the processingDtlsV02 property.
             * 
             * @return
             *     possible object is
             *     {@link ProcessingDtlsV02T }
             *     
             */
            public ProcessingDtlsV02T getProcessingDtlsV02() {
                return processingDtlsV02;
            }

            /**
             * Sets the value of the processingDtlsV02 property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProcessingDtlsV02T }
             *     
             */
            public void setProcessingDtlsV02(ProcessingDtlsV02T value) {
                this.processingDtlsV02 = value;
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
             * Gets the value of the basedInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the basedInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBasedInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BasedInfoT }
             * 
             * 
             */
            public List<BasedInfoT> getBasedInfo() {
                if (basedInfo == null) {
                    basedInfo = new ArrayList<BasedInfoT>();
                }
                return this.basedInfo;
            }

        }

    }

}
