
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * тип информации/ списка
 * 
 * <p>Java class for information_type_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="information_type_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="information_type_code" type="{}information_indicator_et"/>
 *         &lt;element name="narrative" type="{}text_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "information_type_t", propOrder = {
    "informationTypeCode",
    "narrative"
})
public class InformationTypeT {

    @XmlElement(name = "information_type_code", required = true)
    @XmlSchemaType(name = "string")
    protected InformationIndicatorEt informationTypeCode;
    protected String narrative;

    /**
     * Gets the value of the informationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link InformationIndicatorEt }
     *     
     */
    public InformationIndicatorEt getInformationTypeCode() {
        return informationTypeCode;
    }

    /**
     * Sets the value of the informationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationIndicatorEt }
     *     
     */
    public void setInformationTypeCode(InformationIndicatorEt value) {
        this.informationTypeCode = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

}
