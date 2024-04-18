package hashmap;

import java.util.LinkedHashMap;

public class LinkedHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> empData = new LinkedHashMap<String, String>();

		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");

		
		System.out.println(empData);
	}

}
