package com.nt.audax;

import java.util.Scanner;

public class Pattern2
{
	
	public static void main(String args[])
	{
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Row to Print Pattern");
		row = sc.nextInt();
		for(i=1; i<=row; i++)
		{
			for(j=i; j<=row; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
