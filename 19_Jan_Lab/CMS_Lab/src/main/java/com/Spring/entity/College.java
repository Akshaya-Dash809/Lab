package com.Spring.entity;

public class College {
	private String cname;
	private String email;
	private long phone;
	private C_Address address;

	public College(String cname, String address, String email, long phone) {// Parameterized constructor
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public void display() {
		System.out.println(cname + " " + email + " " + phone);
		System.out.println(address.toString());
	}
}
