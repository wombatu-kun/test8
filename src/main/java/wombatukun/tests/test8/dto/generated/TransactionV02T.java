
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * описание/ информация о сделке/ операции
 * 
 * <p>Java class for transaction_v02_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_v02_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et" minOccurs="0"/>
 *         &lt;element name="security" type="{}security_info_t"/>
 *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *         &lt;element name="block_indicator" type="{}yes_no_t"/>
 *         &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlement_amount" type="{}currency_and_amount_t" minOccurs="0"/>
 *         &lt;element name="contragent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *                   &lt;element name="account_holder" type="{}party_dtls_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="based_info" type="{}based_info_t" maxOccurs="unbounded"/>
 *         &lt;element name="common_id" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="owner" type="{}text_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_v02_t", propOrder = {
    "transactionType",
    "codeBaseTransactions",
    "security",
    "quantity",
    "blockIndicator",
    "blockType",
    "settlementAmount",
    "contragent",
    "basedInfo",
    "commonId",
    "owner"
})
public class TransactionV02T {

    @XmlElement(name = "transaction_type", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionTypeEt transactionType;
    @XmlElement(name = "code_base_transactions")
    @XmlSchemaType(name = "string")
    protected CodeBaseTransactionsEt codeBaseTransactions;
    @XmlElement(required = true)
    protected SecurityInfoT security;
    @XmlElement(required = true)
    protected QuantityInUnitT quantity;
    @XmlElement(name = "block_indicator", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoT blockIndicator;
    @XmlElement(name = "block_type")
    protected List<BlockTypeT> blockType;
    @XmlElement(name = "settlement_amount")
    protected CurrencyAndAmountT settlementAmount;
    @XmlElement(required = true)
    protected TransactionV02T.Contragent contragent;
    @XmlElement(name = "based_info", required = true)
    protected List<BasedInfoT> basedInfo;
    @XmlElement(name = "common_id")
    protected String commonId;
    protected List<String> owner;

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
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountT }
     *     
     */
    public CurrencyAndAmountT getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountT }
     *     
     */
    public void setSettlementAmount(CurrencyAndAmountT value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the contragent property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionV02T.Contragent }
     *     
     */
    public TransactionV02T.Contragent getContragent() {
        return contragent;
    }

    /**
     * Sets the value of the contragent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionV02T.Contragent }
     *     
     */
    public void setContragent(TransactionV02T.Contragent value) {
        this.contragent = value;
    }

    /**
     * Gets the value of the basedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasedInfoT }
     * 
     * 
     */
    public List<BasedInfoT> getBasedInfo() {
        if (basedInfo == null) {
            basedInfo = new ArrayList<BasedInfoT>();
        }
        return this.basedInfo;
    }

    /**
     * Gets the value of the commonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonId() {
        return commonId;
    }

    /**
     * Sets the value of the commonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonId(String value) {
        this.commonId = value;
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
     *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
     *         &lt;element name="account_holder" type="{}party_dtls_t"/>
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
        "accountHolder"
    })
    public static class Contragent {

        @XmlElement(name = "account_dtls", required = true)
        protected AccountDtlsT accountDtls;
        @XmlElement(name = "account_holder", required = true)
        protected PartyDtlsT accountHolder;

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

    }

}
