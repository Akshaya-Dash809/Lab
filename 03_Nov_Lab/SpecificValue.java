package Lab_03_Nov;

//Q.1   Write a Java program to test if an array contains a specific value.
import java.util.Scanner;
public class SpecificValue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int[] num = {1, 2, 3, 4, 5}; //Integer array
	    System.out.println("Enter a no. ");
	    int toFind = sc.nextInt(); //input from scanner
	    boolean found = false; //temp. variable

	    for (int n : num) { //for-each loop to initialize array value
	      if (n == toFind) {   // to check the given no is present or not
	        found = true;
	        break;
	      }
	    }
	    
	    if(found) 
	      System.out.println(true);
	    else
	      System.out.println(false);
	  }
	}

