package Lab_15_Dec;

public class Book {//main book class
	
	//encapsulating all data members
	private int bookId;
	private String  title, author, category;
	private float price;
	
	public Book(int bookId, String title, String author, String category, float price)  {//parameterized constructor
		
		//validations
		try {
			//conditon for bookId	
			if((title.startsWith("B")) && (title.length()==4)) {	//condition
				this.bookId=bookId;	//if condition meets
			}
			else {
				throw new InvalidBookException("book id should be start with 'B' and lenght of 4");		//throws exception
			}
		
			
			//conditon for category	
			if((category.equalsIgnoreCase("Science")) || (category.equalsIgnoreCase("Fiction")) || (category.equalsIgnoreCase("Technology")) || (category.equalsIgnoreCase("Others"))) {	//conditon
				this.category=category;	//if condition meets
			}
			else {
				throw new InvalidBookException("category should be Science,Fiction,Technology and Others");	//throws exception
			}
			
			//conditon for price	
			if(price>0) {	//conditon
				this.price=price; //if condition meets
			}
			else {
				throw new InvalidBookException("negative price can not be accepted");				//throws exception
			}
		this.title=title;
		this.author=author;
		}
		catch(Exception e) {	//exception handling
			System.out.println(e);
		}
	}

	//getters for all private data members
	public int getbookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {	//for printing all details of Book objects
		System.out.println("Book [bookId='" + bookId + "', title='" + title + "', author='" + author + "', category='" + category + "', price='" + price + "']");
	return toString();
	}

	
}

//creating custom exception class
class InvalidBookException extends Exception{	
	private static final long serialVersionUID = 1L;	//default serial id suggested by eclipse IDE

	//overloading InvalidBookException class 
	public InvalidBookException(String s) {	//parameterized constructor
		super(s);	//passing 's' argument to Exception super class
	}
}
