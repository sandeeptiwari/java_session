import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/*
store currency value in 1d array of all country.
create convercurrency rate method which return covert eqal value
#1: Kuwaiti Dinar (KWD): [$3.30 USD = 1 KWD],#2: Bahraini Dinar (BHD):  [$2.65 USD = 1 BHD]
#3: Omani Rial (OMR):  [$2.60 USD = 1 OMR],#4: Jordanian Dinar (JOD):  [$1.41 USD - 1 JOD]
#5: Pound Sterling (GBP):  [$1.34 USD = 1 GBP],#6: Cayman Islands Dollar (KYD):  [$1.20 USD = 1 KYD]
#7: Euro (EUR):  [$1.12 USD = 1 EUr,#8: Swiss Franc (CHF):  [$1.08 USD = 1 CHF]
#9: US Dollar (USD)[1],#10: Canadian Dollar (CAD):  [$0.79 USD = 1 CAD]
 */
public class Main {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
       //final double currancy_rate[]=new double[10];
        final double currancy_rate[]={0.15,3.30,2.65,2.60,1.41,1.34,1.20,1.12,1.08,1,0.79,};
        System.out.print(" here is top ten currency of country\n0.China\n1.Kuwait\n2.Bahraini\n3.Omani.\n4.Jordanian\n" +
                "5.pound\n6.Cayman islands Dollar\n7.Euro\n8.Swiss Franc\n9.Us Dollar\n10.Canadian Dollar\n......");
        System.out.println("enter country serial number to get their currency value in rupees ");
        short choice= sc.nextShort();
        switch (choice){
            case 0:
                System.out.println("\nenter china currancy to convert into rupees ");
                int cny=sc.nextInt();
                System.out.printf("%d chainees yhun is equal to %f INR",cny,cny*currancy_rate[choice]*75);
                break;
            case 1:
                System.out.println("\nenter kuwait currancy to convert into rupees ");
                int kwd=sc.nextInt();
                System.out.printf("%d KWD Kuwait dinnar is equal to %f INR",kwd,kwd*currancy_rate[choice]*75);
                break;
            case 2:
                System.out.println("\nenter Bahraini currancy to convert into rupees ");
                int val=sc.nextInt();
                System.out.printf("%d BHD Bahraini Dinar is equal to %f INR",val,val*currancy_rate[choice]*75);
                break;
            case 3:
                System.out.println("\nenter Omani  currancy to convert into rupees ");
                int omr=sc.nextInt();
                System.out.printf("%d OMR Omani Rial is equal to %f INR",omr,omr*currancy_rate[choice]*75);
                break;
            case 4:
                System.out.println("\nenter Jordanian   currancy to convert into rupees ");
                int jod=sc.nextInt();
                System.out.printf("%d JOD Jordanian Dinar  is equal to %f INR",jod,jod*currancy_rate[choice]*75);
                break;
            case 5:
                System.out.println("\nenter Pound    currancy to convert into rupees ");
                int gbp=sc.nextInt();
                System.out.printf("%d Pound Sterling (GBP)  is equal to %f INR",gbp,gbp*currancy_rate[choice]*75);
                break;
            case 6:
                System.out.println("\nenter Pound    currancy to convert into rupees ");
                int kyd=sc.nextInt();
                System.out.printf("%d Cayman Islands Dollar (KYD) is equal to %f INR",kyd,kyd*currancy_rate[choice]*75);
                break;
            case 7:
                System.out.println("\nenter Euro (EUR):  currancy to convert into rupees ");
                int eur=sc.nextInt();
                System.out.printf("%d Euro (EUR): is equal to %f INR",eur,eur*currancy_rate[choice]*75);
                break;
            case 8:
                System.out.println("\nenter Swiss Franc (CHF)  currancy to convert into rupees ");
                int chf=sc.nextInt();
                System.out.printf("%d Swiss Franc (CHF) is equal to %f INR",chf,chf*currancy_rate[choice]*75);
                break;
            case 9:
                System.out.println("\nenter US Dollar (USD)[1]  currancy to convert into rupees ");
                int usd=sc.nextInt();
                System.out.printf("%d US Dollar (USD) is equal to %f INR",usd,usd*currancy_rate[choice]*75);
                break;
            case 10:
                System.out.println("\nenter Canadian Dollar (CAD)  currancy to convert into rupees ");
                int cad=sc.nextInt();
                System.out.printf("%d Canadian Dollar (CAD) is equal to %f INR",cad,cad*currancy_rate[choice]*75);
                break;
            default:
                System.out.println("you enter out of above available country value  index");
        }

    }
}