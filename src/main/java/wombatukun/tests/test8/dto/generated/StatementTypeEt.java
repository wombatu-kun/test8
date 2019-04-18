
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statement_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statement_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="TRAN"/>
 *     &lt;enumeration value="CONF"/>
 *     &lt;enumeration value="AVAI"/>
 *     &lt;enumeration value="OPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statement_type_et")
@XmlEnum
public enum StatementTypeEt {


    /**
     * выписка из реестра, справка об остатках ценных бумаг на конкретную дату
     * 
     */
    HOLD,

    /**
     * справка о движении ценных бумаг
     * 
     */
    TRAN,

    /**
     * уведомление о проведении операции
     * 
     */
    CONF,

    /**
     * справка о наличии ценных бумаг (определенного количества, указанного в запросе)
     * 
     */
    AVAI,

    /**
     * справка об операциях по лицевому счету
     * 
     */
    OPER;

    public String value() {
        return name();
    }

    public static StatementTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
