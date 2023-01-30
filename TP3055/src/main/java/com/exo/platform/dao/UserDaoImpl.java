package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.User;
import com.exo.platform.dao.jpa.UserRepository;

@Repository
public class UserDaoImpl implements UserDaoService{

	
	@Autowired
	private UserRepository repo;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User load(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Boolean delete(Long Id) {
		// TODO Auto-generated method stub
		try{
			repo.deleteById(Id);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
}
