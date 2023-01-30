package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Corrige;
import com.exo.platform.dao.jpa.CorrigeRepository;


@Repository
public class CorrigeDaoImpl implements CorrigeDaoService {

	@Autowired
	private CorrigeRepository repo;
	
	
	@Override
	public Corrige save(Corrige corrige) {
		// TODO Auto-generated method stub
		return repo.save(corrige);
	}

	@Override
	public Corrige load(Long Id) {
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
