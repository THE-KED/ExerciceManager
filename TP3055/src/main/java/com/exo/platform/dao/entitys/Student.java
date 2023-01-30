package com.exo.platform.dao.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DynamicUpdate
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Student extends User{
	
	private String Classe;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Exercice> exercices;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<ExerciceRejeter> exercicesRejeter;

	public Student() {
		super();
		this.exercices = new ArrayList<Exercice>();
		this.exercicesRejeter = new ArrayList<ExerciceRejeter>();

		// TODO Auto-generated constructor stub
	}

	public Student(String name, String firstName, Date bornThe, String bornAt, String email) {
		super(name, firstName, bornThe, bornAt, email);
		// TODO Auto-generated constructor stub
	}

	public Student(String classe, List<Exercice> exercices, List<ExerciceRejeter> exercicesRejeter) {
		super();
		Classe = classe;
		this.exercices = exercices;
		this.exercicesRejeter = exercicesRejeter;
	}

	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
	}

	public List<Exercice> getExercices() {
		return exercices;
	}

	public void setExercices(List<Exercice> exercices) {
		this.exercices = exercices;
	}

	public List<ExerciceRejeter> getExercicesRejeter() {
		return exercicesRejeter;
	}

	public void setExercicesRejeter(List<ExerciceRejeter> exercicesRejeter) {
		this.exercicesRejeter = exercicesRejeter;
	}
	
	
	
	public void soumetExercice(Exercice Exo) {
		
		this.exercices.add(Exo);
	}
	
}
