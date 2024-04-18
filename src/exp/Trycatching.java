package exp;

public class Trycatching {
	
	public static void main (String args[]) {
		
		System.out.println("all good");
		System.out.println("all good");
		System.out.println("all good");
		
		try {
			int c = 9/0;
			System.out.println( " Good"+c);

		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Ae handled");
		}
		try {
			int c = 9/0;
			System.out.println( " Good"+c);

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		int c=0;
		if(c==0) {
			throw new MyExp("this is my exp");
		}

	}

}
