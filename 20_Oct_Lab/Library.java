/*Problem 3. 
Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variable
*/

package Lab_20Oct;

public class Library {

	private int bookId;//
	private String bookName,bookAuthor;
	void addBook(int id,String bname,String bauthor) {// to store books
		this.bookAuthor=bauthor;
		this.bookId=id;
		this.bookName=bname;
	}
	
	void dispenseBook(String name) { //to check whether the book is present or not
	if(name==bookName) { //if present ,print the book details
		System.out.println("Book id:"+bookId+"\nBook name:"+bookName+"\nBook author="+bookAuthor);
	}else                 // If not present , print not found
		System.out.println("Book not found");
	}
}
