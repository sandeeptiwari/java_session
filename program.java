package pattern;

import java.util.Scanner;

/*
        print pattern
                ***
        *       ***                *
        *       ***              * * *
        *         ***          * * * * *
        *         ***
        *         ***
        *            ***
        *            ***
        *            ***
        */
public class program
{

    public static void rightangle(short n)
    {
        System.out.println("printing right anglt trangel pattern");
        for(short i=0;i<n;i++)
        {
            for(short j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void revrightangel(short p)
    {
        System.out.println("printing side mirror image right angle trangel pattern");
        for(short i=0;i<p;i++)
        {
            for(short j=0;j<p-i;j++)
                System.out.print(" ");
            for(short k=0;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void trangle(short p)

    {
        System.out.println("printing  trangel pattern");
        for(short i=0;i<p;i++)
        {
            for(short j=0;j<p-i;j++)
                System.out.print(" ");
            for(short k=0;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void siftsquare()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of squre length");
        short n=sc.nextShort();
        short row= (short) (n*n);
        for(short i=1;i<=row;)
        {
                for(short m=0;m<n;m++) {
                    for (short k = 1; k <= n; k++)
                    {
                        // loop for print space...
                            for (short j = 1; j <=(n - 1) * m ; j++)
                                System.out.print(" ");
                        // loop for print star
                            for (short l = 1; l <= n; l++)
                                System.out.print("*");
                            //i++;
                        System.out.println();
                        i++;
                    }

                }

        }
    }


    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //System.out.println("enter number of row to print");
       // short n= sc.nextShort();
        //rightangle(n);
        //revrightangel(n);
        //trangle(n);
        siftsquare();
    }
}
