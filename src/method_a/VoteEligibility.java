package method_a;

public class VoteEligibility {
	//6. A person is eligible to vote if his/her age is greater than or equal to 18.
	//Define a method to find out if he/she is eligible to﻿ vote. - return true/false
	
	public boolean eligibility(int age) {
		return (age>=18);
	}

	public static void main(String[] args) {
		VoteEligibility elig = new VoteEligibility();
		boolean vote = elig.eligibility(17);
		if (vote) {
			System.out.println("user is eligible for vote");
			}
		else {
			System.out.println("User is not eligible for vote");
		}

	}

}
