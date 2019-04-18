
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * информация об обработке документа версия 3
 * 
 * <p>Java class for processing_dtls_v03_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processing_dtls_v03_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doc_link" type="{}doc_link_t"/>
 *         &lt;element name="processing_info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operation_name" type="{}text_t"/>
 *                   &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
 *                   &lt;element name="processing_reference" type="{}text_t"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processing_dtls_v03_t", propOrder = {
    "docLink",
    "processingInfo"
})
public class ProcessingDtlsV03T {

    @XmlElement(name = "doc_link", required = true)
    protected DocLinkT docLink;
    @XmlElement(name = "processing_info", required = true)
    protected ProcessingDtlsV03T.ProcessingInfo processingInfo;

    /**
     * Gets the value of the docLink property.
     * 
     * @return
     *     possible object is
     *     {@link DocLinkT }
     *     
     */
    public DocLinkT getDocLink() {
        return docLink;
    }

    /**
     * Sets the value of the docLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocLinkT }
     *     
     */
    public void setDocLink(DocLinkT value) {
        this.docLink = value;
    }

    /**
     * Gets the value of the processingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDtlsV03T.ProcessingInfo }
     *     
     */
    public ProcessingDtlsV03T.ProcessingInfo getProcessingInfo() {
        return processingInfo;
    }

    /**
     * Sets the value of the processingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDtlsV03T.ProcessingInfo }
     *     
     */
    public void setProcessingInfo(ProcessingDtlsV03T.ProcessingInfo value) {
        this.processingInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="operation_name" type="{}text_t"/>
     *         &lt;element name="processing_datetime" type="{}date_or_datetime_t"/>
     *         &lt;element name="processing_reference" type="{}text_t"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operationName",
        "processingDatetime",
        "processingReference"
    })
    public static class ProcessingInfo {

        @XmlElement(name = "operation_name", required = true)
        protected String operationName;
        @XmlElement(name = "processing_datetime", required = true)
        protected DateOrDatetimeT processingDatetime;
        @XmlElement(name = "processing_reference", required = true)
        protected String processingReference;

        /**
         * Gets the value of the operationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationName() {
            return operationName;
        }

        /**
         * Sets the value of the operationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationName(String value) {
            this.operationName = value;
        }

        /**
         * Gets the value of the processingDatetime property.
         * 
         * @return
         *     possible object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public DateOrDatetimeT getProcessingDatetime() {
            return processingDatetime;
        }

        /**
         * Sets the value of the processingDatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public void setProcessingDatetime(DateOrDatetimeT value) {
            this.processingDatetime = value;
        }

        /**
         * Gets the value of the processingReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessingReference() {
            return processingReference;
        }

        /**
         * Sets the value of the processingReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessingReference(String value) {
            this.processingReference = value;
        }

    }

}
