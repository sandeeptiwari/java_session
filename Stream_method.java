package com.vaishali.audax;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_method {
    public static void main(String[] args) {

        //filter (predicate) method

        //boolean value function

        List<String> name=List.of("Aman", "Ankit","Rahul","Abhi","Neha","Shubham");
        List<String> newName=name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());

        System.out.println(newName);
        newName.stream().forEach(System.out::println);


//map () method
        List<Integer> list1=List.of(12,45,78,14);
       List<Integer> newlist=  list1.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println("map method");
        System.out.println(newlist);

     //sorted()

        System.out.println("sorted list with sorted method");
        list1.stream().sorted().forEach(System.out::println);


       //min()
        //int x,y;
       Integer integer= list1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min="+integer);


        //max()
        Integer integer2= list1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("mix="+integer2);




    }
}
