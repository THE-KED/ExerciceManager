package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Account;

public interface AccountDaoService {
	
	public Account save(Account account);
	public Account loadAccount(String Login);
	public Account Authentification(String Login,String pass);
	public Account findbyId(Long Id);
	public Boolean Delete(Long id);

}
