package com.exo.platform.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Exercice;
import com.exo.platform.dao.jpa.ExerciceRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


@Repository
public class ExerciceDaoImpl implements ExerciceDaoService{

	@Autowired
	private ExerciceRepository repo;
	
	@Autowired
	private EntityManager Em;
	
	
	@Override
	public Exercice save(Exercice exo) {
		// TODO Auto-generated method stub
		return repo.save(exo);
	}

	@Override
	public Exercice load(Long Id) {
		// TODO Auto-generated method stub
		return repo.findById(Id).get();
	}
	
	@Override
	public List<Exercice> loadAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Exercice> loadNonCorrige() {
		// TODO Auto-generated method stub
	
		String jpql = "SELECT e FROM Exercice e WHERE e.Correction = NUL";
		Query query = Em.createQuery(jpql);
		int nb =query.getResultList().size();
		ArrayList<Exercice> result = new ArrayList<Exercice>();
		for(int i=0;i<nb;i++) {
			result.add((Exercice) query.getResultList().get(i));
		}
		
		return result;
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
