package wombatukun.tests.test8.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wombatukun.tests.test8.dto.Fixtures;
import wombatukun.tests.test8.dto.generated.*;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList;
import wombatukun.tests.test8.model.Account;

import java.util.List;

@Component
public class RegisterMapperImpl implements RegisterMapper {

	private Fixtures fixtures;
	private AccountMapper accountMapper;

	@Autowired
	public RegisterMapperImpl(Fixtures fixtures, AccountMapper accountMapper) {
		this.fixtures = fixtures;
		this.accountMapper = accountMapper;
	}

	@Override
	public REGISTEROFSHAREHOLDERS map(Account ndAccount, List<Account> shareholderAccounts) {
		REGISTEROFSHAREHOLDERS register = createRegister();
		mapNDAccount(register, ndAccount);
		mapShareholders(register, shareholderAccounts);
		return register;
	}

	private REGISTEROFSHAREHOLDERS createRegister() {
		REGISTEROFSHAREHOLDERS register = new REGISTEROFSHAREHOLDERS();
		register.setVersion(fixtures.getVersion());
		register.setHeader(fixtures.getHeader());
		register.getIssuer().add(fixtures.getIssuer());
		register.setCorporateActionCode(fixtures.getCorporateActionCode());
		register.setRecordDate(fixtures.getRecordDate());
		register.setMessageFunction(fixtures.getMessageFunction());
		register.setInformationIndicator(fixtures.getInformationIndicator());
		return register;
	}

	private void mapNDAccount(REGISTEROFSHAREHOLDERS register, Account ndAccount) {
		register.setAccountDtls(accountMapper.mapAccountDtls(ndAccount));
		fillAccountHolder(register, ndAccount);
	}

	private void mapShareholders(REGISTEROFSHAREHOLDERS register, List<Account> shareholderAccounts) {
		RegisterList registerList = new RegisterList();
		List<RegisterList> listOfRegisterLists = register.getRegisterList();
		shareholderAccounts.stream()
				.filter(account -> !accountMapper.isAccountND(account))
				.map(account -> accountMapper.map(account))
				.forEach(shareholder -> registerList.getShareholder().add(shareholder));
		listOfRegisterLists.add(registerList);
	}

	private void fillAccountHolder(REGISTEROFSHAREHOLDERS register, Account nd) {
		PartyDtlsT accountHolder = new PartyDtlsT();
		accountHolder.setName(nd.getName());
		accountHolder.setOgrn(nd.getOgrnCode());
		accountHolder.setShortName(nd.getShortName());
		accountHolder.setIndividualOrEntity(IndividualOrEntityEt.LEGL);
		accountHolder.setAddress(accountMapper.mapAccountAddress(nd.getLegalCountryCode(), nd.getLegalIndex(), nd.getLegalAddress()));
		accountHolder.getEntityRegDtls().add(accountMapper.mapEntityRegDtls(nd));
		register.setAccountHolder(accountHolder);
	}

}
