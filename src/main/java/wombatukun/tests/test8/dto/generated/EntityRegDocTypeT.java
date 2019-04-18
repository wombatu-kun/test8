
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * тип документа о регистрации юридического лица
 * 
 * <p>Java class for entity_reg_doc_type_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity_reg_doc_type_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity_reg_doc_type_code" type="{}entity_reg_doc_type_et"/>
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
@XmlType(name = "entity_reg_doc_type_t", propOrder = {
    "entityRegDocTypeCode",
    "narrative"
})
public class EntityRegDocTypeT {

    @XmlElement(name = "entity_reg_doc_type_code", required = true)
    @XmlSchemaType(name = "string")
    protected EntityRegDocTypeEt entityRegDocTypeCode;
    protected String narrative;

    /**
     * Gets the value of the entityRegDocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRegDocTypeEt }
     *     
     */
    public EntityRegDocTypeEt getEntityRegDocTypeCode() {
        return entityRegDocTypeCode;
    }

    /**
     * Sets the value of the entityRegDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRegDocTypeEt }
     *     
     */
    public void setEntityRegDocTypeCode(EntityRegDocTypeEt value) {
        this.entityRegDocTypeCode = value;
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
