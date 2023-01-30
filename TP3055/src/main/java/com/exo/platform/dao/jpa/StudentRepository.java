package com.exo.platform.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.platform.dao.entitys.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
