package Practice;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("Pattern1...........");
		pattern1();
		
		System.out.println("Pattern2...........");
		pattern2();
		
		System.out.println("Pattern3...........");
		pattern3();

	}

	public static void pattern1() {

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void pattern2() {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
