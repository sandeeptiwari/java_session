package com.vaishali.audax;

//public class Member_Interface {

    interface Memeber {
         void watch();

          void orignise ();

    }

    class VIP implements Memeber {

        public void watch() {
            System.out.println("Vip mamber watch this ");
        }

        public void orignise () {
            System.out.println("Vip mamber origination this ");
        }
    }
     class General extends VIP{
        public void watch() {
            System.out.println("General mamber watch this ");
        }

    }
    class Prime implements Memeber{
        public void watch() {
            System.out.println("Prime  mamber origination  this ");
        }

        public void orignise () {
            System.out.println("Prime  mamber watch  this ");
        }
    }

    class Member_Interface{
        public static void main(String[] args) {
            VIP a = new VIP();
            a.orignise();
            a.watch();

            Prime obj =new Prime();
            obj.watch();
            obj.orignise();

            General b=new General();
            b.watch();

    }
}
