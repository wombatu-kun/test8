
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * идентификационная информация лица
 * 
 * <p>Java class for party_identification_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party_identification_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_2" type="{}id_type_t"/>
 *         &lt;element name="id_date" type="{}date_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party_identification_t", propOrder = {
    "id2",
    "idDate"
})
public class PartyIdentificationT {

    @XmlElement(name = "id_2", required = true)
    protected IdTypeT id2;
    @XmlElement(name = "id_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idDate;

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link IdTypeT }
     *     
     */
    public IdTypeT getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdTypeT }
     *     
     */
    public void setId2(IdTypeT value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the idDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdDate() {
        return idDate;
    }

    /**
     * Sets the value of the idDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdDate(XMLGregorianCalendar value) {
        this.idDate = value;
    }

}
