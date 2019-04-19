package wombatukun.tests.test8.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wombatukun.tests.test8.dto.Fixtures;
import wombatukun.tests.test8.dto.generated.*;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList.Shareholder;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList.Shareholder.ShareholderInfo;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList.Shareholder.ShareholderInfo.PostalName;
import wombatukun.tests.test8.model.Account;
import wombatukun.tests.test8.utils.DateUtils;

import java.math.BigDecimal;

@Component
public class AccountMapperImpl implements AccountMapper {

	private Fixtures fixtures;

	@Autowired
	public AccountMapperImpl(Fixtures fixtures) {
		this.fixtures = fixtures;
	}

	@Override
	public Shareholder mapShareholder(Account account) {
		Shareholder shareholder = new Shareholder();
		shareholder.setShareholderId(mapShareholderId(account));
		shareholder.setAccountDtls(mapAccountDtls(account));
		ShareholderInfo shareholderInfo = new ShareholderInfo();
		shareholderInfo.setInn(account.getInn());
		if (account.getBirthDate() != null) shareholderInfo.setBirthday(DateUtils.mapDate(account.getBirthDate()));
		if (account.getCitizen() != null) shareholderInfo.setNationality(mapCountry(account.getCitizen()));
		shareholderInfo.setPostalName(mapPostalName(account));
		shareholderInfo.setShareholderDtls(mapPartyDtls(account));
		shareholder.setShareholderInfo(shareholderInfo);
		shareholder.setShareholderContacts(mapPartyContacts(account.getEmail()));
		shareholder.setTaxCategory(fixtures.getTaxCategory());
		fillSecurityBalance(shareholder, account.getOrdValue(), account.getOrdN(), account.getOrdD(), fixtures.getOrdStateRegNum());
		fillSecurityBalance(shareholder, account.getPrivValue(), account.getPrivN(), account.getPrivD(), fixtures.getPrivStateRegNum());
		return shareholder;
	}

	@Override
	public AccountDtlsT mapAccountDtls(Account account) {
		AccountDtlsT accountDtls = new AccountDtlsT();
		IdT accountId = new IdT();
		if (isAccountND(account)) {
			accountDtls.setAccountType("02");
			accountId.setId(String.valueOf(account.getAccountId()));
		} else {
			accountDtls.setAccountType("01");
			accountId.setId(String.valueOf(account.getAccNd()));
		}
		accountDtls.setAccountId(accountId);
		return accountDtls;
	}

	@Override
	public AddressT mapAccountAddress(String countryCode, String index, String addr) {
		AddressT address = new AddressT();
		AddressPartadT addressPartad = new AddressPartadT();
		addressPartad.setCountry(mapCountry(countryCode));
		addressPartad.setIndex(index);
		addressPartad.setAddress(addr);
		address.setPartad(addressPartad);
		return address;
	}

	@Override
	public PartyDtlsT mapPartyDtls(Account account) {
		PartyDtlsT shareholderDtls = new PartyDtlsT();
		shareholderDtls.setName(account.getName());
		shareholderDtls.setShortName(account.getShortName());
		shareholderDtls.setAddress(mapAccountAddress(account.getLegalCountryCode(), account.getLegalIndex(), account.getLegalAddress()));
		if ("PHIZ".equals(account.getPersType())) {
			shareholderDtls.setIndividualOrEntity(IndividualOrEntityEt.INDV);
			shareholderDtls.setIndividualDocument(mapIndividualDocument(account));
		} else {
			shareholderDtls.setIndividualOrEntity(IndividualOrEntityEt.LEGL);
			shareholderDtls.getEntityRegDtls().add(mapEntityRegDtls(account));
		}
		return shareholderDtls;
	}

	@Override
	public EntityRegDtlsT mapEntityRegDtls(Account account) {
		EntityRegDtlsT entityRegDtls = new EntityRegDtlsT();
		EntityRegDocTypeT entityRegDocType = new EntityRegDocTypeT();
		entityRegDocType.setEntityRegDocTypeCode(EntityRegDocTypeEt.OGRN);
		entityRegDtls.setRegDocType(entityRegDocType);
		entityRegDtls.setRegNum(account.getOgrnCode());
		entityRegDtls.setRegOrg(account.getOgrnPlace());
		if (account.getOgrnDate() != null) entityRegDtls.setDateOfIncorporation(DateUtils.mapDate(account.getOgrnDate()));
		return entityRegDtls;
	}

	@Override
	public IndividualDocumentT mapIndividualDocument(Account account) {
		IndividualDocumentT individualDocument = new IndividualDocumentT();
		individualDocument.setDocSer(account.getRegSerial());
		individualDocument.setDocNum(account.getRegNum());
		if (account.getRegDate() != null) individualDocument.setDocDate(DateUtils.mapDate(account.getRegDate()));
		individualDocument.setOrg(account.getRegPlace());
		IndividualDocumentTypeT individualDocumentType = new IndividualDocumentTypeT();
		individualDocumentType.setIndividualDocumentTypeCode(account.getPersDoc());
		individualDocument.setDocType(individualDocumentType);
		return individualDocument;
	}

	@Override
	public boolean isAccountND(Account account) {
		return "-".equals(account.getAccNd()) && "ND".equals(account.getAccKind());
	}

	@Override
	public PostalName mapPostalName(Account account) {
		PostalName postalName = new PostalName();
		postalName.setName(account.getName());
		postalName.setAddress(mapAccountAddress(account.getPostCountryCode(), account.getPostIndex(), account.getPostAddress()));
		return postalName;
	}

	private IdT mapShareholderId(Account account) {
		IdT shareholderId = new IdT();
		shareholderId.setId(account.getAccNd() + "_" + account.getId().getAccNum());
		return shareholderId;
	}

	private String mapCountry(String code) {
		return "94".equals(code) ? "RU" : "X3";
	}

	private PartyContactsT mapPartyContacts(String email) {
		PartyContactsT contacts = null;
		if (email != null) {
			contacts = new PartyContactsT();
			contacts.getEMail().add(email);
		}
		return contacts;
	}

	private void fillSecurityBalance(Shareholder shareholder, BigDecimal value, Long numerator, Long denominator, String regNum) {
		if ((value != null && value.compareTo(BigDecimal.ZERO) > 0) || (numerator != null && numerator != 0L)) {
			SecurityBalanceT securityBalance = new SecurityBalanceT();
			SecurityInfoT securityInfo = new SecurityInfoT();
			securityInfo.setSecurityClassification(SecurityClassificationEt.fromValue(fixtures.getSecurityClassification()));
			securityInfo.setStateRegNum(regNum);
			securityBalance.setSecurity(securityInfo);
			QuantityInUnitT total = new QuantityInUnitT();
			total.setUnits(value);
			if (numerator != 0) {
				QuantityInUnitT.Fraction fraction = new QuantityInUnitT.Fraction();
				fraction.setNumerator(BigDecimal.valueOf(numerator));
				fraction.setDenominator(BigDecimal.valueOf(denominator));
				total.setFraction(fraction);
			}
			securityBalance.setTotal(total);
			shareholder.getSecurityBalance().add(securityBalance);
		}
	}
}
