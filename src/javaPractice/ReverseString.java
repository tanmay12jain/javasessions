package javaPractice;

public class ReverseString {
//	Solution 1: As asked in the above question, we need to reverse a String. For Ex:
//		The Input is : "RahulShettyAcademy"
//			This problem can be solved by writing a simple for loop and print the string in the reverse.
//		Output should be : "ymedacAyttehSluhaR"
	public static void main(String[] args) {
		String s1 = "We need to reverse this one";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

}
