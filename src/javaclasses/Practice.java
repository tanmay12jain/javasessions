package javaclasses;

public class Practice {
	public void getMarks() {
		int a = 10;
		int b = 20;
		int c = 30;
		int total = a + b + c;
		System.out.println("total marks" + total);
	}

	public static void main(String[] args) {
		Practice m1= new Practice();
		Object t1 = m1.getMarks();
		System.out.println(t1+20);

	}

}
