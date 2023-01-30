package com.exo.platform.dao.entitys;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;

@Entity
@DynamicUpdate
public class ExerciceRejeter extends Exercice {

	private String Motif;

	public ExerciceRejeter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExerciceRejeter(Long id, byte[] file, Date dateImport, String description, String titre, String classe) {
		super(id, file, dateImport, description, titre, classe);
		// TODO Auto-generated constructor stub
	}

	public ExerciceRejeter(CopieCorrige copie, Corrige correction) {
		super(copie, correction);
		// TODO Auto-generated constructor stub
	}

	public ExerciceRejeter(String motif) {
		super();
		Motif = motif;
	}

	public String getMotif() {
		return Motif;
	}

	public void setMotif(String motif) {
		Motif = motif;
	}
	
}
