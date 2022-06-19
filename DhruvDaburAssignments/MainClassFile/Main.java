package assignments;

public class Main {

	public static void main(String[] args) {
		int a[] = { 1, 1, 6, 5, 6, 2, 3, 5, 3 };

		// to find out the non-repeated number in an array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					break;
				}
				if (j == a.length - 1) {
					System.out.println("The number which is not repeated in the array is " + (a[i]));
				}

			}

		}
		// non-repeated number program end

		// static block testing

		Test t1 = new TestInheritance();
		t1.print();

		System.out.println("Printing Pattern 1");
		// printing pattern 1

		Pattern1 p1 = new Pattern1();
		p1.firstPattern(5);

		System.out.println("Printing Pattern 2");

		// printing pattern 2

		Pattern2.secondPattern(5);
		System.out.println("Printing Pattern 3");

		// printing pattern 3
		Pattern3.thirdPattern(5);
		System.out.println("Printing Pattern 4");

		// printing pattern 4
		Pattern4.fourthPattern(5);
		System.out.println("Printing Pattern 5");

		// printing pattern 5
		Pattern5.fifthPattern(3);
		System.out.println(" ");
		
		// running the currency conversion program
		//CurrencyConversion.currencyConverter();
		
		// new Assignment
		
		Prime prime1 = new Prime();
		prime1.watchMatch();
		prime1.createMatch("INDIA VS KENYA");
		
		Vip v1 = new Vip();
		v1.createMatch("PAKISTAN VS AUSTRALIA");
		
		
		
		

	}

}
