package com.nt.audax;

import java.util.HashMap;
import java.util.Map;

public class ImplementingHashMap
{
	public static void main(String args[])
	{
		Map<Integer,String> m = new HashMap<Integer, String>(); //Taking HasMap objects of Map reference type.
		m.put(1,"Kinshuk Mishra"); // It adds a key value pair to the Map.
		m.put(2,"Mukesh Kumar");   // Every key value pair is called an entry. Map is a collection of entry objects.
		m.put(3,"Dhruv Dabur");
		m.put(4,"Rajat Sharma");
		m.put(5,"Mukesh Kumar"); // The keys have to be unique whereas the values can be repeated.
		m.put(6,"Saurabh Pal"); // If a key is repeated then the previous value gets overridden by the new one.
		System.out.println("Print Map m "+m);
		System.out.println("Prints 1st element in Map m "+m.get(1)); // Helps to fetch an object related to the corresponding key
		HashMap<Integer,String> ma = new HashMap<Integer, String>();
		ma.putAll(m);  // Puts all the entries in a particular map into another map
		ma.put(7,"Ashutosh Yadav");
		ma.put(8,"Trideev Ganguly");
		System.out.println("Print updated Map ma "+ma);
		ma.remove(3); // Removes an entry from a map.
		System.out.println("Is there a value for key 3: "+ma.containsKey(3)); // Checks if a value is present corresponding to a particular key.
		System.out.println("Print Map ma after removing element at key 3 "+ma);
		System.out.println("Is there a value named 'Mukesh Kumar' in the Map ma "+ma.containsValue("Mukesh Kumar")); // Checks if a value is present or not.
		System.out.println("The size of Map ma is: "+ma.size()); // Gives the size of a map.
		m.clear(); // Clears all entries in a map.
		System.out.println("Is Map ma empty: "+ma.isEmpty()); // Checks if a map is empty or not.
		System.out.println("Is Map m empty: "+m.isEmpty());
		System.out.println(m);
		System.out.println("Complete set of keys in Map ma "+ma.keySet()); // Gives the set of discrete keys in the Map.
		System.out.println("Complete collection of values in Map ma "+ma.values()); // Gives the collection of values.
		System.out.println("Complete set of entry objects set in Map ma "+ma.entrySet()); // Gives the set of entry objects in the Map(key,value pair)
		// These three functions are called Collection views of Map.
		ma.replace(5,"Amit Kumar"); // Replaces the element present corresponding to a certain key.
		System.out.println("New updated map ma with replaced value at key 5"+ma);
		ma.putIfAbsent(3,"Poonam Dubey"); // Puts an element at a certain key if the value is absent.
		System.out.println("New updated map ma "+ma);
		System.out.println("Clone of map ma "+ma.clone()); // This Method creates a clone of a certain HashMap(works with only HashMaps).
	}
}
