package Raj.com;



 interface AddNumber
{
    int add(int a, int b);
}

 interface SubtractNumber
{
    int subtract(int a, int b);
}
 interface MultiplyNumber
{
    int multiply(int a, int b);
}
interface DivideNumber
{
    int divide(int a, int b);
}

















public class Lam {
    public static void main(String[] args) {
        AddNumber sum = (a,b)->(a+b);

        System.out.println("Added Numbers "+sum.add(8,2));

        SubtractNumber sub = (a,b) -> a-b;

        System.out.println("Subtracted Numbers "+sub.subtract(8,2));

        MultiplyNumber mul = (a,b) -> a*b;

        System.out.println("Multiplied Numbers "+mul.multiply(8,2));

        DivideNumber div = (a,b) -> a/b;

        System.out.println("Divided Numbers "+div.divide(8,2));


    }
}
