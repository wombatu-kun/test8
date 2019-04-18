
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contract_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contract_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="AGTC"/>
 *     &lt;enumeration value="BYSA"/>
 *     &lt;enumeration value="COLA"/>
 *     &lt;enumeration value="COMC"/>
 *     &lt;enumeration value="DEPA"/>
 *     &lt;enumeration value="DSTA"/>
 *     &lt;enumeration value="EXGA"/>
 *     &lt;enumeration value="GIFA"/>
 *     &lt;enumeration value="INDA"/>
 *     &lt;enumeration value="NCBO"/>
 *     &lt;enumeration value="NOMA"/>
 *     &lt;enumeration value="ORDA"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="PLGA"/>
 *     &lt;enumeration value="TRSA"/>
 *     &lt;enumeration value="REPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contract_et")
@XmlEnum
public enum ContractEt {


    /**
     * агентский договор
     * 
     */
    AGTC,

    /**
     * договор купли-продажи
     * 
     */
    BYSA,

    /**
     * договор займа (кредитный договор)
     * 
     */
    COLA,

    /**
     * договор комиссии
     * 
     */
    COMC,

    /**
     * депозитарный договор
     * 
     */
    DEPA,

    /**
     * договор вклада/ хранения (депозитное соглашение)
     * 
     */
    DSTA,

    /**
     * договор мены
     * 
     */
    EXGA,

    /**
     * договор дарения
     * 
     */
    GIFA,

    /**
     * междепозитарный договор
     * 
     */
    INDA,

    /**
     * поручение клиента (исп. для поручений без перехода прав собственности)
     * 
     */
    NCBO,

    /**
     * договор о номинальном держании
     * 
     */
    NOMA,

    /**
     * договор поручения
     * 
     */
    ORDA,

    /**
     * прочее
     * 
     */
    OTHR,

    /**
     * договор залога
     * 
     */
    PLGA,

    /**
     * договор доверительного управления
     * 
     */
    TRSA,

    /**
     * Договор РЕПО
     * 
     */
    REPA;

    public String value() {
        return name();
    }

    public static ContractEt fromValue(String v) {
        return valueOf(v);
    }

}
