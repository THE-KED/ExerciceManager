package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Moderator;
import com.exo.platform.dao.jpa.ModeratorRepository;

@Repository
public class ModeratorDaoImpl implements ModeratorDaoService{

	@Autowired
	private ModeratorRepository repo;

	@Override
	public Moderator save(Moderator moderator) {
		// TODO Auto-generated method stub
		return repo.save(moderator);
	}

	@Override
	public Moderator load(Long Id) {
		// TODO Auto-generated method stub
		return repo.findById(Id).get();
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
