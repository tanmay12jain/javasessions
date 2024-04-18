
package javaPractice;

import java.util.Arrays;

public class RemoveDuplicateElementsExample {
	/**
	 * Question 22: Write a Java Program to remove the duplicates from an array.
	 * Solution 22: In this problem, we need to find the total count of unique
	 * elements. We iterate through the array and check if the adjacent elements are
	 * not duplicate.
	 * 
	 * Below is the Java Program:
	 * 
	 * @param arr
	 * @return
	 */

	static int removeDupElements(int[] arr) {
		Arrays.sort(arr);
		if (arr.length == 0)
			return 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}

		return j + 1;
	}

	public static void main(String[] args) {

		int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		System.out.println(removeDupElements(array));
	}

}