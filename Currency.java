package com.introductory;
import java.util.Scanner;

public class Currency {
    public static double convertCurrency(double amt,int str){
        double Curr[]={0.013,1.73,0.012,0.010};
       double convAmount=0;
       if(str==1){
           convAmount=amt*Curr[0];
       }
        else if(str==2){
           convAmount=amt*Curr[1];
       }
        else if(str==3){
           convAmount=amt*Curr[2];
       }
        else if(str==3){
           convAmount=amt*Curr[3];
       }
        else {
           System.out.println("invalid input");
       }
      return convAmount;

    }

    public static void main(String[] args) {
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
        double amt= sc.nextDouble();
        System.out.println("enter 1 to convert in dollar");
        System.out.println("enter 2 to convert in Yan");
        System.out.println("enter 3 to convert in Euro");
        System.out.println("enter 4 to convert in Pound");
        int str= sc.nextInt();
        System.out.println("converted amount is " +convertCurrency(amt,str));
    }

}
