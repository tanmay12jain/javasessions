
package javaPractice;

public class MissingNumberInArrayExample {
	/**
	 * Question 25: Write a Java Program to print the missing number in a given
	 * Array. Solution 25: To solve this problem, we first add the elements of the
	 * given array(sum1) and then add the range of elements of the array(sum2). Then
	 * we subtract sum2 - sum1 which would give us the missing number in the given
	 * array.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int sum1 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}

		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Missing number in Array: " + (sum2 - sum1));

	}

}