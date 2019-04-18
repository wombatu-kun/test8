
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * баланс ценных бумаг
 * 
 * <p>Java class for security_balance_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security_balance_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security" type="{}security_info_t"/>
 *         &lt;element name="total" type="{}quantity_in_unit_t"/>
 *         &lt;element name="blocked" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantity" type="{}quantity_in_unit_t"/>
 *                   &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded"/>
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
@XmlType(name = "security_balance_t", propOrder = {
    "security",
    "total",
    "blocked"
})
public class SecurityBalanceT {

    @XmlElement(required = true)
    protected SecurityInfoT security;
    @XmlElement(required = true)
    protected QuantityInUnitT total;
    protected List<SecurityBalanceT.Blocked> blocked;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfoT }
     *     
     */
    public SecurityInfoT getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfoT }
     *     
     */
    public void setSecurity(SecurityInfoT value) {
        this.security = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInUnitT }
     *     
     */
    public QuantityInUnitT getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInUnitT }
     *     
     */
    public void setTotal(QuantityInUnitT value) {
        this.total = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blocked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlocked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityBalanceT.Blocked }
     * 
     * 
     */
    public List<SecurityBalanceT.Blocked> getBlocked() {
        if (blocked == null) {
            blocked = new ArrayList<SecurityBalanceT.Blocked>();
        }
        return this.blocked;
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
     *         &lt;element name="quantity" type="{}quantity_in_unit_t"/>
     *         &lt;element name="block_type" type="{}block_type_t" maxOccurs="unbounded"/>
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
        "quantity",
        "blockType"
    })
    public static class Blocked {

        @XmlElement(required = true)
        protected QuantityInUnitT quantity;
        @XmlElement(name = "block_type", required = true)
        protected List<BlockTypeT> blockType;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityInUnitT }
         *     
         */
        public QuantityInUnitT getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityInUnitT }
         *     
         */
        public void setQuantity(QuantityInUnitT value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the blockType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blockType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlockType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BlockTypeT }
         * 
         * 
         */
        public List<BlockTypeT> getBlockType() {
            if (blockType == null) {
                blockType = new ArrayList<BlockTypeT>();
            }
            return this.blockType;
        }

    }

}
