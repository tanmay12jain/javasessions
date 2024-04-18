package method_a;

public class ProductOfdouble_2 {
	//2. Define a method that returns the product of two double numbers entered by user.
	
	public double productofTwoNum(double a,double b) {
		double c = a +b;
		return c;
		
	}

	public static void main(String[] args) {
		ProductOfdouble_2 product = new ProductOfdouble_2();
		double d = product.productofTwoNum(23.33, 44.98);
		System.out.println(d);
		
		
	}

}
