package constrictor_a;

import java.util.jar.Attributes.Name;

public class Person {
	/*
	 * Assignment 1:
	 * 
	 * Create a Java class named "Person" with the following instance variables:
	 * 
	 * name (String)
	 * 
	 * age (int)
	 * 
	 * gender (char)
	 * 
	 * height (double)
	 * 
	 * Create a constructor for the Person class that takes in the name, age,
	 * gender, and height as parameters and initializes the instance variables.
	 * 
	 * Create a main method that creates two instances of the Person class using the
	 * constructor and prints out their information.
	 * 
	 * Questions:
	 * 
	 * What is the purpose of a constructor in Java?
	 * 
	 * How does a constructor differ from a regular method in Java?
	 * 
	 * Can a Java class have multiple constructors? If so, how are they
	 * differentiated?
	 * 
	 * What happens if a constructor is not defined in a Java class?
	 * 
	 * If you don’t implement any constructor in your class, the Java compiler
	 * inserts default constructor into your code on your behalf. You will not see
	 * the default constructor in your source code (the .java file) as it is
	 * inserted during compilation and present in the bytecode (.class file).
	 * 
	 * Can a constructor call other methods or constructors within the same class?
	 */
	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		test();
	}
	
	public void test() {
		System.out.println("passing in the constructor");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("sunita", 30, 'F', 34.44);
		System.out.println(p1.name + " "+ p1.age+ " "+ p1.gender+" "+ p1.height);
		
		Person p2 = new Person("Prakash", 40, 'M', 30.44);
		System.out.println(p2.name + " "+ p2.age+ " "+ p2.gender+" "+ p2.height);
	}
	
	/*Q1: what is the purpose of the constructor in java?
	 * Ans: Constructor is used for initialize the non static variable of the class with the local variables using this keyword 
	 * Constructor is used for ristrict the obkject creation, objects will be depends on the use case 
	 * 
	 * Q2: How does a constructor differ from a regular method in Java?
	 * Ans: Constructor return noting, here constructor does't have any return type
	 * constructor name should be same as the class name 
	 * Constructor is only used for the initializing the class object, but methods is used for business logic 
	 * java complier provide the default construct ehen java class doesn,t have any constructor
	 * 
	 * Q3: Can a Java class have multiple constructors? If so, how are they differentiated?
	 * Ans: yes java class can have multiple constructor.
	 * Here constructor signature should not same if we are declaring the  constructors, to differ the constructors to
	 *  each other in same class we use different parameter in constructor, this is known as constructor overloading 
	 *  
	 *Q4:  What happens if a constructor is not defined in a Java class?

 	  Ans: If you don’t implement any constructor in your class, the Java compiler inserts default constructor into your code 
 	  on your behalf. You will not see the default constructor in your source code (the .java file) as it is inserted during compilation 
 	  and present in the bytecode (.class file).
 	  
 	  Q5: Can a constructor call other methods or constructors within the same class?
 	  Ans: Yes we can call the construcor with in the constructor. this is known as constructor chaining and we use this() method for the constructor
 	  chaining. 
 	  we can also called the another method in the constructor.
	 * */
	
	
	

}
