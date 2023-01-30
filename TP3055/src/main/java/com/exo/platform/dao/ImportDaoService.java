package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Import;

public interface ImportDaoService {

	
	public Import save(Import impr);
	public Import load(Long Id);
	public Boolean delete(Long Id);
}
