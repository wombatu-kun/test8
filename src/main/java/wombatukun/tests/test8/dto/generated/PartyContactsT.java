
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * контактная информация о стороне
 * 
 * <p>Java class for party_contacts_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party_contacts_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_or_fax" type="{}phone_t" maxOccurs="unbounded"/>
 *         &lt;element name="e_mail" type="{}text_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party_contacts_t", propOrder = {
    "phoneOrFax",
    "eMail"
})
public class PartyContactsT {

    @XmlElement(name = "phone_or_fax", required = true)
    protected List<PhoneT> phoneOrFax;
    @XmlElement(name = "e_mail")
    protected List<String> eMail;

    /**
     * Gets the value of the phoneOrFax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneOrFax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneOrFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneT }
     * 
     * 
     */
    public List<PhoneT> getPhoneOrFax() {
        if (phoneOrFax == null) {
            phoneOrFax = new ArrayList<PhoneT>();
        }
        return this.phoneOrFax;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<String>();
        }
        return this.eMail;
    }

}
