package a_1;

public class LoopA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. WAP to print following output:
		 * 
		 * I am Batman﻿
		 * 
		 * I am Batman﻿
		 * 
		 * I am Batman﻿
		 * 
		 * I am Batman
		 * 
		 * I am Batman
		 * 
		 */
		for (int bat = 1; bat <= 5; bat++) {
			System.out.println("I am Batman");
		}
		/*
		 * 2. WAP to print following output:
		 * 
		 * I am Batman 1
		 * 
		 * I am Batman 2
		 * 
		 * I am Batman 3
		 * 
		 * I am Batman 4
		 * 
		 * I am Batman 5
		 * 
		 * I am Batman 6
		 * 
		 * I am Batman 7
		 * 
		 * I am Batman 8
		 * 
		 * I am Batman 9
		 * 
		 */
		for (int batman = 1; batman <= 9; batman++) {
			System.out.println("I am Batman " + batman);

		}

		// 3. WAP to print 10 to 1 using for, while and do-while loop

		// for
		for (int ifor = 10; ifor >= 1; ifor--) {
			System.out.println(ifor);

		}
		System.out.println("----------------");
		int iwhile = 10;
		while (iwhile >= 1) {
			System.out.println(iwhile);
			iwhile--;
		}

		System.out.println("----------------");

		int doWhile = 10;
		do {
			System.out.println(doWhile);
			doWhile--;
		} while ((doWhile >= 1));
		// 4.Write a program in Java to print "Hello World" ten times using while loop
		int ihello = 1;
		while (ihello <= 10) {
			System.out.println("Hello World");
			ihello++;
		}
		// 5. Write a program in Java to print all the multiplication of 5 from 1 to 100
		// using while /for/do-while loop

		int mFive = 1;
		while (mFive <= 100) {
			if (mFive % 5 == 0) {
				System.out.println(mFive);
			}
			mFive++;
		}

		String mfivePrint = "";
		for (int mfor = 1; mfor <= 100; mfor++) {
			if (mfor % 5 == 0) {
				mfivePrint = (mfivePrint + mfor + ",");
			}
		}
		System.out.println(mfivePrint);
		System.out.println("---------------------------");

		String doWhileprintString = "";
		int dowhilel = 1;

		do {
			if (dowhilel % 5 == 0) {
				doWhileprintString = (doWhileprintString + dowhilel + ",");

			}
			dowhilel++;

		} while (dowhilel <= 100);
		System.out.println(doWhileprintString);

		System.out.println("---------------------------");

		// 6. Print all odd and even numbers between 1 to 100

		for (int iodd = 1; iodd < 100; iodd++) {
			System.out.println(iodd);
			iodd = iodd + 1;
		}
		int doeven = 1;

		do {
			if (doeven % 2 == 0) {
				System.out.println(doeven);
			}
			doeven++;
		} while (doeven <= 100);

		// 7. What will be the output of this program:
		// int i = 1;

		// while(i<=1){

		// System.out.println("Hi Java");

		// 8. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while and for loop.

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		int cch = 65;
		while (cch <= 90) {
			System.out.println((char) cch + " = " + cch);
			cch++;
		}

		char cchh = '0';
		do {
			System.out.println(cchh + " = " + (byte) cchh);
			cchh++;
		} while (cchh <= '9');

		System.out.println("------------------------");
		// 9. Print the following series: 

		//1.0 2.0 3.0  ...... 10.0 

		//0 9 18 27 36 …99
		
		for (float f = 1.0f; f<=10.0;f++ ) {
			System.out.print(f+" ");
		}
		
		System.out.println("------------------------");
		
	//	10. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		char vowels = 'a';
		while(vowels<='z') {
			if(vowels=='a' | vowels=='e'|| vowels=='i' || vowels =='o' || vowels=='u' ) {
				System.out.print(vowels+" ");
		}
			vowels++;
			
			 }
		
		//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		int x = 1; 
		while(x<=10){ 
		System.out.println(x);
		if(x % 7 == 0){
		System.out.println("bye, see you tomorrow");
		break; 
		} 
		x++;
		}
	}
			
			
		
		

}

		



