package javaPractice;

public class ProductArrayExceptSelfExample {

	public static void main(String[] args) {
		/**
		 * Question 14: Write a Java Program to print the product of an array except
		 * self? Solution 14: In this problem, We need the output which is the product
		 * of the all the numbers in the array except self. Here we take two arrays,
		 * left_products and right_products in which we store the products of all
		 * numbers except self.
		 * 
		 * Then we multiply the left_products and right_products to get the output.
		 * 
		 * Below is the Java Program:
		 */

		int[] arr = { 1, 2, 3, 4 };
		int N = arr.length;

		int[] left_products = new int[N];
		int[] right_products = new int[N];

		int[] output_array = new int[N];
		left_products[0] = 1;
		right_products[N - 1] = 1;

		for (int i = 1; i < N; i++) {
			left_products[i] = arr[i - 1] * left_products[i - 1];
		}

		for (int i = N - 2; i >= 0; i--) {
			right_products[i] = arr[i + 1] * right_products[i + 1];
		}

		for (int i = 0; i < N; i++) {
			output_array[i] = left_products[i] * right_products[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.print(output_array[i] + " ");
		}

	}

}