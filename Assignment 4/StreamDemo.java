package assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
	
	// Empty Stream:-
	// We create an empty Stream with the help of empty() method 

		Stream emptyStream = Stream.empty();
	
		// Here create a list of integers
	    List<Integer> num = Arrays.asList(2,3,4,5,6,8,10);
	    System.out.println(num);
	    
	    System.out.println("===================================================================");
	    // 1. map() method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
	    
	    List square = num.stream().map(x->x*x).collect(Collectors.toList());
	    System.out.println(square);
	    
	    System.out.println("===================================================================");
	    // 2. filter() method is used to select elements as per the Predicate passed as argument.
	    
	    // Here create a List of String
	    List <String> names = Arrays.asList("Mukesh","Saurabh","Kinshukh","Rajat","Ashutosh");
	    List <String> result = names.stream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
	    System.out.println(result);
	    
	    System.out.println("===================================================================");
	    // 3. sorted() method is used to sort the stream.
	    
	    List result1 = names.stream().sorted().collect(Collectors.toList());
	    System.out.println("Sorted List are:- "+result1);
	    
	    System.out.println("===================================================================");
	    // 4. collect() method  is used to return the set.
	    
	    Set<Integer> squareSet = num.stream().map(x-> x * x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	    
	    System.out.println("===================================================================");
	    // 5. forEach method is used to iterate through every element of the stream.
	    
	    num.stream().map(x->x*x).forEach(y->System.out.println(y));
	    
	    System.out.println("===================================================================");
	    // 6. reduce() method is used to reduce the elements of a stream to a single value.
	    // - the reduce method takes a BinaryOperator as a parameter.
	    
	    // Here ans variable is assigned 0 as the initial value and i is added to it .
	    int even = num.stream().filter(x-> x%2 == 0).reduce(0,(ans,i)-> ans+i);
	    System.out.println(even);
	}
}

