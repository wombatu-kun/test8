
package wombatukun.tests.test8.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * характеристики организации
 * 
 * <p>Java class for organisation_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisation_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisation_name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}text_t">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="organisation_short_name" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="organisation_other_name" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="entity_reg_dtls" type="{}entity_reg_dtls_t" maxOccurs="unbounded"/>
 *         &lt;element name="legal_address" type="{}address_t"/>
 *         &lt;element name="post_address" type="{}address_t"/>
 *         &lt;element name="registration_country" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="inn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}text_t">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iin" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="ssn" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="kpp" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="okpo" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="okved" type="{}text_t" minOccurs="0"/>
 *         &lt;element name="manager" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="manager_type" type="{}text_t" minOccurs="0"/>
 *                   &lt;element name="FIO" type="{}text_t"/>
 *                   &lt;element name="individual_document" type="{}individual_document_t" minOccurs="0"/>
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
@XmlType(name = "organisation_t", propOrder = {
    "organisationName",
    "organisationShortName",
    "organisationOtherName",
    "entityRegDtls",
    "legalAddress",
    "postAddress",
    "registrationCountry",
    "inn",
    "iin",
    "ssn",
    "kpp",
    "okpo",
    "okved",
    "manager"
})
public class OrganisationT {

    @XmlElement(name = "organisation_name", required = true)
    protected String organisationName;
    @XmlElementRef(name = "organisation_short_name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisationShortName;
    @XmlElementRef(name = "organisation_other_name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisationOtherName;
    @XmlElement(name = "entity_reg_dtls", required = true)
    protected List<EntityRegDtlsT> entityRegDtls;
    @XmlElement(name = "legal_address", required = true, nillable = true)
    protected AddressT legalAddress;
    @XmlElement(name = "post_address", required = true, nillable = true)
    protected AddressT postAddress;
    @XmlElement(name = "registration_country")
    protected String registrationCountry;
    protected String inn;
    protected String iin;
    protected String ssn;
    protected String kpp;
    protected String okpo;
    protected String okved;
    @XmlElementRef(name = "manager", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationT.Manager> manager;

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the organisationShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationShortName() {
        return organisationShortName;
    }

    /**
     * Sets the value of the organisationShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationShortName(JAXBElement<String> value) {
        this.organisationShortName = value;
    }

    /**
     * Gets the value of the organisationOtherName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationOtherName() {
        return organisationOtherName;
    }

    /**
     * Sets the value of the organisationOtherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationOtherName(JAXBElement<String> value) {
        this.organisationOtherName = value;
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
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressT }
     *     
     */
    public AddressT getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressT }
     *     
     */
    public void setLegalAddress(AddressT value) {
        this.legalAddress = value;
    }

    /**
     * Gets the value of the postAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressT }
     *     
     */
    public AddressT getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressT }
     *     
     */
    public void setPostAddress(AddressT value) {
        this.postAddress = value;
    }

    /**
     * Gets the value of the registrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /**
     * Sets the value of the registrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationCountry(String value) {
        this.registrationCountry = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the iin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIin() {
        return iin;
    }

    /**
     * Sets the value of the iin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIin(String value) {
        this.iin = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkpo() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkpo(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkved(String value) {
        this.okved = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationT.Manager }{@code >}
     *     
     */
    public JAXBElement<OrganisationT.Manager> getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationT.Manager }{@code >}
     *     
     */
    public void setManager(JAXBElement<OrganisationT.Manager> value) {
        this.manager = value;
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
     *         &lt;element name="manager_type" type="{}text_t" minOccurs="0"/>
     *         &lt;element name="FIO" type="{}text_t"/>
     *         &lt;element name="individual_document" type="{}individual_document_t" minOccurs="0"/>
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
        "managerType",
        "fio",
        "individualDocument"
    })
    public static class Manager {

        @XmlElementRef(name = "manager_type", type = JAXBElement.class, required = false)
        protected JAXBElement<String> managerType;
        @XmlElement(name = "FIO", required = true)
        protected String fio;
        @XmlElement(name = "individual_document")
        protected IndividualDocumentT individualDocument;

        /**
         * Gets the value of the managerType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getManagerType() {
            return managerType;
        }

        /**
         * Sets the value of the managerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setManagerType(JAXBElement<String> value) {
            this.managerType = value;
        }

        /**
         * Gets the value of the fio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIO() {
            return fio;
        }

        /**
         * Sets the value of the fio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIO(String value) {
            this.fio = value;
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

}
