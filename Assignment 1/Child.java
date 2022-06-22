package com.audax;

public class Child implements Parent
{
		float c;

	public float divide() 
		{
			c = Parent.a / Parent.b; // calling the static data members through class name.
				return c;
		}
	
	public void print()
		{
			float c = divide(); // Local variable c.
			System.out.println(c);
		}
}
