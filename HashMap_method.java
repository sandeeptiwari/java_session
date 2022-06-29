package Training_sesssion;



import java.util.HashMap;
import java.util.Map;

public class HashMap_method
{
    public static void main(String[] args) {

        Map<Integer,String> m1 = new HashMap<Integer, String>();
        m1.put(1,"Aman Kumar");
        m1.put(2,"Amit Kumar");
        m1.put(3,"Rakesh Kumar");
        m1.put(4,"Saurabh singh");
        m1.put(5,"vaishli Saini");
        m1.put(6, "Rajat Sharma");

        System.out.println("Print Map:- "+m1);
        System.out.println("============================================================");
        //get() method to fetch element
        System.out.println("1st Element in Map is:- "+m1.get(1));
        System.out.println("=============================================================");
        Map<Integer,String> m2 = new HashMap<Integer, String>();
        m2.putAll(m1);
        m2.put(7,"Rana Omanshu");
        m2.put(8,"Amit Kumar");

        System.out.println("Updated Map M2 is:- "+m2);
        System.out.println("==============================================================");
        //remove() Method
        m2.remove(8);
        System.out.println("After Remove Upadated Map is:-"+m2);
        System.out.println("==============================================================");
        //containsKey() Method
        System.out.println("Key is Present in the Map:- "+m2.containsKey(1));
        System.out.println("Key is Present in the Map:- "+m2.containsKey(8));

        System.out.println("===============================================================");
        //replace() Method
        System.out.println("Initial Map is:-"+m2);
        m2.replace(7,"Amit Kumar");
        System.out.println("Updated Map after use Replace Method:- "+m2);


 
        System.out.println("===============================================================");
        //we can't store duplicate key in Hashmap
        m2.put(2,"Mukesh Kumar");
        System.out.println("Updated Map is :- "+m2);
        System.out.println("===============================================================");
        //size() Method
        System.out.println("The Size of M1 Map is:- "+m1.size());
        System.out.println("The Size of M1 Map is:- "+m2.size());
        System.out.println("===============================================================");
        //isEmpty Method
        Map <Integer, String> m3 = new HashMap <Integer, String>();
        System.out.println(m1.isEmpty());
        System.out.println(m3.isEmpty());
        System.out.println("===============================================================");
        //containsValue() Method
        System.out.println("Mukesh Kumar is present in Map M1:- "+m1.containsValue("Mukesh Kumar"));
        System.out.println("Deepak Kumar is present in Map M1:- "+m1.containsValue("Deepak Kumar"));
        System.out.println("===============================================================");
        //clear() Method
        m2.clear();
        System.out.println(m2);
        System.out.println("===============================================================");
        //clone() method
        HashMap <String, Integer> m4 = new HashMap<String, Integer>();
        m4.put("Mukesh", 1);
        m4.put("Saurabh",2);
        m4.put("Kinshukh",3);
        m4.put("Rajat", 4);
        m4.put("Ashutosh", 5);
        System.out.println("Initial Hashmap is:- " +m4);
        System.out.println("The Cloned Map is:- " +m4.clone());
        System.out.println("===============================================================");
        //keySet() Method
        System.out.println("HashMap of M4 is:-" + m4);
        System.out.println("HashMap of M4 is:-" + m4.keySet());
        System.out.println("===============================================================");
        //putIfAbsent() Method
        System.out.println("Initial Hashmap is:-" +m4);
        m4.putIfAbsent("Amit",6);
        System.out.println("New Hashmap is:- "+m4);

    }
}


