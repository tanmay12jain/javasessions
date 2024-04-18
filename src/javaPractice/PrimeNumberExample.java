package javaPractice;

public class PrimeNumberExample {
	/**
	 * Question 6: Write a Java Program to check if a number is Prime or not.
	 * Solution 6. A prime number is a number which is divisible by 1 and itself.
	 * This problem can be solved by a simple for loop and we check the condition
	 * that the given number returns a remainder value.
	 * 
	 * If the remainder is 0, then the number is not prime. Else its a prime number.
	 * 
	 * Below is the Java Program:
	 * 
	 * @param num
	 * @return
	 */

	public static boolean isPrime(int num) {
// Validate that the number is neither less than 1 nor equal to 1.
// It should return false as it cannot be a prime number
		if (num <= 1)
			return false;

// Logic to check if a number is prime or not. If its Prime, returns true else
// return false
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
// Pass the integer value to check whether it is prime or not.
		System.out.println(isPrime(11));

	}

}