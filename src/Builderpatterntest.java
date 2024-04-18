
public class Builderpatterntest{
	String name;
	int age;
	double salary;

	public Builderpatterntest (String name, int age) {
		this("Testing", 40, 10);
		this.name=name;
		this.age=age;
	}
	
	public Builderpatterntest (String name, int age, double salary) {
		System.out.println("Hi");
		this.name=name;
		this.age=age;
		this.salary=salary;
		getInfo();
	}
	
	public void getInfo() {
		System.out.println("Get info");
	}
	public static void main(String[] args) {
		Builderpatterntest bp = new Builderpatterntest("Ram", 33);
		System.out.println(bp.name);
		System.out.println(bp.age);
		System.out.println(bp.salary);
	}

}
