package com.exo.platform.dao.entitys;

import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@DynamicUpdate
public class ExerciceManager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private List<Exercice> ListeAttente ;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private List<Exercice> ListeValide ;
	
	
	public ExerciceManager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExerciceManager(Long id, List<Exercice> listeAttente, List<Exercice> listeValide) {
		super();
		this.id = id;
		ListeAttente = listeAttente;
		ListeValide = listeValide;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Exercice> getListeAttente() {
		return ListeAttente;
	}


	public void setListeAttente(List<Exercice> listeAttente) {
		ListeAttente = listeAttente;
	}


	public List<Exercice> getListeValide() {
		return ListeValide;
	}


	public void setListeValide(List<Exercice> listeValide) {
		ListeValide = listeValide;
	}

	
}
