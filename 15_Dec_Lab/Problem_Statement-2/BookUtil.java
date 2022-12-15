package Lab_15_Dec;
import java.util.Scanner;

import Lab_15_Dec.Book;
import Lab_15_Dec.BookStore;

public class BookUtil {
	public static void main(String[] args){									//main method
		BookStore obj = new BookStore();								//instantiating BookStore object
		Scanner sc  = new Scanner(System.in);								//instantiating scanner object

		for(int i=1; i<=3; i++) {									//running for loop three times to add 3 book instances
		//taking inputs from user 
		
		System.out.println("For book-"+i);
		System.out.println("Enter bookId:");
		Scanner scanbookId  = new Scanner(System.in);								//instantiating scanner object
		int bookId = scanbookId.nextInt();									//taking input for bookId
		
		System.out.println("Enter title:");
		Scanner scanTitle  = new Scanner(System.in);								//instantiating scanner object
		String title = scanTitle.nextLine();									//taking input for title
		
		System.out.println("Enter author:");
		Scanner scanAuthor  = new Scanner(System.in);								//instantiating scanner object
		String author = scanAuthor.nextLine();									//taking input for author
		
		System.out.println("Enter category:");
		Scanner scanCategory  = new Scanner(System.in);								//instantiating scanner object
		String category = scanCategory.nextLine();									//taking input for category
		
		System.out.println("Enter price:");
		Scanner scanPrice  = new Scanner(System.in);								//instantiating scanner object
		float price = scanPrice.nextFloat();									//taking input for price
												
		obj.addBook(new Book(bookId,title,author,category,price));						//adding Book instances into BookStore
		obj.displayAll(); 
		
		if(i!=4) {	//condition for close scanner input stream
			continue;
		}
		//closing all scanner input streams
		scanbookId.close();
		scanTitle.close();
		scanAuthor.close();
		scanCategory.close();
		scanPrice.close();
		}	//for loop end
	
		System.out.println("\nEnter title to search book: ");
		String title = sc.nextLine();									//taking input for price
		System.out.println("\nSearched by title");
		obj.searchByTitle(title);									//searching book by book title 
		
		System.out.println("\nEnter author name to search book");
		String author = sc.nextLine();									//taking input for price
		System.out.println("\nSearched by author");
		obj.searchByAuthor(author);									//searching book by author name
		
		System.out.println("\nPrinting all books:");
		obj.displayAll(); 										//displaying all books with details
		
		sc.close(); 											//closing input stream
	}
	
}
