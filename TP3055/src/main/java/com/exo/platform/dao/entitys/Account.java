package com.exo.platform.dao.entitys;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;


@Entity
@DynamicUpdate
public class Account {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Login;
	private String Pass;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private User user;
	
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String login, String pass, User user) {
		super();
		Login = login;
		Pass = pass;
		this.user = user;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
