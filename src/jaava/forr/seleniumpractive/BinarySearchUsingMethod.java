package jaava.forr.seleniumpractive;

import java.util.Arrays;

public class BinarySearchUsingMethod {
	public static void main(String args[]) {
		int array[] = { 10, 20, 30, 40, 50, 60 }; // Should be in order
		System.out.println(Arrays.binarySearch(array, 30));
	}
}
