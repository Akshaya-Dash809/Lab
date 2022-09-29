/*Q3.… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic  */


package Lab_29Sep;

class Adder extends Arithmetic{   //class Adder inherits from class Arithmetic
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic (); //object of class Arithmetic to call its non-static method
		int d=ar.add(10,20);               //d is a variable which is store the method
		System.out.println("The addition is : "+d); //print the sum(d)
	}
}

