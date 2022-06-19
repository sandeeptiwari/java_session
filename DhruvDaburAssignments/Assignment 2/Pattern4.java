package assignments;

public class Pattern4 {

	public static void fourthPattern(int n) {
		for (int i = 0; i <= n - 1; i++) { //For loop for Rows

			for (int j = 0; j <= i; j++) { //For loop for Col

			System.out.print(" "); // blank space

			}

			for (int k = 0; k <= n - 1 - i; k++) { 

			System.out.print("*" + " "); // prints * and blank space

			}

			System.out.println(); //Next line

			}
	}
	
}
