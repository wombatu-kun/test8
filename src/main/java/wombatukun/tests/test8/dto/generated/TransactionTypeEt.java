
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transaction_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="DELI"/>
 *     &lt;enumeration value="RECE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transaction_type_et")
@XmlEnum
public enum TransactionTypeEt {


    /**
     * списание
     * 
     */
    DELI,

    /**
     * зачисление
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static TransactionTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
