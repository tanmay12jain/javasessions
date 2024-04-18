package method_a;

import java.util.Scanner;

public class Greades {
	/*
	 * 7. Write a program which will ask the user to enter his/her marks (out of
	 * 100). Define a method that will display grades according to the marks entered
	 * as below:
	 * 
	 * Marks        Grade
	 * 
	 * 91-100         AA
	 * 
	 * 81-90          AB
	 * 
	 * 71-80          BB﻿
	 * 
	 * 61-70          BC
	 * 
	 * 51-60          CD
	 * 
	 * 41-50          DD
	 * 
	 * <=40          Fail
	 */
	
	
	public void userGreades(int marks) {
		if(marks>90 && marks<=100) {
			System.out.println("grade is AA");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("grade is AB");
		}
		else if(marks>70 && marks<=80) {
			System.out.println("grade is BB");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("grade is BC");
		}
		else if(marks>50 && marks<=60) {
			System.out.println("grade is CD");
		}
		else if(marks>40 && marks<=50) {
			System.out.println("grade is DD");
		}
		else {
			System.out.println("Student is fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks out of 100");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		Greades gd = new Greades();
		gd.userGreades(marks);
		
	}

}
