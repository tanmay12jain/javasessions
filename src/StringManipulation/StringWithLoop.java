package StringManipulation;

public class StringWithLoop {
	
	public static void main (String [] args) {
		  String str = "hello This is my java code and i am so happy i am expert  am also sad";

	        int indexi = str.indexOf("i");

	        if (indexi != -1) {
	            System.out.println("This is first i at index: " + indexi);

	            while ((indexi = str.indexOf("i", indexi + 1)) != -1) {
	                System.out.println("This is another i at index: " + indexi);
	            }

	            System.out.println("No more i present");
	        } else {
	            System.out.println("i is not present");
	        }
	    }
	

}
