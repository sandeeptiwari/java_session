package com.company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;



public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(20);
        marks.add(60);
        marks.add(65);
        marks.add(35);
        marks.add(40);
        marks.add(55);
        marks.add(25);
        marks.add(28);
        System.out.println("Marks of Students :" + marks);
        //marks.stream().forEach(i -> {System.out::println("Marks are : "+ i);});
        List<Integer> failedStudents = marks.stream().filter(m -> m < 40).collect(Collectors.toList());
        Long count = marks.stream().filter(m -> m < 40).count();
        System.out.println("Failed Students are : " + failedStudents);
        System.out.println("No. of failed students : " + count);
        List<Integer> gracMarked = failedStudents.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println("Marks of Fail students after Grace Marking :" + gracMarked);
        List<Integer> SortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Marks of students in increasing order : " + SortedMarks);

        List<Integer> ReverseSorted = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Marks of students in decreasing order : " + ReverseSorted);

        Optional<Integer> min = marks.stream().min(Comparator.comparingInt(n -> n));

        System.out.println("Minimum Marks of students is : " + min.orElse(0));

        Optional<Integer> maxi = marks.stream().max(Comparator.comparingInt(n -> n));
        System.out.println("Maximum Marks of students is : " + maxi);

    }
}
