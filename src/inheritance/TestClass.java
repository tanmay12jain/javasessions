package inheritance;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		CPMBA cpmba = new CPMBA();
		cpmba.collage("CP MBA collage");
		cpmba.isAffilicated(true);
		cpmba.univercityType("private");
		cpmba.university("CP univercity");
		cpmba.location("Delhi");
		cpmba.CpDegrees();
		
		ArrayList<String> cname=new ArrayList<String>();
		cname.add("Finance");
		cname.add("marketing");
		cname.add("Human resource management");
		cname.add("International Bussiness");
		cpmba.coursesProvided(cname);
		
		
		System.out.println();
		System.out.println();
		
		
		MahaveerMedical medical = new MahaveerMedical();
		medical.collage("Mahaveer medical collage");
		medical.isAffilicated(false);
		medical.university("Govt.");
		medical.location("indore");
		
		ArrayList<String> medCourcesName=new ArrayList<String>();
		medCourcesName.add("Bachelor of Medicine, Bachelor of Surgery - MBBS.");
		medCourcesName.add("Master of Surgery - MS.");
		medCourcesName.add("Doctor of Medicine - MD.");
		medCourcesName.add("Bachelor of Ayurvedic Medicine and Surgery - BAMS.");
		medical.coursesProvided(medCourcesName);
		medical.faculty();
		medical.placements();
		
		

	}

}
