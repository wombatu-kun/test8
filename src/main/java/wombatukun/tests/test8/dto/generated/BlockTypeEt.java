
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for block_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="block_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;minLength value="4"/>
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="COLO"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="PLAC"/>
 *     &lt;enumeration value="BLFL"/>
 *     &lt;enumeration value="BLTR"/>
 *     &lt;enumeration value="BLIN"/>
 *     &lt;enumeration value="BLFC"/>
 *     &lt;enumeration value="BLRO"/>
 *     &lt;enumeration value="BLCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "block_type_et")
@XmlEnum
public enum BlockTypeEt {


    /**
     * передано в залог
     * 
     */
    COLO,

    /**
     * иное обременение/блокировка
     * 
     */
    OTHR,

    /**
     * размещаемые ценные бумаги
     * 
     */
    PLAC,

    /**
     * блокировано в соответствии со ст. 84.8 ФЗ "Об акционерных обществах"
     * 
     */
    BLFL,

    /**
     * блокировано в связи с прекращением паевого инвестиционного фонда
     * 
     */
    BLTR,

    /**
     * блокировано по решению государственных органов (суд, следователь, пристав и пр.)
     * 
     */
    BLIN,

    /**
     * блокировано в связи с предписанием регулятора по финансовому рынку
     * 
     */
    BLFC,

    /**
     * блокировано в связи с реорганизацией
     * 
     */
    BLRO,

    /**
     * блокировано в связи с конвертацией без реорганизации
     * 
     */
    BLCV;

    public String value() {
        return name();
    }

    public static BlockTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
