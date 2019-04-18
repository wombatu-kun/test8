
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
 *         &lt;element name="security_transactions" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="security" type="{}security_info_t"/>
 *                   &lt;element name="opening_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="transactions" type="{}processing_dtls_t" maxOccurs="unbounded" minOccurs="0"/>
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
    "securityTransactions",
    "addInfo"
})
@XmlRootElement(name = "STATEMENT_OF_TRANSACTIONS")
public class STATEMENTOFTRANSACTIONS
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
    @XmlElement(name = "security_transactions", required = true)
    protected List<STATEMENTOFTRANSACTIONS.SecurityTransactions> securityTransactions;
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
     * Gets the value of the securityTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STATEMENTOFTRANSACTIONS.SecurityTransactions }
     * 
     * 
     */
    public List<STATEMENTOFTRANSACTIONS.SecurityTransactions> getSecurityTransactions() {
        if (securityTransactions == null) {
            securityTransactions = new ArrayList<STATEMENTOFTRANSACTIONS.SecurityTransactions>();
        }
        return this.securityTransactions;
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
     *         &lt;element name="closing_balance" type="{}quantity_in_unit_t"/>
     *         &lt;element name="transactions" type="{}processing_dtls_t" maxOccurs="unbounded" minOccurs="0"/>
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
        "closingBalance",
        "transactions"
    })
    public static class SecurityTransactions {

        @XmlElement(required = true)
        protected SecurityInfoT security;
        @XmlElement(name = "opening_balance", required = true)
        protected QuantityInUnitT openingBalance;
        @XmlElement(name = "closing_balance", required = true)
        protected QuantityInUnitT closingBalance;
        protected List<ProcessingDtlsT> transactions;

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
         * {@link ProcessingDtlsT }
         * 
         * 
         */
        public List<ProcessingDtlsT> getTransactions() {
            if (transactions == null) {
                transactions = new ArrayList<ProcessingDtlsT>();
            }
            return this.transactions;
        }

    }

}
