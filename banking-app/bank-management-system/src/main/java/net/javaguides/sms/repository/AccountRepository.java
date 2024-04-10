package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
