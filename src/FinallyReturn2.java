public class FinallyReturn2 {
	public int m1() {
		try {
			System.out.println("I am in try block");
			int x = 10 / 0;
			System.out.println("Result: " + x);
		} catch (ArithmeticException ae) {
			System.out.println("I am in catch block");
			return 40;
		} finally {
			System.out.println("I am in finally block");
			return 50;
		}
		
	}

	public static void main(String[] args) {
		FinallyReturn2 obj = new FinallyReturn2();
		System.out.println(obj.m1());
	}
}