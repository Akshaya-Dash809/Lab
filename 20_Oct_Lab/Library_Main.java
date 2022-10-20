//Problem 3

package Lab_20Oct;

public class Library_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library obj1=new Library();  //obj 1
		Library obj2=new Library();  //obj 2
		obj1.addBook(111, "Java", "Mr. ABC");
		obj2.addBook(222, "SQL", "Mr. DEF");
		
		obj1.dispenseBook("Java");
		obj2.dispenseBook("SQL");
		
	}

}
