package com.assignment.audax;

public class Main2
{
	
	public static void main(String args[]) {
		
		VipMembers vip = new VipMembers();
		vip.canOrganise();
		vip.canWatch();
		
		GeneralMembers gen = new GeneralMembers();
		gen.canWatch();
		//gen.canOrganise(); //Exception Method is not defined in class. 
	}
}