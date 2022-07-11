package assignment4;

import java.util.HashMap;
import java.util.Map;

public class Hashmap
{
    public static void main(String args[])
    {
    	// Here create Hashmap m1
        Map<Integer,String> m1 = new HashMap<Integer, String>();
        
        // 1. put() method is used to insert an entry in the map according their key and value.
        m1.put(1,"Mukesh Kumar"); 
        m1.put(2,"Rakesh Kumar");   
        m1.put(3,"Saurabh Pal");
        m1.put(4,"Kinsukh Mishra");
        m1.put(5,"Ashutosh Kumar");
        m1.put(6,"Rajat Sharma"); 
        
       // Here we print the Map
       System.out.println("Print Map:- "+m1);
       
       System.out.println("===================================================================");
       
       // 2. get() method is used to fetch an object related to their corresponding key
       System.out.println("1st Element in Map is:- "+m1.get(1)); 
       
       System.out.println("====================================================================");
       
       // Here create HashMap m2
       Map<Integer,String> m2 = new HashMap<Integer, String>();
       
       // 3. putAll() method  is used to insert the specified map in the map.
       m2.putAll(m1);  
       m2.put(7,"Rana Omanshu");
       m2.put(8,"Ankit Kumar");
       
       // Here print the upadated Map 
       System.out.println("Updated Map M2 is:- "+m2);
      
       System.out.println("=====================================================================");
       
       // 4. remove() method is used to delete an entry for the specified key.
       m2.remove(2);
       
       System.out.println("After Remove Upadated Map is:-"+m2);
       
       System.out.println("======================================================================");
       
       // 5. containsKey() method returns true if some key equal to the key exists within the map, else return false.
       System.out.println("Key is Present in the Map:- "+m2.containsKey(1));
       System.out.println("Key is Present in the Map:- "+m2.containsKey(2));
       
       System.out.println("======================================================================");
       
       // 6. replace() method is used to replaces the specified value for a specified key.
       
       // Here we print the Intial Map
       System.out.println("Initial Map is:-"+m2);
       
       m2.replace(7,"Omanshu Gautam");
       
       System.out.println("Updated Map after use Replace Method:- "+m2);
       
       System.out.println("======================================================================");
       
       // 7. we can't store duplicate key in Hashmap, Lets check it.
       m2.put(1,"Mukesh Kumar");
       
       // Here print the Updated map 
       System.out.println("Updated Map is :- "+m2);
       
       System.out.println("=======================================================================");
       
       // 8. size() method is used to returns the number of entries in the map.
       
       	// Here print the size of Map
       	System.out.println("The Size of M1 Map is:- "+m1.size());
       	System.out.println("The Size of M2 Map is:- "+m2.size());
       	
       	System.out.println("======================================================================");
       	
       	// 9. isEmpty() method returns true if the map is empty; returns false if it contains at least one key.
       	
       	// Here create HashMap m3 which is empty
       	Map <Integer, String> m3 = new HashMap <Integer, String>();
       	
       	System.out.println(m1.isEmpty());
       	System.out.println(m3.isEmpty());
       	
       	System.out.println("======================================================================");
       	
       	// 10. containsValue() method is used to returns true if some value equal to the value exists within the map, else return false.
       	
       	System.out.println("Mukesh Kumar is present in Map M1:- "+m1.containsValue("Mukesh Kumar"));
       	System.out.println("Deepak Kumar is present in Map M1:- "+m1.containsValue("Deepak Kumar"));
       	
       	System.out.println("=======================================================================================================");
       	
       	// 11. clear() method is used to remove all of the mappings from this map. 
       
       	m2.clear();
       	System.out.println(m2);
       	
       	System.out.println("===========================================================================================");
       	
       // 12. clone() method is used to return a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
       		
       	HashMap <String, Integer> m4 = new HashMap<String, Integer>();
       	
       	m4.put("Mukesh", 1);
       	m4.put("Saurabh",2);
       	m4.put("Kinshukh",3);
       	m4.put("Rajat", 4);
       	m4.put("Ashutosh", 5);
       	
       	// Print and display the Initial HashMap
       	System.out.println("Initial Hashmap is:- " +m4);
       	
       	// Print and display the cloned HashMap
       	System.out.println("The Cloned Map is:- " +m4.clone());
       	
       	System.out.println("==========================================================================");
   
       	// 13. putIfAbsent method is used to map the specified key with the specified value, only if no such key exists (or is mapped to null)
       	
       	// Print Initial Hashmap
       	System.out.println("Initial Hashmap is:-" +m4);
    
       	// Here put a new value which is not mapped, before in map
        m4.putIfAbsent("Ankit",6);
        
        // Here print New HashMap
        System.out.println("New Hashmap is:- "+m4);
        
        // Here try to put a new value with existing key before in map
        m4.putIfAbsent("Ankit",7);
        
        // Here print Newly Hashmap
        System.out.println("Unchanged HashMap is:-"+m4);
        
        System.out.println("=============================================================================");
    
        // 14. keySet() method is used to create a set out of the key elements contained in the hash map.
        // It basically returns a set view of the keys or we can create a new set and store the key elements in them.
        
        // Here Print the HashMap
        System.out.println("HashMap of M4 is:- "+m4);
        
        // Here Using keySet() to get the set view of keys
        System.out.println("The Set is:- "+m4.keySet());
    }
}
