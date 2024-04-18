
package javaPractice;

public class SwapNumbersExample {

	public static void main(String[] args) {
		/**
		 * Question 9: Write a Java Program for swapping of 2 numbers. Solution 9: In
		 * this problem , we would be given two numbers as input. We need to swap those
		 * 2 numbers which can be done a simple logic.
		 * 
		 * Below is the java program.
		 * 
		 * 
		 */

		int num1 = 10;
		int num2 = 20;

// Logic to swap 2 numbers.
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}