
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message_function_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="message_function_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="CANC"/>
 *     &lt;enumeration value="NEWM"/>
 *     &lt;enumeration value="REPL"/>
 *     &lt;enumeration value="RMDR"/>
 *     &lt;enumeration value="AMND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "message_function_et")
@XmlEnum
public enum MessageFunctionEt {


    /**
     * отмена ранее предоставленного сообщения
     * 
     */
    CANC,

    /**
     * первичное сообщение
     * 
     */
    NEWM,

    /**
     * замена сообщения
     * 
     */
    REPL,

    /**
     * напоминание
     * 
     */
    RMDR,

    /**
     * дораскрытие (дополнение) номинального держателя
     * 
     */
    AMND;

    public String value() {
        return name();
    }

    public static MessageFunctionEt fromValue(String v) {
        return valueOf(v);
    }

}
