
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processing_status_code_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="processing_status_code_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="PACK"/>
 *     &lt;enumeration value="REJT"/>
 *     &lt;enumeration value="PEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "processing_status_code_et")
@XmlEnum
public enum ProcessingStatusCodeEt {


    /**
     * документ получен и принят к обработке
     * 
     */
    PACK,

    /**
     * документ не принят к последующей обработке
     * 
     */
    REJT,

    /**
     * документ ожидает обработки
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static ProcessingStatusCodeEt fromValue(String v) {
        return valueOf(v);
    }

}
