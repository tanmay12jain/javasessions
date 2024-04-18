package inheritance;

public class AICTE 

{
	String univercityName;
	String collageName;
	Boolean affiliated;
	public void university(String univercityName) {
		System.out.println("Univercity name is " + univercityName);
		this.univercityName=univercityName;
		}
	public void collage(String collageName) {
		System.out.println("Collage name "+collageName);
		this.collageName=collageName;
	}
	
	public void isAffilicated(Boolean affiliated) {
		if (affiliated) {
			System.out.println(collageName+" is AICTE affiliated");
		}
		else {
			System.out.println(collageName+" is not AICTE affiliated");
		}
    this.affiliated=affiliated;
	}

}
