
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * характеристики стороны с контактами
 * 
 * <p>Java class for party_dtls_contacts_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party_dtls_contacts_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="party_dtls" type="{}party_dtls_t"/>
 *         &lt;element name="contacts" type="{}party_contacts_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party_dtls_contacts_t", propOrder = {
    "partyDtls",
    "contacts"
})
public class PartyDtlsContactsT {

    @XmlElement(name = "party_dtls", required = true)
    protected PartyDtlsT partyDtls;
    @XmlElement(required = true)
    protected PartyContactsT contacts;

    /**
     * Gets the value of the partyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsT }
     *     
     */
    public PartyDtlsT getPartyDtls() {
        return partyDtls;
    }

    /**
     * Sets the value of the partyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsT }
     *     
     */
    public void setPartyDtls(PartyDtlsT value) {
        this.partyDtls = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyContactsT }
     *     
     */
    public PartyContactsT getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyContactsT }
     *     
     */
    public void setContacts(PartyContactsT value) {
        this.contacts = value;
    }

}
