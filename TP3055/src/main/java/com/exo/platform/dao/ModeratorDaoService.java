package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Moderator;

public interface ModeratorDaoService {

	public Moderator save (Moderator moderator);
	public Moderator load (Long Id);
	public Boolean delete (Long Id);
}
