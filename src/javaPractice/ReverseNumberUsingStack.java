
package javaPractice;

import java.util.Stack;

public class ReverseNumberUsingStack {
	/**
	 * Question 15: Write a Java Program to reverse a number using Stack. Solution
	 * 15: In the above program, we will be using Stack to reverse a number. The
	 * idea is to get the digits using the % operator and push each digit in the
	 * Stack.
	 * 
	 * Once all digits are pushed in the stack, we pop each digit using the pop
	 * method. Stack is LIFO datastructure thus the output number will be a number
	 * in a reverse order.
	 * 
	 */

	static Stack<Integer> st = new Stack<>();

	static void push_digits(int number) {
		while (number != 0) {
			st.push(number % 10);
			number = number / 10;
		}
	}

	static int reverse_number(int number) {
		push_digits(number);
		int reverse = 0;
		int i = 1;

		while (!st.isEmpty()) {
			reverse = reverse + (st.peek() * i);
			st.pop();
			i = i * 10;
		}

		return reverse;
	}

	public static void main(String[] args) {

		int number = 3997;
		System.out.println(reverse_number(number));
	}

}
