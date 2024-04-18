package method_a;


public class MaxandMin {
//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	public void maxNumber(int a, int b, int c) {
		if (a>b&&a>c) {
			System.out.println(a+ " is greatest");
		}
		else if(b>c)
			System.out.println(b+ " is greatest");
	
	else {
		System.out.println(c+ " is greatest");
	}
	}
	
	public void minnumber(int a, int b, int c) {
		if(a<b&&a<c) {
			System.out.println(a+ " is lowest");
		}
		else if(b<c) {
			System.out.println(b+ " is lowest");
		}
		else {
			System.out.println(c+" is lowest");
		}
	}
	public static void main(String[] args) {
		MaxandMin maxmin = new MaxandMin();
		maxmin.maxNumber(12,33,4);
		maxmin.minnumber(12,33,4);

	}

}
