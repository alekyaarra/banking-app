package com.project.banking.service.impl;

import com.project.banking.service.AccountService;
import com.project.banking.entity.Account;
import com.project.banking.Mapper.AccountMapper;
import com.project.banking.dto.AccountDto;
import com.project.banking.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountServiceImpl( AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Override
	public  AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
}
