package assignments;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

	 static List <String> newList1 = Arrays.asList("Dhruv","Someet","Arpit","Rajat","Nimish");
	 static List<Integer> random = Arrays.asList(1,2,3,4,5,6,7);
	 
	public static void mapMethod() {
		
		// map() method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
	    System.out.println(random);
		List newList = random.stream().map(x->x*x).collect(Collectors.toList());
	    System.out.println(newList);
	}
	
	public static void filterMethod() {
		 // filter() method is used to select elements as per the Predicate passed as argument.
		    List <String> result = newList1.stream().filter(s ->s.startsWith("D")).collect(Collectors.toList());
		    System.out.println(result);
	}
	
	public static void sortedMethod() {
		// sorted() method is used to sort the stream.
		 List result1 = newList1.stream().sorted().collect(Collectors.toList());
		    System.out.println("Sorted List are:- "+result1);
	}
	
	public static void collectMethod() {
		// collect() method  is used to return the set.
		 Set<Integer> newSet = random.stream().map(x-> x * x).collect(Collectors.toSet());
		    System.out.println(newSet);
	}
	
	public static void forEachMethod() {
		// forEach method is used to iterate through every element of the stream.
		random.stream().map(x->x*x).forEach(y->System.out.println(y));
	}
	
	public static void reduceMethod() {
		// reduce() method is used to reduce the elements of a stream to a single value.
		int evenNum = random.stream().filter(x-> x%2 == 0).reduce(0,(ans,i)-> ans+i);
	    System.out.println(evenNum);
	}
}
