package constrictor_a;

public class TestbankAccount {

	 	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("234234324324", 1000.11);
		double deposited01 =ba.deposite(15);
		System.out.println(deposited01);
		
		double deposited02 =ba.deposite(544.99);
		System.out.println(deposited02);
		
		double withrow = ba.withdrow(33.33);
		System.out.println(withrow);
		
		double withrow02 = ba.withdrow(22.33); 
		System.out.println(withrow02);
		
	
	}

}
/*
 *Q1: What is the purpose of an instance variable in Java?
 *Ans: instance variable store the variable data, 
 *    instance variable state is saved in heap as long as object exist 
 *    by using constructor we can initialize the properties 
 *    
 *Q2: How are instance variables different from local variables in Java?
 *- Instance variable bound to the object but local variable bound to the constructor and methods     
 *- We can use access modifier to the instance variable but for local variable we can not use access modifier 
 *- Instnace variable can have default values but local variable can not.
 *- instance variables create when creating the object and local variable created when entering the method or a constructor
 *- Instance variable destroyers when destroying the object but local variable destroyed when exiting the method or constructor
 *
 *Q3: What is the access level of an instance variable in Java?
 *Public, protected, default, private
 *
 *Q4: What is the purpose of a method in Java?
 *- To perform certain task or operation we use . 
 *- so writing the bussiness logic functions are used
 *- In functions we right the logic, so when we run it this will perform some task 
 *-so we write the complex program in modules so they became manageable and small. 
 *- In code re-usability functions play a major role, we can call them any time 
 *
 Q5: Can a method call other methods within the same class?
 *Ans: yes method can call another method in same call, this will helps us to write 
 *the logic more clear and and programer will not see any useful method so we are encapsulating the internal implementation of the feature, we can only   methods
 *
 *
 */