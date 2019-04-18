
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entity_reg_doc_type_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entity_reg_doc_type_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="LICS"/>
 *     &lt;enumeration value="STIC"/>
 *     &lt;enumeration value="REGN"/>
 *     &lt;enumeration value="OGRN"/>
 *     &lt;enumeration value="INCR"/>
 *     &lt;enumeration value="USTV"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entity_reg_doc_type_et")
@XmlEnum
public enum EntityRegDocTypeEt {


    /**
     * лицензия
     * 
     */
    LICS,

    /**
     * свидетельство о регистрации до 1 июля 2002г.
     * 
     */
    STIC,

    /**
     * свидетельство о регистрации и внесении записи в ЕГРЮЛ после 1 июля 2002г.
     * 
     */
    REGN,

    /**
     * свидетельство о внесении записи в ЕГРЮЛ
     * 
     */
    OGRN,

    /**
     * сертификат об инкорпорации
     * 
     */
    INCR,

    /**
     * устав
     * 
     */
    USTV,

    /**
     * другое
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static EntityRegDocTypeEt fromValue(String v) {
        return valueOf(v);
    }

}
