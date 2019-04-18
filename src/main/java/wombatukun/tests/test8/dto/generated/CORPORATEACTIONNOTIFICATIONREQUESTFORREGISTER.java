
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
 *     &lt;extension base="{}out_doc_t">
 *       &lt;sequence>
 *         &lt;element name="registrar" type="{}party_dtls_contacts_t"/>
 *         &lt;element name="issuer" type="{}party_dtls_t" maxOccurs="2"/>
 *         &lt;element name="corporate_action_reference" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="corporate_action_code" type="{}corporate_action_event_et"/>
 *         &lt;element name="purpose_of_request" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="reason_indicator" type="{}text_t"/>
 *         &lt;element name="information_indicator" type="{}information_indicator_et"/>
 *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *         &lt;element name="buyback_date" type="{}date_t" minOccurs="0"/>
 *         &lt;element name="record_date" type="{}date_t"/>
 *         &lt;element name="certification_deadline_date" type="{}date_t"/>
 *         &lt;element name="doc_link" type="{}doc_link_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registered_shareholders" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *                   &lt;element name="account_holder" type="{}party_id_name_t"/>
 *                   &lt;element name="account_holder_contacts" type="{}party_contacts_t"/>
 *                   &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t" minOccurs="0"/>
 *                   &lt;element name="security_balance" type="{}security_balance_t" maxOccurs="unbounded"/>
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
    "corporateActionReference",
    "corporateActionCode",
    "purposeOfRequest",
    "reasonIndicator",
    "informationIndicator",
    "codeBaseTransactions",
    "buybackDate",
    "recordDate",
    "certificationDeadlineDate",
    "docLink",
    "registeredShareholders",
    "addInfo"
})
@XmlRootElement(name = "CORPORATE_ACTION_NOTIFICATION_REQUEST_FOR_REGISTER")
public class CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER
    extends OutDocT
{

    @XmlElement(required = true)
    protected PartyDtlsContactsT registrar;
    @XmlElement(required = true)
    protected List<PartyDtlsT> issuer;
    @XmlElement(name = "corporate_action_reference")
    protected String corporateActionReference;
    @XmlElement(name = "corporate_action_code", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionEventEt corporateActionCode;
    @XmlElement(name = "purpose_of_request")
    protected String purposeOfRequest;
    @XmlElement(name = "reason_indicator", required = true)
    protected String reasonIndicator;
    @XmlElement(name = "information_indicator", required = true)
    @XmlSchemaType(name = "string")
    protected InformationIndicatorEt informationIndicator;
    @XmlElement(name = "code_base_transactions", required = true)
    @XmlSchemaType(name = "string")
    protected CodeBaseTransactionsEt codeBaseTransactions;
    @XmlElement(name = "buyback_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buybackDate;
    @XmlElement(name = "record_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordDate;
    @XmlElement(name = "certification_deadline_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificationDeadlineDate;
    @XmlElement(name = "doc_link")
    protected List<DocLinkT> docLink;
    @XmlElement(name = "registered_shareholders")
    protected List<CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER.RegisteredShareholders> registeredShareholders;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDtlsT }
     * 
     * 
     */
    public List<PartyDtlsT> getIssuer() {
        if (issuer == null) {
            issuer = new ArrayList<PartyDtlsT>();
        }
        return this.issuer;
    }

    /**
     * Gets the value of the corporateActionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateActionReference() {
        return corporateActionReference;
    }

    /**
     * Sets the value of the corporateActionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateActionReference(String value) {
        this.corporateActionReference = value;
    }

    /**
     * Gets the value of the corporateActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventEt }
     *     
     */
    public CorporateActionEventEt getCorporateActionCode() {
        return corporateActionCode;
    }

    /**
     * Sets the value of the corporateActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventEt }
     *     
     */
    public void setCorporateActionCode(CorporateActionEventEt value) {
        this.corporateActionCode = value;
    }

    /**
     * Gets the value of the purposeOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfRequest() {
        return purposeOfRequest;
    }

    /**
     * Sets the value of the purposeOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfRequest(String value) {
        this.purposeOfRequest = value;
    }

    /**
     * Gets the value of the reasonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonIndicator() {
        return reasonIndicator;
    }

    /**
     * Sets the value of the reasonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonIndicator(String value) {
        this.reasonIndicator = value;
    }

    /**
     * Gets the value of the informationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InformationIndicatorEt }
     *     
     */
    public InformationIndicatorEt getInformationIndicator() {
        return informationIndicator;
    }

    /**
     * Sets the value of the informationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationIndicatorEt }
     *     
     */
    public void setInformationIndicator(InformationIndicatorEt value) {
        this.informationIndicator = value;
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
     * Gets the value of the buybackDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuybackDate() {
        return buybackDate;
    }

    /**
     * Sets the value of the buybackDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuybackDate(XMLGregorianCalendar value) {
        this.buybackDate = value;
    }

    /**
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordDate(XMLGregorianCalendar value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the certificationDeadlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificationDeadlineDate() {
        return certificationDeadlineDate;
    }

    /**
     * Sets the value of the certificationDeadlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificationDeadlineDate(XMLGregorianCalendar value) {
        this.certificationDeadlineDate = value;
    }

    /**
     * Gets the value of the docLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocLinkT }
     * 
     * 
     */
    public List<DocLinkT> getDocLink() {
        if (docLink == null) {
            docLink = new ArrayList<DocLinkT>();
        }
        return this.docLink;
    }

    /**
     * Gets the value of the registeredShareholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredShareholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredShareholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER.RegisteredShareholders }
     * 
     * 
     */
    public List<CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER.RegisteredShareholders> getRegisteredShareholders() {
        if (registeredShareholders == null) {
            registeredShareholders = new ArrayList<CORPORATEACTIONNOTIFICATIONREQUESTFORREGISTER.RegisteredShareholders>();
        }
        return this.registeredShareholders;
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
     *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
     *         &lt;element name="account_holder" type="{}party_id_name_t"/>
     *         &lt;element name="account_holder_contacts" type="{}party_contacts_t"/>
     *         &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t" minOccurs="0"/>
     *         &lt;element name="security_balance" type="{}security_balance_t" maxOccurs="unbounded"/>
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
        "accountDtls",
        "accountHolder",
        "accountHolderContacts",
        "bankPropRub",
        "securityBalance"
    })
    public static class RegisteredShareholders {

        @XmlElement(name = "account_dtls", required = true)
        protected AccountDtlsT accountDtls;
        @XmlElement(name = "account_holder", required = true)
        protected PartyIdNameT accountHolder;
        @XmlElement(name = "account_holder_contacts", required = true)
        protected PartyContactsT accountHolderContacts;
        @XmlElement(name = "bank_prop_rub")
        protected BankPropRubT bankPropRub;
        @XmlElement(name = "security_balance", required = true)
        protected List<SecurityBalanceT> securityBalance;

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
         *     {@link PartyIdNameT }
         *     
         */
        public PartyIdNameT getAccountHolder() {
            return accountHolder;
        }

        /**
         * Sets the value of the accountHolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyIdNameT }
         *     
         */
        public void setAccountHolder(PartyIdNameT value) {
            this.accountHolder = value;
        }

        /**
         * Gets the value of the accountHolderContacts property.
         * 
         * @return
         *     possible object is
         *     {@link PartyContactsT }
         *     
         */
        public PartyContactsT getAccountHolderContacts() {
            return accountHolderContacts;
        }

        /**
         * Sets the value of the accountHolderContacts property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyContactsT }
         *     
         */
        public void setAccountHolderContacts(PartyContactsT value) {
            this.accountHolderContacts = value;
        }

        /**
         * Gets the value of the bankPropRub property.
         * 
         * @return
         *     possible object is
         *     {@link BankPropRubT }
         *     
         */
        public BankPropRubT getBankPropRub() {
            return bankPropRub;
        }

        /**
         * Sets the value of the bankPropRub property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankPropRubT }
         *     
         */
        public void setBankPropRub(BankPropRubT value) {
            this.bankPropRub = value;
        }

        /**
         * Gets the value of the securityBalance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the securityBalance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecurityBalance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurityBalanceT }
         * 
         * 
         */
        public List<SecurityBalanceT> getSecurityBalance() {
            if (securityBalance == null) {
                securityBalance = new ArrayList<SecurityBalanceT>();
            }
            return this.securityBalance;
        }

    }

}
