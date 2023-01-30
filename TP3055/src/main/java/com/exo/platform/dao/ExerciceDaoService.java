package com.exo.platform.dao;

import java.util.List;

import com.exo.platform.dao.entitys.Exercice;

public interface ExerciceDaoService {

	
	public Exercice save (Exercice exo);
	public Exercice load (Long Id);
	public List<Exercice> loadAll ();
	public List<Exercice> loadNonCorrige ();
	public Boolean delete(Long Id);
}
