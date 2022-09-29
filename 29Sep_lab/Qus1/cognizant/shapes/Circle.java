package com.cognizant.shapes;

public class Circle {

	   float radius;
	   float pi=3.5f;
	   public Circle(){   //Constructor 1
		   radius=1.5f;
	   }
	   Circle(float radius){ //Constructor 2
		   this.radius=radius;  // Overloading constructors and using “this” keyword
	   }

	  Circle(float radius,float pi){  //Constructor 3
		  this.radius=radius;         //Constructor 3- with two float arguments radius and pi
		  this.pi=3.14f;
	  }
	  public double calculateCircleArea(float radius) {  //Method 1 - calculateCircleArea
		  return pi*radius*radius;
	  }
	  public double calculateCircumference(float radius) {  //Method 2 – calculateCircumference
		  return 2*pi*radius;
	  }
	}