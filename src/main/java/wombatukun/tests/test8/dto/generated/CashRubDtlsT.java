
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * информация о банковских реквизитах в рублях
 * 
 * <p>Java class for cash_rub_dtls_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cash_rub_dtls_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{}id_t"/>
 *         &lt;element name="bank_name" type="{}text_t"/>
 *         &lt;element name="bank_city" type="{}text_t"/>
 *         &lt;element name="ruic" type="{}text_t"/>
 *         &lt;element name="bank_corr" type="{}id_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cash_rub_dtls_t", propOrder = {
    "account",
    "bankName",
    "bankCity",
    "ruic",
    "bankCorr"
})
public class CashRubDtlsT {

    @XmlElement(required = true)
    protected IdT account;
    @XmlElement(name = "bank_name", required = true)
    protected String bankName;
    @XmlElement(name = "bank_city", required = true)
    protected String bankCity;
    @XmlElement(required = true)
    protected String ruic;
    @XmlElement(name = "bank_corr", required = true)
    protected IdT bankCorr;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link IdT }
     *     
     */
    public IdT getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdT }
     *     
     */
    public void setAccount(IdT value) {
        this.account = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * Sets the value of the bankCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCity(String value) {
        this.bankCity = value;
    }

    /**
     * Gets the value of the ruic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuic() {
        return ruic;
    }

    /**
     * Sets the value of the ruic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuic(String value) {
        this.ruic = value;
    }

    /**
     * Gets the value of the bankCorr property.
     * 
     * @return
     *     possible object is
     *     {@link IdT }
     *     
     */
    public IdT getBankCorr() {
        return bankCorr;
    }

    /**
     * Sets the value of the bankCorr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdT }
     *     
     */
    public void setBankCorr(IdT value) {
        this.bankCorr = value;
    }

}
