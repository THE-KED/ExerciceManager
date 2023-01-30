package com.exo.platform.dao.entitys;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@DynamicUpdate
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Exercice extends Import {

	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private CopieCorrige Copie;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Corrige Correction;

	
	
	public Exercice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Exercice(Long id, byte[] file, Date dateImport, String description, String titre, String classe) {
		super(id, file, dateImport, description, titre, classe);
		// TODO Auto-generated constructor stub
	}

	public Exercice(CopieCorrige copie, Corrige correction) {
		super();
		Copie = copie;
		Correction = correction;
		// TODO Auto-generated constructor stub
	}

	public CopieCorrige getCopie() {
		return Copie;
	}

	public void setCopie(CopieCorrige copie) {
		Copie = copie;
	}

	public Corrige getCorrection() {
		return Correction;
	}

	public void setCorrection(Corrige correction) {
		Correction = correction;
	}
	
}
