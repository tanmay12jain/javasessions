package method_a;

public class Factorial {

	/*
	 * 8. Write a program to print the factorial of a number by defining a method
	 * named 'Factorial'.
	 * 
	 * Factorial of any number n is represented by n! and is equal to
	 * 1*2*3*....*(n-1)*n. E.g.-
	 * 
	 * 4! = 1*2*3*4 = 24
	 * 
	 * 3! = 3*2*1 = 6
	 * 
	 * 2! = 2*1 = 2
	 * 
	 * Also,
	 * 
	 * 1! = 1
	 * 
	 * 0! = 1
	 * 
	 */

	// int num;

	public void factorial(int num) {

		for (int j = 0; j <= num; num--) {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(num + "! = " + fact);

		}
	}

	public static void main(String[] args) {
		Factorial ft = new Factorial();
		ft.factorial(10);

	}

}
