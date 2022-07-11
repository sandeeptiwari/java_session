package com.nt.audax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream API
	/*These streams are related to Collection Framework/(Group of Objects). These streams are very different from io stream, io streams are sequence of data.
	 * Stream API was introduced in java 1.8 version.
	 * Stream API can perform bulk operations and process the objects of collection
	 * Stream reduces code length.*/
	/* When we have to represent data or objects collectively(as a single entity) then we can use Collections but if we have to process data from a collection then we should use stream.
	 * How is stream represented : - Stream s = collection.stream(); the return type of this method is stream object.
	 * Stream is available in java.util.stream package
	 * Important functions used:- stream(), filter(), map(), collect(),Collectors.toList(), count(), sorted(){default,customized}, max(), min(), Consumer, forEach(), Stream.of(),  */
public class StreamAPI 
{
	public static void main(String args[])
		{
			List<Integer> l = new ArrayList<Integer>();
			for( int i=1; i<150; i++)
				{
					if(i%7==0)
						l.add(i);
				}
			System.out.println(l);
			for(int j:l) // For each loop.
				{
					if(j%2==0)
						System.out.println(j);
				}
			List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
			/* The stream function creates a complete set of data just like queue and passes one object at a time on first in first out basis.
			 * The filter function returns a stream that matches the given predicate.
			 * collect method collects the filtered stream and stores it into the new list l2 after parsing it to List using the static method toList of the Collectors class.*/
				System.out.println("Even multiples of 7 are: "+l2);
				
			List<Double> l3 = l.stream().map(i->Math.pow(i, 2)).collect(Collectors.toList());
			/*The map function is used perform a certain task on the stream object and passes a new object*/
				System.out.println("Square of the multipes of 7 are: "+l3);
			
			/*The filter always comes in association with a predicate function which has boolean return type function.
			 * If the predicate satisfies (i.e. returns true) then the filter will pass stream object.*/
			/*Whereas the map comes in association with another method which has the scope of all return types so it can also pass a modified object all together.*/
			
			long c = l.stream().filter(i->i<100).count(); // The count method helps to count the number of objects satisfying the filter predicate.
				System.out.println("Number of multiples of 7 less than 100 are: "+c);
				
			List<Integer> l4 = l.stream().sorted().collect(Collectors.toList()); //This will sort values in default sorting order(ascending).
				System.out.println("Sorted list of multiples of 7 in natural ascending order: "+l4);
			List<Integer> l5 = l.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());//This will sort values in descending order.
				System.out.println("Sorted list of multiples of 7 in descending order: "+l5);
				/*Comparator(for descending order)--> compare(obj1,obj2)
				 * returns -ve if obj1 has to come before obj2
				 * returns +ve if obj2 has to come before obj1
				 * returns 0 if obj1 and obj2 are equal
				 * i.e. ((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)*/
				/*
				 * sorted()==>default ascending sorting. 
				 * sorted(Comparator)==>Customized sorting.*/
			
				// The above can also be done using compareTo() method.
			List<Integer> l6 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());//This is the reverse of natural sorting order descending order.
				System.out.println("Sorted list of multiples of 7 in descending order: "+l6);
				List<String> str = new ArrayList<String>();
				str.add("Kinshuk Mishra");
				str.add("Saurabh Pal");
				str.add("Mukesh Kumar");
				str.add("Satyam Mishra");
				str.add("Ujjwal Mishra");
				Comparator<String> comp = (s1,s2)->{int le1= s1.length();
				int le2=s2.length();
				if(le1<le2) return -1;
				else if (le1>le2) return 1;
				else return s1.compareTo(s2);};
				List<String> sortedlist = str.stream().sorted(comp).collect(Collectors.toList());
				System.out.println("Sorted Names according to length"+sortedlist);
			
			int min1 = l.stream().min((i1,i2)->i1.compareTo(i2)).get();// natural sorting order.
			int max1 = l.stream().max((i1,i2)->i1.compareTo(i2)).get();// natural sorting order.
			int min2 = l.stream().min((i1,i2)->i2.compareTo(i1)).get();// customized sorting order.
			int max2 = l.stream().max((i1,i2)->i2.compareTo(i1)).get();// customized sorting order.
				System.out.println("Minimum multiple of 7(in natural order)"+min1);
				System.out.println("Maximum multiple of 7(in natural order)"+max1);
				System.out.println("Minimum multiple of 7(in reverse order)"+min2);
				System.out.println("Maximum multiple of 7(in reverse order)"+max2);
			// It's compulsory to pass a comparator in the max min functions max min simply means the first and last elements in sorted order of stream.
			
			Consumer<Integer> w = i -> 
										{
											System.out.println("The cube of "+i+" is "+(Math.pow(i,3)));
										};
			// Consumer is an interface that is used to implement functional programming. It consists of a function that performs a single task but does not returns a value.
				l.stream().forEach(w);
				l.stream().forEach(i->{double a = Math.sqrt(i); System.out.println("The square root of multiples of 7 is: "+a);});
			// The forEach() method computes on each stream entered individually an we can either write a lambda expression into it or pass a Consumer.
			
			Stream<Number> s = Stream.of(1,499,800,2,679,625); // Taking Stream group of data.
			s.forEach(System.out::println);// Operating on each elements of stream.	
		}
}
