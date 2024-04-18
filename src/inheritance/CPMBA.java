package inheritance;

import java.util.ArrayList;


public class CPMBA extends CPUniver {
	ArrayList<String> courseName;
	String location;
	public void location(String location) {
		System.out.println("we are located at "+location);
		this.location= location;
	}
	public void coursesProvided(ArrayList<String> courseName) {
		System.out.println(courseName);
		this.courseName=courseName;
	}
	
	public void placements() {
		System.out.println("100% placement in evaryprogram");
	}
}
