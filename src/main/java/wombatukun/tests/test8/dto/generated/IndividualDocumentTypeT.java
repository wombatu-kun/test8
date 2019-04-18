
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * тип документа, удостоверяющего личность физического лица
 * 
 * <p>Java class for individual_document_type_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individual_document_type_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="individual_document_type_code" type="{}individual_document_type_et"/>
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
@XmlType(name = "individual_document_type_t", propOrder = {
    "individualDocumentTypeCode",
    "narrative"
})
public class IndividualDocumentTypeT {

    @XmlElement(name = "individual_document_type_code", required = true)
    protected String individualDocumentTypeCode;
    protected String narrative;

    /**
     * Gets the value of the individualDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualDocumentTypeCode() {
        return individualDocumentTypeCode;
    }

    /**
     * Sets the value of the individualDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualDocumentTypeCode(String value) {
        this.individualDocumentTypeCode = value;
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
