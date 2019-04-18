
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2"/>
 *         &lt;element name="base_security" type="{}security_info_t" maxOccurs="unbounded"/>
 *         &lt;element name="future_security" type="{}security_info_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="new_issuer" type="{}party_identification2_t" maxOccurs="2" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="corporate_action_date" type="{}date_t"/>
 *           &lt;sequence>
 *             &lt;element name="register_date" type="{}date_t"/>
 *             &lt;element name="security" type="{}security_info_t" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="block_date" type="{}date_t" minOccurs="0"/>
 *         &lt;element name="corporate_action_code" type="{}corporate_action_event_et"/>
 *         &lt;element name="corporate_action_narrative" type="{}text_t"/>
 *         &lt;element name="corporate_action_reference" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="buyer_info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *                   &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
 *                   &lt;element name="legal_address" type="{}address_t" minOccurs="0"/>
 *                   &lt;element name="post_address" type="{}address_t" minOccurs="0"/>
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
    "issuerV02",
    "baseSecurity",
    "futureSecurity",
    "newIssuer",
    "corporateActionDate",
    "registerDate",
    "security",
    "blockDate",
    "corporateActionCode",
    "corporateActionNarrative",
    "corporateActionReference",
    "buyerInfo",
    "addInfo"
})
@XmlRootElement(name = "CORPORATE_ACTION_NOTIFICATION")
public class CORPORATEACTIONNOTIFICATION
    extends OutDocT
{

    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "issuer_V02", required = true)
    protected List<PartyIdentification2T> issuerV02;
    @XmlElement(name = "base_security", required = true)
    protected List<SecurityInfoT> baseSecurity;
    @XmlElement(name = "future_security")
    protected List<SecurityInfoT> futureSecurity;
    @XmlElement(name = "new_issuer")
    protected List<PartyIdentification2T> newIssuer;
    @XmlElement(name = "corporate_action_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar corporateActionDate;
    @XmlElement(name = "register_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registerDate;
    protected List<SecurityInfoT> security;
    @XmlElement(name = "block_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar blockDate;
    @XmlElement(name = "corporate_action_code", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionEventEt corporateActionCode;
    @XmlElement(name = "corporate_action_narrative", required = true)
    protected String corporateActionNarrative;
    @XmlElement(name = "corporate_action_reference")
    protected String corporateActionReference;
    @XmlElement(name = "buyer_info")
    protected CORPORATEACTIONNOTIFICATION.BuyerInfo buyerInfo;
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
     * Gets the value of the issuerV02 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerV02 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerV02().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2T }
     * 
     * 
     */
    public List<PartyIdentification2T> getIssuerV02() {
        if (issuerV02 == null) {
            issuerV02 = new ArrayList<PartyIdentification2T>();
        }
        return this.issuerV02;
    }

    /**
     * Gets the value of the baseSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityInfoT }
     * 
     * 
     */
    public List<SecurityInfoT> getBaseSecurity() {
        if (baseSecurity == null) {
            baseSecurity = new ArrayList<SecurityInfoT>();
        }
        return this.baseSecurity;
    }

    /**
     * Gets the value of the futureSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futureSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutureSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityInfoT }
     * 
     * 
     */
    public List<SecurityInfoT> getFutureSecurity() {
        if (futureSecurity == null) {
            futureSecurity = new ArrayList<SecurityInfoT>();
        }
        return this.futureSecurity;
    }

    /**
     * Gets the value of the newIssuer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newIssuer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewIssuer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2T }
     * 
     * 
     */
    public List<PartyIdentification2T> getNewIssuer() {
        if (newIssuer == null) {
            newIssuer = new ArrayList<PartyIdentification2T>();
        }
        return this.newIssuer;
    }

    /**
     * Gets the value of the corporateActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorporateActionDate() {
        return corporateActionDate;
    }

    /**
     * Sets the value of the corporateActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorporateActionDate(XMLGregorianCalendar value) {
        this.corporateActionDate = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDate(XMLGregorianCalendar value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the security property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityInfoT }
     * 
     * 
     */
    public List<SecurityInfoT> getSecurity() {
        if (security == null) {
            security = new ArrayList<SecurityInfoT>();
        }
        return this.security;
    }

    /**
     * Gets the value of the blockDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlockDate() {
        return blockDate;
    }

    /**
     * Sets the value of the blockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlockDate(XMLGregorianCalendar value) {
        this.blockDate = value;
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
     * Gets the value of the corporateActionNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateActionNarrative() {
        return corporateActionNarrative;
    }

    /**
     * Sets the value of the corporateActionNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateActionNarrative(String value) {
        this.corporateActionNarrative = value;
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
     * Gets the value of the buyerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEACTIONNOTIFICATION.BuyerInfo }
     *     
     */
    public CORPORATEACTIONNOTIFICATION.BuyerInfo getBuyerInfo() {
        return buyerInfo;
    }

    /**
     * Sets the value of the buyerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEACTIONNOTIFICATION.BuyerInfo }
     *     
     */
    public void setBuyerInfo(CORPORATEACTIONNOTIFICATION.BuyerInfo value) {
        this.buyerInfo = value;
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
     *         &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
     *         &lt;element name="legal_address" type="{}address_t" minOccurs="0"/>
     *         &lt;element name="post_address" type="{}address_t" minOccurs="0"/>
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
        "shareholderDtls",
        "legalAddress",
        "postAddress"
    })
    public static class BuyerInfo {

        @XmlElement(name = "account_dtls", required = true)
        protected AccountDtlsT accountDtls;
        @XmlElement(name = "shareholder_dtls", required = true)
        protected PartyDtlsT shareholderDtls;
        @XmlElementRef(name = "legal_address", type = JAXBElement.class, required = false)
        protected JAXBElement<AddressT> legalAddress;
        @XmlElementRef(name = "post_address", type = JAXBElement.class, required = false)
        protected JAXBElement<AddressT> postAddress;

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
         * Gets the value of the shareholderDtls property.
         * 
         * @return
         *     possible object is
         *     {@link PartyDtlsT }
         *     
         */
        public PartyDtlsT getShareholderDtls() {
            return shareholderDtls;
        }

        /**
         * Sets the value of the shareholderDtls property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyDtlsT }
         *     
         */
        public void setShareholderDtls(PartyDtlsT value) {
            this.shareholderDtls = value;
        }

        /**
         * Gets the value of the legalAddress property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AddressT }{@code >}
         *     
         */
        public JAXBElement<AddressT> getLegalAddress() {
            return legalAddress;
        }

        /**
         * Sets the value of the legalAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AddressT }{@code >}
         *     
         */
        public void setLegalAddress(JAXBElement<AddressT> value) {
            this.legalAddress = value;
        }

        /**
         * Gets the value of the postAddress property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AddressT }{@code >}
         *     
         */
        public JAXBElement<AddressT> getPostAddress() {
            return postAddress;
        }

        /**
         * Sets the value of the postAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AddressT }{@code >}
         *     
         */
        public void setPostAddress(JAXBElement<AddressT> value) {
            this.postAddress = value;
        }

    }

}
