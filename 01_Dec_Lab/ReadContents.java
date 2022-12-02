/*
 * 3. Write a Java program to read contents from a file into byte array.
 */
package Lab_01_Dec;
import java.io.*;

public class ReadContents{ // class
	public static void main(String[] args) throws IOException { // main method
		FileOutputStream f = new FileOutputStream("D:\\test.txt"); // destination
		byte arr[] = { 32,54,77,24,68 };
		ByteArrayInputStream b = new ByteArrayInputStream(arr); // converting to byte
		int i = 0;
		while ((i = b.read()) != -1) {
			f.write(i);
			char ch = (char) i; // storing
			System.out.println(ch);
			b.close();
			f.close();
		}
	}

}