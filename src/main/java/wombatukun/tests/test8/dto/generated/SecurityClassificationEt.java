
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_classification_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="security_classification_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="BOND"/>
 *     &lt;enumeration value="SHAR"/>
 *     &lt;enumeration value="MFUN"/>
 *     &lt;enumeration value="RDRP"/>
 *     &lt;enumeration value="MPPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "security_classification_et")
@XmlEnum
public enum SecurityClassificationEt {


    /**
     * облигация
     * 
     */
    BOND,

    /**
     * акция
     * 
     */
    SHAR,

    /**
     * пай
     * 
     */
    MFUN,

    /**
     * российская депозитарная расписка
     * 
     */
    RDRP,

    /**
     * ипотечный сертификат участия
     * 
     */
    MPPC;

    public String value() {
        return name();
    }

    public static SecurityClassificationEt fromValue(String v) {
        return valueOf(v);
    }

}
