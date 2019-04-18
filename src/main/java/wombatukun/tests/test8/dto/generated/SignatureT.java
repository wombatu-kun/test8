
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * блок для описания электронной подписи
 * 
 * <p>Java class for signature_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signature_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="signature_ISO_SRO" type="{}SignatureType"/>
 *         &lt;element name="signature_ISO" type="{}SignatureEnvelope"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signature_t", propOrder = {
    "signatureISOSRO",
    "signatureISO"
})
public class SignatureT {

    @XmlElement(name = "signature_ISO_SRO")
    protected SignatureType signatureISOSRO;
    @XmlElement(name = "signature_ISO")
    protected SignatureEnvelope signatureISO;

    /**
     * Gets the value of the signatureISOSRO property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignatureISOSRO() {
        return signatureISOSRO;
    }

    /**
     * Sets the value of the signatureISOSRO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignatureISOSRO(SignatureType value) {
        this.signatureISOSRO = value;
    }

    /**
     * Gets the value of the signatureISO property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSignatureISO() {
        return signatureISO;
    }

    /**
     * Sets the value of the signatureISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public void setSignatureISO(SignatureEnvelope value) {
        this.signatureISO = value;
    }

}
