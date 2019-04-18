package wombatukun.tests.test8.mappers;

import wombatukun.tests.test8.dto.generated.*;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList.Shareholder;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS.RegisterList.Shareholder.ShareholderInfo.PostalName;
import wombatukun.tests.test8.model.Account;

public interface AccountMapper {

	Shareholder map(Account account);

	AddressT mapAccountAddress(String countryCode, String index, String addr);

	EntityRegDtlsT mapEntityRegDtls(Account account);

	IndividualDocumentT mapIndividualDocument(Account account);

	AccountDtlsT mapAccountDtls(Account account);

	boolean isAccountND(Account account);

	PostalName mapPostalName(Account account);

	PartyDtlsT mapShareholderDtls(Account account);

}
