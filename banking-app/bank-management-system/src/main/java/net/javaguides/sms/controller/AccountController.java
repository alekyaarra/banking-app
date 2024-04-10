package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Account;
import net.javaguides.sms.service.AccountService;

@Controller
public class AccountController {
	
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/accounts")
	public String listAccounts(Model model) {
		model.addAttribute("accounts", accountService.getAllAccounts());
		return "accounts";
	}
	
	@GetMapping("/accounts/new")
	public String createAccountForm(Model model) {
		
		// create student object to hold student form data
		Account account = new Account();
		model.addAttribute("account", account);
		return "create_account";
		
	}
	
	@PostMapping("/accounts")
	public String saveStudent(@ModelAttribute Account account) {
		accountService.saveAccount(account);
		return "redirect:/accounts";
	}
	
	@GetMapping("/accounts/edit/{id}")
	public String editAccountForm(@PathVariable Long id, Model model) {
		model.addAttribute("account", accountService.getAccountById(id));
		return "edit_account";
	}

	@PostMapping("/accounts/{id}")
	public String updateAccount(@PathVariable Long id,
			@ModelAttribute Account account,
			Model model) {
		
		// get student from database by id
		Account existingAccount = accountService.getAccountById(id);
		existingAccount.setId(id);
//		existingStudent.setRollNo(account.getRollNo());
//		existingStudent.setFirstName(account.getFirstName());
		existingAccount.setAccount_holder_name(account.getAccount_holder_name());
		existingAccount.setBalance(account.getBalance());
//		existingStudent.setSection(account.getSection());
		existingAccount.setEmail(account.getEmail());
		
		// save updated student object
		accountService.updateAccount(existingAccount);
		return "redirect:/accounts";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/accounts/{id}")
	public String deleteAccount(@PathVariable Long id) {
		accountService.deleteAccountById(id);	
		return "redirect:/accounts";
	}
	
}
