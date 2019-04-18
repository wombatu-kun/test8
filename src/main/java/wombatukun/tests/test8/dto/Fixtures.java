package wombatukun.tests.test8.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import wombatukun.tests.test8.dto.generated.AnswerDocT.Header;
import wombatukun.tests.test8.dto.generated.*;
import wombatukun.tests.test8.utils.DateUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "application.fixtures")
public class Fixtures {
    private final String ISSUER_OGRN = "OGRN";
    private final String ISSUER_FCSM = "FCSM";

    private String meetingId;
    private String version;
    private String headerDocNum;
    private Map<String, Integer> headerDocDate;
    private String headerOutDocNum;
    private String headerInDocNum;
    private String issuerName;
    private String issuerFcsmId;
    private String issuerOgrnId;
    private String corporateActionCode;
    private Map<String, Integer> recordDate;
    private String messageFunction;
    private String informationTypeCode;
    private String securityClassification;
    private String ordStateRegNum;
    private String privStateRegNum;

    public String getVersion() { return version; }

    public Header getHeader() {
        Header header = new Header();
        header.setDocNum(headerDocNum);
        DateOrDatetimeT docDate = new DateOrDatetimeT();
        docDate.setDate(DateUtils.mapDate(headerDocDate));
        header.setDocDate(docDate);
        DocLinkT docLink = new DocLinkT();
        docLink.setOutDocNum(headerOutDocNum);
        docLink.setInDocNum(headerInDocNum);
        header.setLink(docLink);
        return header;
    }

    public PartyIdNameT getIssuer() {
        PartyIdNameT issuer = new PartyIdNameT();
        issuer.setName(issuerName);
        IdT issuerId = new IdT();
        issuerId.setIssuer(ISSUER_FCSM);
        issuerId.setId(issuerFcsmId);
        issuer.getId().add(issuerId);
        issuerId = new IdT();
        issuerId.setIssuer(ISSUER_OGRN);
        issuerId.setId(issuerOgrnId);
        issuer.getId().add(issuerId);
        return issuer;
    }

    public CorporateActionEventEt getCorporateActionCode() { return CorporateActionEventEt.fromValue(corporateActionCode); }

    public XMLGregorianCalendar getRecordDate() { return DateUtils.mapDate(recordDate); }

    public MessageFunctionEt getMessageFunction() { return MessageFunctionEt.fromValue(messageFunction); }

    public InformationTypeT getInformationIndicator() {
        InformationTypeT indicator = new InformationTypeT();
        indicator.setInformationTypeCode(InformationIndicatorEt.fromValue(informationTypeCode));
        return indicator;
    }

    public String getSecurityClassification() { return securityClassification; }

    public String getOrdStateRegNum() { return ordStateRegNum; }

    public String getPrivStateRegNum() { return privStateRegNum; }

    public String getMeetingId() { return meetingId; }

    public void setMeetingId(String meetingId) { this.meetingId = meetingId; }

    public void setVersion(String version) { this.version = version; }

    public void setHeaderDocNum(String headerDocNum) { this.headerDocNum = headerDocNum; }

    public void setHeaderDocDate(Map<String, Integer> headerDocDate) { this.headerDocDate = headerDocDate; }

    public void setHeaderOutDocNum(String headerOutDocNum) { this.headerOutDocNum = headerOutDocNum; }

    public void setHeaderInDocNum(String headerInDocNum) { this.headerInDocNum = headerInDocNum; }

    public void setIssuerName(String issuerName) { this.issuerName = issuerName; }

    public void setIssuerFcsmId(String issuerFcsmId) { this.issuerFcsmId = issuerFcsmId; }

    public void setIssuerOgrnId(String issuerOgrnId) { this.issuerOgrnId = issuerOgrnId; }

    public void setCorporateActionCode(String corporateActionCode) { this.corporateActionCode = corporateActionCode; }

    public void setRecordDate(Map<String, Integer> recordDate) { this.recordDate = recordDate; }

    public void setMessageFunction(String messageFunction) { this.messageFunction = messageFunction; }

    public void setInformationTypeCode(String informationTypeCode) { this.informationTypeCode = informationTypeCode; }

    public void setSecurityClassification(String securityClassification) { this.securityClassification = securityClassification; }

    public void setOrdStateRegNum(String ordStateRegNum) { this.ordStateRegNum = ordStateRegNum; }

    public void setPrivStateRegNum(String privStateRegNum) { this.privStateRegNum = privStateRegNum; }

}
