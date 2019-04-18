
package wombatukun.tests.test8.dto.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * валюта и сумма
 * 
 * <p>Java class for currency_and_amount_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currency_and_amount_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccy_code" type="{}text_t"/>
 *         &lt;element name="amount" type="{}decimal_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currency_and_amount_t", propOrder = {
    "ccyCode",
    "amount"
})
public class CurrencyAndAmountT {

    @XmlElement(name = "ccy_code", required = true)
    protected String ccyCode;
    @XmlElement(required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the ccyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyCode() {
        return ccyCode;
    }

    /**
     * Sets the value of the ccyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyCode(String value) {
        this.ccyCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
