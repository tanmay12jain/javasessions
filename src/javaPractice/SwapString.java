package javaPractice;

/**
 * Question 2: Write a Java Program to swap two given Strings Solution 2. As
 * asked in the above question, for swapping of two strings we need to use the
 * substring method of the String class in Java. Substring method returns part
 * of the string.
 * 
 * We have the start index and end index in the substring method where start
 * index is inclusive and end index is exclusive.
 * 
 * Below is the Java Program to swap two Strings.
 */

public class SwapString {
	public static void main (String[] args) {
	String s1 = "Tanmay";
	String s2= "Jain";
	
	s1=s1+s2;
	System.out.println(s1);
	
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println("now s1 is " + s1);
	System.out.println("now s2 is "+s2);
	
	}
}
//https://martinfowler.com/bliki/PageObject.html