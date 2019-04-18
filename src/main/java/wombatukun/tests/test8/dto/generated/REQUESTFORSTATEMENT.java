
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
 *         &lt;element name="issuer" type="{}party_id_name_t" maxOccurs="2"/>
 *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *         &lt;element name="account_holder" type="{}party_dtls_t"/>
 *         &lt;element name="statement_type" type="{}statement_type_et"/>
 *         &lt;choice>
 *           &lt;element name="statement">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="date" type="{}date_t" minOccurs="0"/>
 *                     &lt;element name="start_date" type="{}date_t" minOccurs="0"/>
 *                     &lt;element name="end_date" type="{}date_t" minOccurs="0"/>
 *                     &lt;element name="security" type="{}security_info_t" minOccurs="0"/>
 *                     &lt;element name="quantity" type="{}quantity_in_unit_t" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="confirmation">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="doc_link" type="{}doc_link_t" minOccurs="0"/>
 *                     &lt;element name="transaction" type="{}transaction_t"/>
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
    "issuer",
    "accountDtls",
    "accountHolder",
    "statementType",
    "statement",
    "confirmation",
    "addInfo"
})
@XmlRootElement(name = "REQUEST_FOR_STATEMENT")
public class REQUESTFORSTATEMENT
    extends OutDocT
{

    @XmlElement(required = true)
    protected List<PartyIdNameT> issuer;
    @XmlElement(name = "account_dtls", required = true)
    protected AccountDtlsT accountDtls;
    @XmlElement(name = "account_holder", required = true)
    protected PartyDtlsT accountHolder;
    @XmlElement(name = "statement_type", required = true)
    @XmlSchemaType(name = "string")
    protected StatementTypeEt statementType;
    protected REQUESTFORSTATEMENT.Statement statement;
    protected REQUESTFORSTATEMENT.Confirmation confirmation;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

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
     * {@link PartyIdNameT }
     * 
     * 
     */
    public List<PartyIdNameT> getIssuer() {
        if (issuer == null) {
            issuer = new ArrayList<PartyIdNameT>();
        }
        return this.issuer;
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
     * Gets the value of the statementType property.
     * 
     * @return
     *     possible object is
     *     {@link StatementTypeEt }
     *     
     */
    public StatementTypeEt getStatementType() {
        return statementType;
    }

    /**
     * Sets the value of the statementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementTypeEt }
     *     
     */
    public void setStatementType(StatementTypeEt value) {
        this.statementType = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTFORSTATEMENT.Statement }
     *     
     */
    public REQUESTFORSTATEMENT.Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTFORSTATEMENT.Statement }
     *     
     */
    public void setStatement(REQUESTFORSTATEMENT.Statement value) {
        this.statement = value;
    }

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTFORSTATEMENT.Confirmation }
     *     
     */
    public REQUESTFORSTATEMENT.Confirmation getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTFORSTATEMENT.Confirmation }
     *     
     */
    public void setConfirmation(REQUESTFORSTATEMENT.Confirmation value) {
        this.confirmation = value;
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
     *         &lt;element name="doc_link" type="{}doc_link_t" minOccurs="0"/>
     *         &lt;element name="transaction" type="{}transaction_t"/>
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
        "docLink",
        "transaction"
    })
    public static class Confirmation {

        @XmlElement(name = "doc_link")
        protected DocLinkT docLink;
        @XmlElement(required = true)
        protected TransactionT transaction;

        /**
         * Gets the value of the docLink property.
         * 
         * @return
         *     possible object is
         *     {@link DocLinkT }
         *     
         */
        public DocLinkT getDocLink() {
            return docLink;
        }

        /**
         * Sets the value of the docLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocLinkT }
         *     
         */
        public void setDocLink(DocLinkT value) {
            this.docLink = value;
        }

        /**
         * Gets the value of the transaction property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionT }
         *     
         */
        public TransactionT getTransaction() {
            return transaction;
        }

        /**
         * Sets the value of the transaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionT }
         *     
         */
        public void setTransaction(TransactionT value) {
            this.transaction = value;
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
     *         &lt;element name="date" type="{}date_t" minOccurs="0"/>
     *         &lt;element name="start_date" type="{}date_t" minOccurs="0"/>
     *         &lt;element name="end_date" type="{}date_t" minOccurs="0"/>
     *         &lt;element name="security" type="{}security_info_t" minOccurs="0"/>
     *         &lt;element name="quantity" type="{}quantity_in_unit_t" minOccurs="0"/>
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
        "date",
        "startDate",
        "endDate",
        "security",
        "quantity"
    })
    public static class Statement {

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "start_date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "end_date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        protected SecurityInfoT security;
        protected QuantityInUnitT quantity;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
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

    }

}
