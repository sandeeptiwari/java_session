package Training_sesssion;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		
		int n,i,j;
		System.out.println("Enter the number of lines you want to pattern of :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=0; i<n; i++) {
			for(j=n-i; j>1; j--) {
				System.out.print(" ");
			}
			
			for(j=0; j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

}
