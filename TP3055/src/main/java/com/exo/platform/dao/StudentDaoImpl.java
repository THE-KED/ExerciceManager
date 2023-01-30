package com.exo.platform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.platform.dao.entitys.Student;
import com.exo.platform.dao.jpa.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDaoService{

	
	@Autowired
	private StudentRepository repo;

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student load(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Boolean Delete(Long Id) {
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
