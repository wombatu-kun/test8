package wombatukun.tests.test8.services;

import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS;

import java.util.List;

public interface RegisterOfShareholdersService {

	List<Long> findNDAccountIds(String meetingId);

	REGISTEROFSHAREHOLDERS getRegisterOfShareholders(String meetingId, Long accountId);

}
