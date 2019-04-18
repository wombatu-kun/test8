
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * подробная информация о счете/ лицевом счете
 * 
 * <p>Java class for account_dtls_v02_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="account_dtls_v02_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account_id" type="{}id_t"/>
 *         &lt;element name="account_type" type="{}account_type_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_dtls_v02_t", propOrder = {
    "accountId",
    "accountType"
})
public class AccountDtlsV02T {

    @XmlElement(name = "account_id", required = true)
    protected IdT accountId;
    @XmlElement(name = "account_type", required = true)
    protected AccountTypeT accountType;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdT }
     *     
     */
    public IdT getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdT }
     *     
     */
    public void setAccountId(IdT value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeT }
     *     
     */
    public AccountTypeT getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeT }
     *     
     */
    public void setAccountType(AccountTypeT value) {
        this.accountType = value;
    }

}
