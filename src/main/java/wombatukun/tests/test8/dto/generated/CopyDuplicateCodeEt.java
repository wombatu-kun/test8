
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copy_duplicate_code_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="copy_duplicate_code_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="CODU"/>
 *     &lt;enumeration value="COPY"/>
 *     &lt;enumeration value="DUPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "copy_duplicate_code_et")
@XmlEnum
public enum CopyDuplicateCodeEt {


    /**
     * Сообщение направлется как дубликат ранее направленной копии сообщения, исключительно для информационных целей.
     * 
     */
    CODU,

    /**
     * Сообщение направляется как копия ранее направленного сообщения, исключительно для информационных целей.
     * 
     */
    COPY,

    /**
     * Сообщение является как дубликат ранее направленного сообщения.
     * Если оригинала сообщения не поступало, то дубликат должен быть обработан, как будто это пришел оригинал. Если оригинал ранее был обработан, то дубликат используется исключительно для информационных целей.
     * 
     */
    DUPL;

    public String value() {
        return name();
    }

    public static CopyDuplicateCodeEt fromValue(String v) {
        return valueOf(v);
    }

}
