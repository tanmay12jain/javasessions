
package javaPractice;

public class SecondLargestElementOfArray {
	/**
	 * Question 16: Write a Java Program to print the second largest number in a
	 * given array. Solution 16: In this problem, to find the second largest number
	 * in the array, first we sort the array and then using the for loop we find the
	 * second largest number in reverse order.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 6, 9, 9 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				System.out.println("The second largest element " + arr[i]);
				break;
			}
		}

	}

}