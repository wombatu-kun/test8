
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
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
 *         &lt;element name="security" type="{}security_info_t"/>
 *         &lt;element name="total_linked_instructions" type="{}number_t"/>
 *         &lt;element name="transactions_info_mif" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="current_instruction_number" type="{}number_t"/>
 *                   &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *                   &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *                   &lt;element name="doc_link_request">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="doc_num" type="{}text_t"/>
 *                             &lt;element name="doc_date" type="{}date_or_datetime_t"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="management_comp_account" type="{}account_dtls_v02_t" minOccurs="0"/>
 *                   &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="block_indicator" type="{}yes_no_t"/>
 *                   &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="processing_info">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="link" type="{}doc_link_t"/>
 *                             &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                             &lt;element name="processing_reference" type="{}text_t"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="owner" type="{}text_t" maxOccurs="unbounded"/>
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
    "security",
    "totalLinkedInstructions",
    "transactionsInfoMif",
    "addInfo"
})
@XmlRootElement(name = "REPORT_OF_UNCONFIRMED_TRANSACTION_MIF")
public class REPORTOFUNCONFIRMEDTRANSACTIONMIF
    extends AnswerDocT
{

    @XmlElement(name = "previous_ref", required = true)
    protected RefDtlsT previousRef;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(required = true)
    protected SecurityInfoT security;
    @XmlElement(name = "total_linked_instructions", required = true)
    protected BigDecimal totalLinkedInstructions;
    @XmlElement(name = "transactions_info_mif", required = true)
    protected List<REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif> transactionsInfoMif;
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
     * Gets the value of the transactionsInfoMif property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionsInfoMif property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionsInfoMif().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif }
     * 
     * 
     */
    public List<REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif> getTransactionsInfoMif() {
        if (transactionsInfoMif == null) {
            transactionsInfoMif = new ArrayList<REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif>();
        }
        return this.transactionsInfoMif;
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
     *         &lt;element name="current_instruction_number" type="{}number_t"/>
     *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
     *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
     *         &lt;element name="doc_link_request">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="doc_num" type="{}text_t"/>
     *                   &lt;element name="doc_date" type="{}date_or_datetime_t"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="management_comp_account" type="{}account_dtls_v02_t" minOccurs="0"/>
     *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
     *         &lt;element name="block_indicator" type="{}yes_no_t"/>
     *         &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="processing_info">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="link" type="{}doc_link_t"/>
     *                   &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
     *                   &lt;element name="processing_reference" type="{}text_t"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="owner" type="{}text_t" maxOccurs="unbounded"/>
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
        "currentInstructionNumber",
        "transactionType",
        "codeBaseTransactions",
        "docLinkRequest",
        "managementCompAccount",
        "quantity",
        "blockIndicator",
        "blockType",
        "openingBalance",
        "closingBalance",
        "processingInfo",
        "owner"
    })
    public static class TransactionsInfoMif {

        @XmlElement(name = "current_instruction_number", required = true)
        protected BigDecimal currentInstructionNumber;
        @XmlElement(name = "transaction_type", required = true)
        @XmlSchemaType(name = "string")
        protected TransactionTypeEt transactionType;
        @XmlElement(name = "code_base_transactions", required = true)
        @XmlSchemaType(name = "string")
        protected CodeBaseTransactionsEt codeBaseTransactions;
        @XmlElement(name = "doc_link_request", required = true)
        protected REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.DocLinkRequest docLinkRequest;
        @XmlElement(name = "management_comp_account")
        protected AccountDtlsV02T managementCompAccount;
        @XmlElement(required = true)
        protected QuantityInUnitT quantity;
        @XmlElement(name = "block_indicator", required = true)
        @XmlSchemaType(name = "string")
        protected YesNoT blockIndicator;
        @XmlElement(name = "block_type")
        protected List<BlockTypeT> blockType;
        @XmlElement(name = "opening_balance", required = true)
        protected QuantityInUnitT openingBalance;
        @XmlElement(name = "closing_balance", required = true)
        protected QuantityInUnitT closingBalance;
        @XmlElement(name = "processing_info", required = true)
        protected REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.ProcessingInfo processingInfo;
        @XmlElement(required = true)
        protected List<String> owner;

        /**
         * Gets the value of the currentInstructionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCurrentInstructionNumber() {
            return currentInstructionNumber;
        }

        /**
         * Sets the value of the currentInstructionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCurrentInstructionNumber(BigDecimal value) {
            this.currentInstructionNumber = value;
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
         * Gets the value of the docLinkRequest property.
         * 
         * @return
         *     possible object is
         *     {@link REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.DocLinkRequest }
         *     
         */
        public REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.DocLinkRequest getDocLinkRequest() {
            return docLinkRequest;
        }

        /**
         * Sets the value of the docLinkRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.DocLinkRequest }
         *     
         */
        public void setDocLinkRequest(REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.DocLinkRequest value) {
            this.docLinkRequest = value;
        }

        /**
         * Gets the value of the managementCompAccount property.
         * 
         * @return
         *     possible object is
         *     {@link AccountDtlsV02T }
         *     
         */
        public AccountDtlsV02T getManagementCompAccount() {
            return managementCompAccount;
        }

        /**
         * Sets the value of the managementCompAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountDtlsV02T }
         *     
         */
        public void setManagementCompAccount(AccountDtlsV02T value) {
            this.managementCompAccount = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityInUnitT }
         *     
         */
        public QuantityInUnitT getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityInUnitT }
         *     
         */
        public void setQuantity(QuantityInUnitT value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the blockIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link YesNoT }
         *     
         */
        public YesNoT getBlockIndicator() {
            return blockIndicator;
        }

        /**
         * Sets the value of the blockIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link YesNoT }
         *     
         */
        public void setBlockIndicator(YesNoT value) {
            this.blockIndicator = value;
        }

        /**
         * Gets the value of the blockType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blockType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlockType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BlockTypeT }
         * 
         * 
         */
        public List<BlockTypeT> getBlockType() {
            if (blockType == null) {
                blockType = new ArrayList<BlockTypeT>();
            }
            return this.blockType;
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
         *     {@link REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.ProcessingInfo }
         *     
         */
        public REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.ProcessingInfo getProcessingInfo() {
            return processingInfo;
        }

        /**
         * Sets the value of the processingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.ProcessingInfo }
         *     
         */
        public void setProcessingInfo(REPORTOFUNCONFIRMEDTRANSACTIONMIF.TransactionsInfoMif.ProcessingInfo value) {
            this.processingInfo = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the owner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOwner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOwner() {
            if (owner == null) {
                owner = new ArrayList<String>();
            }
            return this.owner;
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
         *         &lt;element name="doc_num" type="{}text_t"/>
         *         &lt;element name="doc_date" type="{}date_or_datetime_t"/>
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
            "docNum",
            "docDate"
        })
        public static class DocLinkRequest {

            @XmlElement(name = "doc_num", required = true)
            protected String docNum;
            @XmlElement(name = "doc_date", required = true)
            protected DateOrDatetimeT docDate;

            /**
             * Gets the value of the docNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocNum() {
                return docNum;
            }

            /**
             * Sets the value of the docNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocNum(String value) {
                this.docNum = value;
            }

            /**
             * Gets the value of the docDate property.
             * 
             * @return
             *     possible object is
             *     {@link DateOrDatetimeT }
             *     
             */
            public DateOrDatetimeT getDocDate() {
                return docDate;
            }

            /**
             * Sets the value of the docDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateOrDatetimeT }
             *     
             */
            public void setDocDate(DateOrDatetimeT value) {
                this.docDate = value;
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
         *         &lt;element name="link" type="{}doc_link_t"/>
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
            "link",
            "processingDatetime",
            "processingReference"
        })
        public static class ProcessingInfo {

            @XmlElement(required = true)
            protected DocLinkT link;
            @XmlElement(name = "processing_datetime", required = true)
            protected DateOrDatetimeT processingDatetime;
            @XmlElement(name = "processing_reference", required = true)
            protected String processingReference;

            /**
             * Gets the value of the link property.
             * 
             * @return
             *     possible object is
             *     {@link DocLinkT }
             *     
             */
            public DocLinkT getLink() {
                return link;
            }

            /**
             * Sets the value of the link property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocLinkT }
             *     
             */
            public void setLink(DocLinkT value) {
                this.link = value;
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

}
