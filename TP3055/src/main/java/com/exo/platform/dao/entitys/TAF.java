package com.exo.platform.dao.entitys;

import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@DynamicUpdate
public class TAF {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private List<Exercice> Copies;
	private String Classe;
	private int Number;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private Corrige Correction;
	
	
	public TAF() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TAF(Long id, List<Exercice> copies, String classe, int number, Corrige correction) {
		super();
		Id = id;
		Copies = copies;
		Classe = classe;
		Number = number;
		Correction = correction;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public List<Exercice> getCopies() {
		return Copies;
	}
	public void setCopies(List<Exercice> copies) {
		Copies = copies;
	}
	public String getClasse() {
		return Classe;
	}
	public void setClasse(String classe) {
		Classe = classe;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public Corrige getCorrection() {
		return Correction;
	}
	public void setCorrection(Corrige correction) {
		Correction = correction;
	}
	
	
}
