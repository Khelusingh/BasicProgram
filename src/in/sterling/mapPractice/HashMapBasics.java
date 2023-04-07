package in.sterling.mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
	public static void main(String[] args) {
		HashMap<String, String> country = new HashMap<String, String>();
		country.put("India", "New Delhi");
		country.put("Pakistan", "Islamabad");
		country.put("Nepal", "Kathmandu");
		country.put("China", "Beijing");
		country.put("United State", "Washington DC");
		country.put(null, "Dhaka");
		country.put(null, "Landon");

		// System.out.println(country.get(null));

		// key iteration
		Iterator<String> itr = country.keySet().iterator();
//		while (itr.hasNext()) {
//			String string = (String) itr.next();
//			System.out.println(string + "\t " + country.get(string));
//		}

		// key-value iteration using entrySet

		Iterator<Entry<String, String>> itr1 = country.entrySet().iterator();

//		while (itr1.hasNext()) {
//			Entry<String, String> entry = itr1.next();
//			System.out.println("Key is : " + entry.getKey() + " And the values is : " + entry.getValue());
//		}

		
		//using foreach method
		
		country.forEach((k,v)->System.out.println("Key is : "+k+"\t"+" Value is : "+v));
		
		
	}
}
