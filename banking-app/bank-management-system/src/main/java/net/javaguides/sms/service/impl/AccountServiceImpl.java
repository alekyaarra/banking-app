package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Account;
import net.javaguides.sms.repository.AccountRepository;
import net.javaguides.sms.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();	
	}

	@Override
	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account getAccountById(Long id) {
		return accountRepository.findById(id).get();
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public void deleteAccountById(Long id) {
		accountRepository.deleteById(id);	
	}

}
