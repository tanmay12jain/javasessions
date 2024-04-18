
package javaPractice;

import java.util.HashMap;

public class FirstNonRepeatingCharacterinString {
	/**
	 * Question 17: Write a Java Program to print the first non repeating character
	 * in a given String. Solution 17: In the above problem, to find the first non
	 * repeating character, first we create a hashmap object and store each
	 * character as key and its respective count as values.
	 * 
	 * Then we run a for loop, and check the value of each character is equal to 1.
	 * If it matches then that is the first non repeating character.
	 * 
	 * Below is the java program:
	 * 
	 * @param s
	 * @return
	 */

	public static char firstNonRepeat(String s) {

		HashMap<Character, Integer> char_count = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (char_count.containsKey(c)) {
				char_count.put(c, char_count.get(c) + 1);
			} else {
				char_count.put(c, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (char_count.get(c) == 1)
				return c;
		}
		return '_';

	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeat("GeeksForGeeks"));

	}

}