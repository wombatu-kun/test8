package wombatukun.tests.test8.mappers;

import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS;
import wombatukun.tests.test8.model.Account;

import java.util.List;

public interface RegisterMapper {

	REGISTEROFSHAREHOLDERS map(Account ndAccount, List<Account> shareholderAccounts);

}
