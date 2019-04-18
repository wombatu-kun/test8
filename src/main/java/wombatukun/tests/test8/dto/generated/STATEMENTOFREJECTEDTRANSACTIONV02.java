
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
 *         &lt;element name="registrar" type="{}party_dtls_contacts_t"/>
 *         &lt;element name="issuer" type="{}party_dtls_t" minOccurs="0"/>
 *         &lt;element name="account_dtls" type="{}account_dtls_t" minOccurs="0"/>
 *         &lt;element name="account_holder" type="{}party_dtls_t" minOccurs="0"/>
 *         &lt;element name="rejected_transaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reject_reason_type" type="{}reject_reason_type_t"/>
 *                   &lt;element name="recommendation" type="{}text_t" maxOccurs="unbounded"/>
 *                   &lt;element name="requirement_law" type="{}text_t" maxOccurs="unbounded"/>
 *                   &lt;element name="transaction_processing" type="{}processing_dtls_t" minOccurs="0"/>
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
    "rejectedTransaction",
    "addInfo"
})
@XmlRootElement(name = "STATEMENT_OF_REJECTED_TRANSACTION_V02")
public class STATEMENTOFREJECTEDTRANSACTIONV02
    extends AnswerDocT
{

    @XmlElement(required = true)
    protected PartyDtlsContactsT registrar;
    protected PartyDtlsT issuer;
    @XmlElement(name = "account_dtls")
    protected AccountDtlsT accountDtls;
    @XmlElement(name = "account_holder")
    protected PartyDtlsT accountHolder;
    @XmlElement(name = "rejected_transaction", required = true)
    protected STATEMENTOFREJECTEDTRANSACTIONV02 .RejectedTransaction rejectedTransaction;
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
     * Gets the value of the rejectedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link STATEMENTOFREJECTEDTRANSACTIONV02 .RejectedTransaction }
     *     
     */
    public STATEMENTOFREJECTEDTRANSACTIONV02 .RejectedTransaction getRejectedTransaction() {
        return rejectedTransaction;
    }

    /**
     * Sets the value of the rejectedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATEMENTOFREJECTEDTRANSACTIONV02 .RejectedTransaction }
     *     
     */
    public void setRejectedTransaction(STATEMENTOFREJECTEDTRANSACTIONV02 .RejectedTransaction value) {
        this.rejectedTransaction = value;
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
     *         &lt;element name="reject_reason_type" type="{}reject_reason_type_t"/>
     *         &lt;element name="recommendation" type="{}text_t" maxOccurs="unbounded"/>
     *         &lt;element name="requirement_law" type="{}text_t" maxOccurs="unbounded"/>
     *         &lt;element name="transaction_processing" type="{}processing_dtls_t" minOccurs="0"/>
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
        "rejectReasonType",
        "recommendation",
        "requirementLaw",
        "transactionProcessing"
    })
    public static class RejectedTransaction {

        @XmlElement(name = "reject_reason_type", required = true)
        protected RejectReasonTypeT rejectReasonType;
        @XmlElement(required = true)
        protected List<String> recommendation;
        @XmlElement(name = "requirement_law", required = true)
        protected List<String> requirementLaw;
        @XmlElement(name = "transaction_processing")
        protected ProcessingDtlsT transactionProcessing;

        /**
         * Gets the value of the rejectReasonType property.
         * 
         * @return
         *     possible object is
         *     {@link RejectReasonTypeT }
         *     
         */
        public RejectReasonTypeT getRejectReasonType() {
            return rejectReasonType;
        }

        /**
         * Sets the value of the rejectReasonType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RejectReasonTypeT }
         *     
         */
        public void setRejectReasonType(RejectReasonTypeT value) {
            this.rejectReasonType = value;
        }

        /**
         * Gets the value of the recommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRecommendation() {
            if (recommendation == null) {
                recommendation = new ArrayList<String>();
            }
            return this.recommendation;
        }

        /**
         * Gets the value of the requirementLaw property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requirementLaw property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequirementLaw().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRequirementLaw() {
            if (requirementLaw == null) {
                requirementLaw = new ArrayList<String>();
            }
            return this.requirementLaw;
        }

        /**
         * Gets the value of the transactionProcessing property.
         * 
         * @return
         *     possible object is
         *     {@link ProcessingDtlsT }
         *     
         */
        public ProcessingDtlsT getTransactionProcessing() {
            return transactionProcessing;
        }

        /**
         * Sets the value of the transactionProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcessingDtlsT }
         *     
         */
        public void setTransactionProcessing(ProcessingDtlsT value) {
            this.transactionProcessing = value;
        }

    }

}
