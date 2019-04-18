
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * сведения об исполнении операции в реестре
 * 
 * <p>Java class for processing_dtls_v02_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processing_dtls_v02_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current_instruction_number" type="{}number_t"/>
 *         &lt;element name="doc_link_csd" type="{}doc_link_t"/>
 *         &lt;element name="doc_link_allegement" type="{}doc_link_t"/>
 *         &lt;element name="processing_reference" type="{}text_t"/>
 *         &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processing_dtls_v02_t", propOrder = {
    "currentInstructionNumber",
    "docLinkCsd",
    "docLinkAllegement",
    "processingReference",
    "processingDatetime"
})
public class ProcessingDtlsV02T {

    @XmlElement(name = "current_instruction_number", required = true)
    protected BigDecimal currentInstructionNumber;
    @XmlElement(name = "doc_link_csd", required = true)
    protected DocLinkT docLinkCsd;
    @XmlElement(name = "doc_link_allegement", required = true)
    protected DocLinkT docLinkAllegement;
    @XmlElement(name = "processing_reference", required = true)
    protected String processingReference;
    @XmlElement(name = "processing_datetime", required = true)
    protected DateOrDatetimeT processingDatetime;

    /**
     * Gets the value of the currentInstructionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInstructionNumber() {
        return currentInstructionNumber;
    }

    /**
     * Sets the value of the currentInstructionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInstructionNumber(BigDecimal value) {
        this.currentInstructionNumber = value;
    }

    /**
     * Gets the value of the docLinkCsd property.
     * 
     * @return
     *     possible object is
     *     {@link DocLinkT }
     *     
     */
    public DocLinkT getDocLinkCsd() {
        return docLinkCsd;
    }

    /**
     * Sets the value of the docLinkCsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocLinkT }
     *     
     */
    public void setDocLinkCsd(DocLinkT value) {
        this.docLinkCsd = value;
    }

    /**
     * Gets the value of the docLinkAllegement property.
     * 
     * @return
     *     possible object is
     *     {@link DocLinkT }
     *     
     */
    public DocLinkT getDocLinkAllegement() {
        return docLinkAllegement;
    }

    /**
     * Sets the value of the docLinkAllegement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocLinkT }
     *     
     */
    public void setDocLinkAllegement(DocLinkT value) {
        this.docLinkAllegement = value;
    }

    /**
     * Gets the value of the processingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingReference() {
        return processingReference;
    }

    /**
     * Sets the value of the processingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingReference(String value) {
        this.processingReference = value;
    }

    /**
     * Gets the value of the processingDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public DateOrDatetimeT getProcessingDatetime() {
        return processingDatetime;
    }

    /**
     * Sets the value of the processingDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDatetimeT }
     *     
     */
    public void setProcessingDatetime(DateOrDatetimeT value) {
        this.processingDatetime = value;
    }

}
