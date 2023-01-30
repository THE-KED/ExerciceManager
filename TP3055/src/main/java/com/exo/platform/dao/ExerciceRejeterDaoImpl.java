package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.ExerciceRejeter;
import com.exo.platform.dao.jpa.ExerciceRejeterRepository;

@Repository
public class ExerciceRejeterDaoImpl  implements ExerciceRejeterDaoService{

	
	@Autowired
	private ExerciceRejeterRepository repo;

	@Override
	public ExerciceRejeter save(ExerciceRejeter exo) {
		// TODO Auto-generated method stub
		return repo.save(exo);
	}

	@Override
	public ExerciceRejeter load(Long Id) {
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
