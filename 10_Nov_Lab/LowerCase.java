       package Lab_10_Nov;

       //Q.2- Write a Java program to find sequences of lower case letters joined with a underscore.

       public class LowerCase {  //main class
	   public static void main(String[] args) {//main method
		String s="Java_program";//taking the string
		boolean bol=false;
		for(int i=0;i<s.length();i++) {//loop up to the string length
			if(s.charAt(i)=='_') {//check conditions
				char c=s.charAt(i+1);//initializing the next character
			
				if(Character.isLowerCase(c)) {//if the character will be lower case
				bol=true;
				break;
			}		
		}
	    } if(bol) //check the string
		System.out.println("matched");
	    else
		System.out.println("not matched");
		}}
