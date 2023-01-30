package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Teacher;

public interface TeacherDaoService {

	public Teacher save(Teacher teacher);
	public Teacher load(Long id);
	public Boolean delete(Long id);
}
