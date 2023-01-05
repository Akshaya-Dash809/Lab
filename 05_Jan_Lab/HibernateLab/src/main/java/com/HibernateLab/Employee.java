package com.HibernateLab;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
	@Getter
	@Setter
	@Entity 
	@Table(name="Employee_Details")
	public class Employee {
		@Id //Marks identifier of class
		private int empId;
		private String empFirstName,empLastName,empEmail,empAddr,empDept;
		private double empSalary;
		private long empPhone;
	}
