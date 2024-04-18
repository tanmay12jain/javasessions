
package javaPractice;

import java.util.Arrays;

public class ShiftAllZerosRightExample {

	/**
	 * Question 21: Write a Java Program to shift all zeros on the right. 
	 * Solution 21: In this Java Program, we create a new array of the same length as the
	 * given array and assign all the non zero values in the new array.
	 * 
	 * Below is the Java Program:
	 * 
	 * @param a
	 * @return
	 */

	public static int[] shiftAllZerosRight(int[] a) {
//		if (a.length == 1) {
//			return a;
//		}

		int[] newArray = new int[a.length];

		int count = 0;
		for (int number : a) {
			if (number != 0) {
				newArray[count] = number;
				count++;

			}
		}
		return newArray;

	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 0, 2, 0, 3, 0, 0, 0 };

		System.out.println(Arrays.toString(shiftAllZerosRight(inputArray)));

	}

}