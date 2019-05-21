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

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type", nullable = false)
	private UserType utype;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Enumerated(EnumType.STRING)
	public UserType getUtype() {

		return utype;
	}

	@Enumerated(EnumType.STRING)
	public void setUtype(UserType utype) {
		this.utype = utype;
	}
}