package com.introductory;


interface raj{
    abstract void watch();
    abstract void organise();
}

 class VipMembers implements raj{
     public void watch(){
         System.out.println("vip members can watch");
     }
     public void organise(){
         System.out.println("vip members can organise");
     }
}
 class GeneralMember implements raj {
     public void watch() {
         System.out.println("general members can only watch");

     }

     public void organise() {

     }}

     class PrimeMember implements raj {
         public void watch() {
             System.out.println("Prime members can watch");
         }

         public void organise() {
             System.out.println("prime members can organise");
         }
     }












public class Vip {
    public static void main(String[] args) {
        VipMembers obj=new VipMembers();
        PrimeMember obj1=new PrimeMember();
        GeneralMember obj2=new GeneralMember();
        obj.organise();
        obj.watch();
        System.out.println();
        obj1.watch();
        obj1.organise();
        System.out.println();
        obj2.organise();
        obj2.watch();



        }


    }

