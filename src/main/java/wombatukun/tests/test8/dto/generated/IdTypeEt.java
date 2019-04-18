
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="id_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="OGRN"/>
 *     &lt;enumeration value="RINN"/>
 *     &lt;enumeration value="RBIC"/>
 *     &lt;enumeration value="SBIC"/>
 *     &lt;enumeration value="RKPP"/>
 *     &lt;enumeration value="CCPT"/>
 *     &lt;enumeration value="STIC"/>
 *     &lt;enumeration value="INCR"/>
 *     &lt;enumeration value="REGN"/>
 *     &lt;enumeration value="BIRT"/>
 *     &lt;enumeration value="FCCP"/>
 *     &lt;enumeration value="LICS"/>
 *     &lt;enumeration value="USTV"/>
 *     &lt;enumeration value="TMRL"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="MMRL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "id_type_et")
@XmlEnum
public enum IdTypeEt {


    /**
     * ОГРН
     * 
     */
    OGRN,

    /**
     * ИНН
     * 
     */
    RINN,

    /**
     * БИК
     * 
     */
    RBIC,

    /**
     * SWIFT BIC
     * 
     */
    SBIC,

    /**
     * код причины постановки на учет (КПП), присваиваемый ГНИ
     * 
     */
    RKPP,

    /**
     * Паспорт гражданина РФ, действующий на территории РФ с 1 октября 1997 года
     * 
     */
    CCPT,

    /**
     * Свидетельство о регистрации до 1 июля 2002г.
     * 
     */
    STIC,

    /**
     * Сертификат об инкорпорации
     * 
     */
    INCR,

    /**
     * Свидетельство о регистрации и внесении записи в ЕГРЮЛ после 1 июля 2002г.
     * 
     */
    REGN,

    /**
     * Свидетельство о рождении (01.10.97 г. – 14-летнего) возраста 
     * 
     */
    BIRT,

    /**
     * Заграничный паспорт для постоянно проживающих за границей граждан, которые временно находятся на территории Российской Федерации
     * 
     */
    FCCP,

    /**
     * лицензия
     * 
     */
    LICS,

    /**
     * устав
     * 
     */
    USTV,

    /**
     * правила доверительного управления ПИФ
     * 
     */
    TMRL,

    /**
     * иной тип документа
     * 
     */
    OTHR,

    /**
     * правила доверительного управления ипотечным покрытием
     * 
     */
    MMRL;

    public String value() {
        return name();
    }

    public static IdTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
