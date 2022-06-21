/*
Assignment - 2:
     *  1 you have to store country currency value in 1D array
     *  2 create convertCurrency method which accept currency and index of exchange rate array,
     *  3 and return converted values
*/

package CurrencyConvertor;

import java.util.Scanner;

public class CurrencyConvertor {

	public static double convertCurrency( double amt, char str )
	{
	double[] currenIndex = {0.01280737705,0.01207729469,0.01041016032,0.72463768116};
	double c_amt = 0;
	if(str == 'A')
	{
	c_amt = amt * currenIndex[0];
	}
	else if(str == 'B')
	{
	c_amt = amt * currenIndex[1];
	}
	else if(str == 'C')
	{
	c_amt = amt * currenIndex[2];
	}
	else if(str == 'D')
	{
	c_amt = amt * currenIndex[3];
	}
	else
	{
	System.out.println("Enter valid option");
	}
	return c_amt;
	}


	public static void main(String args[])
	{
	System.out.println ("Enter amount in Rupees: ");
	Scanner myObj = new Scanner (System.in); //creating scanner obj.
	double amt = myObj.nextDouble (); // storing object as double data type

	System.out.println("Enter A to convert to Dollars");
	System.out.println("Enter B to convert to Euros");
	System.out.println("Enter C to convert to Pound");
	System.out.println("Enter D to convert to Ruble");
	char str = myObj.next().charAt(0);
	System.out.println("Your converted amount is: "+convertCurrency(amt,str));
	myObj.close();
	}

}
