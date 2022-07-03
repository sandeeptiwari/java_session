import java.util.HashMap;
import java.util.Map;

public class hasmap_assignment {
    public static void main(String[] args) {
        System.out.println("this assignmet about hasmap in java");
        // implimentation of hasmap
        // creating hashmap
        HashMap<String,Integer>hsmap= new HashMap<>();
        // operationon for hashmap
        // to adding elementuse put()
        hsmap.put("amit",10);
        hsmap.put("rohan",20);
        hsmap.put("rohit",30);
        hsmap.put("rajesh",40);
        // to printig hashmap
        System.out.println("created hashmap is "+hsmap+" and it's size is "+hsmap.size());
        // changing value of a existing key use agin put() by key vale name
        hsmap.put("rohit",50);
        System.out.println("hashMap after udating rohit vale"+ hsmap);
       // to remove a element of hashmap
        // use remove(key) if key will present then itwill be removed
        hsmap.remove("rohit");// rohit key will be wipe
        System.out.println("map after removing key rohit"+ hsmap);
        // iteration of hashmap
        for(Map.Entry<String,Integer>lst: hsmap.entrySet()){
            System.out.println("key is -> "+lst.getKey()+" and it's value is "+lst.getValue()+" hascode is "+ lst.hashCode());

        }
        // entrySet() method return set vie os hashmap
        //The method returns a set having same elements as the hash map
        System.out.println("set view of hashmap using enterySet() -> "+hsmap.entrySet());
        // some boulian return type method
        //isEmpty().
        if(hsmap.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println(" map f is with some key-value->"+hsmap.values());// values() gives collection of value associted with key

        }
        //containsKey() return true if key is present
        if(hsmap.containsKey("amit")){
            System.out.println("Amit key is present with value-> "+hsmap.get("amit"));
        }else{
            System.out.println("amit key is absent");
        }
        hsmap.replace("amit",100);
        System.out.println("after replacing amit value"+hsmap);
        hsmap.replace("amit",100,200);
        System.out.println("hasmp is "+hsmap);
        //to clear all key-value
        hsmap.clear();
        System.out.println("size of hashmap is "+hsmap.size());
    }
}
