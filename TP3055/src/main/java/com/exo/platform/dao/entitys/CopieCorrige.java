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
public class CopieCorrige extends Import{

	private Float Note;
	

	public CopieCorrige() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CopieCorrige(Long id, byte[] file, Date dateImport, String description, String titre, String classe) {
		super(id, file, dateImport, description, titre, classe);
		// TODO Auto-generated constructor stub
	}

	public CopieCorrige(Float note) {
		super();
		Note = note;
	}

	public Float getNote() {
		return Note;
	}

	public void setNote(Float note) {
		Note = note;
	}
	
	
}
