package javaclasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrarypract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] smallLetters = new char[26];
		for(int i=0;i<=25;i++) {
			smallLetters[i]=(char)('a'+i);
		}
		System.out.println(Arrays.toString(smallLetters));
		
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
		for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { System.out.print("*");
		}
		System.out.println(); // Go to next line
		}
		int n, reverse = 0;
		System.out.println("Enter the number to reverse"); Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while( n != 0 )
		{
		reverse = reverse * 10; reverse = reverse + n%10; n = n/10;
		}
		System.out.println("Reverse of entered number is "+reverse);
		
		
		int a, b, c, d;
		
		System.out.println("Enter range of numbers to print their multiplication table");
		Scanner in1 = new Scanner(System.in);
		a = in1.nextInt(); b = in1.nextInt();
		for (c = a; c <= b; c++) { System.out.println("Multiplication table of "+c);
		for (d = 1; d <= 10; d++) { System.out.println(c+"*"+d+" = "+(c*d));
		}
		}
		
			}
	

}
