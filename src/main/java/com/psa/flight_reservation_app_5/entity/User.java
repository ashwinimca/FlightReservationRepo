package com.psa.flight_reservation_app_5.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User extends AbstractEntity {
	private String firstNane;
	private String lastName;
	private String email;
	private String password;

	public String getFirstNane() {
		return firstNane;
	}

	public void setFirstName(String firstNane) {
		this.firstNane = firstNane;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
