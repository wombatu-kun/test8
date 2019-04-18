
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
 *         &lt;element name="registrar" type="{}party_dtls_contacts_t"/>
 *         &lt;element name="issuer" type="{}party_dtls_t"/>
 *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *         &lt;element name="account_holder" type="{}party_dtls_t"/>
 *         &lt;element name="preparation_datetime" type="{}datetime_t"/>
 *         &lt;element name="start_date" type="{}date_t"/>
 *         &lt;element name="end_date" type="{}date_t"/>
 *         &lt;element name="transactions" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;choice>
 *                     &lt;element name="transactions_all" type="{}processing_dtls_t"/>
 *                     &lt;element name="transactions_ndcd">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="security" type="{}security_info_t"/>
 *                               &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
 *                               &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="transactions_other">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t" minOccurs="0"/>
 *                               &lt;element name="account_holder_v02" type="{}party_identification_t" minOccurs="0"/>
 *                               &lt;element name="transaction_processing" type="{}processing_dtls_v03_t"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
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
    "registrar",
    "issuer",
    "accountDtls",
    "accountHolder",
    "preparationDatetime",
    "startDate",
    "endDate",
    "transactions",
    "addInfo"
})
@XmlRootElement(name = "STATEMENT_OF_TRANSACTIONS_V02")
public class STATEMENTOFTRANSACTIONSV02
    extends AnswerDocT
{

    @XmlElement(required = true)
    protected PartyDtlsContactsT registrar;
    @XmlElement(required = true)
    protected PartyDtlsT issuer;
    @XmlElement(name = "account_dtls", required = true)
    protected AccountDtlsT accountDtls;
    @XmlElement(name = "account_holder", required = true)
    protected PartyDtlsT accountHolder;
    @XmlElement(name = "preparation_datetime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preparationDatetime;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected List<STATEMENTOFTRANSACTIONSV02 .Transactions> transactions;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the registrar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsContactsT }
     *     
     */
    public PartyDtlsContactsT getRegistrar() {
        return registrar;
    }

    /**
     * Sets the value of the registrar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsContactsT }
     *     
     */
    public void setRegistrar(PartyDtlsContactsT value) {
        this.registrar = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsT }
     *     
     */
    public PartyDtlsT getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsT }
     *     
     */
    public void setIssuer(PartyDtlsT value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the accountDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDtlsT }
     *     
     */
    public AccountDtlsT getAccountDtls() {
        return accountDtls;
    }

    /**
     * Sets the value of the accountDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDtlsT }
     *     
     */
    public void setAccountDtls(AccountDtlsT value) {
        this.accountDtls = value;
    }

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsT }
     *     
     */
    public PartyDtlsT getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsT }
     *     
     */
    public void setAccountHolder(PartyDtlsT value) {
        this.accountHolder = value;
    }

    /**
     * Gets the value of the preparationDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreparationDatetime() {
        return preparationDatetime;
    }

    /**
     * Sets the value of the preparationDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreparationDatetime(XMLGregorianCalendar value) {
        this.preparationDatetime = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STATEMENTOFTRANSACTIONSV02 .Transactions }
     * 
     * 
     */
    public List<STATEMENTOFTRANSACTIONSV02 .Transactions> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<STATEMENTOFTRANSACTIONSV02 .Transactions>();
        }
        return this.transactions;
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
     *         &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
     *         &lt;choice>
     *           &lt;element name="transactions_all" type="{}processing_dtls_t"/>
     *           &lt;element name="transactions_ndcd">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="security" type="{}security_info_t"/>
     *                     &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
     *                     &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="transactions_other">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t" minOccurs="0"/>
     *                     &lt;element name="account_holder_v02" type="{}party_identification_t" minOccurs="0"/>
     *                     &lt;element name="transaction_processing" type="{}processing_dtls_v03_t"/>
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
        "openingBalance",
        "closingBalance",
        "transactionsAll",
        "transactionsNdcd",
        "transactionsOther"
    })
    public static class Transactions {

        @XmlElement(name = "opening_balance", required = true)
        protected QuantityInUnitT openingBalance;
        @XmlElement(name = "closing_balance", required = true)
        protected QuantityInUnitT closingBalance;
        @XmlElement(name = "transactions_all")
        protected ProcessingDtlsT transactionsAll;
        @XmlElement(name = "transactions_ndcd")
        protected STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsNdcd transactionsNdcd;
        @XmlElement(name = "transactions_other")
        protected STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsOther transactionsOther;

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
         * Gets the value of the transactionsAll property.
         * 
         * @return
         *     possible object is
         *     {@link ProcessingDtlsT }
         *     
         */
        public ProcessingDtlsT getTransactionsAll() {
            return transactionsAll;
        }

        /**
         * Sets the value of the transactionsAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcessingDtlsT }
         *     
         */
        public void setTransactionsAll(ProcessingDtlsT value) {
            this.transactionsAll = value;
        }

        /**
         * Gets the value of the transactionsNdcd property.
         * 
         * @return
         *     possible object is
         *     {@link STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsNdcd }
         *     
         */
        public STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsNdcd getTransactionsNdcd() {
            return transactionsNdcd;
        }

        /**
         * Sets the value of the transactionsNdcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsNdcd }
         *     
         */
        public void setTransactionsNdcd(STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsNdcd value) {
            this.transactionsNdcd = value;
        }

        /**
         * Gets the value of the transactionsOther property.
         * 
         * @return
         *     possible object is
         *     {@link STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsOther }
         *     
         */
        public STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsOther getTransactionsOther() {
            return transactionsOther;
        }

        /**
         * Sets the value of the transactionsOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsOther }
         *     
         */
        public void setTransactionsOther(STATEMENTOFTRANSACTIONSV02 .Transactions.TransactionsOther value) {
            this.transactionsOther = value;
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
         *         &lt;element name="transaction_v03" type="{}transaction_v03_t"/>
         *         &lt;element name="processing_dtls_v02" type="{}processing_dtls_v02_t"/>
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
            "transactionV03",
            "processingDtlsV02"
        })
        public static class TransactionsNdcd {

            @XmlElement(required = true)
            protected SecurityInfoT security;
            @XmlElement(name = "transaction_v03", required = true)
            protected TransactionV03T transactionV03;
            @XmlElement(name = "processing_dtls_v02", required = true)
            protected ProcessingDtlsV02T processingDtlsV02;

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
         *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t" minOccurs="0"/>
         *         &lt;element name="account_holder_v02" type="{}party_identification_t" minOccurs="0"/>
         *         &lt;element name="transaction_processing" type="{}processing_dtls_v03_t"/>
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
            "accountHolderV02",
            "transactionProcessing"
        })
        public static class TransactionsOther {

            @XmlElement(name = "account_dtls_v02")
            protected AccountDtlsV02T accountDtlsV02;
            @XmlElement(name = "account_holder_v02")
            protected PartyIdentificationT accountHolderV02;
            @XmlElement(name = "transaction_processing", required = true)
            protected ProcessingDtlsV03T transactionProcessing;

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
             * Gets the value of the transactionProcessing property.
             * 
             * @return
             *     possible object is
             *     {@link ProcessingDtlsV03T }
             *     
             */
            public ProcessingDtlsV03T getTransactionProcessing() {
                return transactionProcessing;
            }

            /**
             * Sets the value of the transactionProcessing property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProcessingDtlsV03T }
             *     
             */
            public void setTransactionProcessing(ProcessingDtlsV03T value) {
                this.transactionProcessing = value;
            }

        }

    }

}
