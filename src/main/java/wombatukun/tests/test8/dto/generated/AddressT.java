
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * обобщенный адрес
 * 
 * <p>Java class for address_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="partad" type="{}address_partad_t"/>
 *           &lt;element name="kladr" type="{}text_t" maxOccurs="0" minOccurs="0"/>
 *           &lt;element name="plain" type="{}text_t"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address_t", propOrder = {
    "partad",
    "plain"
})
public class AddressT {

    protected AddressPartadT partad;
    protected String plain;

    /**
     * Gets the value of the partad property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPartadT }
     *     
     */
    public AddressPartadT getPartad() {
        return partad;
    }

    /**
     * Sets the value of the partad property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPartadT }
     *     
     */
    public void setPartad(AddressPartadT value) {
        this.partad = value;
    }

    /**
     * Gets the value of the plain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlain() {
        return plain;
    }

    /**
     * Sets the value of the plain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlain(String value) {
        this.plain = value;
    }

}
