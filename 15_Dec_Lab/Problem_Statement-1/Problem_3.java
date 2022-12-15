package Lab_15_Dec;

import java.util.*;
import java.util.Map.Entry;

public class Problem_3 { //main class
	private HashMap<String, String> M1;
	String CountryMap; //instance variable CountryMap
	public Problem_3() { //constructor
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) { //1st method
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) { //2nd method 
		return M1.get(CountryName); //return country name
	}
	
	public String getCountry(String capitalName) {//3rd method
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey(); //return capital name
		}
		
		return null; //if capital is not present return null
	}
	
	public HashMap<String, String> swapKyeValue() { // method to swap HasMap
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();//using Entry and it's entrySet method
		Iterator<Entry<String, String>> it = set.iterator();//using iterator
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() { //method for creating ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet(); //using Entry and it's entrySet method
		Iterator<Entry<String, String>> it = set.iterator(); //using iterator
		
		while (it.hasNext()) { //using while loop
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	public static void main(String[] args) {
		Problem_3 countryMap = new Problem_3(); //creating object of main class

		countryMap.saveCountryCapital("India", "Delhi"); //storing country and it's capital
		countryMap.saveCountryCapital("Japan", "Tokyo"); //storing country and it's capital
		
		System.out.println(countryMap.getCapital("Japan")); //retrive capital by it's country name
		System.out.println(countryMap.getCountry("Delhi")); //retrive country by it's capital name
		System.out.println("-----------------ArrayList--------------------");
		System.out.println(countryMap.toArrayList()); //print the array list
		System.out.println("-----------------Swap key value---------------");
		HashMap<String, String> M2 = countryMap.swapKyeValue(); //print the swap values
		System.out.println(M2);
	}
}