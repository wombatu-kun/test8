
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="previous_ref" type="{}ref_dtls_t"/>
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
 *         &lt;element name="corporate_action_notificaton_link" type="{}ref_dtls_t" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="conversion_at_reorganization" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="security" type="{}security_info_t"/>
 *                     &lt;element name="future_security" type="{}security_info_t" minOccurs="0"/>
 *                     &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *                     &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *                     &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
 *                     &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
 *                     &lt;element name="processing_info">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                               &lt;element name="processing_reference" type="{}text_t"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="shareholder_id" type="{}id_t"/>
 *                               &lt;element name="total" type="{}quantity_in_unit_t"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="conversion_securities_issue" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="previous_state">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="previous_security" type="{}security_info_t"/>
 *                               &lt;element name="previous_opening_balance" type="{}quantity_in_unit_t"/>
 *                               &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *                               &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *                               &lt;element name="previous_closing_balance" type="{}quantity_in_unit_t"/>
 *                               &lt;element name="processing_info">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                                         &lt;element name="processing_reference" type="{}text_t"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="shareholder_id" type="{}id_t"/>
 *                                         &lt;element name="total" type="{}quantity_in_unit_t"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="future_state">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="future_security" type="{}security_info_t"/>
 *                               &lt;element name="future_opening_balance" type="{}quantity_in_unit_t"/>
 *                               &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *                               &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *                               &lt;element name="future_closing_balance" type="{}quantity_in_unit_t"/>
 *                               &lt;element name="processing_info">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                                         &lt;element name="processing_reference" type="{}text_t"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="shareholder_id" type="{}id_t"/>
 *                                         &lt;element name="total" type="{}quantity_in_unit_t"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
    "counterparty",
    "corporateActionNotificatonLink",
    "conversionAtReorganization",
    "conversionSecuritiesIssue",
    "addInfo"
})
@XmlRootElement(name = "REPORT_OF_UNCONFIRMED_GLOBAL_OPERATION")
public class REPORTOFUNCONFIRMEDGLOBALOPERATION
    extends AnswerDocT
{

    @XmlElement(name = "previous_ref", required = true)
    protected RefDtlsT previousRef;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    protected REPORTOFUNCONFIRMEDGLOBALOPERATION.Counterparty counterparty;
    @XmlElement(name = "corporate_action_notificaton_link")
    protected RefDtlsT corporateActionNotificatonLink;
    @XmlElement(name = "conversion_at_reorganization")
    protected List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization> conversionAtReorganization;
    @XmlElement(name = "conversion_securities_issue")
    protected List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue> conversionSecuritiesIssue;
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
     * Gets the value of the counterparty property.
     * 
     * @return
     *     possible object is
     *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.Counterparty }
     *     
     */
    public REPORTOFUNCONFIRMEDGLOBALOPERATION.Counterparty getCounterparty() {
        return counterparty;
    }

    /**
     * Sets the value of the counterparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.Counterparty }
     *     
     */
    public void setCounterparty(REPORTOFUNCONFIRMEDGLOBALOPERATION.Counterparty value) {
        this.counterparty = value;
    }

    /**
     * Gets the value of the corporateActionNotificatonLink property.
     * 
     * @return
     *     possible object is
     *     {@link RefDtlsT }
     *     
     */
    public RefDtlsT getCorporateActionNotificatonLink() {
        return corporateActionNotificatonLink;
    }

    /**
     * Sets the value of the corporateActionNotificatonLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDtlsT }
     *     
     */
    public void setCorporateActionNotificatonLink(RefDtlsT value) {
        this.corporateActionNotificatonLink = value;
    }

    /**
     * Gets the value of the conversionAtReorganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionAtReorganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionAtReorganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization }
     * 
     * 
     */
    public List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization> getConversionAtReorganization() {
        if (conversionAtReorganization == null) {
            conversionAtReorganization = new ArrayList<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization>();
        }
        return this.conversionAtReorganization;
    }

    /**
     * Gets the value of the conversionSecuritiesIssue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionSecuritiesIssue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionSecuritiesIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue }
     * 
     * 
     */
    public List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue> getConversionSecuritiesIssue() {
        if (conversionSecuritiesIssue == null) {
            conversionSecuritiesIssue = new ArrayList<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue>();
        }
        return this.conversionSecuritiesIssue;
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
     *         &lt;element name="future_security" type="{}security_info_t" minOccurs="0"/>
     *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
     *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
     *         &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
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
     *         &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shareholder_id" type="{}id_t"/>
     *                   &lt;element name="total" type="{}quantity_in_unit_t"/>
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
        "futureSecurity",
        "transactionType",
        "codeBaseTransactions",
        "openingBalance",
        "closingBalance",
        "processingInfo",
        "registerAllocation"
    })
    public static class ConversionAtReorganization {

        @XmlElement(required = true)
        protected SecurityInfoT security;
        @XmlElement(name = "future_security")
        protected SecurityInfoT futureSecurity;
        @XmlElement(name = "transaction_type", required = true)
        @XmlSchemaType(name = "string")
        protected TransactionTypeEt transactionType;
        @XmlElement(name = "code_base_transactions", required = true)
        @XmlSchemaType(name = "string")
        protected CodeBaseTransactionsEt codeBaseTransactions;
        @XmlElement(name = "opening_balance", required = true)
        protected QuantityInUnitT openingBalance;
        @XmlElement(name = "closing_balance", required = true)
        protected QuantityInUnitT closingBalance;
        @XmlElement(name = "processing_info", required = true)
        protected REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.ProcessingInfo processingInfo;
        @XmlElement(name = "register_allocation")
        protected List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.RegisterAllocation> registerAllocation;

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
         * Gets the value of the futureSecurity property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityInfoT }
         *     
         */
        public SecurityInfoT getFutureSecurity() {
            return futureSecurity;
        }

        /**
         * Sets the value of the futureSecurity property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityInfoT }
         *     
         */
        public void setFutureSecurity(SecurityInfoT value) {
            this.futureSecurity = value;
        }

        /**
         * Gets the value of the transactionType property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionTypeEt }
         *     
         */
        public TransactionTypeEt getTransactionType() {
            return transactionType;
        }

        /**
         * Sets the value of the transactionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionTypeEt }
         *     
         */
        public void setTransactionType(TransactionTypeEt value) {
            this.transactionType = value;
        }

        /**
         * Gets the value of the codeBaseTransactions property.
         * 
         * @return
         *     possible object is
         *     {@link CodeBaseTransactionsEt }
         *     
         */
        public CodeBaseTransactionsEt getCodeBaseTransactions() {
            return codeBaseTransactions;
        }

        /**
         * Sets the value of the codeBaseTransactions property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeBaseTransactionsEt }
         *     
         */
        public void setCodeBaseTransactions(CodeBaseTransactionsEt value) {
            this.codeBaseTransactions = value;
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
         * Gets the value of the processingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.ProcessingInfo }
         *     
         */
        public REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.ProcessingInfo getProcessingInfo() {
            return processingInfo;
        }

        /**
         * Sets the value of the processingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.ProcessingInfo }
         *     
         */
        public void setProcessingInfo(REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.ProcessingInfo value) {
            this.processingInfo = value;
        }

        /**
         * Gets the value of the registerAllocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registerAllocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegisterAllocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.RegisterAllocation }
         * 
         * 
         */
        public List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.RegisterAllocation> getRegisterAllocation() {
            if (registerAllocation == null) {
                registerAllocation = new ArrayList<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionAtReorganization.RegisterAllocation>();
            }
            return this.registerAllocation;
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
         *         &lt;element name="shareholder_id" type="{}id_t"/>
         *         &lt;element name="total" type="{}quantity_in_unit_t"/>
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
            "shareholderId",
            "total"
        })
        public static class RegisterAllocation {

            @XmlElement(name = "shareholder_id", required = true)
            protected IdT shareholderId;
            @XmlElement(required = true)
            protected QuantityInUnitT total;

            /**
             * Gets the value of the shareholderId property.
             * 
             * @return
             *     possible object is
             *     {@link IdT }
             *     
             */
            public IdT getShareholderId() {
                return shareholderId;
            }

            /**
             * Sets the value of the shareholderId property.
             * 
             * @param value
             *     allowed object is
             *     {@link IdT }
             *     
             */
            public void setShareholderId(IdT value) {
                this.shareholderId = value;
            }

            /**
             * Gets the value of the total property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getTotal() {
                return total;
            }

            /**
             * Sets the value of the total property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setTotal(QuantityInUnitT value) {
                this.total = value;
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
     *         &lt;element name="previous_state">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="previous_security" type="{}security_info_t"/>
     *                   &lt;element name="previous_opening_balance" type="{}quantity_in_unit_t"/>
     *                   &lt;element name="transaction_type" type="{}transaction_type_et"/>
     *                   &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
     *                   &lt;element name="previous_closing_balance" type="{}quantity_in_unit_t"/>
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
     *                   &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="shareholder_id" type="{}id_t"/>
     *                             &lt;element name="total" type="{}quantity_in_unit_t"/>
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
     *         &lt;element name="future_state">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="future_security" type="{}security_info_t"/>
     *                   &lt;element name="future_opening_balance" type="{}quantity_in_unit_t"/>
     *                   &lt;element name="transaction_type" type="{}transaction_type_et"/>
     *                   &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
     *                   &lt;element name="future_closing_balance" type="{}quantity_in_unit_t"/>
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
     *                   &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="shareholder_id" type="{}id_t"/>
     *                             &lt;element name="total" type="{}quantity_in_unit_t"/>
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
        "previousState",
        "futureState"
    })
    public static class ConversionSecuritiesIssue {

        @XmlElement(name = "previous_state", required = true)
        protected REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState previousState;
        @XmlElement(name = "future_state", required = true)
        protected REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState futureState;

        /**
         * Gets the value of the previousState property.
         * 
         * @return
         *     possible object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState }
         *     
         */
        public REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState getPreviousState() {
            return previousState;
        }

        /**
         * Sets the value of the previousState property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState }
         *     
         */
        public void setPreviousState(REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState value) {
            this.previousState = value;
        }

        /**
         * Gets the value of the futureState property.
         * 
         * @return
         *     possible object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState }
         *     
         */
        public REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState getFutureState() {
            return futureState;
        }

        /**
         * Sets the value of the futureState property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState }
         *     
         */
        public void setFutureState(REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState value) {
            this.futureState = value;
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
         *         &lt;element name="future_security" type="{}security_info_t"/>
         *         &lt;element name="future_opening_balance" type="{}quantity_in_unit_t"/>
         *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
         *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
         *         &lt;element name="future_closing_balance" type="{}quantity_in_unit_t"/>
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
         *         &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="shareholder_id" type="{}id_t"/>
         *                   &lt;element name="total" type="{}quantity_in_unit_t"/>
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
            "futureSecurity",
            "futureOpeningBalance",
            "transactionType",
            "codeBaseTransactions",
            "futureClosingBalance",
            "processingInfo",
            "registerAllocation"
        })
        public static class FutureState {

            @XmlElement(name = "future_security", required = true)
            protected SecurityInfoT futureSecurity;
            @XmlElement(name = "future_opening_balance", required = true)
            protected QuantityInUnitT futureOpeningBalance;
            @XmlElement(name = "transaction_type", required = true)
            @XmlSchemaType(name = "string")
            protected TransactionTypeEt transactionType;
            @XmlElement(name = "code_base_transactions", required = true)
            @XmlSchemaType(name = "string")
            protected CodeBaseTransactionsEt codeBaseTransactions;
            @XmlElement(name = "future_closing_balance", required = true)
            protected QuantityInUnitT futureClosingBalance;
            @XmlElement(name = "processing_info", required = true)
            protected REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.ProcessingInfo processingInfo;
            @XmlElement(name = "register_allocation")
            protected List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.RegisterAllocation> registerAllocation;

            /**
             * Gets the value of the futureSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link SecurityInfoT }
             *     
             */
            public SecurityInfoT getFutureSecurity() {
                return futureSecurity;
            }

            /**
             * Sets the value of the futureSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurityInfoT }
             *     
             */
            public void setFutureSecurity(SecurityInfoT value) {
                this.futureSecurity = value;
            }

            /**
             * Gets the value of the futureOpeningBalance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getFutureOpeningBalance() {
                return futureOpeningBalance;
            }

            /**
             * Sets the value of the futureOpeningBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setFutureOpeningBalance(QuantityInUnitT value) {
                this.futureOpeningBalance = value;
            }

            /**
             * Gets the value of the transactionType property.
             * 
             * @return
             *     possible object is
             *     {@link TransactionTypeEt }
             *     
             */
            public TransactionTypeEt getTransactionType() {
                return transactionType;
            }

            /**
             * Sets the value of the transactionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionTypeEt }
             *     
             */
            public void setTransactionType(TransactionTypeEt value) {
                this.transactionType = value;
            }

            /**
             * Gets the value of the codeBaseTransactions property.
             * 
             * @return
             *     possible object is
             *     {@link CodeBaseTransactionsEt }
             *     
             */
            public CodeBaseTransactionsEt getCodeBaseTransactions() {
                return codeBaseTransactions;
            }

            /**
             * Sets the value of the codeBaseTransactions property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeBaseTransactionsEt }
             *     
             */
            public void setCodeBaseTransactions(CodeBaseTransactionsEt value) {
                this.codeBaseTransactions = value;
            }

            /**
             * Gets the value of the futureClosingBalance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getFutureClosingBalance() {
                return futureClosingBalance;
            }

            /**
             * Sets the value of the futureClosingBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setFutureClosingBalance(QuantityInUnitT value) {
                this.futureClosingBalance = value;
            }

            /**
             * Gets the value of the processingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.ProcessingInfo }
             *     
             */
            public REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.ProcessingInfo getProcessingInfo() {
                return processingInfo;
            }

            /**
             * Sets the value of the processingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.ProcessingInfo }
             *     
             */
            public void setProcessingInfo(REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.ProcessingInfo value) {
                this.processingInfo = value;
            }

            /**
             * Gets the value of the registerAllocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the registerAllocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegisterAllocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.RegisterAllocation }
             * 
             * 
             */
            public List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.RegisterAllocation> getRegisterAllocation() {
                if (registerAllocation == null) {
                    registerAllocation = new ArrayList<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.FutureState.RegisterAllocation>();
                }
                return this.registerAllocation;
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
             *         &lt;element name="shareholder_id" type="{}id_t"/>
             *         &lt;element name="total" type="{}quantity_in_unit_t"/>
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
                "shareholderId",
                "total"
            })
            public static class RegisterAllocation {

                @XmlElement(name = "shareholder_id", required = true)
                protected IdT shareholderId;
                @XmlElement(required = true)
                protected QuantityInUnitT total;

                /**
                 * Gets the value of the shareholderId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IdT }
                 *     
                 */
                public IdT getShareholderId() {
                    return shareholderId;
                }

                /**
                 * Sets the value of the shareholderId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IdT }
                 *     
                 */
                public void setShareholderId(IdT value) {
                    this.shareholderId = value;
                }

                /**
                 * Gets the value of the total property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuantityInUnitT }
                 *     
                 */
                public QuantityInUnitT getTotal() {
                    return total;
                }

                /**
                 * Sets the value of the total property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuantityInUnitT }
                 *     
                 */
                public void setTotal(QuantityInUnitT value) {
                    this.total = value;
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
         *         &lt;element name="previous_security" type="{}security_info_t"/>
         *         &lt;element name="previous_opening_balance" type="{}quantity_in_unit_t"/>
         *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
         *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
         *         &lt;element name="previous_closing_balance" type="{}quantity_in_unit_t"/>
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
         *         &lt;element name="register_allocation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="shareholder_id" type="{}id_t"/>
         *                   &lt;element name="total" type="{}quantity_in_unit_t"/>
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
            "previousSecurity",
            "previousOpeningBalance",
            "transactionType",
            "codeBaseTransactions",
            "previousClosingBalance",
            "processingInfo",
            "registerAllocation"
        })
        public static class PreviousState {

            @XmlElement(name = "previous_security", required = true)
            protected SecurityInfoT previousSecurity;
            @XmlElement(name = "previous_opening_balance", required = true)
            protected QuantityInUnitT previousOpeningBalance;
            @XmlElement(name = "transaction_type", required = true)
            @XmlSchemaType(name = "string")
            protected TransactionTypeEt transactionType;
            @XmlElement(name = "code_base_transactions", required = true)
            @XmlSchemaType(name = "string")
            protected CodeBaseTransactionsEt codeBaseTransactions;
            @XmlElement(name = "previous_closing_balance", required = true)
            protected QuantityInUnitT previousClosingBalance;
            @XmlElement(name = "processing_info", required = true)
            protected REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.ProcessingInfo processingInfo;
            @XmlElement(name = "register_allocation")
            protected List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.RegisterAllocation> registerAllocation;

            /**
             * Gets the value of the previousSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link SecurityInfoT }
             *     
             */
            public SecurityInfoT getPreviousSecurity() {
                return previousSecurity;
            }

            /**
             * Sets the value of the previousSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurityInfoT }
             *     
             */
            public void setPreviousSecurity(SecurityInfoT value) {
                this.previousSecurity = value;
            }

            /**
             * Gets the value of the previousOpeningBalance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getPreviousOpeningBalance() {
                return previousOpeningBalance;
            }

            /**
             * Sets the value of the previousOpeningBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setPreviousOpeningBalance(QuantityInUnitT value) {
                this.previousOpeningBalance = value;
            }

            /**
             * Gets the value of the transactionType property.
             * 
             * @return
             *     possible object is
             *     {@link TransactionTypeEt }
             *     
             */
            public TransactionTypeEt getTransactionType() {
                return transactionType;
            }

            /**
             * Sets the value of the transactionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionTypeEt }
             *     
             */
            public void setTransactionType(TransactionTypeEt value) {
                this.transactionType = value;
            }

            /**
             * Gets the value of the codeBaseTransactions property.
             * 
             * @return
             *     possible object is
             *     {@link CodeBaseTransactionsEt }
             *     
             */
            public CodeBaseTransactionsEt getCodeBaseTransactions() {
                return codeBaseTransactions;
            }

            /**
             * Sets the value of the codeBaseTransactions property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeBaseTransactionsEt }
             *     
             */
            public void setCodeBaseTransactions(CodeBaseTransactionsEt value) {
                this.codeBaseTransactions = value;
            }

            /**
             * Gets the value of the previousClosingBalance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityInUnitT }
             *     
             */
            public QuantityInUnitT getPreviousClosingBalance() {
                return previousClosingBalance;
            }

            /**
             * Sets the value of the previousClosingBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityInUnitT }
             *     
             */
            public void setPreviousClosingBalance(QuantityInUnitT value) {
                this.previousClosingBalance = value;
            }

            /**
             * Gets the value of the processingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.ProcessingInfo }
             *     
             */
            public REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.ProcessingInfo getProcessingInfo() {
                return processingInfo;
            }

            /**
             * Sets the value of the processingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.ProcessingInfo }
             *     
             */
            public void setProcessingInfo(REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.ProcessingInfo value) {
                this.processingInfo = value;
            }

            /**
             * Gets the value of the registerAllocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the registerAllocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegisterAllocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.RegisterAllocation }
             * 
             * 
             */
            public List<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.RegisterAllocation> getRegisterAllocation() {
                if (registerAllocation == null) {
                    registerAllocation = new ArrayList<REPORTOFUNCONFIRMEDGLOBALOPERATION.ConversionSecuritiesIssue.PreviousState.RegisterAllocation>();
                }
                return this.registerAllocation;
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
             *         &lt;element name="shareholder_id" type="{}id_t"/>
             *         &lt;element name="total" type="{}quantity_in_unit_t"/>
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
                "shareholderId",
                "total"
            })
            public static class RegisterAllocation {

                @XmlElement(name = "shareholder_id", required = true)
                protected IdT shareholderId;
                @XmlElement(required = true)
                protected QuantityInUnitT total;

                /**
                 * Gets the value of the shareholderId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IdT }
                 *     
                 */
                public IdT getShareholderId() {
                    return shareholderId;
                }

                /**
                 * Sets the value of the shareholderId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IdT }
                 *     
                 */
                public void setShareholderId(IdT value) {
                    this.shareholderId = value;
                }

                /**
                 * Gets the value of the total property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuantityInUnitT }
                 *     
                 */
                public QuantityInUnitT getTotal() {
                    return total;
                }

                /**
                 * Sets the value of the total property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuantityInUnitT }
                 *     
                 */
                public void setTotal(QuantityInUnitT value) {
                    this.total = value;
                }

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

}
