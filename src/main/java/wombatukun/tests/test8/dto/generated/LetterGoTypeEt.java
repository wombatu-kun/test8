
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for letter_go_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="letter_go_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="LETR"/>
 *     &lt;enumeration value="KURR"/>
 *     &lt;enumeration value="REGR"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="EDOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "letter_go_type_et")
@XmlEnum
public enum LetterGoTypeEt {


    /**
     * Письмо
     * 
     */
    LETR,

    /**
     * Курьер
     * 
     */
    KURR,

    /**
     * У регистратора (в депозитарии)
     * 
     */
    REGR,

    /**
     * В месте подачи заявки
     * 
     */
    AGNT,

    /**
     * По системе ЭДО
     * 
     */
    EDOC;

    public String value() {
        return name();
    }

    public static LetterGoTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
