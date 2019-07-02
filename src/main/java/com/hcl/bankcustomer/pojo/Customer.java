package com.hcl.bankcustomer.pojo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotEmpty(message = "id should not be empty")
	private int id;
	@NotNull(message = "name should not be null")
	private String name;
	@NotEmpty
	private String role;
	@NotEmpty
	@Size(min = 10)
	private int phoneNumber;
	@NotEmpty
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer() {

	}

	public Customer(int id, String name, String role, int phoneNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

}
