package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< Integer, String> hm = new HashMap<Integer, String>();
		hm.put(01, "damon");
		hm.put(03, "lion");
		hm.put(04, "Delta");
		hm.put(02,"elion");
		
		
		
		System.out.println(hm);
		//hm.remove(01);
		System.out.println(hm);
		
		System.out.println("-----------------------------------------");
		
		for(Map.Entry<Integer, String> entry : hm.entrySet()) { 
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		hm.forEach((k,v) -> System.out.println(k + ":" + v)) ; 
		
	
	}

}
