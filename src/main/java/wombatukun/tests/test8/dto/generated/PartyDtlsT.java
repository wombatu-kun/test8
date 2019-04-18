
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * характеристики стороны 
 * 
 * <p>Java class for party_dtls_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party_dtls_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{}id_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{}text_t"/>
 *         &lt;element name="short_name" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="ogrn" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="address" type="{}address_t" minOccurs="0"/>
 *         &lt;element name="individual_or_entity" type="{}individual_or_entity_et"/>
 *         &lt;choice>
 *           &lt;element name="entity_reg_dtls" type="{}entity_reg_dtls_t" maxOccurs="unbounded"/>
 *           &lt;element name="individual_document" type="{}individual_document_t"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party_dtls_t", propOrder = {
    "id",
    "name",
    "shortName",
    "ogrn",
    "address",
    "individualOrEntity",
    "entityRegDtls",
    "individualDocument"
})
public class PartyDtlsT {

    protected List<IdT> id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "short_name")
    protected String shortName;
    protected String ogrn;
    protected AddressT address;
    @XmlElement(name = "individual_or_entity", required = true)
    @XmlSchemaType(name = "string")
    protected IndividualOrEntityEt individualOrEntity;
    @XmlElement(name = "entity_reg_dtls")
    protected List<EntityRegDtlsT> entityRegDtls;
    @XmlElement(name = "individual_document")
    protected IndividualDocumentT individualDocument;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdT }
     * 
     * 
     */
    public List<IdT> getId() {
        if (id == null) {
            id = new ArrayList<IdT>();
        }
        return this.id;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressT }
     *     
     */
    public AddressT getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressT }
     *     
     */
    public void setAddress(AddressT value) {
        this.address = value;
    }

    /**
     * Gets the value of the individualOrEntity property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOrEntityEt }
     *     
     */
    public IndividualOrEntityEt getIndividualOrEntity() {
        return individualOrEntity;
    }

    /**
     * Sets the value of the individualOrEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOrEntityEt }
     *     
     */
    public void setIndividualOrEntity(IndividualOrEntityEt value) {
        this.individualOrEntity = value;
    }

    /**
     * Gets the value of the entityRegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityRegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityRegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityRegDtlsT }
     * 
     * 
     */
    public List<EntityRegDtlsT> getEntityRegDtls() {
        if (entityRegDtls == null) {
            entityRegDtls = new ArrayList<EntityRegDtlsT>();
        }
        return this.entityRegDtls;
    }

    /**
     * Gets the value of the individualDocument property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualDocumentT }
     *     
     */
    public IndividualDocumentT getIndividualDocument() {
        return individualDocument;
    }

    /**
     * Sets the value of the individualDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualDocumentT }
     *     
     */
    public void setIndividualDocument(IndividualDocumentT value) {
        this.individualDocument = value;
    }

}
