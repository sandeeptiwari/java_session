package com.company;
// Program to add elements
import com.sun.javafx.collections.MappingChange;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_01 {
    public static void main(String[] args) {
        HashMap<Integer,String> obj=new HashMap<Integer, String>();
        System.out.println("iterating elements" +obj);
        obj.put(1,"raj");
        obj.put(2,"dhruv");
        obj.put(3,"kinshuk");
        System.out.println(" put method" + " ");
        for (Map.Entry m: obj.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());


        }
        obj.putIfAbsent(4,"urvashi");
        System.out.println("absent method" + " ");
        for( Map.Entry m:obj.entrySet()) {
            System.out.println(m.getKey() + " "+ m.getValue());

        }
      HashMap<Integer,String> obj1=new HashMap<Integer, String>();
        obj1.put(5,"anushka");
        obj1.putAll(obj);
        System.out.println("all methods" + " ");
        for (Map.Entry m: obj1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }










    }
}
