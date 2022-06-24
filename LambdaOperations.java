package com.practice.audax;

import java.util.Scanner;

@FunctionalInterface
interface Addition {
	
	public void operation(int a,int b);
}

/*
 * class Demo implements Addition{
 * 
 * public void add(int a,int b) { System.out.println("Addition is:: " + (a+b));
 * } }
 */

public class LambdaOperations {

	public static void main(String[] args) {

		int x=0,y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values for different operations:: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		Addition i = (a,b)->System.out.println("Addition is:: " + (a+b) + "\n" + "Multiplication is:: " + (a*b) + "\n" + "Subtraction is:: " + (a-b));
		i.operation(x,y);
	}
}