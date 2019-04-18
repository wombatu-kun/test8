
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
 *         &lt;element name="issuer" type="{}party_id_name_t" maxOccurs="2"/>
 *         &lt;element name="account_dtls" type="{}account_dtls_t"/>
 *         &lt;element name="account_holder" type="{}party_dtls_t"/>
 *         &lt;element name="corporate_action_code" type="{}corporate_action_event_et"/>
 *         &lt;element name="corporate_action_reference" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="record_date" type="{}date_t"/>
 *         &lt;element name="message_function" type="{}message_function_et"/>
 *         &lt;element name="information_indicator" type="{}information_type_t"/>
 *         &lt;element name="doc_link" type="{}doc_link_t" minOccurs="0"/>
 *         &lt;element name="register_list_info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="page_total" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="register_list_id" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "issuer",
    "accountDtls",
    "accountHolder",
    "corporateActionCode",
    "corporateActionReference",
    "recordDate",
    "messageFunction",
    "informationIndicator",
    "docLink",
    "registerListInfo",
    "addInfo"
})
@XmlRootElement(name = "REGISTER_OF_SHAREHOLDERS_HEADER")
public class REGISTEROFSHAREHOLDERSHEADER
    extends AnswerDocT
{

    @XmlElement(required = true)
    protected List<PartyIdNameT> issuer;
    @XmlElement(name = "account_dtls", required = true)
    protected AccountDtlsT accountDtls;
    @XmlElement(name = "account_holder", required = true)
    protected PartyDtlsT accountHolder;
    @XmlElement(name = "corporate_action_code", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionEventEt corporateActionCode;
    @XmlElement(name = "corporate_action_reference")
    protected String corporateActionReference;
    @XmlElement(name = "record_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordDate;
    @XmlElement(name = "message_function", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunctionEt messageFunction;
    @XmlElement(name = "information_indicator", required = true)
    protected InformationTypeT informationIndicator;
    @XmlElement(name = "doc_link")
    protected DocLinkT docLink;
    @XmlElement(name = "register_list_info", required = true)
    protected REGISTEROFSHAREHOLDERSHEADER.RegisterListInfo registerListInfo;
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
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordDate(XMLGregorianCalendar value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionEt }
     *     
     */
    public MessageFunctionEt getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionEt }
     *     
     */
    public void setMessageFunction(MessageFunctionEt value) {
        this.messageFunction = value;
    }

    /**
     * Gets the value of the informationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeT }
     *     
     */
    public InformationTypeT getInformationIndicator() {
        return informationIndicator;
    }

    /**
     * Sets the value of the informationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeT }
     *     
     */
    public void setInformationIndicator(InformationTypeT value) {
        this.informationIndicator = value;
    }

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
     * Gets the value of the registerListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link REGISTEROFSHAREHOLDERSHEADER.RegisterListInfo }
     *     
     */
    public REGISTEROFSHAREHOLDERSHEADER.RegisterListInfo getRegisterListInfo() {
        return registerListInfo;
    }

    /**
     * Sets the value of the registerListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link REGISTEROFSHAREHOLDERSHEADER.RegisterListInfo }
     *     
     */
    public void setRegisterListInfo(REGISTEROFSHAREHOLDERSHEADER.RegisterListInfo value) {
        this.registerListInfo = value;
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
     *         &lt;element name="page_total" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="register_list_id" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "pageTotal",
        "registerListId"
    })
    public static class RegisterListInfo {

        @XmlElement(name = "page_total", required = true)
        protected Object pageTotal;
        @XmlElement(name = "register_list_id", required = true)
        protected Object registerListId;

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

    }

}
