
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheme_name_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scheme_name_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="EOCC"/>
 *     &lt;enumeration value="CEDE"/>
 *     &lt;enumeration value="RUIC"/>
 *     &lt;enumeration value="SMPG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scheme_name_et")
@XmlEnum
public enum SchemeNameEt {


    /**
     * для указания на использование кодировки Euroclear Bank, Brussels (при идентификации номера счета или стороны)
     * 
     */
    EOCC,

    /**
     * для указания на использование кодировки Clearstream Banking, Luxembourg (при идентификации номера счета или стороны)
     * 
     */
    CEDE,

    /**
     * для указания на код БИК, присваиваемый Центральным Банком Российской Федерации кредитным организациям (при идентификации стороны)
     * 
     */
    RUIC,

    /**
     * для указания на использование международной кодировки стандарта ISO20022 (SMPG –Security Market Practice Group)
     * 
     */
    SMPG;

    public String value() {
        return name();
    }

    public static SchemeNameEt fromValue(String v) {
        return valueOf(v);
    }

}
