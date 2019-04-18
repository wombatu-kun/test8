
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}answer_doc_t">
 *       &lt;sequence>
 *         &lt;element name="status_reason_dtls" type="{}status_reason_dtls_t"/>
 *         &lt;element name="ref_dtls" type="{}ref_dtls_t" minOccurs="0"/>
 *         &lt;element name="status_datetime" type="{}datetime_t" minOccurs="0"/>
 *         &lt;element name="add_info" type="{}any_t" minOccurs="0"/>
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
    "statusReasonDtls",
    "refDtls",
    "statusDatetime",
    "addInfo"
})
@XmlRootElement(name = "STATUS_PROCESSING_SETTLEMENT_ADVICE")
public class STATUSPROCESSINGSETTLEMENTADVICE
    extends AnswerDocT
{

    @XmlElement(name = "status_reason_dtls", required = true)
    protected StatusReasonDtlsT statusReasonDtls;
    @XmlElement(name = "ref_dtls")
    protected RefDtlsT refDtls;
    @XmlElement(name = "status_datetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDatetime;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the statusReasonDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonDtlsT }
     *     
     */
    public StatusReasonDtlsT getStatusReasonDtls() {
        return statusReasonDtls;
    }

    /**
     * Sets the value of the statusReasonDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonDtlsT }
     *     
     */
    public void setStatusReasonDtls(StatusReasonDtlsT value) {
        this.statusReasonDtls = value;
    }

    /**
     * Gets the value of the refDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RefDtlsT }
     *     
     */
    public RefDtlsT getRefDtls() {
        return refDtls;
    }

    /**
     * Sets the value of the refDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDtlsT }
     *     
     */
    public void setRefDtls(RefDtlsT value) {
        this.refDtls = value;
    }

    /**
     * Gets the value of the statusDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDatetime() {
        return statusDatetime;
    }

    /**
     * Sets the value of the statusDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDatetime(XMLGregorianCalendar value) {
        this.statusDatetime = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnyT }
     *     
     */
    public AnyT getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyT }
     *     
     */
    public void setAddInfo(AnyT value) {
        this.addInfo = value;
    }

}
