package com.nt.audax;

/* Lambda is an anonymous function with
 * No name
 * No access modifier
 * No return type
 * Its benefits are:-
 * 	1 It reduces the lines of codes.But it can only be with a FUNCTIONAL INTERFACE.
 * 	2 Sequential and parallel execution is supported by passing behavior as an argument in methods.
 *  3 To call API's very effectively.
 *  4 To write more readable,maintainable and concise code.*/

public class Main 
{
	public static void main(String args[])
	{
		PracticeLambda l = (String a, String b) ->
								{
									return a+b;
								};
								
								System.out.println(l.joinString("Mukesh"," Kumar"));
		
		/* Important rules
		 * If the body of a lambda expression contains only one statement then we can simply remove the curly braces
		 * Java compiler can interpret the type of variable in arguments, hence type is optional.
		 * We can also skip the return statement if the function is returning a value.
		 * The Brackets while passing the argument can also be skipped if there is just a single argument.
		 */
		
		// For Example
		PracticeLambda la = (a,b) ->a+b;
				
								System.out.println(la.joinString("Kinshuk"," Mishra"));
		
		PracticeLambda2 lb = str -> str.length();
								
								System.out.println(lb.getStringLength("Kinshuk Mishra"));
	}
}
