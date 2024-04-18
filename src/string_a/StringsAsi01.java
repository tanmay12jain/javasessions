package string_a;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class StringsAsi01 {
	
	public void reverseNumber(String name) {
		System.out.println(name);
		char [] st = new char[name.length()];
		int j = 0;
		for(int i = name.length()-1; i>=0 ;i--) {
		  st[j]=name.charAt(i);
		  j++;
		}
		
		System.out.println(st);
	}

	public static void main(String[] args) {
		// 1.  Write a program to check two different strings equality.

		String diff01 = "This is java string";
		String diff02 = "This is my String";

		if (diff01.equalsIgnoreCase(diff02)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}

//		2. Remove all  spaces in a String . 
//		For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String spaceRemove = "          Hello       Everyone       ";
		String aspaceremoved = spaceRemove.replaceAll("\\s+", "");
		System.out.println("String with removed spaces: " + aspaceremoved);
		
		//3. Write a program that will  print out the last character and first character of a word.
		String firstlaat = "This is first and last string";
		String [] fl = firstlaat.split(" ");
		for (int i =0; i<fl.length;i++) {
			System.out.println("word is: "+fl[i]);
			System.out.println("First char of the word is: "+fl[i].charAt(0));
			System.out.println("last char of the word is: "+fl[i].charAt(fl[i].length()-1));
			
		}
		
		//4. Write a program to verify a word or a character contained in the sentence.
		System.out.println("---------------------------------------------");
		boolean find = firstlaat.toLowerCase().contains("last");
		System.out.println(find);
		String expected = "First";
		for (int i =0; i<fl.length;i++) {
		
			if(expected.equals(fl[i])) {
				System.out.println(expected+" word is in the string");
				break;
			}
			else if (expected.equals(fl[i].charAt(fl[i].length()-1))) {
				System.out.println(expected+" char is in the string");		
				break;
			}
			else {
				if(i==fl.length-1) {
				System.out.println(expected+" is not present in the String");
				}
			}
				
			
		}
		
		//5.Write a function/ method to reverse your own name.
		StringsAsi01 sAsi01 = new StringsAsi01();
		sAsi01.reverseNumber("Tanmay jain");

		// 6. Write a program that gives you the last half of the string.

		String fullString = "Hello my name is tanmay jain";
		int slength = fullString.length();
		int halflen = slength/2;
		
		String lastPartOfString =fullString.substring(halflen, slength);
		System.out.println(lastPartOfString);
		

		

		
	} 

}
