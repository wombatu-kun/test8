package wombatukun.tests.test8.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="tblaccount")
public class Account {

  @EmbeddedId
  private AccountPKey id;
  private Long accountId;
  private String accNd;
  private long version;
  private String accKind;
  private String persType;
  private String name;
  private String shortName;
  private String inn;
  private String citizen;
  private String ogrnCode;
  private Date ogrnDate;
  private String ogrnPlace;
  private String orgDoc;
  private String persDoc;
  private Date birthDate;
  private Date regDate;
  private String regSerial;
  private String regNum;
  private String regPlace;
  private String anSign1;
  private String anSign2;
  private String anSign3;
  private String anMarked;
  private String anMarkComm;
  private String anVip;
  private String anVipComm;
  private String postCountryCode;
  private String postIndex;
  private String postAddress;
  private String legalCountryCode;
  private String legalIndex;
  private String legalAddress;
  private BigDecimal ordValue;
  @Column(name = "ord_n")
  private Long ordN;
  @Column(name = "ord_d")
  private Long ordD;
  private BigDecimal privValue;
  @Column(name = "priv_n")
  private Long privN;
  @Column(name = "priv_d")
  private Long privD;
  private BigDecimal allValue;
  @Column(name = "all_n")
  private Long allN;
  @Column(name = "all_d")
  private Long allD;
  private String rightGold;
  private String isTmp;
  private String isExternal;
  private Integer status;
  private String addressee;
  private String regUsrId;
  private String voiteUsrId;
  private Timestamp accTime;
  private Timestamp regTime;
  private Timestamp voiteTime;
  private String email;
  private String leiId;
  private BigDecimal doValue;
  @Column(name = "do_n")
  private Long doN;
  @Column(name = "do_d")
  private Long doD;
  private BigDecimal dpValue;
  @Column(name = "dp_n")
  private Long dpN;
  @Column(name = "dp_d")
  private Long dpD;
  private BigDecimal daValue;
  @Column(name = "da_n")
  private Long daN;
  @Column(name = "da_d")
  private Long daD;
  private String exportId;
  private String impId;
  private String searchName;
  private Integer voiteVersion;
  private String searchInn;
  private String searchDoc;
  private String searchOgrn;
  private String searchSnils;
  private String accOwner;
  private String shpi;
  private Integer shpiStatus;

  public AccountPKey getId() { return id; }

  public void setId(AccountPKey id) { this.id = id; }

  public Long getAccountId() {
	return accountId;
  }

  public void setAccountId(Long accountId) {
	this.accountId = accountId;
  }


  public String getAccNd() {
	return accNd;
  }

  public void setAccNd(String accNd) {
	this.accNd = accNd;
  }


  public long getVersion() {
	return version;
  }

  public void setVersion(long version) {
	this.version = version;
  }


  public String getAccKind() {
	return accKind;
  }

  public void setAccKind(String accKind) {
	this.accKind = accKind;
  }


  public String getPersType() {
	return persType;
  }

  public void setPersType(String persType) {
	this.persType = persType;
  }


  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }


  public String getShortName() {
	return shortName;
  }

  public void setShortName(String shortName) {
	this.shortName = shortName;
  }


  public String getInn() {
	return inn;
  }

  public void setInn(String inn) {
	this.inn = inn;
  }


  public String getCitizen() {
	return citizen;
  }

  public void setCitizen(String citizen) {
	this.citizen = citizen;
  }


  public String getOgrnCode() {
	return ogrnCode;
  }

  public void setOgrnCode(String ogrnCode) {
	this.ogrnCode = ogrnCode;
  }


  public Date getOgrnDate() {
	return ogrnDate;
  }

  public void setOgrnDate(Date ogrnDate) {
	this.ogrnDate = ogrnDate;
  }


  public String getOgrnPlace() {
	return ogrnPlace;
  }

  public void setOgrnPlace(String ogrnPlace) {
	this.ogrnPlace = ogrnPlace;
  }


  public String getOrgDoc() {
	return orgDoc;
  }

  public void setOrgDoc(String orgDoc) {
	this.orgDoc = orgDoc;
  }


  public String getPersDoc() {
	return persDoc;
  }

  public void setPersDoc(String persDoc) {
	this.persDoc = persDoc;
  }


  public Date getBirthDate() {
	return birthDate;
  }

  public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
  }


  public Date getRegDate() {
	return regDate;
  }

  public void setRegDate(Date regDate) {
	this.regDate = regDate;
  }


  public String getRegSerial() {
	return regSerial;
  }

  public void setRegSerial(String regSerial) {
	this.regSerial = regSerial;
  }


  public String getRegNum() {
	return regNum;
  }

  public void setRegNum(String regNum) {
	this.regNum = regNum;
  }


  public String getRegPlace() {
	return regPlace;
  }

  public void setRegPlace(String regPlace) {
	this.regPlace = regPlace;
  }


  public String getAnSign1() {
	return anSign1;
  }

  public void setAnSign1(String anSign1) {
	this.anSign1 = anSign1;
  }


  public String getAnSign2() {
	return anSign2;
  }

  public void setAnSign2(String anSign2) {
	this.anSign2 = anSign2;
  }


  public String getAnSign3() {
	return anSign3;
  }

  public void setAnSign3(String anSign3) {
	this.anSign3 = anSign3;
  }


  public String getAnMarked() {
	return anMarked;
  }

  public void setAnMarked(String anMarked) {
	this.anMarked = anMarked;
  }


  public String getAnMarkComm() {
	return anMarkComm;
  }

  public void setAnMarkComm(String anMarkComm) {
	this.anMarkComm = anMarkComm;
  }


  public String getAnVip() {
	return anVip;
  }

  public void setAnVip(String anVip) {
	this.anVip = anVip;
  }


  public String getAnVipComm() {
	return anVipComm;
  }

  public void setAnVipComm(String anVipComm) {
	this.anVipComm = anVipComm;
  }


  public String getPostCountryCode() {
	return postCountryCode;
  }

  public void setPostCountryCode(String postCountryCode) {
	this.postCountryCode = postCountryCode;
  }


  public String getPostIndex() {
	return postIndex;
  }

  public void setPostIndex(String postIndex) {
	this.postIndex = postIndex;
  }


  public String getPostAddress() {
	return postAddress;
  }

  public void setPostAddress(String postAddress) {
	this.postAddress = postAddress;
  }


  public String getLegalCountryCode() {
	return legalCountryCode;
  }

  public void setLegalCountryCode(String legalCountryCode) {
	this.legalCountryCode = legalCountryCode;
  }


  public String getLegalIndex() {
	return legalIndex;
  }

  public void setLegalIndex(String legalIndex) {
	this.legalIndex = legalIndex;
  }


  public String getLegalAddress() {
	return legalAddress;
  }

  public void setLegalAddress(String legalAddress) {
	this.legalAddress = legalAddress;
  }


  public BigDecimal getOrdValue() {
	return ordValue;
  }

  public void setOrdValue(BigDecimal ordValue) {
	this.ordValue = ordValue;
  }


  public Long getOrdN() {
	return ordN;
  }

  public void setOrdN(Long ordN) {
	this.ordN = ordN;
  }


  public Long getOrdD() {
	return ordD;
  }

  public void setOrdD(Long ordD) {
	this.ordD = ordD;
  }


  public BigDecimal getPrivValue() {
	return privValue;
  }

  public void setPrivValue(BigDecimal privValue) {
	this.privValue = privValue;
  }


  public Long getPrivN() {
	return privN;
  }

  public void setPrivN(Long privN) {
	this.privN = privN;
  }


  public Long getPrivD() {
	return privD;
  }

  public void setPrivD(Long privD) {
	this.privD = privD;
  }


  public BigDecimal getAllValue() {
	return allValue;
  }

  public void setAllValue(BigDecimal allValue) {
	this.allValue = allValue;
  }


  public Long getAllN() {
	return allN;
  }

  public void setAllN(Long allN) {
	this.allN = allN;
  }


  public Long getAllD() {
	return allD;
  }

  public void setAllD(Long allD) {
	this.allD = allD;
  }


  public String getRightGold() {
	return rightGold;
  }

  public void setRightGold(String rightGold) {
	this.rightGold = rightGold;
  }


  public String getIsTmp() {
	return isTmp;
  }

  public void setIsTmp(String isTmp) {
	this.isTmp = isTmp;
  }


  public String getIsExternal() {
	return isExternal;
  }

  public void setIsExternal(String isExternal) {
	this.isExternal = isExternal;
  }


  public Integer getStatus() {
	return status;
  }

  public void setStatus(Integer status) {
	this.status = status;
  }


  public String getAddressee() {
	return addressee;
  }

  public void setAddressee(String addressee) {
	this.addressee = addressee;
  }


  public String getRegUsrId() {
	return regUsrId;
  }

  public void setRegUsrId(String regUsrId) {
	this.regUsrId = regUsrId;
  }


  public String getVoiteUsrId() {
	return voiteUsrId;
  }

  public void setVoiteUsrId(String voiteUsrId) {
	this.voiteUsrId = voiteUsrId;
  }


  public Timestamp getAccTime() {
	return accTime;
  }

  public void setAccTime(Timestamp accTime) {
	this.accTime = accTime;
  }


  public Timestamp getRegTime() {
	return regTime;
  }

  public void setRegTime(Timestamp regTime) {
	this.regTime = regTime;
  }


  public Timestamp getVoiteTime() {
	return voiteTime;
  }

  public void setVoiteTime(Timestamp voiteTime) {
	this.voiteTime = voiteTime;
  }


  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }


  public String getLeiId() {
	return leiId;
  }

  public void setLeiId(String leiId) {
	this.leiId = leiId;
  }


  public BigDecimal getDoValue() {
	return doValue;
  }

  public void setDoValue(BigDecimal doValue) {
	this.doValue = doValue;
  }


  public Long getDoN() {
	return doN;
  }

  public void setDoN(Long doN) {
	this.doN = doN;
  }


  public Long getDoD() {
	return doD;
  }

  public void setDoD(Long doD) {
	this.doD = doD;
  }


  public BigDecimal getDpValue() {
	return dpValue;
  }

  public void setDpValue(BigDecimal dpValue) {
	this.dpValue = dpValue;
  }


  public Long getDpN() {
	return dpN;
  }

  public void setDpN(Long dpN) {
	this.dpN = dpN;
  }


  public Long getDpD() {
	return dpD;
  }

  public void setDpD(Long dpD) {
	this.dpD = dpD;
  }


  public BigDecimal getDaValue() {
	return daValue;
  }

  public void setDaValue(BigDecimal daValue) {
	this.daValue = daValue;
  }


  public Long getDaN() {
	return daN;
  }

  public void setDaN(Long daN) {
	this.daN = daN;
  }


  public Long getDaD() {
	return daD;
  }

  public void setDaD(Long daD) {
	this.daD = daD;
  }


  public String getExportId() {
	return exportId;
  }

  public void setExportId(String exportId) {
	this.exportId = exportId;
  }


  public String getImpId() {
	return impId;
  }

  public void setImpId(String impId) {
	this.impId = impId;
  }


  public String getSearchName() {
	return searchName;
  }

  public void setSearchName(String searchName) {
	this.searchName = searchName;
  }


  public Integer getVoiteVersion() {
	return voiteVersion;
  }

  public void setVoiteVersion(Integer voiteVersion) {
	this.voiteVersion = voiteVersion;
  }


  public String getSearchInn() {
	return searchInn;
  }

  public void setSearchInn(String searchInn) {
	this.searchInn = searchInn;
  }


  public String getSearchDoc() {
	return searchDoc;
  }

  public void setSearchDoc(String searchDoc) {
	this.searchDoc = searchDoc;
  }


  public String getSearchOgrn() {
	return searchOgrn;
  }

  public void setSearchOgrn(String searchOgrn) {
	this.searchOgrn = searchOgrn;
  }


  public String getSearchSnils() {
	return searchSnils;
  }

  public void setSearchSnils(String searchSnils) {
	this.searchSnils = searchSnils;
  }


  public String getAccOwner() {
	return accOwner;
  }

  public void setAccOwner(String accOwner) {
	this.accOwner = accOwner;
  }


  public String getShpi() {
	return shpi;
  }

  public void setShpi(String shpi) {
	this.shpi = shpi;
  }


  public Integer getShpiStatus() {
	return shpiStatus;
  }

  public void setShpiStatus(Integer shpiStatus) {
	this.shpiStatus = shpiStatus;
  }

}
