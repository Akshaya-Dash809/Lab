//Problem 1

package com.cognizant.tax;

public class TaxCalculator {

	// Instance Variables
	float basicSalary;
	boolean citizenship;
	float tax;
	int nettsalary;
	void calculateTax(){   ///Method for calculating tax
		tax=30*basicSalary/100;
		System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
	}
	void deductTax(){    // method for deduct tax from basic salary
		nettsalary=(int)basicSalary-(int)tax;
		System.out.println("The nett salary of the employee: "+nettsalary);
	}
	void validateSalary() {  //method to validate the salary
		if(basicSalary>100000&&citizenship==true)
			System.out.println("The salary and citizenship eligibility : true");
		else
			System.out.println("The salary and citizenship eligibility : false");

	}
	}