
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phone_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phone_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="BIZZ"/>
 *     &lt;enumeration value="MOBI"/>
 *     &lt;enumeration value="FAXI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phone_type_et")
@XmlEnum
public enum PhoneTypeEt {


    /**
     * домашний телефон
     * 
     */
    HOME,

    /**
     * рабочий телефон
     * 
     */
    BIZZ,

    /**
     * мобильный телефон
     * 
     */
    MOBI,

    /**
     * номер факса
     * 
     */
    FAXI;

    public String value() {
        return name();
    }

    public static PhoneTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
