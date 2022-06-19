package Day4;

import java.util.Scanner;

class ConvertCurrency extends CurrencyExchange {
	
	void convertCurrency(double[] arr) {
		System.out.print("\nEnter the amount : ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt();
		
		System.out.print("Enter the Currency : ");
		String currency = sc.next();
		
		
		switch(currency) {
		
		case "USD" :
			System.out.println("USD to  USD Rs Rubal Euro ");
			System.out.println(amount * arr[0] + " USD");
			System.out.println(amount * arr[1] + " Rs");
			System.out.println(amount * arr[2] + " Rubal");
			System.out.println(amount * arr[3] + " Euro");
			break;
		case "Rs":
			System.out.println("Rs to  USD Rs Rubal Euro ");
			amount = amount/arr[1];
			System.out.println(amount * arr[0] + " USD");
			System.out.println(amount * arr[1] + " Rs");
			System.out.println(amount * arr[2] + " Rubal");
			System.out.println(amount * arr[3] + " Euro");
			break;
		case "Rubal":
			System.out.println("Rubal to  USD Rs Rubal Euro ");
			amount = amount/arr[2];
			System.out.println(amount * arr[0] + " USD");
			System.out.println(amount * arr[1] + " Rs");
			System.out.println(amount * arr[2] + " Rubal");
			System.out.println(amount * arr[3] + " Euro");
			break;
		case "Euro":
			System.out.println("Euro to  USD Rs Rubal Euro ");
			amount = amount/arr[3];
			System.out.println(amount * arr[0] + " USD");
			System.out.println(amount * arr[1] + " Rs");
			System.out.println(amount * arr[2] + " Rubal");
			System.out.println(amount * arr[3] + " Euro");
			break;
		default : 
			System.out.println("Please Enter the right input. ");
		}
	}
}

public class CurrencyExchange {
	
	public static void main(String[] args) {
		
		System.out.println("Currency exchange Rate :  USD  Rs  Rubal  Euro ");
		double arr[] = {1.0, 78.04, 56.55, 0.95};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		ConvertCurrency obj = new ConvertCurrency();
		obj.convertCurrency(arr);
		
	}

}
