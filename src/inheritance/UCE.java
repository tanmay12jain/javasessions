package inheritance;

import java.util.ArrayList;

public class UCE extends RTU {
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
		System.out.println("100% placement in every branch with very good package last year avg package is 35 lac");
	}
	
	public void faculty() {
		System.out.println("we have faculty from IITs passout and phd holder in their fields ");
	}
}
