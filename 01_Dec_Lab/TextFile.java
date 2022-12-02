/*
 * 4. Write a Java program to store text file content 
   line by line into an array.
 */
package Lab_01_Dec;
import java.io.*;
public class TextFile {

	public static void main(String[] args) { // main method
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt"); // destination
			byte arr[] = f.readAllBytes();
			ByteArrayInputStream b = new ByteArrayInputStream(arr);
			int i = 0;
			while ((i = b.read()) != -1) {
				System.out.print((char) i); // convert it to character
			}
			f.close();
			b.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
