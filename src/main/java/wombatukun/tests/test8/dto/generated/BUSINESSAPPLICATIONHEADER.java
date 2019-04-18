
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}business_application_header_t">
 *       &lt;sequence>
 *         &lt;element name="related" type="{}business_application_header_t" minOccurs="0"/>
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
    "related"
})
@XmlRootElement(name = "BUSINESS_APPLICATION_HEADER")
public class BUSINESSAPPLICATIONHEADER
    extends BusinessApplicationHeaderT
{

    protected BusinessApplicationHeaderT related;

    /**
     * Gets the value of the related property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeaderT }
     *     
     */
    public BusinessApplicationHeaderT getRelated() {
        return related;
    }

    /**
     * Sets the value of the related property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeaderT }
     *     
     */
    public void setRelated(BusinessApplicationHeaderT value) {
        this.related = value;
    }

}
