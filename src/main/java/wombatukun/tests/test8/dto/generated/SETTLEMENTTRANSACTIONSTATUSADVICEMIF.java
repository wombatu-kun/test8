
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
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="total_linked_instructions" type="{}number_t"/>
 *         &lt;element name="security" type="{}security_info_t"/>
 *         &lt;element name="mif_operation_status" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="current_instruction_number" type="{}number_t"/>
 *                   &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *                   &lt;element name="transaction_type" type="{}transaction_type_et"/>
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
 *                   &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
 *                   &lt;element name="doc_link_request" minOccurs="0">
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
 *                   &lt;element name="shareholder_info" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
 *                             &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="inn" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="iin" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="okved" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
 *                             &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="postal_name" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{}text_t"/>
 *                                       &lt;element name="address" type="{}address_t"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "security",
    "mifOperationStatus",
    "addInfo"
})
@XmlRootElement(name = "SETTLEMENT_TRANSACTION_STATUS_ADVICE_MIF")
public class SETTLEMENTTRANSACTIONSTATUSADVICEMIF
    extends AnswerDocT
{

    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "total_linked_instructions", required = true)
    protected BigDecimal totalLinkedInstructions;
    @XmlElement(required = true)
    protected SecurityInfoT security;
    @XmlElement(name = "mif_operation_status", required = true)
    protected List<SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus> mifOperationStatus;
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
     * Gets the value of the mifOperationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mifOperationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMifOperationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus }
     * 
     * 
     */
    public List<SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus> getMifOperationStatus() {
        if (mifOperationStatus == null) {
            mifOperationStatus = new ArrayList<SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus>();
        }
        return this.mifOperationStatus;
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
     *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
     *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
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
     *         &lt;element name="reconciliation_info" type="{}reconciliation_info_t"/>
     *         &lt;element name="doc_link_request" minOccurs="0">
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
     *         &lt;element name="shareholder_info" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
     *                   &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="inn" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="iin" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="okved" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
     *                   &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="postal_name" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{}text_t"/>
     *                             &lt;element name="address" type="{}address_t"/>
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
        "currentInstructionNumber",
        "codeBaseTransactions",
        "transactionType",
        "processingInfo",
        "reconciliationInfo",
        "docLinkRequest",
        "shareholderInfo"
    })
    public static class MifOperationStatus {

        @XmlElement(name = "current_instruction_number", required = true)
        protected BigDecimal currentInstructionNumber;
        @XmlElement(name = "code_base_transactions", required = true)
        @XmlSchemaType(name = "string")
        protected CodeBaseTransactionsEt codeBaseTransactions;
        @XmlElement(name = "transaction_type", required = true)
        @XmlSchemaType(name = "string")
        protected TransactionTypeEt transactionType;
        @XmlElement(name = "processing_info", required = true)
        protected SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ProcessingInfo processingInfo;
        @XmlElement(name = "reconciliation_info", required = true)
        protected ReconciliationInfoT reconciliationInfo;
        @XmlElement(name = "doc_link_request")
        protected SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.DocLinkRequest docLinkRequest;
        @XmlElement(name = "shareholder_info")
        protected SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo shareholderInfo;

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
         * Gets the value of the processingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ProcessingInfo }
         *     
         */
        public SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ProcessingInfo getProcessingInfo() {
            return processingInfo;
        }

        /**
         * Sets the value of the processingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ProcessingInfo }
         *     
         */
        public void setProcessingInfo(SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ProcessingInfo value) {
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
         * Gets the value of the docLinkRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.DocLinkRequest }
         *     
         */
        public SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.DocLinkRequest getDocLinkRequest() {
            return docLinkRequest;
        }

        /**
         * Sets the value of the docLinkRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.DocLinkRequest }
         *     
         */
        public void setDocLinkRequest(SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.DocLinkRequest value) {
            this.docLinkRequest = value;
        }

        /**
         * Gets the value of the shareholderInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo }
         *     
         */
        public SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo getShareholderInfo() {
            return shareholderInfo;
        }

        /**
         * Sets the value of the shareholderInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo }
         *     
         */
        public void setShareholderInfo(SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo value) {
            this.shareholderInfo = value;
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
         *         &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
         *         &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="inn" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="iin" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="okved" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
         *         &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
         *         &lt;element name="postal_name" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{}text_t"/>
         *                   &lt;element name="address" type="{}address_t"/>
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
            "shareholderDtls",
            "managerInfo",
            "inn",
            "iin",
            "ssn",
            "kpp",
            "okpo",
            "okved",
            "birthday",
            "nationality",
            "postalName"
        })
        public static class ShareholderInfo {

            @XmlElement(name = "shareholder_dtls", required = true)
            protected PartyDtlsT shareholderDtls;
            @XmlElement(name = "manager_info")
            protected String managerInfo;
            protected String inn;
            protected String iin;
            protected String ssn;
            protected String kpp;
            protected String okpo;
            protected String okved;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar birthday;
            protected String nationality;
            @XmlElement(name = "postal_name")
            protected SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo.PostalName postalName;

            /**
             * Gets the value of the shareholderDtls property.
             * 
             * @return
             *     possible object is
             *     {@link PartyDtlsT }
             *     
             */
            public PartyDtlsT getShareholderDtls() {
                return shareholderDtls;
            }

            /**
             * Sets the value of the shareholderDtls property.
             * 
             * @param value
             *     allowed object is
             *     {@link PartyDtlsT }
             *     
             */
            public void setShareholderDtls(PartyDtlsT value) {
                this.shareholderDtls = value;
            }

            /**
             * Gets the value of the managerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManagerInfo() {
                return managerInfo;
            }

            /**
             * Sets the value of the managerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManagerInfo(String value) {
                this.managerInfo = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the iin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIin() {
                return iin;
            }

            /**
             * Sets the value of the iin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIin(String value) {
                this.iin = value;
            }

            /**
             * Gets the value of the ssn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSsn() {
                return ssn;
            }

            /**
             * Sets the value of the ssn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSsn(String value) {
                this.ssn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
            }

            /**
             * Gets the value of the okpo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOkpo() {
                return okpo;
            }

            /**
             * Sets the value of the okpo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOkpo(String value) {
                this.okpo = value;
            }

            /**
             * Gets the value of the okved property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOkved() {
                return okved;
            }

            /**
             * Sets the value of the okved property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOkved(String value) {
                this.okved = value;
            }

            /**
             * Gets the value of the birthday property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBirthday() {
                return birthday;
            }

            /**
             * Sets the value of the birthday property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBirthday(XMLGregorianCalendar value) {
                this.birthday = value;
            }

            /**
             * Gets the value of the nationality property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationality() {
                return nationality;
            }

            /**
             * Sets the value of the nationality property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationality(String value) {
                this.nationality = value;
            }

            /**
             * Gets the value of the postalName property.
             * 
             * @return
             *     possible object is
             *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo.PostalName }
             *     
             */
            public SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo.PostalName getPostalName() {
                return postalName;
            }

            /**
             * Sets the value of the postalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo.PostalName }
             *     
             */
            public void setPostalName(SETTLEMENTTRANSACTIONSTATUSADVICEMIF.MifOperationStatus.ShareholderInfo.PostalName value) {
                this.postalName = value;
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
             *         &lt;element name="name" type="{}text_t"/>
             *         &lt;element name="address" type="{}address_t"/>
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
                "name",
                "address"
            })
            public static class PostalName {

                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected AddressT address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressT }
                 *     
                 */
                public AddressT getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressT }
                 *     
                 */
                public void setAddress(AddressT value) {
                    this.address = value;
                }

            }

        }

    }

}
