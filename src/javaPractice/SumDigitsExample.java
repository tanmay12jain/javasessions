
package javaPractice;

public class SumDigitsExample {
	/**
	 * Question 5: Write a Java Program to print the sum of digits of a given
	 * integer. Solution 5: We can solve the question using a while loop. Using the
	 * % operator we get the remainder and keep adding to the sum variable until the
	 * number becomes 0. The total sum will be the total of all the digits of the
	 * given integer.
	 * 
	 * Below is the java program :
	 * 
	 * The above program will print the sum of all digits in the console. In the
	 * 
	 * @param num
	 * @return
	 */

	public static int getSumOfAllDigits(int num) {

// Declare variable sum which will store the sum of all digits.
		int sum = 0;

// Run a while loop until the num becomes 0.
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;

	}

	public static void main(String[] args) {

// We can pass any integer value of whose sum of the digits is required.
		System.out.println(getSumOfAllDigits(549));
	}

}