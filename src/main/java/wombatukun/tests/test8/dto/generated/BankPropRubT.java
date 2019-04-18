
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Банковские реквизиты сторон для расчетов в рублях
 * 
 * <p>Java class for bank_prop_rub_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bank_prop_rub_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pay_name" type="{}text_t"/>
 *         &lt;element name="inn" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="cash_rub_dtls" type="{}cash_rub_dtls_t"/>
 *         &lt;element name="pay_add_info" type="{}text_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bank_prop_rub_t", propOrder = {
    "payName",
    "inn",
    "cashRubDtls",
    "payAddInfo"
})
public class BankPropRubT {

    @XmlElement(name = "pay_name", required = true)
    protected String payName;
    protected String inn;
    @XmlElement(name = "cash_rub_dtls", required = true)
    protected CashRubDtlsT cashRubDtls;
    @XmlElement(name = "pay_add_info")
    protected String payAddInfo;

    /**
     * Gets the value of the payName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayName() {
        return payName;
    }

    /**
     * Sets the value of the payName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayName(String value) {
        this.payName = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the cashRubDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashRubDtlsT }
     *     
     */
    public CashRubDtlsT getCashRubDtls() {
        return cashRubDtls;
    }

    /**
     * Sets the value of the cashRubDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashRubDtlsT }
     *     
     */
    public void setCashRubDtls(CashRubDtlsT value) {
        this.cashRubDtls = value;
    }

    /**
     * Gets the value of the payAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAddInfo() {
        return payAddInfo;
    }

    /**
     * Sets the value of the payAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAddInfo(String value) {
        this.payAddInfo = value;
    }

}
