
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cash_settlement_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cash_settlement_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="DVCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cash_settlement_type_et")
@XmlEnum
public enum CashSettlementTypeEt {


    /**
     * Дивиденды в денежной форме
     * 
     */
    DVCA;

    public String value() {
        return name();
    }

    public static CashSettlementTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
