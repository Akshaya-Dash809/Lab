package com.cognizant.shapes;

public class Area {
	 public static void main(String[] args) {  
			Circle c1= new Circle(5.05f,3.14f);  //The constructor “constructor 2”  invoked from a main method
			System.out.println("The area of the circle is : "+c1.calculateCircleArea(3.8f));
			System.out.println("The circumference of the circle is  :"+c1.calculateCircumference(4.6f));
		}
		}
