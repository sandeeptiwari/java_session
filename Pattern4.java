package Assignment2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String args[])
	{
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Row to Print Pattern");
		row = sc.nextInt();
		  
		for (i=0; i<row; i++)   
		{        
		for (j=2*(row-i); j>=0; j--)         
		{     
		System.out.print(" ");   
		}   
		for (j=0; j<=i; j++ )   
		{         
		System.out.print("* ");   
		}   
		System.out.println();   
		}   
	}
}
