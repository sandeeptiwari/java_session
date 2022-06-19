package assignments;

import java.util.*;

public class CurrencyConversion {

	public static void currencyConverter() {

	    double rupee, dollar, pound, euro, user_input;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Welcome to Currency Converter program in Java. \nEnter the index of the currency you would like your input to be in:- \n1: Rupees \n2: Dollar \n3: Pound \n4: Euro");

		user_input = sc.nextDouble();
		
		double rupee_arr[]= { 0.013 , 0.010 , 0.012 };
		double dollar_arr[]= {78.02 ,  0.81 , 0.95 };
		double pound_arr[]= {95.96, 1.23 , 1.17};
		double euro_arr[]= {82.11, 1.05, 0.86};
		
		if(user_input==1) {
			System.out.println("Enter amount in rupees");
			rupee = sc.nextDouble();
			dollar= rupee * rupee_arr[0];
			System.out.println("amount in dollar= "+dollar);
			pound= rupee * rupee_arr[1];
			System.out.println("amount in pounds= "+pound );
			euro= rupee * rupee_arr[2];
			System.out.println("amount in euros= "+euro);
		}
		else if(user_input==2) {
			System.out.println("Enter amount in dollar");
			dollar = sc.nextDouble();
			rupee = dollar * dollar_arr[0];
			System.out.println("amount in rupees= "+rupee);
			pound= dollar * dollar_arr[1];
			System.out.println("amount in pounds= "+pound);
			euro= dollar * dollar_arr[2];
			System.out.println("amount in euros= "+euro);
		}
		else if(user_input==3) {
			System.out.println("Enter amount in pounds");
			pound = sc.nextDouble();
			rupee= pound * pound_arr[0];
			System.out.println("amount in rupees= "+rupee);
			dollar= pound * pound_arr[1];
			System.out.println("amount in dollars= "+dollar);
			euro = pound * pound_arr[2];
			System.out.println("amount in euros= "+euro);
			
		}
		else if(user_input==4) {
			System.out.println("Enter amount in euros");
			euro = sc.nextDouble();
			rupee = euro * euro_arr[0];
			System.out.println("amount in rupees= "+rupee);
			dollar = euro * euro_arr[1];
			System.out.println("amount in dollars= "+dollar);
			pound = euro * euro_arr[2];
			System.out.println("amount in pounds= "+pound);
		}
		else{
			System.out.println("input is invalid");
		}
		
		sc.close();
		

	}
	
	
	}

	
	

