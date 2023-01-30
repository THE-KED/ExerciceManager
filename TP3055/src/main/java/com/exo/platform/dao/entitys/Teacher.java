package com.exo.platform.dao.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

@Entity
@DynamicUpdate
public class Teacher extends User{
	
	private boolean Pleg;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private TAF taf;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String firstName, Date bornThe, String bornAt, String email) {
		super(name, firstName, bornThe, bornAt, email);
		// TODO Auto-generated constructor stub
	}

	public Teacher(boolean pleg, TAF taf) {
		super();
		Pleg = pleg;
		this.taf = taf;
	}

	public boolean isPleg() {
		return Pleg;
	}

	public void setPleg(boolean pleg) {
		Pleg = pleg;
	}

	public TAF getTaf() {
		return taf;
	}

	public void setTaf(TAF taf) {
		this.taf = taf;
	}
	
	
	
	
	public void corriger(int indexCopie , CopieCorrige copieCorrige) {
	
	List <Exercice> listeCopies = this.taf.getCopies();
	Exercice copie = listeCopies.get(indexCopie);
	copie.setCopie(copieCorrige);
	copie.setCorrection(this.taf.getCorrection());
	ArrayList<Exercice> newlisteCopies = new ArrayList<Exercice>();
	for(int i=0;i<listeCopies.size();i++) {
		if(i!=indexCopie)
		newlisteCopies.add(listeCopies.get(i));
	}
	
	this.taf.setCopies(newlisteCopies);
	
	}
}
