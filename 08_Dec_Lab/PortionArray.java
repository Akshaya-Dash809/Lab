package Lab_08_Dec;
/*Problem Statement 2:
Write a Java program to extract a portion of an array list.*/

import java.util.ArrayList;
import java.util.List;
public class PortionArray {
	public static void main(String[] args) {//main method
		  List<String>color_list=new ArrayList<String>();//creating array list
			color_list.add("Red");//adding elements
			color_list.add("Green");
			color_list.add("Orange");
			color_list.add("White");
			color_list.add("Black");
			System.out.println("Original ArrayList "+color_list);//printing previous arraylist
			List<String>color_list2=color_list.subList(0, 3);
			System.out.println("After Extracting The ArrayList "+color_list2);//printing sub arraylist	
		}}

