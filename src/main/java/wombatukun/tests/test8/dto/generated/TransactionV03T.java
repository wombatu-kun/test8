
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
 * <p>Java class for transaction_v03_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_v03_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="common_id" type="{}text_t"/>
 *         &lt;element name="transaction_type" type="{}transaction_type_et"/>
 *         &lt;element name="code_base_transactions" type="{}code_base_transactions_et"/>
 *         &lt;element name="narrative" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *         &lt;element name="block_indicator" type="{}yes_no_t"/>
 *         &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contragent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *                   &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="owner" type="{}text_t" maxOccurs="unbounded"/>
 *         &lt;element name="corporate_action_reference" type="{}text_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_v03_t", propOrder = {
    "commonId",
    "transactionType",
    "codeBaseTransactions",
    "narrative",
    "quantity",
    "blockIndicator",
    "blockType",
    "contragent",
    "owner",
    "corporateActionReference"
})
public class TransactionV03T {

    @XmlElement(name = "common_id", required = true)
    protected String commonId;
    @XmlElement(name = "transaction_type", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionTypeEt transactionType;
    @XmlElement(name = "code_base_transactions", required = true)
    @XmlSchemaType(name = "string")
    protected CodeBaseTransactionsEt codeBaseTransactions;
    protected String narrative;
    @XmlElement(required = true)
    protected QuantityInUnitT quantity;
    @XmlElement(name = "block_indicator", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoT blockIndicator;
    @XmlElement(name = "block_type")
    protected List<BlockTypeT> blockType;
    @XmlElement(required = true)
    protected TransactionV03T.Contragent contragent;
    @XmlElement(required = true)
    protected List<String> owner;
    @XmlElement(name = "corporate_action_reference")
    protected String corporateActionReference;

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
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
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
     * Gets the value of the contragent property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionV03T.Contragent }
     *     
     */
    public TransactionV03T.Contragent getContragent() {
        return contragent;
    }

    /**
     * Sets the value of the contragent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionV03T.Contragent }
     *     
     */
    public void setContragent(TransactionV03T.Contragent value) {
        this.contragent = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
     *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
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
        "accountDtlsV02",
        "accountHolderV02"
    })
    public static class Contragent {

        @XmlElement(name = "account_dtls_v02", required = true)
        protected AccountDtlsV02T accountDtlsV02;
        @XmlElement(name = "account_holder_v02", required = true)
        protected PartyIdentificationT accountHolderV02;

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

    }

}
