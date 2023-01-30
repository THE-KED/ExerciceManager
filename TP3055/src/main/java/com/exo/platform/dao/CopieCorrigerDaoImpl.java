package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.CopieCorrige;
import com.exo.platform.dao.jpa.CopieCorrigeRepository;


@Repository
public class CopieCorrigerDaoImpl implements CopieCorrigeDaoService{

	@Autowired
	private CopieCorrigeRepository repo;
	
	
	@Override
	public CopieCorrige save(CopieCorrige copie) {
		// TODO Auto-generated method stub
		return repo.save(copie);
	}

	@Override
	public CopieCorrige load(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Boolean Delete(Long id) {
		// TODO Auto-generated method stub
		try{
			repo.deleteById(id);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
