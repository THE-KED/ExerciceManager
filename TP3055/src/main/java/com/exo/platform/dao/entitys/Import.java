package com.exo.platform.dao.entitys;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Import {
	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Lob
	private byte[] File;
	private Date DateImport;
	private String Description;
	private String Titre;
	private String Classe;
	public Import() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Import(Long id, byte[] file, Date dateImport, String description, String titre, String classe) {
		super();
		Id = id;
		File = file;
		DateImport = dateImport;
		Description = description;
		Titre = titre;
		Classe = classe;
	}
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public byte[] getFile() {
		return File;
	}
	public void setFile(byte[] file) {
		File = file;
	}
	public Date getDateImport() {
		return DateImport;
	}
	public void setDateImport(Date dateImport) {
		DateImport = dateImport;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getClasse() {
		return Classe;
	}
	public void setClasse(String classe) {
		Classe = classe;
	}
	
	
	
}
