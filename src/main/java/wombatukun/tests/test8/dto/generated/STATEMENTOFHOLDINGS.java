
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
 *         &lt;element name="statement_type" type="{}statement_type_et"/>
 *         &lt;element name="statement_date" type="{}date_t"/>
 *         &lt;element name="preparation_datetime" type="{}datetime_t"/>
 *         &lt;element name="security_balance" type="{}security_balance_t" maxOccurs="unbounded"/>
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
    "statementType",
    "statementDate",
    "preparationDatetime",
    "securityBalance",
    "addInfo"
})
@XmlRootElement(name = "STATEMENT_OF_HOLDINGS")
public class STATEMENTOFHOLDINGS
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
    @XmlElement(name = "statement_type", required = true)
    @XmlSchemaType(name = "string")
    protected StatementTypeEt statementType;
    @XmlElement(name = "statement_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statementDate;
    @XmlElement(name = "preparation_datetime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preparationDatetime;
    @XmlElement(name = "security_balance", required = true)
    protected List<SecurityBalanceT> securityBalance;
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
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatementDate(XMLGregorianCalendar value) {
        this.statementDate = value;
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

}
