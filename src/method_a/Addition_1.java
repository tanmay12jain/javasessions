package method_a;

public class Addition_1 {
	
	//1. Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("addition of the number is " +c);
	}
	
	public void substraction(int a, int b) {
		int c = a - b;
		System.out.println("substraction of the number is " +c);
	}
	
	public void multiplicaton(int a, int b) {
		int c = a * b;
		System.out.println("multiplication of the number is " +c);
	}
	public void division(int a, int b) {
		int c = a / b;
		System.out.println("division of the number is " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_1 addSub = new Addition_1();
		addSub.addition(12, 32);
		addSub.substraction(33,980);
		addSub.multiplicaton(10, 10);
		addSub.division(88,11);
		




	}

}
