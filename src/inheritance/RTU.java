package inheritance;

public class RTU extends AICTE{
	String type;
	public void univercityType(String type) {
		System.out.println("This is a "+type+" university");
		this.type=type;
	}
	public void rtuDegrees() {
		System.out.println("we have 2 types of degree colllages: /n 1. Medical /n 2. Engineering");
	}
}
