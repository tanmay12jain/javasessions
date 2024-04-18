package javaPractice;

public class ReverseAnArray {

	public static void main(String[] args) {
		/**
		 * Question 10: Write a Java Program to reverse an array? Solution 10: In this
		 * problem, we are given an array of characters as input. This problem can be
		 * solved by writing a while loop.
		 * 
		 * By using a third variable, we reverse the array as below.
		 */

		char[] s = { 'a', 'b', 'c', 'd', 'e' };

		int right = s.length - 1;
		int left = 0;

		while (left < right) {
			char c = s[left];
			s[left] = s[right];
			s[right] = c;

// Increment the left by 1 and Decrement the right by 1
			left += 1;
			right -= 1;
		}

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}

}
