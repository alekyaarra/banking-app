package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	
	Account saveAccount(Account account);
	
	Account getAccountById(Long id);
	
	Account updateAccount(Account account);
	
	void deleteAccountById(Long id);
}
