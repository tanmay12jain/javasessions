
package javaPractice;

public class PrintNumWithoutUsingLoopExample {
	/**
	 * Question 20: Write a Java Program to print numbers 1 to 100 without using any
	 * loop(for/while/do-while). Solution 20: In this problem, to print the numbers
	 * between 1 to 100 we will use the if statement and check the condition.
	 * 
	 * We will check the condition i.e. num value should be less than equal to 100
	 * and then increment it till it reaches to 100 and thus printing each number.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		printnum(1);

	}

	public static void printnum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printnum(num);

		}

	}

}