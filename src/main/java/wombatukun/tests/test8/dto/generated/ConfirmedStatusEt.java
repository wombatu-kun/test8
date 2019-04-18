
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmed_status_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="confirmed_status_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="CONF"/>
 *     &lt;enumeration value="RJCT"/>
 *     &lt;enumeration value="PEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "confirmed_status_et")
@XmlEnum
public enum ConfirmedStatusEt {


    /**
     * Сверка проведена успешно
     * 
     */
    CONF,

    /**
     * Отказ в проведении сверки
     * 
     */
    RJCT,

    /**
     * Сверка не проводилась
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static ConfirmedStatusEt fromValue(String v) {
        return valueOf(v);
    }

}
