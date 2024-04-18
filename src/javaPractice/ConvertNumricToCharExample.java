
package javaPractice;

public class ConvertNumricToCharExample {

	static void convertNumToChar(String s) {
		/**
		 * Question 13: Write a Java Program to generate Output "aabbbcccc" with the
		 * input "a2b3c4" Solution 13: In the above problem, we have the numbers in the
		 * input. We need to print the as many characters same the number value.
		 */

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				int a = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < a; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}

	}

	public static void main(String[] args) {

		String str = "a2b3c4"; // output = aabbbcccc
		convertNumToChar(str);

	}

}