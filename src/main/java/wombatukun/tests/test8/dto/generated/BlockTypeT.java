
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * вид обременения
 * 
 * <p>Java class for block_type_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="block_type_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="block_type_code" type="{}block_type_et"/>
 *         &lt;element name="narrative" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="pledgee_info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t" minOccurs="0"/>
 *                   &lt;element name="pledgee" type="{}party_dtls_t"/>
 *                   &lt;element name="pledgee_narrative" type="{}text_t" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "block_type_t", propOrder = {
    "blockTypeCode",
    "narrative",
    "restrictions",
    "pledgeeInfo"
})
public class BlockTypeT {

    @XmlElement(name = "block_type_code", required = true)
    @XmlSchemaType(name = "string")
    protected BlockTypeEt blockTypeCode;
    protected String narrative;
    protected String restrictions;
    @XmlElement(name = "pledgee_info")
    protected BlockTypeT.PledgeeInfo pledgeeInfo;

    /**
     * Gets the value of the blockTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTypeEt }
     *     
     */
    public BlockTypeEt getBlockTypeCode() {
        return blockTypeCode;
    }

    /**
     * Sets the value of the blockTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTypeEt }
     *     
     */
    public void setBlockTypeCode(BlockTypeEt value) {
        this.blockTypeCode = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictions(String value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the pledgeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTypeT.PledgeeInfo }
     *     
     */
    public BlockTypeT.PledgeeInfo getPledgeeInfo() {
        return pledgeeInfo;
    }

    /**
     * Sets the value of the pledgeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTypeT.PledgeeInfo }
     *     
     */
    public void setPledgeeInfo(BlockTypeT.PledgeeInfo value) {
        this.pledgeeInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t" minOccurs="0"/>
     *         &lt;element name="pledgee" type="{}party_dtls_t"/>
     *         &lt;element name="pledgee_narrative" type="{}text_t" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountDtlsV02",
        "pledgee",
        "pledgeeNarrative"
    })
    public static class PledgeeInfo {

        @XmlElement(name = "account_dtls_v02")
        protected AccountDtlsV02T accountDtlsV02;
        @XmlElement(required = true)
        protected PartyDtlsT pledgee;
        @XmlElement(name = "pledgee_narrative")
        protected String pledgeeNarrative;

        /**
         * Gets the value of the accountDtlsV02 property.
         * 
         * @return
         *     possible object is
         *     {@link AccountDtlsV02T }
         *     
         */
        public AccountDtlsV02T getAccountDtlsV02() {
            return accountDtlsV02;
        }

        /**
         * Sets the value of the accountDtlsV02 property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountDtlsV02T }
         *     
         */
        public void setAccountDtlsV02(AccountDtlsV02T value) {
            this.accountDtlsV02 = value;
        }

        /**
         * Gets the value of the pledgee property.
         * 
         * @return
         *     possible object is
         *     {@link PartyDtlsT }
         *     
         */
        public PartyDtlsT getPledgee() {
            return pledgee;
        }

        /**
         * Sets the value of the pledgee property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyDtlsT }
         *     
         */
        public void setPledgee(PartyDtlsT value) {
            this.pledgee = value;
        }

        /**
         * Gets the value of the pledgeeNarrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPledgeeNarrative() {
            return pledgeeNarrative;
        }

        /**
         * Sets the value of the pledgeeNarrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPledgeeNarrative(String value) {
            this.pledgeeNarrative = value;
        }

    }

}
