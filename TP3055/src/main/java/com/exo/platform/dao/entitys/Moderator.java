package com.exo.platform.dao.entitys;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import com.exo.platform.dao.TeacherManager;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;


@Entity
@DynamicUpdate
public class Moderator extends User{

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private ExerciceManager exerciceManager;
	
	@Transient
	private TeacherManager teacherManager;

	public Moderator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moderator(String name, String firstName, Date bornThe, String bornAt, String email) {
		super(name, firstName, bornThe, bornAt, email);
		// TODO Auto-generated constructor stub
	}

	public Moderator(ExerciceManager exerciceManager, TeacherManager teacherManager) {
		super();
		this.exerciceManager = exerciceManager;
		this.teacherManager = teacherManager;
	}

	public ExerciceManager getExerciceManager() {
		return exerciceManager;
	}

	public void setExerciceManager(ExerciceManager exerciceManager) {
		this.exerciceManager = exerciceManager;
	}

	public TeacherManager getTeacherManager() {
		return teacherManager;
	}

	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}
	
	
	
	
}
