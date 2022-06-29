package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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
		
		
		
		
		// movie category creation
		
		Category category1 = new Category("Comedy");
		Movies movie = new Movies("3 idiots", 4.8, category1);
		
		Category category2 = new Category("Drama");
		Movies movie1= new Movies("Pursuit of Happyness", 4.6, category2);
		
		Category category3 = new Category("Crime");
		Movies movie2 = new Movies("The Godfather",4.4, category3);
		
		// List<Movies> movies2 = List.of(movie,movie1,movie2);
		List<Movies> movies = new ArrayList<Movies>();
		movies.add(movie);
		movies.add(movie1);
		movies.add(movie2);
		System.out.println(movieByCategory(movies));
		
		// start of stream functions
		
        StreamFunctions.collectMethod();
        StreamFunctions.filterMethod();
        StreamFunctions.forEachMethod();
        StreamFunctions.mapMethod();
        StreamFunctions.reduceMethod();
        StreamFunctions.sortedMethod();
        
        // end of stream functions
		
		
	    
	    
		
		//end of main method
	}
	
	private static Map<String,List<Movies>> movieByCategory(List<Movies> movies){
		Map<String,List<Movies>> movieByCategory = new HashMap<>();
		for(Movies movie: movies) {
			if(movie.getRating() >= 4.5 ) {
				String category = movie.getCategory().toString();
				List<Movies> movieList = movieByCategory.get(category);
				if(movieList==null) {
					movieList=new ArrayList<>();
					movieByCategory.put(category, movieList);
				}
				movieList.add(movie);
			}
		}
		return movieByCategory;
	}
		// start of stream funtion
		
		
		
		
		
	}


