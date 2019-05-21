package com.example.demo;

public enum UserType {

	CLIENT("Client"), SUPPLIER("Supplier"), ADMIN("Admin");

	private final String type;

	UserType(String userType) {

		this.type = userType;

	}

	public String getType() {

		return this.type;
	}
}