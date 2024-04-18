
package javaPractice;

public class CountCapitalizedWordsInString {
	/**
	 * Question 11: Write a Java Program to get the count of Capitalized words in a
	 * String.
	 * 
	 * Solution 11: Capitalized words in a given String which are those words which
	 * starts with a Capital Letter. We need the total count of these words. This
	 * problem can be solved by using a for loop and iterate through each character
	 * in the String.
	 * 
	 * We also take a counter variable and increment it when any Capital character
	 * is encountered.
	 * 
	 * @param inputString
	 * @return
	 */

	public static int getCapsWordsInString(String inputString) {

		int counter = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(getCapsWordsInString("RahulShettyAcademy"));
	}

}


