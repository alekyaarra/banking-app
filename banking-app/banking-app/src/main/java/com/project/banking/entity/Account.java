package com.project.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {

//	public Account(Object id2, Object accountHolderName2, Object balance2) {
//		// TODO Auto-generated constructor stub
//	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;
	public Account(Object id2, Object accountHolderName2, Object balance2) {
		// TODO Auto-generated constructor stub
	}
	public Account(Long id2, String accountHolderName2, double balance2) {
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
