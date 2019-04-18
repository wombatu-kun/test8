package wombatukun.tests.test8.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import wombatukun.tests.test8.model.Account;
import wombatukun.tests.test8.model.AccountPKey;

import java.util.List;


public interface AccountRepository extends Repository<Account, AccountPKey> {
	String ND_ACCOUNT_KIND = "ND";

	@Query("select a.accountId from Account a where id.meetingId = :meetingId and accKind = '" + ND_ACCOUNT_KIND + "'")
	List<Long> findNDAccountIds(String meetingId);

	@Query("select a from Account a where id.meetingId = :meetingId and accountId = :accountId")
	List<Account> findShareholders(String meetingId, Long accountId);

}
