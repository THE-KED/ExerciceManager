package com.exo.platform.dao;

public interface DaoService<e> {

	public e save(e entity);
	public e load(Long id);
	public Boolean delete(Long id);
}
