
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
 *         &lt;element name="message_type" type="{}account_innstruction_type_et"/>
 *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="shareholder_info" type="{}shareholder_t"/>
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
    "messageType",
    "issuerV02",
    "accountDtlsV02",
    "shareholderInfo",
    "addInfo"
})
@XmlRootElement(name = "ACCOUNT_MODIFICATION_INSTRUCTION")
public class ACCOUNTMODIFICATIONINSTRUCTION
    extends OutDocT
{

    @XmlElement(name = "message_type", required = true)
    @XmlSchemaType(name = "string")
    protected AccountInnstructionTypeEt messageType;
    @XmlElement(name = "issuer_V02", required = true, nillable = true)
    protected List<PartyIdentification2T> issuerV02;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "shareholder_info", required = true)
    protected ShareholderT shareholderInfo;
    @XmlElementRef(name = "add_info", type = JAXBElement.class, required = false)
    protected JAXBElement<AnyT> addInfo;

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInnstructionTypeEt }
     *     
     */
    public AccountInnstructionTypeEt getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInnstructionTypeEt }
     *     
     */
    public void setMessageType(AccountInnstructionTypeEt value) {
        this.messageType = value;
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
     * Gets the value of the shareholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderT }
     *     
     */
    public ShareholderT getShareholderInfo() {
        return shareholderInfo;
    }

    /**
     * Sets the value of the shareholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderT }
     *     
     */
    public void setShareholderInfo(ShareholderT value) {
        this.shareholderInfo = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnyT }{@code >}
     *     
     */
    public JAXBElement<AnyT> getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnyT }{@code >}
     *     
     */
    public void setAddInfo(JAXBElement<AnyT> value) {
        this.addInfo = value;
    }

}
