package com.audax;

public class Main {
	public static void main(String args[])
	{
		{
			System.out.println("Executing initial block");
			Parent p = new Child();
			p.print();
		}
	}
		static
		{
			System.out.println("Executing static block");
			Child q = new Child();
			q.print();
		}
}
