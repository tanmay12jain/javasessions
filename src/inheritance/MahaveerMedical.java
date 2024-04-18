package inheritance;

import java.util.ArrayList;

public class MahaveerMedical extends RTU {

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
		System.out.println("100% placement in every field and lots of good doctor are passedout from our collage");
	}
	
	public void faculty() {
		System.out.println("we have most exprinced faculty, they have 20 + year of exp on their field");
	}
}
