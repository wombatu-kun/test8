package wombatukun.tests.test8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wombatukun.tests.test8.dao.AccountRepository;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS;
import wombatukun.tests.test8.exceptions.AccountNotFoundException;
import wombatukun.tests.test8.mappers.AccountMapper;
import wombatukun.tests.test8.mappers.RegisterMapper;
import wombatukun.tests.test8.model.Account;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterOfShareholdersServiceImpl implements RegisterOfShareholdersService {

	private AccountRepository accountRepository;
	private AccountMapper accountMapper;
	private RegisterMapper registerMapper;

	@Autowired
	public RegisterOfShareholdersServiceImpl(
			AccountRepository accountRepository,
			AccountMapper accountMapper,
			RegisterMapper registerMapper
	) {
		this.accountRepository = accountRepository;
		this.accountMapper = accountMapper;
		this.registerMapper = registerMapper;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Long> findNDAccountIds(String meetingId) {
		return accountRepository.findNDAccountIds(meetingId);
	}

	@Transactional(readOnly = true)
	@Override
	public REGISTEROFSHAREHOLDERS getRegisterOfShareholders(String meetingId, Long accountId) {
		List<Account> shareholderAccounts = accountRepository.findShareholders(meetingId, accountId);
		Optional<Account> ndAccount = shareholderAccounts.stream()
				.filter(accountMapper::isAccountND).findAny();
		if (ndAccount.isPresent()) {
			return registerMapper.map(ndAccount.get(), shareholderAccounts);
		} else {
			throw new AccountNotFoundException("ND account with such ID was not found.");
		}
	}

}
