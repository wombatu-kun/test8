
package wombatukun.tests.test8.dto.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * основание - список договоров
 * 
 * <p>Java class for based_info_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="based_info_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contract_type" type="{}contract_type_t"/>
 *         &lt;element name="doc_num" type="{}text_t"/>
 *         &lt;element name="doc_date" type="{}date_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "based_info_t", propOrder = {
    "contractType",
    "docNum",
    "docDate"
})
public class BasedInfoT {

    @XmlElement(name = "contract_type", required = true)
    protected ContractTypeT contractType;
    @XmlElement(name = "doc_num", required = true)
    protected String docNum;
    @XmlElement(name = "doc_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTypeT }
     *     
     */
    public ContractTypeT getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTypeT }
     *     
     */
    public void setContractType(ContractTypeT value) {
        this.contractType = value;
    }

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

}
