
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * статус налогоплательщика
 * 
 * <p>Java class for tax_category_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tax_category_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tax_status_code" type="{}tax_status_et"/>
 *         &lt;element name="nonresident_type" type="{}nonresident_type_et" minOccurs="0"/>
 *         &lt;element name="tax_exempt_indicator" type="{}yes_no_t" minOccurs="0"/>
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
@XmlType(name = "tax_category_t", propOrder = {
    "taxStatusCode",
    "nonresidentType",
    "taxExemptIndicator",
    "narrative"
})
public class TaxCategoryT {

    @XmlElement(name = "tax_status_code", required = true)
    protected String taxStatusCode;
    @XmlElement(name = "nonresident_type")
    protected String nonresidentType;
    @XmlElement(name = "tax_exempt_indicator")
    @XmlSchemaType(name = "string")
    protected YesNoT taxExemptIndicator;
    protected String narrative;

    /**
     * Gets the value of the taxStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatusCode() {
        return taxStatusCode;
    }

    /**
     * Sets the value of the taxStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatusCode(String value) {
        this.taxStatusCode = value;
    }

    /**
     * Gets the value of the nonresidentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonresidentType() {
        return nonresidentType;
    }

    /**
     * Sets the value of the nonresidentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonresidentType(String value) {
        this.nonresidentType = value;
    }

    /**
     * Gets the value of the taxExemptIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoT }
     *     
     */
    public YesNoT getTaxExemptIndicator() {
        return taxExemptIndicator;
    }

    /**
     * Sets the value of the taxExemptIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoT }
     *     
     */
    public void setTaxExemptIndicator(YesNoT value) {
        this.taxExemptIndicator = value;
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
