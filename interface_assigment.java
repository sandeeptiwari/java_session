package oops_pakage;
//VIP member(Watch and organized both)

//2- GeneralMember(Watch)
//3- PrimeMember(Watch, Organized both)

public interface interface_assigment {
	void watch();
    void orgnanised();

}
class GeneralMember implements interface_assigment{
	public void watch() {
		System.out.println("general member  can watch");
	}
	public  void orgnanised() {
		//no logic not accessible by general member
	}
}
class primemember implements interface_assigment{
	public void watch() {
		System.out.println("prime member can watch ");
	}
	public void orgnanised() {
		System.out.println("prime member can orgnasied");
	}
}
// creating main class;
  class vip implements interface_assigment{
	
	  public void watch() {
			System.out.println("prime member can watch ");
		}
		public void orgnanised() {
			System.out.println("prime member can orgnasied");
		}
  }
  class Main{
		 public static void main(String ...args) {
			 primemember objprime=new primemember();
			 GeneralMember objgn=new GeneralMember();
			 vip objv=new vip();
			 System.out.println("primemember class  memeber.........");
			 objprime.watch();
			 objprime.orgnanised();
			 System.out.println("general  class  memeber_____________________________");
			 objgn.watch();
			 objgn.orgnanised();
			 System.out.println("vip  class  memeber_____________________________");
             objv.watch();
             objv.orgnanised();
		 }
 }

