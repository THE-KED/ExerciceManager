package com.exo.platform.dao;

import com.exo.platform.dao.entitys.ExerciceRejeter;

public interface ExerciceRejeterDaoService {
	
	
	public ExerciceRejeter save (ExerciceRejeter exo);
	public ExerciceRejeter load (Long Id);
	public Boolean delete(Long Id);
}
