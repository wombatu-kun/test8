
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reason_code_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reason_code_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="CMIS"/>
 *     &lt;enumeration value="DISA"/>
 *     &lt;enumeration value="BLOC"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="LACK"/>
 *     &lt;enumeration value="REFU"/>
 *     &lt;enumeration value="ICAG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reason_code_et")
@XmlEnum
public enum ReasonCodeEt {


    /**
     * нет информации от контрагента
     * 
     */
    CMIS,

    /**
     * стихийное бедствие
     * 
     */
    DISA,

    /**
     * счет заблокирован
     * 
     */
    BLOC,

    /**
     * ценные бумаги находятся в залоге
     * 
     */
    COLL,

    /**
     * недостаточно ценных бумаг на счете
     * 
     */
    LACK,

    /**
     * документ не опознан
     * 
     */
    REFU,

    /**
     * неверно указаны реквизиты контрагент
     * 
     */
    ICAG;

    public String value() {
        return name();
    }

    public static ReasonCodeEt fromValue(String v) {
        return valueOf(v);
    }

}
