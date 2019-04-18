
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * общие элементы для всех ответных документов/ сообщений, т.е. документов, которые являются ответом на чей-либо запрос. 
 * 
 * <p>Java class for answer_doc_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answer_doc_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{}text_t"/>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="doc_num" type="{}text_t"/>
 *                   &lt;element name="doc_date" type="{}date_or_datetime_t"/>
 *                   &lt;element name="link" type="{}doc_link_t"/>
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
@XmlType(name = "answer_doc_t", propOrder = {
    "version",
    "header"
})
@XmlSeeAlso({
    GLOBALOPERATIONSTATUSADVICE.class,
    STATUSPROCESSINGADVICE.class,
    REPORTOFUNCONFIRMEDGLOBALOPERATION.class,
    REGISTEROFSHAREHOLDERSLIST.class,
    SETTLEMENTTRANSACTIONSTATUSADVICEMIF.class,
    SETTLEMENTTRANSACTIONSTATUSADVICE.class,
    REPORTOFUNCONFIRMEDTRANSACTIONMIF.class,
    LISTOFSECURITY.class,
    STATEMENTOFDAILYRECONCILIATION.class,
    OPERATIONSTATUSCONFIRMATION.class,
    STATEMENTOFTRANSACTIONSV02 .class,
    ACCOUNTDETAILSCONFIRMATION.class,
    STATUSPROCESSINGSETTLEMENTADVICE.class,
    STATEMENTOFCONFIRMEDTRANSACTION.class,
    STATEMENTOFREJECTEDTRANSACTION.class,
    STATEMENTOFHOLDINGS.class,
    REPORTOFUNCONFIRMEDTRANSACTION.class,
    STATEMENTOFTRANSACTIONS.class,
    STATEMENTOFCONFIRMEDTRANSACTIONV02 .class,
    REGISTEROFSHAREHOLDERSHEADER.class,
    MESSAGESTATUSADVICE.class,
    REPORTOFUNCONFIRMEDSTATUSCHANGE.class,
    REGISTEROFSHAREHOLDERS.class,
    STATEMENTOFREJECTEDTRANSACTIONV02 .class
})
public class AnswerDocT {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected AnswerDocT.Header header;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerDocT.Header }
     *     
     */
    public AnswerDocT.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerDocT.Header }
     *     
     */
    public void setHeader(AnswerDocT.Header value) {
        this.header = value;
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
     *         &lt;element name="doc_num" type="{}text_t"/>
     *         &lt;element name="doc_date" type="{}date_or_datetime_t"/>
     *         &lt;element name="link" type="{}doc_link_t"/>
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
        "docNum",
        "docDate",
        "link"
    })
    public static class Header {

        @XmlElement(name = "doc_num", required = true)
        protected String docNum;
        @XmlElement(name = "doc_date", required = true)
        protected DateOrDatetimeT docDate;
        @XmlElement(required = true)
        protected DocLinkT link;

        /**
         * Gets the value of the docNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNum() {
            return docNum;
        }

        /**
         * Sets the value of the docNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNum(String value) {
            this.docNum = value;
        }

        /**
         * Gets the value of the docDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public DateOrDatetimeT getDocDate() {
            return docDate;
        }

        /**
         * Sets the value of the docDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateOrDatetimeT }
         *     
         */
        public void setDocDate(DateOrDatetimeT value) {
            this.docDate = value;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link DocLinkT }
         *     
         */
        public DocLinkT getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocLinkT }
         *     
         */
        public void setLink(DocLinkT value) {
            this.link = value;
        }

    }

}
