
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * блок информации о лице, которому открыт (открывается) счет
 * 
 * <p>Java class for shareholder_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shareholder_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shareholder_dtls">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="org" type="{}organisation_t"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shareholder_contacts" type="{}party_contacts_t"/>
 *         &lt;element name="tax_info" type="{}tax_category_t"/>
 *         &lt;element name="letter_go_type" type="{}letter_go_type_et"/>
 *         &lt;element name="cash_settlement_dtls" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cash_settlement_type" type="{}cash_settlement_type_et"/>
 *                   &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t"/>
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
@XmlType(name = "shareholder_t", propOrder = {
    "shareholderDtls",
    "shareholderContacts",
    "taxInfo",
    "letterGoType",
    "cashSettlementDtls"
})
public class ShareholderT {

    @XmlElement(name = "shareholder_dtls", required = true)
    protected ShareholderT.ShareholderDtls shareholderDtls;
    @XmlElement(name = "shareholder_contacts", required = true)
    protected PartyContactsT shareholderContacts;
    @XmlElement(name = "tax_info", required = true)
    protected TaxCategoryT taxInfo;
    @XmlElement(name = "letter_go_type", required = true)
    @XmlSchemaType(name = "string")
    protected LetterGoTypeEt letterGoType;
    @XmlElement(name = "cash_settlement_dtls", required = true)
    protected List<ShareholderT.CashSettlementDtls> cashSettlementDtls;

    /**
     * Gets the value of the shareholderDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderT.ShareholderDtls }
     *     
     */
    public ShareholderT.ShareholderDtls getShareholderDtls() {
        return shareholderDtls;
    }

    /**
     * Sets the value of the shareholderDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderT.ShareholderDtls }
     *     
     */
    public void setShareholderDtls(ShareholderT.ShareholderDtls value) {
        this.shareholderDtls = value;
    }

    /**
     * Gets the value of the shareholderContacts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyContactsT }
     *     
     */
    public PartyContactsT getShareholderContacts() {
        return shareholderContacts;
    }

    /**
     * Sets the value of the shareholderContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyContactsT }
     *     
     */
    public void setShareholderContacts(PartyContactsT value) {
        this.shareholderContacts = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryT }
     *     
     */
    public TaxCategoryT getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryT }
     *     
     */
    public void setTaxInfo(TaxCategoryT value) {
        this.taxInfo = value;
    }

    /**
     * Gets the value of the letterGoType property.
     * 
     * @return
     *     possible object is
     *     {@link LetterGoTypeEt }
     *     
     */
    public LetterGoTypeEt getLetterGoType() {
        return letterGoType;
    }

    /**
     * Sets the value of the letterGoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterGoTypeEt }
     *     
     */
    public void setLetterGoType(LetterGoTypeEt value) {
        this.letterGoType = value;
    }

    /**
     * Gets the value of the cashSettlementDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashSettlementDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashSettlementDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholderT.CashSettlementDtls }
     * 
     * 
     */
    public List<ShareholderT.CashSettlementDtls> getCashSettlementDtls() {
        if (cashSettlementDtls == null) {
            cashSettlementDtls = new ArrayList<ShareholderT.CashSettlementDtls>();
        }
        return this.cashSettlementDtls;
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
     *         &lt;element name="cash_settlement_type" type="{}cash_settlement_type_et"/>
     *         &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t"/>
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
        "cashSettlementType",
        "bankPropRub"
    })
    public static class CashSettlementDtls {

        @XmlElement(name = "cash_settlement_type", required = true, nillable = true)
        @XmlSchemaType(name = "string")
        protected CashSettlementTypeEt cashSettlementType;
        @XmlElement(name = "bank_prop_rub", required = true, nillable = true)
        protected BankPropRubT bankPropRub;

        /**
         * Gets the value of the cashSettlementType property.
         * 
         * @return
         *     possible object is
         *     {@link CashSettlementTypeEt }
         *     
         */
        public CashSettlementTypeEt getCashSettlementType() {
            return cashSettlementType;
        }

        /**
         * Sets the value of the cashSettlementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashSettlementTypeEt }
         *     
         */
        public void setCashSettlementType(CashSettlementTypeEt value) {
            this.cashSettlementType = value;
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
     *         &lt;choice>
     *           &lt;element name="org" type="{}organisation_t"/>
     *         &lt;/choice>
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
        "org"
    })
    public static class ShareholderDtls {

        protected OrganisationT org;

        /**
         * Gets the value of the org property.
         * 
         * @return
         *     possible object is
         *     {@link OrganisationT }
         *     
         */
        public OrganisationT getOrg() {
            return org;
        }

        /**
         * Sets the value of the org property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganisationT }
         *     
         */
        public void setOrg(OrganisationT value) {
            this.org = value;
        }

    }

}
