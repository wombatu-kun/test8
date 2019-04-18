
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processing_rejected_reason_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="processing_rejected_reason_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="BLOC"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="DEPT"/>
 *     &lt;enumeration value="DISA"/>
 *     &lt;enumeration value="DMON"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="NARR"/>
 *     &lt;enumeration value="NCRR"/>
 *     &lt;enumeration value="REFU"/>
 *     &lt;enumeration value="SAFE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "processing_rejected_reason_et")
@XmlEnum
public enum ProcessingRejectedReasonEt {


    /**
     * счет заблокирован: операции по счету зарегистрированного лица, в отношении которого предоставлено распоряжение о списании ценных бумаг, блокированы
     * 
     */
    BLOC,

    /**
     * Ценные бумаги не могут быть поставлены поскольку они были заложены в качестве обеспечения. 
     * 
     */
    COLL,

    /**
     * Отклонено из-за места: Не распознан эмитент/ лицевой счет НД/ лицевой счет НДЦД/ Неверное место расчета
     * 
     */
    DEPT,

    /**
     * форс-мажор; стихийное бедствие
     * 
     */
    DISA,

    /**
     * Расчетная сумма отсутствует/ Не указана сумма сделки
     * 
     */
    DMON,

    /**
     * Непонятное или недопустимое количество финансового инструмента, подлежащее расчетам: Количество ценных бумаг в поручении не соответствует количеству ценных бумаг, учитываемых на счете/ Количество ценных бумаг, указанных в распоряжении или ином документе, являющимся основанием для внесения записей в реестр, превышает количество ценных бумаг, учитываемых на лицевом счете зарегистрированного лица.
     * 
     */
    DQUA,

    /**
     * Отклонено из-за определения ценных бумаг: Непонятное или недопустимое определение финансового инструмента.\Идентификатор ценной бумаги не распознан/отсутствует/  Указанные ценные бумаги отсутствуют на счете, указанном в распоряжении/ В реестре не содержится информация о ценных бумагах, в отношении которых предоставлено распоряжение о внесении записей в реестр
     * 
     */
    DSEC,

    /**
     * Неверно указан контрагент: Идентификатор контрагента не распознан/отсутствует/ или Неверно указаны реквизиты контрагента/ или неверно указан тип счета контрагента/ или в реестре не содержится информация о контрагенте, указанном в поручении/ или в реестре не содержится информация о лице, передающем ценные бумаги, в отношении которых предоставлено распоряжение о внесении записей в реестр
     * 
     */
    ICAG,

    /**
     * иная причина: заполняется поле reason_narrative
     * 
     */
    NARR,

    /**
     * Отклонено из-за валюты расчетов: Код валюты отличен от RUB/ USD/ EUR/ Или Не указана сумма сделки/ Не согласен с валютой расчетной суммы.
     * 
     */
    NCRR,

    /**
     * документ не опознан
     * 
     */
    REFU,

    /**
     * Счет отправителя указан неверно/ отсутствует или в реестре не содержится информация о лице, направившем поручение/ или предоставленные документы не содержат всей необходимой информации либо содержат информацию, не соответствующую имеющейся в документах, предоставленных ранее  регистратору/депозитарию/ Несовпадение счета депо
     * 
     */
    SAFE;

    public String value() {
        return name();
    }

    public static ProcessingRejectedReasonEt fromValue(String v) {
        return valueOf(v);
    }

}