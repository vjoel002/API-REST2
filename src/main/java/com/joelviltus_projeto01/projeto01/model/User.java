package com.joelviltus_projeto01.projeto01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {
	@Id
	@GeneratedValue
	private int idUser;
	private String user;
	private String password;
	
	public int getIdUser() {
		return idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	

}
