package com.exo.platform.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.platform.dao.entitys.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
