
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for corporate_action_event_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="corporate_action_event_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="BIDS"/>
 *     &lt;enumeration value="BONU"/>
 *     &lt;enumeration value="BPUT"/>
 *     &lt;enumeration value="CONV"/>
 *     &lt;enumeration value="DECR"/>
 *     &lt;enumeration value="DRAW"/>
 *     &lt;enumeration value="DVCA"/>
 *     &lt;enumeration value="INCR"/>
 *     &lt;enumeration value="EXOF"/>
 *     &lt;enumeration value="INTR"/>
 *     &lt;enumeration value="MCAL"/>
 *     &lt;enumeration value="MEET"/>
 *     &lt;enumeration value="REDM"/>
 *     &lt;enumeration value="SPLF"/>
 *     &lt;enumeration value="SPLR"/>
 *     &lt;enumeration value="XMET"/>
 *     &lt;enumeration value="PRII"/>
 *     &lt;enumeration value="MRGR"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="DSCL"/>
 *     &lt;enumeration value="PARI"/>
 *     &lt;enumeration value="WRTH"/>
 *     &lt;enumeration value="TEND"/>
 *     &lt;enumeration value="CONS"/>
 *     &lt;enumeration value="DFLT"/>
 *     &lt;enumeration value="SOFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "corporate_action_event_et")
@XmlEnum
public enum CorporateActionEventEt {


    /**
     * Оферта /предложение Эмитента о выкупе ценных бумаг
     * 
     */
    BIDS,

    /**
     * Размещение дополнительных выпусков акций путем распределения среди акционеров
     * 
     */
    BONU,

    /**
     * Досрочное погашение облигаций по требованию владельца
     * 
     */
    BPUT,

    /**
     * Конвертация конвертируемых ценных бумаг
     * 
     */
    CONV,

    /**
     * Конвертация акций  в акции с меньшей   номинальной стоимостью
     * 
     */
    DECR,

    /**
     * Погашение части номинальной стоимости
     * 
     */
    DRAW,

    /**
     * Выплата дивидендов в виде денежных средств
     * 
     */
    DVCA,

    /**
     * Конвертация   акций в акции с большей номинальной стоимостью   
     * 
     */
    INCR,

    /**
     * Обмен ценных бумаг
     * 
     */
    EXOF,

    /**
     * Выплата купонного дохода
     * 
     */
    INTR,

    /**
     * Досрочное  обязательное погашение облигаций или выкуп привилегированных акций
     * 
     */
    MCAL,

    /**
     * Годовое общее собрание акционеров
     * 
     */
    MEET,

    /**
     * Погашение номинальной стоимости облигаций/ выкуп паев/ выкуп привилегированных акций
     * 
     */
    REDM,

    /**
     * Конвертация при дроблении акций
     * 
     */
    SPLF,

    /**
     * Конвертация при консолидации акций
     * 
     */
    SPLR,

    /**
     * Внеочередное собрание акционеров
     * 
     */
    XMET,

    /**
     * Выплата купонного дохода и погашение номинальной стоимости (в том числе части номинальной  стоимости)
     * 
     */
    PRII,

    /**
     * Конвертация ценных бумаг при слиянии
     * 
     */
    MRGR,

    /**
     * Иное событие
     * 
     */
    OTHR,

    /**
     * Раскрытие информации. Требование к держателям или владельцам раскрыть эмитенту сведения о наименовании, местонахождении и величине остатков по всем выпускам
     * 
     */
    DSCL,

    /**
     * Объединение выпусков ценных бумаг, аннулирование кодов дополнительных выпусков
     * 
     */
    PARI,

    /**
     * Списание обесценившихся ценных бумаг в связи с ликвидацией эмитента. Основанием может являться: выписка из ЕГРЮЛ о прекращении деятельности или ликвидации или выписка из места хранения о списании ценных бумаг ликвидированного эмитента
     * 
     */
    WRTH,

    /**
     * Тендерное предложение о выкупе /обратный выкуп
     * 
     */
    TEND,

    /**
     * Заочное голосование
     * 
     */
    CONS,

    /**
     * Дефолт (невыполнение обязательств по облигациям)
     * 
     */
    DFLT,

    /**
     * Распределение дополнительных акций при выделении компании
     * 
     */
    SOFF;

    public String value() {
        return name();
    }

    public static CorporateActionEventEt fromValue(String v) {
        return valueOf(v);
    }

}
