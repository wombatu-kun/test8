
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financial_instrument_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="financial_instrument_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="COMM"/>
 *     &lt;enumeration value="CONV"/>
 *     &lt;enumeration value="CORP"/>
 *     &lt;enumeration value="PREF"/>
 *     &lt;enumeration value="MFUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "financial_instrument_type_et")
@XmlEnum
public enum FinancialInstrumentTypeEt {


    /**
     * Обыкновенные акции
     * 
     */
    COMM,

    /**
     * Конвертируемые облигации
     * 
     */
    CONV,

    /**
     * Корпоративные облигации
     * 
     */
    CORP,

    /**
     * Привилегированные акции
     * 
     */
    PREF,

    /**
     * Инвестиционный пай
     * 
     */
    MFUN;

    public String value() {
        return name();
    }

    public static FinancialInstrumentTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
