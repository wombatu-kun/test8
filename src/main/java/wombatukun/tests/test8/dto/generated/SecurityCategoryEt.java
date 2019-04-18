
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_category_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="security_category_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="ORDN"/>
 *     &lt;enumeration value="PREF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "security_category_et")
@XmlEnum
public enum SecurityCategoryEt {


    /**
     * обыкновенные
     * 
     */
    ORDN,

    /**
     * привилегированные
     * 
     */
    PREF;

    public String value() {
        return name();
    }

    public static SecurityCategoryEt fromValue(String v) {
        return valueOf(v);
    }

}
