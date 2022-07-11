package PreviousAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamFunction {
	static List<String> test=Arrays.asList("Arpit","Dhruv","Somit","Mukesh","Saurabh");
	static List<Integer> newList=Arrays.asList(1,2,3,4,5,6,7,8);
	
	List <Integer> l1=new ArrayList<>();
	public void StreamTest() {
		for(int i=1; i<=50;i++) {
			l1.add(i);
		}
		
		//This method is used to print the element from the list using stream
		//This also creates the thread automatically
		l1.parallelStream().forEachOrdered(System.out::println);
	}
	
	
public static void mapMethod() {
		
		// map() method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
	    System.out.println(newList);
		List newList1 = newList.stream().map(x->x*x).collect(Collectors.toList());
	    System.out.println(newList1);


}

public static void filterMethod() {
	 // filter() method is used to select elements as per the Predicate passed as argument.
	    List <String> result = test.stream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
	    System.out.println(result);
}

public static void sortedMethod() {
	// sorted() method is used to sort the stream.
	 List result1 = newList.stream().sorted().collect(Collectors.toList());
	    System.out.println("Sorted List are:- "+result1);
}

public static void reduceMethod() {
	// reduce() method is used to reduce the elements of a stream to a single value.
	int evenNum = newList.stream().filter(x-> x%2 == 0).reduce(0,(ans,i)-> ans+i);
    System.out.println(evenNum);
}

public static void collectMethod() {
	Set square = newList.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println(square);
}
}
