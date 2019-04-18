
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="message_function" type="{}message_function_et"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="list_of_security" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="record" type="{}content_list_of_security_t" maxOccurs="unbounded"/>
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
    "messageFunction",
    "accountDtlsV02",
    "accountHolderV02",
    "listOfSecurity",
    "addInfo"
})
@XmlRootElement(name = "LIST_OF_SECURITY_REQUEST")
public class LISTOFSECURITYREQUEST
    extends OutDocT
{

    @XmlElement(name = "message_function", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunctionEt messageFunction;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "list_of_security", required = true)
    protected List<LISTOFSECURITYREQUEST.ListOfSecurity> listOfSecurity;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

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
     * Gets the value of the listOfSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTOFSECURITYREQUEST.ListOfSecurity }
     * 
     * 
     */
    public List<LISTOFSECURITYREQUEST.ListOfSecurity> getListOfSecurity() {
        if (listOfSecurity == null) {
            listOfSecurity = new ArrayList<LISTOFSECURITYREQUEST.ListOfSecurity>();
        }
        return this.listOfSecurity;
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
     *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="record" type="{}content_list_of_security_t" maxOccurs="unbounded"/>
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
        "issuerV02",
        "record"
    })
    public static class ListOfSecurity {

        @XmlElement(name = "issuer_V02")
        protected List<PartyIdentification2T> issuerV02;
        @XmlElement(required = true)
        protected List<ContentListOfSecurityT> record;

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
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContentListOfSecurityT }
         * 
         * 
         */
        public List<ContentListOfSecurityT> getRecord() {
            if (record == null) {
                record = new ArrayList<ContentListOfSecurityT>();
            }
            return this.record;
        }

    }

}
