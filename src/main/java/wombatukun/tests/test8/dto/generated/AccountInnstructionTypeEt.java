
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for account_innstruction_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="account_innstruction_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="ACCO"/>
 *     &lt;enumeration value="ACCM"/>
 *     &lt;enumeration value="GACC"/>
 *     &lt;enumeration value="ACMC"/>
 *     &lt;enumeration value="ACMN"/>
 *     &lt;enumeration value="CLSD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "account_innstruction_type_et")
@XmlEnum
public enum AccountInnstructionTypeEt {


    /**
     * открытие счета
     * 
     */
    ACCO,

    /**
     * внесение изменений в информацию (содержание) счета
     * 
     */
    ACCM,

    /**
     * получение деталей счета (НЕ выписка)
     * 
     */
    GACC,

    /**
     * Изменение вида счета с НД на НДЦД
     * 
     */
    ACMC,

    /**
     * Изменение вида счета с НДЦД на НД
     * 
     */
    ACMN,

    /**
     * закрытие счета
     * 
     */
    CLSD;

    public String value() {
        return name();
    }

    public static AccountInnstructionTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
