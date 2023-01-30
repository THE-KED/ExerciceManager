package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.ExerciceManager;
import com.exo.platform.dao.jpa.ExerciceManagerRepository;

@Repository
public class ExerciceManagerDaoImpl implements ExerciceManagerDaoService{

	
	@Autowired
	private ExerciceManagerRepository repo;

	@Override
	public ExerciceManager save(ExerciceManager exoManager) {
		// TODO Auto-generated method stub
		exoManager.setId(1L);
		return repo.save(exoManager);
	}

	@Override
	public ExerciceManager Load() {
		// TODO Auto-generated method stub
		return repo.findById(1L).get();
	}

}
