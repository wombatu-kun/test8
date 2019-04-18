
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yes_no_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="yes_no_t">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "yes_no_t")
@XmlEnum
public enum YesNoT {


    /**
     * Yes - Да
     * 
     */
    @XmlEnumValue("Yes")
    YES("Yes"),

    /**
     * No - Нет
     * 
     */
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    YesNoT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoT fromValue(String v) {
        for (YesNoT c: YesNoT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
