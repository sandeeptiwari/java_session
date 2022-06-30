package com.company;
import java.util.HashMap;

public class Hash_02 {

    public static void main(String[] args){


        HashMap<String, String> details = new HashMap<>();


        details.put("Name", "Programiz");
        details.put("Domain", "programiz.com");
        details.put("Location", "Nepal");
        System.out.println("Programiz Details: \n" + details);


        if(details.containsKey("Domain")) {
            System.out.println("Domain name is present in the Hashmap.");
        }

    }




}
