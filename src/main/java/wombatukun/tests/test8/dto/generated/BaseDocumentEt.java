
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for base_document_et.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="base_document_et">
 *   &lt;restriction base="{}text_t">
 *     &lt;enumeration value="INST"/>
 *     &lt;enumeration value="RQST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "base_document_et")
@XmlEnum
public enum BaseDocumentEt {


    /**
     * передаточное распоряжение
     * 
     */
    INST,

    /**
     * распоряжение на предоставление информации /запрос
     * 
     */
    RQST;

    public String value() {
        return name();
    }

    public static BaseDocumentEt fromValue(String v) {
        return valueOf(v);
    }

}
