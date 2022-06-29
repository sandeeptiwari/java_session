import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.stream.*;

public class listwithstream {
    public static void main(String[] args) {
        System.out.println("this assignment regarding stream pipline");
        List<Integer> num=new ArrayList<>(20);
        int max=100;
        int min=10;
        int range=max-min +1;
        for(int i=0;i<20;i++){
            num.add((int)(Math.random() * range) + min);
        }

        System.out.println("list is "+num);
        // implemanting map() function via stream pipeline
        List<Integer> square = num.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("this is square of each element of list "+square);
        //implemanting filter  function via stream pipeline
        List<Integer> even_number=num.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("even number list "+even_number);
        //implemanting reduce() function via stream pipeline
        // to find max number in list
        int maxnum=num.stream().reduce(0,(n1,n2)->n1>n2?n1:n2);
        System.out.println("largest number in list is "+maxnum);
        //implemanting sorted()  function via stream pipeline
        List<Integer>sorted_list=num.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list is "+sorted_list);
    }
}
