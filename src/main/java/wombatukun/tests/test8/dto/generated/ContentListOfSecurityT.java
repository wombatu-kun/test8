
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * содержание документа "Справочник по ценным бумагам"
 * 
 * <p>Java class for content_list_of_security_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="content_list_of_security_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SN" type="{}number_t" minOccurs="0"/>
 *         &lt;element name="reg_org" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="security_info" type="{}security_info_t"/>
 *         &lt;element name="vote" type="{}number_t" minOccurs="0"/>
 *         &lt;element name="form_issue" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="dividend_rate" type="{}decimal_t" minOccurs="0"/>
 *         &lt;element name="quantity_in_issue" type="{}quantity_in_unit_t" minOccurs="0"/>
 *         &lt;element name="quantity_in_place" type="{}quantity_in_unit_t" minOccurs="0"/>
 *         &lt;element name="state_report_date" type="{}date_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content_list_of_security_t", propOrder = {
    "sn",
    "regOrg",
    "securityInfo",
    "vote",
    "formIssue",
    "dividendRate",
    "quantityInIssue",
    "quantityInPlace",
    "stateReportDate"
})
public class ContentListOfSecurityT {

    @XmlElement(name = "SN")
    protected BigDecimal sn;
    @XmlElement(name = "reg_org")
    protected String regOrg;
    @XmlElement(name = "security_info", required = true)
    protected SecurityInfoT securityInfo;
    protected BigDecimal vote;
    @XmlElement(name = "form_issue")
    protected String formIssue;
    @XmlElement(name = "dividend_rate")
    protected BigDecimal dividendRate;
    @XmlElement(name = "quantity_in_issue")
    protected QuantityInUnitT quantityInIssue;
    @XmlElement(name = "quantity_in_place")
    protected QuantityInUnitT quantityInPlace;
    @XmlElement(name = "state_report_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stateReportDate;

    /**
     * Gets the value of the sn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSN() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSN(BigDecimal value) {
        this.sn = value;
    }

    /**
     * Gets the value of the regOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOrg() {
        return regOrg;
    }

    /**
     * Sets the value of the regOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOrg(String value) {
        this.regOrg = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfoT }
     *     
     */
    public SecurityInfoT getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfoT }
     *     
     */
    public void setSecurityInfo(SecurityInfoT value) {
        this.securityInfo = value;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVote(BigDecimal value) {
        this.vote = value;
    }

    /**
     * Gets the value of the formIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormIssue() {
        return formIssue;
    }

    /**
     * Sets the value of the formIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormIssue(String value) {
        this.formIssue = value;
    }

    /**
     * Gets the value of the dividendRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendRate() {
        return dividendRate;
    }

    /**
     * Sets the value of the dividendRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendRate(BigDecimal value) {
        this.dividendRate = value;
    }

    /**
     * Gets the value of the quantityInIssue property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInUnitT }
     *     
     */
    public QuantityInUnitT getQuantityInIssue() {
        return quantityInIssue;
    }

    /**
     * Sets the value of the quantityInIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInUnitT }
     *     
     */
    public void setQuantityInIssue(QuantityInUnitT value) {
        this.quantityInIssue = value;
    }

    /**
     * Gets the value of the quantityInPlace property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInUnitT }
     *     
     */
    public QuantityInUnitT getQuantityInPlace() {
        return quantityInPlace;
    }

    /**
     * Sets the value of the quantityInPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInUnitT }
     *     
     */
    public void setQuantityInPlace(QuantityInUnitT value) {
        this.quantityInPlace = value;
    }

    /**
     * Gets the value of the stateReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateReportDate() {
        return stateReportDate;
    }

    /**
     * Sets the value of the stateReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateReportDate(XMLGregorianCalendar value) {
        this.stateReportDate = value;
    }

}
