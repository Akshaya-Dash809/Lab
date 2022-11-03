package Lab_03_Nov;

//Q.3 we need to print the elements of the array which are present in odd positions. This can be accomplished by looping through the array and printing the elements of an array by incrementing i by 2 till the end of the array is reached.
public class OddPositions {

	public static void main(String[] args) {
		char [] arr= {'a','b','c','d','e'};  //Char array
		 System.out.println("Charecters in odd Postion are ");
		for(int i=0;i<arr.length;i+=2) {  // for loop to print the odd positions
	     System.out.println(arr[i]);
		}
	}
	}

