
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unmatched_reason_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unmatched_reason_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="CMIS"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="DELN"/>
 *     &lt;enumeration value="NARR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unmatched_reason_et")
@XmlEnum
public enum UnmatchedReasonEt {


    /**
     * Не обнаружены парные инструкции от контрагента (нет информации от контрагента)
     * 
     */
    CMIS,

    /**
     * Неверно указан контрагент: Идентификатор контрагента не распознан/отсутствует/ или Неверно указаны реквизиты контрагента/ или неверно указан тип счета контрагента/ или в реестре не содержится информация о контрагенте, указанном в поручении/ или в реестре не содержится информация о лице, передающем ценные бумаги, в отношении которых предоставлено распоряжение о внесении записей в реестр
     * 
     */
    ICAG,

    /**
     * несовпадение направление сделки
     * 
     */
    DELN,

    /**
     * иная причина: заполняется поле reason_narrative
     * 
     */
    NARR;

    public String value() {
        return name();
    }

    public static UnmatchedReasonEt fromValue(String v) {
        return valueOf(v);
    }

}
