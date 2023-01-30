package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Corrige;

public interface CorrigeDaoService {
	
	public Corrige save(Corrige corrige);
	public Corrige load(Long Id);
	public Boolean delete(Long Id);

}
