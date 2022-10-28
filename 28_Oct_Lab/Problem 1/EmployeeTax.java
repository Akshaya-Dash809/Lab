//Problem 1

package com.cognizant.tax;

public class EmployeeTax {
//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator emp1=new TaxCalculator();  //object 1
		emp1.citizenship=true;
		emp1.basicSalary=25000;
		emp1.calculateTax();
		emp1.deductTax();
		emp1.validateSalary();
		
		System.out.println("                                                  ");
		
		TaxCalculator emp2=new TaxCalculator(); //object 2
		emp2.citizenship=true;
		emp2.basicSalary=125000;
		emp2.calculateTax();
		emp2.deductTax();
		emp2.validateSalary();
	}

}

