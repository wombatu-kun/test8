package wombatukun.tests.test8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import wombatukun.tests.test8.dto.generated.REGISTEROFSHAREHOLDERS;
import wombatukun.tests.test8.exceptions.AccountNotFoundException;
import wombatukun.tests.test8.services.RegisterOfShareholdersService;

import java.util.List;

@RestController
@RequestMapping("register-of-shareholders/{meetingId}")
public class RegisterOfShareholdersController {

	private RegisterOfShareholdersService registerOfShareholdersService;

	@Autowired
	public RegisterOfShareholdersController(RegisterOfShareholdersService registerOfShareholdersService) {
		this.registerOfShareholdersService = registerOfShareholdersService;
	}

	@GetMapping("nd-accounts")
	public List<Long> findNDAccountIds(@PathVariable String meetingId) {
		return registerOfShareholdersService.findNDAccountIds(meetingId);
	}

	@GetMapping(value = "{accountId}", produces = "text/xml;charset=windows-1251")
	public REGISTEROFSHAREHOLDERS registerOfShareholders(@PathVariable String meetingId, @PathVariable Long accountId) {
		return registerOfShareholdersService.getRegisterOfShareholders(meetingId, accountId);
	}

	@ExceptionHandler(AccountNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String accountNotFoundHandler(AccountNotFoundException e) {
		return e.getMessage();
	}

}
