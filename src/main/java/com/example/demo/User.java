package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type", nullable = false)
	private UserType utype;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserType getUtype() {
		return utype;
	}

	public void setUtype(UserType utype) {
		this.utype = utype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}