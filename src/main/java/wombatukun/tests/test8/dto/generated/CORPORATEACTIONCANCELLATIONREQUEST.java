
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
 *         &lt;element name="cancellation_request_reference" type="{}ref_dtls_t"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder_v02" type="{}party_identification_t"/>
 *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2"/>
 *         &lt;element name="security" type="{}security_info_t" minOccurs="0"/>
 *         &lt;element name="corporate_action_reference" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="corporate_action_narrative" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="corporate_action_code" type="{}corporate_action_event_et"/>
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
    "cancellationRequestReference",
    "accountDtlsV02",
    "accountHolderV02",
    "issuerV02",
    "security",
    "corporateActionReference",
    "corporateActionNarrative",
    "corporateActionCode",
    "addInfo"
})
@XmlRootElement(name = "CORPORATE_ACTION_CANCELLATION_REQUEST")
public class CORPORATEACTIONCANCELLATIONREQUEST
    extends OutDocT
{

    @XmlElement(name = "cancellation_request_reference", required = true)
    protected RefDtlsT cancellationRequestReference;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder_v02", required = true)
    protected PartyIdentificationT accountHolderV02;
    @XmlElement(name = "issuer_V02", required = true)
    protected List<PartyIdentification2T> issuerV02;
    protected SecurityInfoT security;
    @XmlElement(name = "corporate_action_reference")
    protected String corporateActionReference;
    @XmlElement(name = "corporate_action_narrative")
    protected String corporateActionNarrative;
    @XmlElement(name = "corporate_action_code", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionEventEt corporateActionCode;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the cancellationRequestReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefDtlsT }
     *     
     */
    public RefDtlsT getCancellationRequestReference() {
        return cancellationRequestReference;
    }

    /**
     * Sets the value of the cancellationRequestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDtlsT }
     *     
     */
    public void setCancellationRequestReference(RefDtlsT value) {
        this.cancellationRequestReference = value;
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

}
