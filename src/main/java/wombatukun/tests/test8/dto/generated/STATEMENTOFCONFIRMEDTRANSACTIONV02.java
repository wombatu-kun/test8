
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}answer_doc_t">
 *       &lt;sequence>
 *         &lt;element name="registrar" type="{}party_dtls_contacts_t"/>
 *         &lt;element name="issuer_V02" type="{}party_identification2_t" maxOccurs="2"/>
 *         &lt;element name="account_dtls_v02" type="{}account_dtls_v02_t"/>
 *         &lt;element name="account_holder" type="{}party_dtls_t"/>
 *         &lt;element name="transaction_processing" type="{}processing_dtls_v03_t"/>
 *         &lt;element name="add_info" type="{}any_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrar",
    "issuerV02",
    "accountDtlsV02",
    "accountHolder",
    "transactionProcessing",
    "addInfo"
})
@XmlRootElement(name = "STATEMENT_OF_CONFIRMED_TRANSACTION_V02")
public class STATEMENTOFCONFIRMEDTRANSACTIONV02
    extends AnswerDocT
{

    @XmlElement(required = true)
    protected PartyDtlsContactsT registrar;
    @XmlElement(name = "issuer_V02", required = true)
    protected List<PartyIdentification2T> issuerV02;
    @XmlElement(name = "account_dtls_v02", required = true)
    protected AccountDtlsV02T accountDtlsV02;
    @XmlElement(name = "account_holder", required = true)
    protected PartyDtlsT accountHolder;
    @XmlElement(name = "transaction_processing", required = true)
    protected ProcessingDtlsV03T transactionProcessing;
    @XmlElement(name = "add_info")
    protected AnyT addInfo;

    /**
     * Gets the value of the registrar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsContactsT }
     *     
     */
    public PartyDtlsContactsT getRegistrar() {
        return registrar;
    }

    /**
     * Sets the value of the registrar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsContactsT }
     *     
     */
    public void setRegistrar(PartyDtlsContactsT value) {
        this.registrar = value;
    }

    /**
     * Gets the value of the issuerV02 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerV02 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerV02().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2T }
     * 
     * 
     */
    public List<PartyIdentification2T> getIssuerV02() {
        if (issuerV02 == null) {
            issuerV02 = new ArrayList<PartyIdentification2T>();
        }
        return this.issuerV02;
    }

    /**
     * Gets the value of the accountDtlsV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDtlsV02T }
     *     
     */
    public AccountDtlsV02T getAccountDtlsV02() {
        return accountDtlsV02;
    }

    /**
     * Sets the value of the accountDtlsV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDtlsV02T }
     *     
     */
    public void setAccountDtlsV02(AccountDtlsV02T value) {
        this.accountDtlsV02 = value;
    }

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDtlsT }
     *     
     */
    public PartyDtlsT getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDtlsT }
     *     
     */
    public void setAccountHolder(PartyDtlsT value) {
        this.accountHolder = value;
    }

    /**
     * Gets the value of the transactionProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDtlsV03T }
     *     
     */
    public ProcessingDtlsV03T getTransactionProcessing() {
        return transactionProcessing;
    }

    /**
     * Sets the value of the transactionProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDtlsV03T }
     *     
     */
    public void setTransactionProcessing(ProcessingDtlsV03T value) {
        this.transactionProcessing = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnyT }
     *     
     */
    public AnyT getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyT }
     *     
     */
    public void setAddInfo(AnyT value) {
        this.addInfo = value;
    }

}
