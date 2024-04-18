package method_a;

public class EvenOdd {
	int num;
	//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.
	public boolean evenOddNum(int num) {
		this.num=num;
			return num%2==0;
	} 
	public static void main(String[] args) {
		EvenOdd eOdd = new EvenOdd();
		boolean number = eOdd.evenOddNum(21);
		if(number) {
			System.out.println(eOdd.num+" is even number");
		}
		else {
			System.out.println(eOdd.num+" is odd number");
		}
	}

}
