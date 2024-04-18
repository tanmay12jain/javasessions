package constrictor_a;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.make + " " + c1.model+ " " + c1.year);
		
		Car c2 = new Car("Honda", "SUV", 0 );
		System.out.println(c2.make + " " + c2.model+ " " + c2.year);
	}
}

/*
 * Q1: What is the purpose of a default constructor in Java?
 * Ans: When no constructor is defined by the programmer, java will add a default constructor to the class to initialize 
 *  attributes of object by their default values
 *  
 *  Q2: Can a default constructor take in parameters?
 *  Default construct has no values when we write parameter in constructor, it will become parameterized constructor
 *  
 *  Q3: Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?
 *  Ans: yes, constructor can be overloaded. and it helps to stop the creation of unneccessory object.
 *   Constructor helps us to perform different task with different parameters
 *   
 *   Q4: Can you create an object of a Java class without calling a constructor?
 *   no, constructor is neccessory  to initiate the variable inside newly created object by default value or with some value, 
 *   if we don't provide any constructor in class compiler will add the constructor by default
 *   
 *   Q5: How are instance variables accessed and modified outside of the class they are defined in?
 *   instance variable is accessed by the object reference of that class. and we can modified in two ways,
 *   fist one by passing the values in the constructor when the instance is created
 *   second one it use object reference.variable name and assign the values 
 *   
 * */
 