package com.exo.platform.dao;

import java.util.ArrayList;

import com.exo.platform.dao.entitys.Teacher;


public class TeacherManager {

	
	private Long id;
	
	private ArrayList<Teacher> DisponibleTeacher;

	public TeacherManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherManager(Long id, ArrayList<Teacher> disponibleTeacher) {
		super();
		this.id = id;
		DisponibleTeacher = disponibleTeacher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Teacher> getDisponibleTeacher() {
		return DisponibleTeacher;
	}

	public void setDisponibleTeacher(ArrayList<Teacher> disponibleTeacher) {
		DisponibleTeacher = disponibleTeacher;
	}
	
	
	
}
