
package wombatukun.tests.test8.dto.generated;

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
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="security" type="{}security_info_t"/>
 *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *         &lt;element name="previous_security_status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="security_status" type="{}block_type_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="registration_date" type="{}date_t" minOccurs="0"/>
 *         &lt;element name="future_security_status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="security_status" type="{}block_type_t"/>
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
    "security",
    "codeBaseTransactions",
    "previousSecurityStatus",
    "registrationDate",
    "futureSecurityStatus",
    "addInfo"
})
@XmlRootElement(name = "STATUS_CHANGE_INSTRUCTION")
public class STATUSCHANGEINSTRUCTION
    extends OutDocT
{

    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(required = true)
    protected SecurityInfoT security;
    @XmlElement(name = "code_base_transactions", required = true)
    @XmlSchemaType(name = "string")
    protected CodeBaseTransactionsEt codeBaseTransactions;
    @XmlElement(name = "previous_security_status", required = true)
    protected STATUSCHANGEINSTRUCTION.PreviousSecurityStatus previousSecurityStatus;
    @XmlElement(name = "registration_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "future_security_status", required = true)
    protected STATUSCHANGEINSTRUCTION.FutureSecurityStatus futureSecurityStatus;
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
     * Gets the value of the previousSecurityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSCHANGEINSTRUCTION.PreviousSecurityStatus }
     *     
     */
    public STATUSCHANGEINSTRUCTION.PreviousSecurityStatus getPreviousSecurityStatus() {
        return previousSecurityStatus;
    }

    /**
     * Sets the value of the previousSecurityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSCHANGEINSTRUCTION.PreviousSecurityStatus }
     *     
     */
    public void setPreviousSecurityStatus(STATUSCHANGEINSTRUCTION.PreviousSecurityStatus value) {
        this.previousSecurityStatus = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the futureSecurityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSCHANGEINSTRUCTION.FutureSecurityStatus }
     *     
     */
    public STATUSCHANGEINSTRUCTION.FutureSecurityStatus getFutureSecurityStatus() {
        return futureSecurityStatus;
    }

    /**
     * Sets the value of the futureSecurityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSCHANGEINSTRUCTION.FutureSecurityStatus }
     *     
     */
    public void setFutureSecurityStatus(STATUSCHANGEINSTRUCTION.FutureSecurityStatus value) {
        this.futureSecurityStatus = value;
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
     *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
     *         &lt;element name="security_status" type="{}block_type_t"/>
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
        "quantity",
        "securityStatus"
    })
    public static class FutureSecurityStatus {

        @XmlElement(required = true)
        protected QuantityInUnitT quantity;
        @XmlElement(name = "security_status", required = true)
        protected BlockTypeT securityStatus;

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
         * Gets the value of the securityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link BlockTypeT }
         *     
         */
        public BlockTypeT getSecurityStatus() {
            return securityStatus;
        }

        /**
         * Sets the value of the securityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BlockTypeT }
         *     
         */
        public void setSecurityStatus(BlockTypeT value) {
            this.securityStatus = value;
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
     *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
     *         &lt;element name="security_status" type="{}block_type_t"/>
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
        "quantity",
        "securityStatus"
    })
    public static class PreviousSecurityStatus {

        @XmlElement(required = true)
        protected QuantityInUnitT quantity;
        @XmlElement(name = "security_status", required = true)
        protected BlockTypeT securityStatus;

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
         * Gets the value of the securityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link BlockTypeT }
         *     
         */
        public BlockTypeT getSecurityStatus() {
            return securityStatus;
        }

        /**
         * Sets the value of the securityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BlockTypeT }
         *     
         */
        public void setSecurityStatus(BlockTypeT value) {
            this.securityStatus = value;
        }

    }

}
