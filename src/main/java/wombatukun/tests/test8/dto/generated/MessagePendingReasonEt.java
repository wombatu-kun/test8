
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message_pending_reason_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="message_pending_reason_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="BATC"/>
 *     &lt;enumeration value="NARR"/>
 *     &lt;enumeration value="BOTH"/>
 *     &lt;enumeration value="CAIS"/>
 *     &lt;enumeration value="CHAS"/>
 *     &lt;enumeration value="DISA"/>
 *     &lt;enumeration value="CMIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "message_pending_reason_et")
@XmlEnum
public enum MessagePendingReasonEt {


    /**
     * Различия во времени обработки. Различия с контрагентом во времени обработки инструкций (например, в дневное время/в режиме реального времени вместо ночной обработки).
     * 
     */
    BATC,

    /**
     * иная причина: заполняется поле reason_narrative
     * 
     */
    NARR,

    /**
     * Инструкции обеих сторон в режиме ожидания. Инструкции от контрагента и от вас в режиме ожида- ния/заморожены/имеют статус предварительного извещения.
     * 
     */
    BOTH,

    /**
     * В ожидании ценных бумаг. В ожидании поступления финансовых инструментов в результате корпоративного или иного действия, например, конвертации, перевода из документарной формы в электронную, обмена, (пере)регистрации, проставления штампа, дробления и т.д.
     * 
     */
    CAIS,

    /**
     * Направлен запрос (Был направлен запрос).
     * 
     */
    CHAS,

    /**
     * форс-мажор; стихийное бедствие
     * 
     */
    DISA,

    /**
     * Не обнаружены парные инструкции от контрагента (нет информации от контрагента)
     * 
     */
    CMIS;

    public String value() {
        return name();
    }

    public static MessagePendingReasonEt fromValue(String v) {
        return valueOf(v);
    }

}
