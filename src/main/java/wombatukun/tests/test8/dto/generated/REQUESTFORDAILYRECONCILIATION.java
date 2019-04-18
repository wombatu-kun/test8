
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
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="date_of_reconciliation" type="{}date_t"/>
 *         &lt;element name="balance_info" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issuer" type="{}party_id_name_t" maxOccurs="2"/>
 *                   &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
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
    "accountHolderV02",
    "dateOfReconciliation",
    "balanceInfo",
    "addInfo"
})
@XmlRootElement(name = "REQUEST_FOR_DAILY_RECONCILIATION")
public class REQUESTFORDAILYRECONCILIATION
    extends OutDocT
{

    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "date_of_reconciliation", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfReconciliation;
    @XmlElement(name = "balance_info", required = true)
    protected List<REQUESTFORDAILYRECONCILIATION.BalanceInfo> balanceInfo;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

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
     * Gets the value of the dateOfReconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfReconciliation() {
        return dateOfReconciliation;
    }

    /**
     * Sets the value of the dateOfReconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfReconciliation(XMLGregorianCalendar value) {
        this.dateOfReconciliation = value;
    }

    /**
     * Gets the value of the balanceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTFORDAILYRECONCILIATION.BalanceInfo }
     * 
     * 
     */
    public List<REQUESTFORDAILYRECONCILIATION.BalanceInfo> getBalanceInfo() {
        if (balanceInfo == null) {
            balanceInfo = new ArrayList<REQUESTFORDAILYRECONCILIATION.BalanceInfo>();
        }
        return this.balanceInfo;
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
     *         &lt;element name="issuer" type="{}party_id_name_t" maxOccurs="2"/>
     *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
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
        "issuer",
        "accountDtlsV02",
        "securityBalance"
    })
    public static class BalanceInfo {

        @XmlElement(required = true)
        protected List<PartyIdNameT> issuer;
        @XmlElement(name = "account_dtls_v02", required = true)
        protected AccountDtlsV02T accountDtlsV02;
        @XmlElement(name = "security_balance", required = true)
        protected List<SecurityBalanceT> securityBalance;

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
