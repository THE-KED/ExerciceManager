package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.TAF;
import com.exo.platform.dao.jpa.TAFRepository;

@Repository
public class TAFDaoImpl implements TAFDaoService{

	
	@Autowired
	private TAFRepository repo;

	@Override
	public TAF save(TAF taf) {
		// TODO Auto-generated method stub
		return repo.save(taf);
	}

	@Override
	public TAF load(Long Id) {
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
