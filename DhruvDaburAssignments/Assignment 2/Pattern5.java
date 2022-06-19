package assignments;

public class Pattern5 {

	public static void fifthPattern(int n) {
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					System.out.print("  ");
				} else if (i == 2) {
					System.out.print("    ");
				} else if (i == 3) {
					System.out.print("      ");
				}

				for (int k = 1; k <= n; k++) {
					System.out.print("*");
				}
				System.out.println(" ");

			}

		}

	}

}
