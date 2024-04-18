package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayListExample {
	/**
	 * Question 24: Write a Java Program to convert HashMap to ArrayList. Solution
	 * 24: To solve this problem, we can convert the HashMap keys into an ArrayList
	 * and then the HashMap values into an ArrayList.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		HashMap<String, String> hash_map = new HashMap<>();

		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Germany", "Berlin");
		hash_map.put("Australia", "Canberra");

		// convert hashmap keys to ArrayList

		List<String> countryNameList = new ArrayList<>(hash_map.keySet());
		System.out.println("HashMap keys are: ");
		for (String s : countryNameList) {
			System.out.println(s);
		}

		System.out.println("************************");

// convert hashmap values to ArrayList
		List<String> capitalNameList = new ArrayList<String>(hash_map.values());
		System.out.println("HashMap values are: ");
		for (String s : capitalNameList) {
			System.out.println(s);
		}

	}

}