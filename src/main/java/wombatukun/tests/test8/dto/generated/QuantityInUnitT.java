
package wombatukun.tests.test8.dto.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quantity_in_unit_t", propOrder = {
    "units", "fraction"
})
public class QuantityInUnitT {

    @XmlElement(name = "units", required = true)
    protected BigDecimal units;
    @XmlElement(name = "fraction")
    protected Fraction fraction;


    public BigDecimal getUnits() { return units; }

    public void setUnits(BigDecimal units) { this.units = units; }

    public Fraction getFraction() { return fraction; }

    public void setFraction(Fraction fraction) { this.fraction = fraction; }

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
     *         &lt;element name="numerator" type="{}number_t"/>
     *         &lt;element name="denominator" type="{}number_t"/>
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
        "numerator",
        "denominator"
    })
    public static class Fraction {

        @XmlElement(required = true)
        protected BigDecimal numerator;
        @XmlElement(required = true)
        protected BigDecimal denominator;

        /**
         * Gets the value of the numerator property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumerator() {
            return numerator;
        }

        /**
         * Sets the value of the numerator property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumerator(BigDecimal value) {
            this.numerator = value;
        }

        /**
         * Gets the value of the denominator property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDenominator() {
            return denominator;
        }

        /**
         * Sets the value of the denominator property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDenominator(BigDecimal value) {
            this.denominator = value;
        }

    }

}
