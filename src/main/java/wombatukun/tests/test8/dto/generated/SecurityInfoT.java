
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * информация о ценной бумаге
 * 
 * <p>Java class for security_info_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security_info_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security_classification" type="{}security_classification_et"/>
 *         &lt;element name="security_classification_CFI" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="financial_instrument_type" type="{}financial_instrument_type_et" minOccurs="0"/>
 *         &lt;element name="security_category" type="{}security_category_et" minOccurs="0"/>
 *         &lt;element name="security_type" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="nominal_value" type="{}currency_and_amount_t" minOccurs="0"/>
 *         &lt;element name="state_reg_num">
 *           &lt;simpleType>
 *             &lt;restriction base="{}text_t">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="state_reg_date" type="{}date_t" minOccurs="0"/>
 *         &lt;element name="ISIN_identifier" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="proprietary_security_code" type="{}id_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_info_t", propOrder = {
    "securityClassification",
    "securityClassificationCFI",
    "financialInstrumentType",
    "securityCategory",
    "securityType",
    "nominalValue",
    "stateRegNum",
    "stateRegDate",
    "isinIdentifier",
    "proprietarySecurityCode"
})
public class SecurityInfoT {

    @XmlElement(name = "security_classification", required = true)
    @XmlSchemaType(name = "string")
    protected SecurityClassificationEt securityClassification;
    @XmlElement(name = "security_classification_CFI")
    protected String securityClassificationCFI;
    @XmlElement(name = "financial_instrument_type")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentTypeEt financialInstrumentType;
    @XmlElement(name = "security_category")
    @XmlSchemaType(name = "string")
    protected SecurityCategoryEt securityCategory;
    @XmlElement(name = "security_type")
    protected String securityType;
    @XmlElement(name = "nominal_value")
    protected CurrencyAndAmountT nominalValue;
    @XmlElement(name = "state_reg_num", required = true)
    protected String stateRegNum;
    @XmlElement(name = "state_reg_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stateRegDate;
    @XmlElement(name = "ISIN_identifier")
    protected String isinIdentifier;
    @XmlElement(name = "proprietary_security_code")
    protected IdT proprietarySecurityCode;

    /**
     * Gets the value of the securityClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationEt }
     *     
     */
    public SecurityClassificationEt getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Sets the value of the securityClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationEt }
     *     
     */
    public void setSecurityClassification(SecurityClassificationEt value) {
        this.securityClassification = value;
    }

    /**
     * Gets the value of the securityClassificationCFI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassificationCFI() {
        return securityClassificationCFI;
    }

    /**
     * Sets the value of the securityClassificationCFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassificationCFI(String value) {
        this.securityClassificationCFI = value;
    }

    /**
     * Gets the value of the financialInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentTypeEt }
     *     
     */
    public FinancialInstrumentTypeEt getFinancialInstrumentType() {
        return financialInstrumentType;
    }

    /**
     * Sets the value of the financialInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentTypeEt }
     *     
     */
    public void setFinancialInstrumentType(FinancialInstrumentTypeEt value) {
        this.financialInstrumentType = value;
    }

    /**
     * Gets the value of the securityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCategoryEt }
     *     
     */
    public SecurityCategoryEt getSecurityCategory() {
        return securityCategory;
    }

    /**
     * Sets the value of the securityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCategoryEt }
     *     
     */
    public void setSecurityCategory(SecurityCategoryEt value) {
        this.securityCategory = value;
    }

    /**
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityType(String value) {
        this.securityType = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountT }
     *     
     */
    public CurrencyAndAmountT getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountT }
     *     
     */
    public void setNominalValue(CurrencyAndAmountT value) {
        this.nominalValue = value;
    }

    /**
     * Gets the value of the stateRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegNum() {
        return stateRegNum;
    }

    /**
     * Sets the value of the stateRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegNum(String value) {
        this.stateRegNum = value;
    }

    /**
     * Gets the value of the stateRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateRegDate() {
        return stateRegDate;
    }

    /**
     * Sets the value of the stateRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateRegDate(XMLGregorianCalendar value) {
        this.stateRegDate = value;
    }

    /**
     * Gets the value of the isinIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISINIdentifier() {
        return isinIdentifier;
    }

    /**
     * Sets the value of the isinIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISINIdentifier(String value) {
        this.isinIdentifier = value;
    }

    /**
     * Gets the value of the proprietarySecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdT }
     *     
     */
    public IdT getProprietarySecurityCode() {
        return proprietarySecurityCode;
    }

    /**
     * Sets the value of the proprietarySecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdT }
     *     
     */
    public void setProprietarySecurityCode(IdT value) {
        this.proprietarySecurityCode = value;
    }

}
