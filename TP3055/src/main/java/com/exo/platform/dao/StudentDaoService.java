package com.exo.platform.dao;

import com.exo.platform.dao.entitys.Student;

public interface StudentDaoService {

	public Student save(Student student);
	public Student load(Long id);
	public Boolean Delete(Long id);
	
}
