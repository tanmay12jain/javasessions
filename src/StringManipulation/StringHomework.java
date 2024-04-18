package StringManipulation;


public class StringHomework {

	public static void main(String[] args) {

		String str = "hello This is my java code and i am so happy i am expert i am also sad";

		int indexi = 0;
		if (str.indexOf("i") != -1) {
			System.out.println("This is first i " + str.indexOf("i"));
			indexi = str.indexOf("i");
			indexi = str.indexOf("i", indexi + 1);

			//System.out.println(indexi);
		
			
			if (indexi != -1) {
				System.out.println("This is second i " + str.indexOf("i", indexi));
				indexi = str.indexOf("i", indexi + 1);
				
				
				if (indexi != -1) {
					System.out.println("This is third i " + str.indexOf("i", indexi));
					indexi = str.indexOf("i", indexi + 1);
					
					if (indexi != -1) {
						System.out.println("This is forth i " + str.indexOf("i", indexi));
						indexi = str.indexOf("i", indexi + 1);
					}
					else {
						System.out.println("now no more i present");
					}

				}
				else {
					System.out.println("now no more i present");
				}

			}
			else {
				System.out.println("now no more i present");
			}

		}
			
		 else {
				System.out.println("i is not present");
			}
		
		if(indexi!=-1) {
			System.out.println("there is more i present please update your code");
		}
		
		
		

	}

}
