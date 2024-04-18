package a_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraysnLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Q1: WAP to delete a specific number from the given array.
		 * 
		 * int p[] = {1,4,5,2,3,22,31, 2};
		 * 
		 * --Need to remove 22 from the p[] array.
		 * 
		 * --output should be: [1, 4, 5, 2, 3, 31, 2]
		 */
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int[] a = new int[p.length - 1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

		/*
		 * Q2: Write a program to create a static Array, having following cricket data:
		 * 
		 *                         --name, age, team name, DOB, gender, Strike Rate
		 * 
		 *                         --Try to create multiple Object Arrays for different
		 * players 
		 * 
		 *                         --Try to print all the values of each player on the
		 * console
		 */

		Object[] criketPlayer1 = { "joahn", 33, "RCB", "01-01-2000", 'm', 5 };

		Object[] criketPlayer2 = { "mona", 35, "RR", "12-12-1999", 'm', 0 };
		System.out.println(Arrays.toString(criketPlayer1));
		System.out.println(Arrays.toString(criketPlayer2));

		/*
		 * . Write a Java program to create a new array list, which contains all color
		 * names.
		 * 
		 *                  --add some colors (string)
		 * 
		 *                 ---and print out the colorslist using loops.
		 * 
		 */
		ArrayList<String> colorList = new ArrayList<String>(10);
		colorList.add("Red");
		;
		colorList.add("white");
		colorList.add("black");
		colorList.add("pink");
		colorList.add("yellow");
		colorList.add("green");

		for (int i = 0; i <= colorList.size() - 1; i++) {

			System.out.println(colorList.get(i));

		}

		System.out.println("--------------");

		//   2. Write a Java program to retrieve an element at a specified index from a
		// given array list.

		System.out.println(colorList.get(2));

		//  3. Write a Java program to update specific array element by given element.

		System.out.println("--------------");

		colorList.set(3, "boo");
		System.out.println(colorList.toString());

		// 4. Write a Java program to remove the third element from an array list. 

		System.out.println("--------------");
		colorList.remove(2);
		System.out.println(colorList.toString());

		// 5. Write a Java program to search an element in an array list using for loop.
		// Once we find that element, break the loop.
		System.out.println("--------------");

		String colorString = "yellow";

		for (int i = 0; i <= colorList.size(); i++) {
			String colorr = colorList.get(i);
			if (colorr.equals(colorString)) {
				System.out.println("We got the your desired color");
				break;
			}
		}

		/*
		 * Reverse this array List:
		 * 
		 * ArrayList<String> studentNames = new ArrayList<String>();
		 * 
		 *                 studentNames.add("Varun");
		 * 
		 *                 studentNames.add("Reena");
		 * 
		 *                 studentNames.add("Naveen");
		 * 
		 *                 studentNames.add("Robin");
		 * 
		 *           studentNames.add("Peter");
		 * 
		 * 
		 */
		ArrayList<String> studentNames = new ArrayList<String>(); 
		studentNames.add("Varun");
		studentNames.add("Reena"); 
		studentNames.add("Naveen"); 
		studentNames.add("Robin"); 
		studentNames.add("Peter");
		
	//	for(int i = studentNames.size()-1;i>=0;i--) {
		//	System.out.println(studentNames.get(i));
		//}
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
		//8. . Write a Java program to extract a portion of an array list.
		ArrayList<String> portion = new ArrayList<String>(colorList.subList(1, 3));
		System.out.println(portion);
		
		//8.  Write a Java program to empty an array list.
	//	colorList.clear();
		System.out.println(colorList);
		
		//9. Write a Java program to trim the virtual capacity of an array list to the current list size.
		
		colorList.trimToSize();
		System.out.println(colorList.size());
		
		//10. Write a Java program to print all the elements of an ArrayList using the position of the elements.
		
		

		for (int i = 0; i <= colorList.size() - 1; i++) {

			System.out.println("on index of " +i+ " color is "+colorList.get(i));

		}
		

	}

}
