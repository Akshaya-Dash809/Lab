//Q2. Write a java program to print numbers between 1 to 100 which are divisible by 3,5 and by both.

package Lab_29Sep;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Divisible by 3 are :");
		for(int i =1; i<100;i++) {   //for loop to print 1 to 100 number
			if(i%3==0)               // if statement to check nos divisible by 3
		System.out.println(i+" ");   //print the no.s
		}
		
		System.out.println("Divisible by 5 are : ");
		for(int i =1; i<100;i++) {  //for loop to print 1 to 100 number
			if(i%5==0)              // if statement to check nos divisible by 5
		System.out.println(i+" ");  //print the no.s
		}
		
		System.out.println("Divisible by both 3&5 are :");
		for(int i =1; i<100;i++) {  //for loop to print 1 to 100 number
			if(i%3==0 && i%5==0)    // if statement to check nos divisible by 3 & 5
		System.out.println(i+" ");  //print the no.s
		}
	}

}
