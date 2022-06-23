package tranning;
import java.util.Scanner;
public class Pattern5 {
	

	public static void main(String args[])
	{
	int i,j,k,row;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the No of Row to Print Pattern");
	row = sc.nextInt();

	for (i= 0; i<= row-1; i++)
	{
	for (j=0; j<=i; j++)
	{
	System.out.print(" ");
	}
	for (k=0; k<=row-1-i; k++)
	{
	System.out.print("*" + " ");
	}
	System.out.println();
	}
	}
	}


