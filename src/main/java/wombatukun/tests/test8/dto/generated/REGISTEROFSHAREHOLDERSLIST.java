
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
 *         &lt;element name="register_list_id" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="page_total" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="register_list" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="shareholder_id" type="{}id_t" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="shareholder" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="shareholder_id" type="{}id_t"/>
 *                             &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *                             &lt;element name="shareholder_info">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
 *                                       &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="inn" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="iin" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="okved" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
 *                                       &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
 *                                       &lt;element name="postal_name" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{}text_t"/>
 *                                                 &lt;element name="address" type="{}address_t"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="shareholder_contacts" type="{}party_contacts_t" minOccurs="0"/>
 *                             &lt;element name="tax_category" type="{}tax_category_t" minOccurs="0"/>
 *                             &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t" minOccurs="0"/>
 *                             &lt;element name="authorization_info" type="{}text_t" minOccurs="0"/>
 *                             &lt;element name="security_balance" type="{}security_balance_t" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "registerListId",
    "pageTotal",
    "page",
    "registerList"
})
@XmlRootElement(name = "REGISTER_OF_SHAREHOLDERS_LIST")
public class REGISTEROFSHAREHOLDERSLIST
    extends AnswerDocT
{

    @XmlElement(name = "register_list_id", required = true)
    protected Object registerListId;
    @XmlElement(name = "page_total", required = true)
    protected Object pageTotal;
    @XmlElement(required = true)
    protected Object page;
    @XmlElement(name = "register_list", required = true)
    protected List<REGISTEROFSHAREHOLDERSLIST.RegisterList> registerList;

    /**
     * Gets the value of the registerListId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegisterListId() {
        return registerListId;
    }

    /**
     * Sets the value of the registerListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegisterListId(Object value) {
        this.registerListId = value;
    }

    /**
     * Gets the value of the pageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageTotal() {
        return pageTotal;
    }

    /**
     * Sets the value of the pageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageTotal(Object value) {
        this.pageTotal = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPage(Object value) {
        this.page = value;
    }

    /**
     * Gets the value of the registerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REGISTEROFSHAREHOLDERSLIST.RegisterList }
     * 
     * 
     */
    public List<REGISTEROFSHAREHOLDERSLIST.RegisterList> getRegisterList() {
        if (registerList == null) {
            registerList = new ArrayList<REGISTEROFSHAREHOLDERSLIST.RegisterList>();
        }
        return this.registerList;
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
     *         &lt;element name="shareholder_id" type="{}id_t" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="shareholder" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shareholder_id" type="{}id_t"/>
     *                   &lt;element name="account_dtls" type="{}account_dtls_t"/>
     *                   &lt;element name="shareholder_info">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
     *                             &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="inn" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="iin" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="okved" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
     *                             &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
     *                             &lt;element name="postal_name" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{}text_t"/>
     *                                       &lt;element name="address" type="{}address_t"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="shareholder_contacts" type="{}party_contacts_t" minOccurs="0"/>
     *                   &lt;element name="tax_category" type="{}tax_category_t" minOccurs="0"/>
     *                   &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t" minOccurs="0"/>
     *                   &lt;element name="authorization_info" type="{}text_t" minOccurs="0"/>
     *                   &lt;element name="security_balance" type="{}security_balance_t" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "shareholderId",
        "shareholder"
    })
    public static class RegisterList {

        @XmlElement(name = "shareholder_id")
        protected List<IdT> shareholderId;
        @XmlElement(required = true)
        protected List<REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder> shareholder;

        /**
         * Gets the value of the shareholderId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareholderId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareholderId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdT }
         * 
         * 
         */
        public List<IdT> getShareholderId() {
            if (shareholderId == null) {
                shareholderId = new ArrayList<IdT>();
            }
            return this.shareholderId;
        }

        /**
         * Gets the value of the shareholder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareholder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareholder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder }
         * 
         * 
         */
        public List<REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder> getShareholder() {
            if (shareholder == null) {
                shareholder = new ArrayList<REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder>();
            }
            return this.shareholder;
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
         *         &lt;element name="shareholder_id" type="{}id_t"/>
         *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
         *         &lt;element name="shareholder_info">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
         *                   &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="inn" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="iin" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="okved" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
         *                   &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
         *                   &lt;element name="postal_name" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{}text_t"/>
         *                             &lt;element name="address" type="{}address_t"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="shareholder_contacts" type="{}party_contacts_t" minOccurs="0"/>
         *         &lt;element name="tax_category" type="{}tax_category_t" minOccurs="0"/>
         *         &lt;element name="bank_prop_rub" type="{}bank_prop_rub_t" minOccurs="0"/>
         *         &lt;element name="authorization_info" type="{}text_t" minOccurs="0"/>
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
            "shareholderId",
            "accountDtls",
            "shareholderInfo",
            "shareholderContacts",
            "taxCategory",
            "bankPropRub",
            "authorizationInfo",
            "securityBalance"
        })
        public static class Shareholder {

            @XmlElement(name = "shareholder_id", required = true)
            protected IdT shareholderId;
            @XmlElement(name = "account_dtls", required = true)
            protected AccountDtlsT accountDtls;
            @XmlElement(name = "shareholder_info", required = true)
            protected REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo shareholderInfo;
            @XmlElement(name = "shareholder_contacts")
            protected PartyContactsT shareholderContacts;
            @XmlElement(name = "tax_category")
            protected TaxCategoryT taxCategory;
            @XmlElement(name = "bank_prop_rub")
            protected BankPropRubT bankPropRub;
            @XmlElement(name = "authorization_info")
            protected String authorizationInfo;
            @XmlElement(name = "security_balance", required = true)
            protected List<SecurityBalanceT> securityBalance;

            /**
             * Gets the value of the shareholderId property.
             * 
             * @return
             *     possible object is
             *     {@link IdT }
             *     
             */
            public IdT getShareholderId() {
                return shareholderId;
            }

            /**
             * Sets the value of the shareholderId property.
             * 
             * @param value
             *     allowed object is
             *     {@link IdT }
             *     
             */
            public void setShareholderId(IdT value) {
                this.shareholderId = value;
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
             * Gets the value of the shareholderInfo property.
             * 
             * @return
             *     possible object is
             *     {@link REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo }
             *     
             */
            public REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo getShareholderInfo() {
                return shareholderInfo;
            }

            /**
             * Sets the value of the shareholderInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo }
             *     
             */
            public void setShareholderInfo(REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo value) {
                this.shareholderInfo = value;
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
             * Gets the value of the taxCategory property.
             * 
             * @return
             *     possible object is
             *     {@link TaxCategoryT }
             *     
             */
            public TaxCategoryT getTaxCategory() {
                return taxCategory;
            }

            /**
             * Sets the value of the taxCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxCategoryT }
             *     
             */
            public void setTaxCategory(TaxCategoryT value) {
                this.taxCategory = value;
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
             * Gets the value of the authorizationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorizationInfo() {
                return authorizationInfo;
            }

            /**
             * Sets the value of the authorizationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorizationInfo(String value) {
                this.authorizationInfo = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="shareholder_dtls" type="{}party_dtls_t"/>
             *         &lt;element name="manager_info" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="inn" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="iin" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="okved" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="birthday" type="{}date_t" minOccurs="0"/>
             *         &lt;element name="nationality" type="{}text_t" minOccurs="0"/>
             *         &lt;element name="postal_name" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{}text_t"/>
             *                   &lt;element name="address" type="{}address_t"/>
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
            @XmlType(name = "", propOrder = {
                "shareholderDtls",
                "managerInfo",
                "inn",
                "iin",
                "ssn",
                "kpp",
                "okpo",
                "okved",
                "birthday",
                "nationality",
                "postalName"
            })
            public static class ShareholderInfo {

                @XmlElement(name = "shareholder_dtls", required = true)
                protected PartyDtlsT shareholderDtls;
                @XmlElement(name = "manager_info")
                protected String managerInfo;
                protected String inn;
                protected String iin;
                protected String ssn;
                protected String kpp;
                protected String okpo;
                protected String okved;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar birthday;
                protected String nationality;
                @XmlElement(name = "postal_name")
                protected REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo.PostalName postalName;

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
                 * Gets the value of the managerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManagerInfo() {
                    return managerInfo;
                }

                /**
                 * Sets the value of the managerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManagerInfo(String value) {
                    this.managerInfo = value;
                }

                /**
                 * Gets the value of the inn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInn() {
                    return inn;
                }

                /**
                 * Sets the value of the inn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInn(String value) {
                    this.inn = value;
                }

                /**
                 * Gets the value of the iin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIin() {
                    return iin;
                }

                /**
                 * Sets the value of the iin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIin(String value) {
                    this.iin = value;
                }

                /**
                 * Gets the value of the ssn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSsn() {
                    return ssn;
                }

                /**
                 * Sets the value of the ssn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSsn(String value) {
                    this.ssn = value;
                }

                /**
                 * Gets the value of the kpp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKpp() {
                    return kpp;
                }

                /**
                 * Sets the value of the kpp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKpp(String value) {
                    this.kpp = value;
                }

                /**
                 * Gets the value of the okpo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOkpo() {
                    return okpo;
                }

                /**
                 * Sets the value of the okpo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOkpo(String value) {
                    this.okpo = value;
                }

                /**
                 * Gets the value of the okved property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOkved() {
                    return okved;
                }

                /**
                 * Sets the value of the okved property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOkved(String value) {
                    this.okved = value;
                }

                /**
                 * Gets the value of the birthday property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getBirthday() {
                    return birthday;
                }

                /**
                 * Sets the value of the birthday property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setBirthday(XMLGregorianCalendar value) {
                    this.birthday = value;
                }

                /**
                 * Gets the value of the nationality property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationality() {
                    return nationality;
                }

                /**
                 * Sets the value of the nationality property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationality(String value) {
                    this.nationality = value;
                }

                /**
                 * Gets the value of the postalName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo.PostalName }
                 *     
                 */
                public REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo.PostalName getPostalName() {
                    return postalName;
                }

                /**
                 * Sets the value of the postalName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo.PostalName }
                 *     
                 */
                public void setPostalName(REGISTEROFSHAREHOLDERSLIST.RegisterList.Shareholder.ShareholderInfo.PostalName value) {
                    this.postalName = value;
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
                 *         &lt;element name="name" type="{}text_t"/>
                 *         &lt;element name="address" type="{}address_t"/>
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
                    "name",
                    "address"
                })
                public static class PostalName {

                    @XmlElement(required = true)
                    protected String name;
                    @XmlElement(required = true)
                    protected AddressT address;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the address property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressT }
                     *     
                     */
                    public AddressT getAddress() {
                        return address;
                    }

                    /**
                     * Sets the value of the address property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressT }
                     *     
                     */
                    public void setAddress(AddressT value) {
                        this.address = value;
                    }

                }

            }

        }

    }

}
