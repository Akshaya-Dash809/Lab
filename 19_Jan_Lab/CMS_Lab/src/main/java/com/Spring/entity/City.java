package com.Spring.entity;

public class City {
	private String cityname;
	private int pincode;

	public City() {
		System.out.println("Default Constructor");
	}

	public City(int pincode) {
		this.pincode = pincode;
	}

	public City(String cityname) {
		this.cityname = cityname;
	}

	public City(String cityname, int pincode) {
		this.cityname = cityname;
		this.pincode = pincode;
	}

	public void display() {
		System.out.println(cityname + " " + pincode);
	}
}