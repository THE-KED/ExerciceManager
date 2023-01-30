package com.exo.platform.dao;

import com.exo.platform.dao.entitys.User;

public interface UserDaoService {

	public User save(User user);
	public User load(Long id);
	public Boolean delete(Long id);
}
