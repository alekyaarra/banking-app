package com.project.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
	
	private Long id;
	private String accountHolderName;
	private double balance;
	public AccountDto(Long id2, String accountHolderName2, double balance2) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return accountHolderName;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
