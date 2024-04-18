package javaPractice;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		int fiblength;

// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		fiblength = sc.nextInt();

		int[] num = new int[fiblength];
// Assign values 0 and 1 to the 0 and 1 indices of the defined array
		num[0] = 0;
		num[1] = 1;

// Logic for getting the values of all the indices of the array using for loop
		for (int i = 2; i < fiblength; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		System.out.print("fibonacci series: ");
// Printing the fibonacci series
		for (int i = 0; i < fiblength; i++) {
			System.out.print(num[i] + " ");
		}

	}

}

/*
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {     	
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
*/