package javaPractice;

public class FirstAndLastPositionExample {
	/**
	 * First Index is: 3 Last Index is: 4
	 * 
	 * Question 19: Write a Java Program to print the first and last position of a
	 * number in a given array. Solution 19: In this problem, we have been given a
	 * target value(in this case it is 8) and we need to find its first and last
	 * position of the target value.
	 * 
	 * Below is the java program :
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 5, 7, 7, 8, 8, 10 };

		int firstIndex = -1;
		int lastIndex = -1;

		int target = 8;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == target && firstIndex == -1) {
				firstIndex = i;
			}

			if (array[i] == target && firstIndex != -1) {
				lastIndex = i;
			}
		}

		System.out.println("First Index is: " + firstIndex + " Last Index is: " + lastIndex);

	}

}