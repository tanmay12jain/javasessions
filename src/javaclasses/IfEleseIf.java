package javaclasses;

public class IfEleseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 999;
        int b = 600;
        int c = 1000;
        int d = 200;
        
        if(a>b&&a>c&&a>d) {
        	System.out.println("a is greater");
        }
        else if (b>c&&b>d) {
        	System.out.println("b is greater");
        }
        else if (c>d) {
        	System.out.println("c is greater");
        }
        else {
        	System.out.println("d is the greater");
        }
        
        int x = 5;
        int y = 10;

        if (x > 0 && y > 0 && x < y && x * 2 <= y) {
            System.out.println("Hi");
        }
        
        if (x > 0 & y > 0 & x < y & x * 2 <= y) {
            System.out.println("Hello");
        }
	}

}
