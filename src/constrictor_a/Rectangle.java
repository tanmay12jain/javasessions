package constrictor_a;

public class Rectangle {
	/*
	 * Assignment 2:
	 * 
	 * Create a Java class named "Rectangle" with the following instance variables:
	 * 
	 * length (double)
	 * 
	 * width (double)
	 * 
	 * Create a default constructor for the Rectangle class that sets both the
	 * length and width to 0.0.
	 * 
	 * Create a constructor for the Rectangle class that takes in the length and
	 * width as parameters and initializes the instance variables.
	 * 
	 * Create a method in the Rectangle class named "calculateArea" that returns the
	 * area of the rectangle (length * width).
	 * 
	 * Create a main method that creates two instances of the Rectangle class using
	 * both constructors, calculates and prints out their respective areas.
	 * 
	 * Questions:
	 * 
	 * What is the purpose of a default constructor in Java?
	 * 
	 * How can you differentiate between a default constructor and a constructor
	 * that takes in parameters?
	 * 
	 * What is the access level of a constructor in Java?
	 * 
	 * Can a constructor be private? If so, why would you want to make a constructor
	 * private?
	 * 
	 * Can a constructor call a method from another class?
	 */
	
	double length;
	double width;
	
	public Rectangle() {
		length=0.0;
		width=0.0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		double area = length*width;
		return area;
	}
	
	public static void main (String[] args) {
		Rectangle r = new Rectangle();
		double rec1 =r.calculateArea();
		System.out.println(rec1);
		
		Rectangle r1 = new Rectangle(1.5,1.5);
		double rec2 =r1.calculateArea();
		System.out.println(rec2);
	}
}
//Q1: What is the purpose of a default constructor in Java?
/* Ans: default constructor is added by java compiler when invoked class doesn't have any constructor,
 *  it will initialse the attribute of object with default values
 *  
 *  Q2: How can you differentiate between a default constructor and a constructor that takes in parameters?
 *  default constructor doesn't have any parameter in declaration, Parameterized 
 *  constructor has parameters in declaration has local to global variable initialization in 
 *  constructor body local parameters pass in the constructor parameters
 *  
 * Q3: What is the access level of a constructor in Java?
 *  Access level for constructor is private, public and protected, and there are we don't use Access modifier 
 *  
 *  Q4: Can a constructor be private? If so, why would you want to make a constructor private?
 *  
 *  Yes, constructor can be private. we can not instanceiate the class when that class having private constructor, 
 *  so for blocking the object creation we can use the private constructor
 *  
 *  Q5: Can a constructor call a method from another class? 
 	Yes constructor call a method from the another class, but this is not recommnded practice to call other method 
 	
 	
 *   * */
