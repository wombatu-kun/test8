
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
 *         &lt;element name="previous_ref" type="{}ref_dtls_t"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="transactions_info" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="security" type="{}security_info_t"/>
 *                   &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="total_linked_instructions" type="{}number_t"/>
 *                   &lt;element name="unconfirmed_transaction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
 *                             &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
 *                             &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
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
    "previousRef",
    "accountDtlsV02",
    "accountHolderV02",
    "transactionsInfo",
    "addInfo"
})
@XmlRootElement(name = "REPORT_OF_UNCONFIRMED_TRANSACTION")
public class REPORTOFUNCONFIRMEDTRANSACTION
    extends AnswerDocT
{

    @XmlElement(name = "previous_ref", required = true)
    protected RefDtlsT previousRef;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "transactions_info", required = true)
    protected List<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo> transactionsInfo;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the previousRef property.
     * 
     * @return
     *     possible object is
     *     {@link RefDtlsT }
     *     
     */
    public RefDtlsT getPreviousRef() {
        return previousRef;
    }

    /**
     * Sets the value of the previousRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDtlsT }
     *     
     */
    public void setPreviousRef(RefDtlsT value) {
        this.previousRef = value;
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
     * Gets the value of the transactionsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo }
     * 
     * 
     */
    public List<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo> getTransactionsInfo() {
        if (transactionsInfo == null) {
            transactionsInfo = new ArrayList<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo>();
        }
        return this.transactionsInfo;
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
     *         &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="total_linked_instructions" type="{}number_t"/>
     *         &lt;element name="unconfirmed_transaction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
     *                   &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
     *                   &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
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
        "openingBalance",
        "totalLinkedInstructions",
        "unconfirmedTransaction"
    })
    public static class TransactionsInfo {

        @XmlElement(required = true)
        protected SecurityInfoT security;
        @XmlElement(name = "opening_balance", required = true)
        protected QuantityInUnitT openingBalance;
        @XmlElement(name = "total_linked_instructions", required = true)
        protected BigDecimal totalLinkedInstructions;
        @XmlElement(name = "unconfirmed_transaction", required = true)
        protected List<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo.UnconfirmedTransaction> unconfirmedTransaction;

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
         * Gets the value of the openingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityInUnitT }
         *     
         */
        public QuantityInUnitT getOpeningBalance() {
            return openingBalance;
        }

        /**
         * Sets the value of the openingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityInUnitT }
         *     
         */
        public void setOpeningBalance(QuantityInUnitT value) {
            this.openingBalance = value;
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
         * Gets the value of the unconfirmedTransaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unconfirmedTransaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnconfirmedTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo.UnconfirmedTransaction }
         * 
         * 
         */
        public List<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo.UnconfirmedTransaction> getUnconfirmedTransaction() {
            if (unconfirmedTransaction == null) {
                unconfirmedTransaction = new ArrayList<REPORTOFUNCONFIRMEDTRANSACTION.TransactionsInfo.UnconfirmedTransaction>();
            }
            return this.unconfirmedTransaction;
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
         *         &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
         *         &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
         *         &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
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
            "transactionV03",
            "processingDtlsV02",
            "closingBalance",
            "basedInfo"
        })
        public static class UnconfirmedTransaction {

            @XmlElement(name = "transaction_v03", required = true)
            protected TransactionV03T transactionV03;
            @XmlElement(name = "processing_dtls_v02", required = true)
            protected ProcessingDtlsV02T processingDtlsV02;
            @XmlElement(name = "closing_balance", required = true)
            protected QuantityInUnitT closingBalance;
            @XmlElement(name = "based_info")
            protected List<BasedInfoT> basedInfo;

            /**
             * Gets the value of the transactionV03 property.
             * 
             * @return
             *     possible object is
             *     {@link TransactionV03T }
             *     
             */
            public TransactionV03T getTransactionV03() {
                return transactionV03;
            }

            /**
             * Sets the value of the transactionV03 property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionV03T }
             *     
             */
            public void setTransactionV03(TransactionV03T value) {
                this.transactionV03 = value;
            }

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
             * Gets the value of the closingBalance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getClosingBalance() {
                return closingBalance;
            }

            /**
             * Sets the value of the closingBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setClosingBalance(QuantityInUnitT value) {
                this.closingBalance = value;
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
