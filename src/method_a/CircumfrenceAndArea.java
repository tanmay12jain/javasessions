package method_a;

public class CircumfrenceAndArea {
//	3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
	public static double circumfrence(double r) {
		double c = Math.PI*2*r;
		return c;
	}
	
	public static double area(double r) {
		double area = Math.PI*r*r;
		return area;
	}
	public static void main(String[] args) {
		
		double circumfrence = CircumfrenceAndArea.circumfrence(4);
		System.out.println(circumfrence);
		
		double area = CircumfrenceAndArea.area(10);
		System.out.println(area);

	}

}
