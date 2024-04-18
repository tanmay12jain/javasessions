package javaclasses;

public class StaticMethdConce {

	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get Info");
	}
	
	public void sendMail() {
		System.out.println("send Mail");
	}
	public static void main(String[] args) {
		
		name = "tom";
		System.out.println(name);

	}

}
