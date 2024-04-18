package constrictor_a;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1, "Mukesh", 100);
		
		System.out.println(e.getId() +" "+ e.getName()+ " " +e.getSalary());
 
	    double sal = e.getSalary();
	    sal = sal + 10 % sal;
	    
	    e.setSalary(sal);
	    
	    System.out.println("salary after raise "+e.getId() +" "+ e.getName()+ " " +e.getSalary());
	    

	}

 }
/* Q1: What is the purpose of a getter method in Java?
 * Ans: To access the private members of the class into another class we use getter methods 
 * 
 * Q2: Can a getter method return void?
 * Ans: No getter method cant be void, because it is returning private members of the class.
 * 
 * Q3: What is the access level of a getter method in Java?
 * Ans: Access level of getter method should be Public because that method is getting called by other classes
 * 
 *	Q4. What is the purpose of a setter method in Java?
 *Ans: To set the values of the private data members of the class, we can set the values without exposting the original data member
 *
 *Q5: Can a setter method return a value other than void?
 *yes we can return but there is no use of that value, setter methods are used for the set the value f the variabls 
 *
 *
 * 
 * */
