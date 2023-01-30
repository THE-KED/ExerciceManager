package com.exo.platform.dao;

import com.exo.platform.dao.entitys.TAF;

public interface TAFDaoService {

	public TAF save (TAF taf);
	public TAF load (Long Id);
	public Boolean delete (Long Id);
}
