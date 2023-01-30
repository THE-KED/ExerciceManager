package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Account;
import com.exo.platform.dao.jpa.AccountRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class AccountDaoImpl implements AccountDaoService{
	
	@Autowired
	private AccountRepository repo;
	
	@Autowired
	private EntityManager Em;

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

	@Override
	public Account loadAccount(String Login) {
		// TODO Auto-generated method stub
		String jpql = "SELECT e FROM Account e WHERE e.Login = :Login";
		Query query = Em.createQuery(jpql);
		query.setParameter("Login", Login);
			return (Account) query.getSingleResult();
	}

	@Override
	public Account Authentification(String Login, String pass) {
		// TODO Auto-generated method stub
		String jpql = "SELECT e FROM Account e WHERE e.Login = :Login and e.Pass = :pass";
		Query query = Em.createQuery(jpql);
		query.setParameter("Login", Login);
		query.setParameter("pass", pass);

		return (Account)query.getSingleResult();
	}

	@Override
	public Account findbyId(Long Id) {
		// TODO Auto-generated method stub
		return repo.findById(Id).get();
	}

	@Override
	public Boolean Delete(Long id) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(id);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

}
