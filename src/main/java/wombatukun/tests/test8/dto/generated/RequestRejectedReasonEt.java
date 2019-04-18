
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request_rejected_reason_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="request_rejected_reason_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="MISM"/>
 *     &lt;enumeration value="NARR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "request_rejected_reason_et")
@XmlEnum
public enum RequestRejectedReasonEt {


    /**
     * Неверно указан тип сообщения
     * 
     */
    MISM,

    /**
     * иная причина: заполняется поле reason_narrative
     * 
     */
    NARR;

    public String value() {
        return name();
    }

    public static RequestRejectedReasonEt fromValue(String v) {
        return valueOf(v);
    }

}
