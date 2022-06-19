package Training_sesssion;

//package mypack;

import java.util.Scanner;

public class StarPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.println("enter rows");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}
}