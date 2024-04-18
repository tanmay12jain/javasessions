package a_1;

import java.lang.runtime.SwitchBootstraps;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Find out the greatest number out of three different given numbers: Input the
		 * 1st number: 25 
		 * 
		 * Input the 2nd number: 78 
		 * 
		 * Input the 3rd number: 87 Expected Output :
		 * 
		 * The greatest﻿: 87
		 */
		byte a = 25;
		byte b = 78;
		byte c = 87;

		if (a > b) {
			System.out.println(a + "is greater than" + b);

		} else if (a > c) {
			System.out.println(a + "is greater than" + c);

		} else if (b > c) {
			System.out.println(b + "is greater than" + c);

		}

		else {
			System.out.println(" the greatest : " + c);

		}

		/*
		 * 1.b : Find out the greatest number out of four different given numbers:
		 * 
		 * Input the 1st number: 25 
		 * 
		 * Input the 2nd number: 78 
		 * 
		 * Input the 3rd number: 87
		 * 
		 * Input the 4th number: 97
		 * 
		 * Expected Output :
		 * 
		 * The greatest﻿: 97
		 */

		byte a1 = 25;
		byte b2 = 78;
		byte c2 = 87;
		byte d2 = 97;

		byte great = a1;
		if (b2 > great) {
			great = b2;
		}
		if (c2 > great) {
			great = b2;
		}
		if (d2 > great) {
			great = d2;
		}

		System.out.println("the greatest no. : " + great);

		int a3 = 35;
		int b3 = -11;
		int num = b3;
		if (num > 0) {
			System.out.println(num + " is positive");
		} else {
			System.out.println(num + "  is negative");
		}
		// 3. WAP to check number is odd or even using If - Else

		int a4 = 28;
		if (a4 % 2 == 0) {
			System.out.println(a4 + " is even number");
		} else {
			System.out.println(a4 + " no. is odd");
		}

		// 4. WAP to check given alphabet character is Vowel or Consonant using Switch -
		// Case

		char a5 = 'i';
		switch (a5) {
		case 'a':
			System.out.println(a5 + " is vowel");
			break;
		case 'e':
			System.out.println(a5 + " is vowel");
			break;
		case 'i':
			System.out.println(a5 + " is vowel");
			break;
		case 'o':
			System.out.println(a5 + " is vowel");
			break;
		case 'u':
			System.out.println(a5 + " is vowel");
			break;

		default:
			System.out.println(a5 + " is consonent");
			break;
		}

		// 5. WAP to run your test cases in a specific environment like: QA, Stage, Dev,
		// UAT, Prod using using Switch - Case

		String a6 = "QA";
		switch (a6) {
		case "QA":
			System.out.println("Running the program into the " + a6);
			break;
		case "Stage":
			System.out.println("Running the program into the " + a6);
			break;
		case "Dev":
			System.out.println("Running the program into the " + a6);
			break;
		case "UAT":
			System.out.println("Running the program into the " + a6);
			break;
		case "Prod":
			System.out.println("Running the program into the " + a6);
			break;

		default:
			System.out.println("please specigy the env.");
			break;
		}

		/*
		 * 6. WAP to book the specific type of car from the Uber app using Switch -
		 * Case.
		 * 
		 * Car Type: Mini, Sedan, SUV, Premium
		 * 
		 * If user passes wrong car type, print please select the right car type
		 */

		String s1 = "minis";
		switch (s1.toLowerCase().trim()) {
		case "mini": {
			System.out.println("yee your uber " + s1 + " is booked");
			break;
		}
		case "sedan": {
			System.out.println("yee your uber " + s1 + " is booked");
			break;
		}
		case "suv": {
			System.out.println("yee your uber " + s1 + " is booked");
			break;
		}
		case "premium": {
			System.out.println("yee your uber " + s1 + " is booked");
			break;
		}

		default:
			System.out.println("please select the right car type");
			break;
		}

		/*
		 * 7. WAP to launch browsers using If-ElseIf and Switch Case.
		 * 
		 * Browser: Chrome/Firefox/IE/Safari
		 * 
		 * If user passes wrong browser, print please pass the right browser name
		 */

		String broserNameString = "firefox";
		if (broserNameString == "chrome") {
			System.out.println("Launching the " + broserNameString + " browser");
		} else if (broserNameString == "safari") {
			System.out.println("Launching the " + broserNameString + " browser");
		} else if (broserNameString == "firefox") {
			System.out.println("Launching the " + broserNameString + " browser");
		} else if (broserNameString == "edge") {
			System.out.println("Launching the " + broserNameString + " browser");
		} else {
			System.out.println("please pass the right browser name");
		}

		switch (broserNameString.toLowerCase().trim()) {
		case "chrome": {
			System.out.println("yee your uber " + broserNameString + " is launched");
			break;
		}
		case "firefox": {
			System.out.println("yee your uber " + broserNameString + " is launched");
			break;
		}
		case "safari": {
			System.out.println("yee your uber " + broserNameString + " is launched");
			break;
		}
		case "edge": {
			System.out.println("yee your uber " + broserNameString + " is launched");
			break;
		}

		default:
			System.out.println("please select the right browser type");
			break;
		}
		/*8 
		 * WAP to define the interest rate on the basis of Loan type using Switch Case
		 * 
		 * Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		 * 
		 * For Housing Loan, if user’s salary is less than 35000 USD - print : NOT
		 * APPLICABLE FOR Housing Loan
		 */
		String loantype = "Housing Loan";
		int salary = 65000;
		switch(loantype)
		{
		case "Housing Loan":
		{
			if(salary>35000)
			{
				System.out.println("intrest rate is 10");
			}
			else {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			}
			break;
		}
		case "car loan":
		{
			System.out.println("intrest rate is 10");
			break;
		}
		case "personal loan":
		{
			System.out.println("intrest rate is 10");
			break;
		}
		case "education loan":
		{
			System.out.println("intrest rate is 10");
			break;
		}
		}
	}

}
