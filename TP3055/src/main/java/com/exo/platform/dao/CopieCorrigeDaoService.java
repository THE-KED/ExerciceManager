package com.exo.platform.dao;

import com.exo.platform.dao.entitys.CopieCorrige;

public interface CopieCorrigeDaoService {

	public CopieCorrige save(CopieCorrige copie);
	public CopieCorrige load(Long id);
	public Boolean Delete(Long id);
}
