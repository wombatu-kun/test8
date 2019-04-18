
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancellation_rejected_reason_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cancellation_rejected_reason_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="DCAN"/>
 *     &lt;enumeration value="DPRG"/>
 *     &lt;enumeration value="NARR"/>
 *     &lt;enumeration value="NRGN"/>
 *     &lt;enumeration value="DSET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cancellation_rejected_reason_et")
@XmlEnum
public enum CancellationRejectedReasonEt {


    /**
     * Отмена невозможна - распоряжение уже отменено
     * 
     */
    DCAN,

    /**
     * Регистратор исполнил поручение, по которому пришла отмена (поручение сквитовано и исполнено)
     * 
     */
    DPRG,

    /**
     * иная причина: заполняется поле reason_narrative
     * 
     */
    NARR,

    /**
     * Запрос об отмене или инструкция по обработке операции был отклонен, поскольку инструкции не были найдены. (Распоряжение для отмены не найдено).
     * 
     */
    NRGN,

    /**
     * Регистратор исполнил поручение, по которому пришла отмена (Отказано в связи с окончанием расчетов)
     * 
     */
    DSET;

    public String value() {
        return name();
    }

    public static CancellationRejectedReasonEt fromValue(String v) {
        return valueOf(v);
    }

}
