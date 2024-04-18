package encapsulation_a;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("mukesh");
		p.setAge(55);
		p.setGender("male");
		
		p.printinfo();

	}

}
/*
 * Q1: What is encapsulation and how does it relate to object-oriented programming?
 * - Hiding the data members of the class is called encapsulation
 * - Hiding implementation of the logic / functionalities is called encapsulation.
 * - Encapsulation is one of the four  fundamental piller of the oops The idea is to encapsulate the internal 
 * details of an object's implementation, providing a protective barrier and exposing only a well-defined interface to the outside world. 
 * 
 * Q2: Why is it important to use getter and setter methods instead of accessing attributes directly?
 * Private attribute accessed directly in the same class only so we create the public getter and setter method to access them outside of the class and store some values into the private variable
 * 
 * Q3: How can encapsulation improve the security and reliability of a program?
 * 
 * 
 */