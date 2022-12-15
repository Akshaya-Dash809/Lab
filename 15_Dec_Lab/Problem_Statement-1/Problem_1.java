package Lab_15_Dec;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem_1 {
	 ArrayList<Integer> A1=new ArrayList<Integer>();
	 ArrayList<Integer> storeEvenNumbers(int N) {//1st method
		 for(int i=2;i<=N;i++) {  //For lop for even numbers
		if(i%2==0) { //logic for even numbers
			A1.add(i);
		}
		 }
		 return A1;	 
	 }
	 ArrayList<Integer> A2=new ArrayList<Integer>();

	 ArrayList<Integer> printEvenNumbers() {//2nd method
		Iterator<Integer> itr=A1.iterator(); //using iterator
		while(itr.hasNext()) {
			A2.add(itr.next()*2); //even numbers multiply by 2
		}	 
		 return A2;
	 }
	 void retrieveEvenNumber(int n){//3rd method
		 if(A1.contains(n)) {
			 System.out.println(n +": is present");
		 }
		 else {
			 System.out.println("zero");
		 }
	 }
	public static void main(String[] args) { //main method
		Problem_1 h=new Problem_1(); //creating object of main method

		System.out.println("Stored Even Numbers "+h.storeEvenNumbers(20)); //print even numbers till 20
		System.out.println("After multiping 2 "+h.printEvenNumbers()); //print even numbers After multiping 2
		h.retrieveEvenNumber(4); //retrive the even number i.e 4	
	}
}