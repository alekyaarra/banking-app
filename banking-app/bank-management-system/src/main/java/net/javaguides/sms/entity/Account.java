package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(name = "roll_no", nullable = false)
//	private String rollNo;
	
//	@Column(name = "first_name", nullable = false)
//	private String firstName;
	
	@Column(name = "account_holder_name")
	private String account_holder_name;
	
	@Column(name = "balance", nullable = false)
	private Long balance;
	
//	@Column(name = "section", nullable = false)
//	private String section;
	
	@Column(name = "email")
	private String email;
	
	public Account() {
		
	}
	
	public Account(String account_holder_name, Long balance,String email) {
		super();
//		this.rollNo = rollNo;
//		this.firstName = firstName;
		this.account_holder_name = account_holder_name;
		this.balance = balance;
//		this.section = section;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public String getRollNo() {
//		return rollNo;
//	}
//	public void setRollNo(String rollNo) {
//		this.rollNo = rollNo;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
//	public String getSection() {
//		return section;
//	}
//	public void setSection(String section) {
//		this.section = section;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
