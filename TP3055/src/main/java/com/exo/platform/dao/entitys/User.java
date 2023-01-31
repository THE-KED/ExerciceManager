package com.exo.platform.dao.entitys;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DynamicUpdate
public class User {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private String Name;
	private String FirstName;
	@DateTimeFormat(iso=ISO.DATE)
	private Date BornThe;
	private String BornAt;
	private String Email;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String firstName, Date bornThe, String bornAt, String email) {
		super();
		Name = name;
		FirstName = firstName;
		BornThe = bornThe;
		BornAt = bornAt;
		Email = email;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public Date getBornThe() {
		return BornThe;
	}

	public void setBornThe(Date bornThe) {
		BornThe = bornThe;
	}

	public String getBornAt() {
		return BornAt;
	}

	public void setBornAt(String bornAt) {
		BornAt = bornAt;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
