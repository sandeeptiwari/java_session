package com.introductory;
interface Parent
{
    float a=200; // Data members in an interface are public,final and static.
    float b=50;
    float divide();
    void print();
}
 class Child implements Parent
{
    float c;



    public float divide()
    {
        c = Parent.a / Parent.b; // calling the static data members through class name.
        return c;
    }

    public void print()
    {
        float c = divide(); // Local variable c.
        System.out.println(c);
    }
}

public class Main {
    public static void main(String args[])
    {
        {
            System.out.println("Executing initial block");
            Parent p = new Child();
            p.print();
        }
    }
    static
    {
        System.out.println("Executing static block");
        Child q = new Child();
        q.print();
    }
}
























