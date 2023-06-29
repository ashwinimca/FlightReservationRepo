package com.psa.flight_reservation_app_5.entity;

import javax.persistence.Entity;

@Entity
public class Passenger extends AbstractEntity {

	private String firstName;
	private String lasttName;
	private String middletName;
	private String email;
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getMiddletName() {
		return middletName;
	}

	public void setMiddletName(String middletName) {
		this.middletName = middletName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
