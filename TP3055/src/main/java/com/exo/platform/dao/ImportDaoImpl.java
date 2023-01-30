package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Import;
import com.exo.platform.dao.jpa.ImportRepository;

@Repository
public class ImportDaoImpl implements ImportDaoService{

	
	@Autowired
	private ImportRepository repo;

	@Override
	public Import save(Import impr) {
		// TODO Auto-generated method stub
		return repo.save(impr);
	}

	@Override
	public Import load(Long Id) {
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
