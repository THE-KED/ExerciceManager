package com.exo.platform.dao.entitys;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Corrige extends Import{
		
	private String Auteur;

	public Corrige() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corrige(Long id, byte[] file, Date dateImport, String description, String titre, String classe) {
		super(id, file, dateImport, description, titre, classe);
		// TODO Auto-generated constructor stub
	}

	public Corrige(String auteur) {
		super();
		Auteur = auteur;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	
	
}
