
package javaPractice;

public class MaxConsecitivesOnesExample {
	/**
	 * Question 18: Write a Java Program to print the maximum consecutive ones in a
	 * given array. Solution 18: In the above problem, we need to find the maximum
	 * consecutive ones in a given array. To solve this, we run a for loop and check
	 * each index if it is equal to 1, we increase the counter. Then we use the
	 * Math.max() to find out the max counter value.
	 * 
	 * Below is the Java Program:
	 * 
	 * @param nums
	 */
	static void findConsectiveOnes(int[] nums) {

		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			while (i < nums.length && nums[i] == 1) {
				count++;
				i++;
			}

			if (max < count) {
				max = count;
			}

			count = 0;

		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
		findConsectiveOnes(array);

	}

}
