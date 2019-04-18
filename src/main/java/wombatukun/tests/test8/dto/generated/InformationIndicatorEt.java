
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for information_indicator_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="information_indicator_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="OWNL"/>
 *     &lt;enumeration value="DEPL"/>
 *     &lt;enumeration value="INML"/>
 *     &lt;enumeration value="NOML"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="NOMT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "information_indicator_et")
@XmlEnum
public enum InformationIndicatorEt {


    /**
     * список владельцев
     * 
     */
    OWNL,

    /**
     * список депонентов
     * 
     */
    DEPL,

    /**
     * список лиц, имеющих право на получение дохода
     * 
     */
    INML,

    /**
     * дораскрытие номинального держателя
     * 
     */
    NOML,

    /**
     * прочее
     * 
     */
    OTHR,

    /**
     * прекращение номинального держателя
     * 
     */
    NOMT;

    public String value() {
        return name();
    }

    public static InformationIndicatorEt fromValue(String v) {
        return valueOf(v);
    }

}
