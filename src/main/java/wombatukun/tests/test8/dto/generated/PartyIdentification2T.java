
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * идентификационная информация лица (вариант 2)
 * 
 * <p>Java class for party_identification2_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party_identification2_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_2" type="{}id_type_t" maxOccurs="unbounded"/>
 *         &lt;element name="name" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="postal_address" type="{}address_t" minOccurs="0"/>
 *         &lt;element name="party_contacts" type="{}party_contacts_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party_identification2_t", propOrder = {
    "id2",
    "name",
    "postalAddress",
    "partyContacts"
})
public class PartyIdentification2T {

    @XmlElement(name = "id_2", required = true)
    protected List<IdTypeT> id2;
    protected String name;
    @XmlElement(name = "postal_address")
    protected AddressT postalAddress;
    @XmlElement(name = "party_contacts")
    protected PartyContactsT partyContacts;

    /**
     * Gets the value of the id2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdTypeT }
     * 
     * 
     */
    public List<IdTypeT> getId2() {
        if (id2 == null) {
            id2 = new ArrayList<IdTypeT>();
        }
        return this.id2;
    }

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
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressT }
     *     
     */
    public AddressT getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressT }
     *     
     */
    public void setPostalAddress(AddressT value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the partyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyContactsT }
     *     
     */
    public PartyContactsT getPartyContacts() {
        return partyContacts;
    }

    /**
     * Sets the value of the partyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyContactsT }
     *     
     */
    public void setPartyContacts(PartyContactsT value) {
        this.partyContacts = value;
    }

}
