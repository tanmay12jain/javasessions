package javaclasses;import java.awt.event.MouseWheelEvent;

public class Carr {
	
	String name;
	int age;
	String lincence ;
	static int wheel=3;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr c1 = new Carr();
		c1.name = "Audi";
		c1.age = 12;
		c1.lincence="234324";
		
		Carr c2 = new Carr();
		c2.name = "hundai";
		c2.age = 13;
		c2.lincence="popadk";
		
		Carr c3 = new Carr();
		c3.name = "suzuki";
		c3.age = 14;
		c3.lincence="99899";
		
		Carr c4 = new Carr();
		c4.name = "tyota";
		c4.age = 15;
		c4.lincence="88hdd";
		
		wheel=4;
		
		System.out.println(c1.name+" "+c1.age+" "+c1.lincence);
		System.out.println(c2.name+" "+c2.age+" "+c2.lincence);
		System.out.println(c3.name+" "+c3.age+" "+c3.lincence);
		System.out.println(c4.name+" "+c4.age+" "+c4.lincence);
		System.out.println(wheel);
		
		c1 = c2;
		
		System.out.println("--------------------");
		System.out.println(c1.name+" "+c1.age+" "+c1.lincence);
		System.out.println(c2.name+" "+c2.age+" "+c2.lincence);
		System.out.println(c3.name+" "+c3.age+" "+c3.lincence);
		System.out.println(c4.name+" "+c4.age+" "+c4.lincence);
		
		
		c2 = c3;
		
		System.out.println("--------------------");
		System.out.println(c1.name+" "+c1.age+" "+c1.lincence);
		System.out.println(c2.name+" "+c2.age+" "+c2.lincence);
		System.out.println(c3.name+" "+c3.age+" "+c3.lincence);
		System.out.println(c4.name+" "+c4.age+" "+c4.lincence);
		
		c3 = c4;
		
		System.out.println("--------------------");
		System.out.println(c1.name+" "+c1.age+" "+c1.lincence);
		System.out.println(c2.name+" "+c2.age+" "+c2.lincence);
		System.out.println(c3.name+" "+c3.age+" "+c3.lincence);
		System.out.println(c4.name+" "+c4.age+" "+c4.lincence);
		
		c4 = c1;
		
		System.out.println("--------------------");
		System.out.println(c1.name+" "+c1.age+" "+c1.lincence);
		System.out.println(c2.name+" "+c2.age+" "+c2.lincence);
		System.out.println(c3.name+" "+c3.age+" "+c3.lincence);
		System.out.println(c4.name+" "+c4.age+" "+c4.lincence);
		
		
		

	}

}