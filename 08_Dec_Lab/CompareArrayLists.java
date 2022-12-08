package Lab_08_Dec;
/*Problem Statement 3:
 * Write a java program to compare two array lists.
 */

import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {//main class
public static void main(String[] args) {//main method
	List<String>color_list=new ArrayList<String>();//creating array list
	color_list.add("Red");//adding elements
	color_list.add("Green");
	color_list.add("Black");
	color_list.add("White");
	color_list.add("Pink");
	System.out.println("First ArrayList "+color_list);
	List<String>color_list1=new ArrayList<String>();//creating array list 2
	color_list1.add("Red");//adding elements
	color_list1.add("Green");
	color_list1.add("Black");
	color_list1.add("Pink");
	System.out.println("Second ArrayList "+color_list);
	List<String>ob=new ArrayList<String>();
	System.out.println("Comparing elements");
	for(String s:color_list)
		ob.add(color_list1.contains(s)?"Yes":"No");
	System.out.println(ob);
	}

}