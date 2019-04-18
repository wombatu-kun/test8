
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for individual_or_entity_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="individual_or_entity_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="LEGL"/>
 *     &lt;enumeration value="INDV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "individual_or_entity_et")
@XmlEnum
public enum IndividualOrEntityEt {


    /**
     * юридическое лицо
     * 
     */
    LEGL,

    /**
     * физическое лицо
     * 
     */
    INDV;

    public String value() {
        return name();
    }

    public static IndividualOrEntityEt fromValue(String v) {
        return valueOf(v);
    }

}
