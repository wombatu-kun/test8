
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * информация о результатах проведенной сверки
 * 
 * <p>Java class for reconciliation_info_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reconciliation_info_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmed_status" type="{}confirmed_status_et"/>
 *         &lt;element name="confirmed_date" type="{}datetime_t"/>
 *         &lt;element name="difference_size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reason_narrative_rejected" type="{}text_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reconciliation_info_t", propOrder = {
    "confirmedStatus",
    "confirmedDate",
    "differenceSize",
    "reasonNarrativeRejected"
})
public class ReconciliationInfoT {

    @XmlElement(name = "confirmed_status", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmedStatusEt confirmedStatus;
    @XmlElement(name = "confirmed_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmedDate;
    @XmlElement(name = "difference_size")
    protected BigDecimal differenceSize;
    @XmlElement(name = "reason_narrative_rejected")
    protected List<String> reasonNarrativeRejected;

    /**
     * Gets the value of the confirmedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmedStatusEt }
     *     
     */
    public ConfirmedStatusEt getConfirmedStatus() {
        return confirmedStatus;
    }

    /**
     * Sets the value of the confirmedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmedStatusEt }
     *     
     */
    public void setConfirmedStatus(ConfirmedStatusEt value) {
        this.confirmedStatus = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmedDate(XMLGregorianCalendar value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the differenceSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDifferenceSize() {
        return differenceSize;
    }

    /**
     * Sets the value of the differenceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDifferenceSize(BigDecimal value) {
        this.differenceSize = value;
    }

    /**
     * Gets the value of the reasonNarrativeRejected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNarrativeRejected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNarrativeRejected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReasonNarrativeRejected() {
        if (reasonNarrativeRejected == null) {
            reasonNarrativeRejected = new ArrayList<String>();
        }
        return this.reasonNarrativeRejected;
    }

}
