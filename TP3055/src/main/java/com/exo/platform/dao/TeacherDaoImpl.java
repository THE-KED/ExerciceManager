package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Teacher;
import com.exo.platform.dao.jpa.TeacherRepository;

@Repository
public class TeacherDaoImpl implements TeacherDaoService{

	
	@Autowired
	private TeacherRepository repo;

	@Override
	public Teacher save(Teacher teacher) {
		// TODO Auto-generated method stub
		return repo.save(teacher);
	}

	@Override
	public Teacher load(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Boolean delete(Long Id) {
		// TODO Auto-generated method stub
		try{
			repo.deleteById(Id);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
}
