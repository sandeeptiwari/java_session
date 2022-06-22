package com.nt.audax;

public class Main 
{
	public static void main(String args[]) 
	{
		Members gm = new GeneralMembers();
		VipMembers vm = new VipMembers();
		PrimeMembers pm = new PrimeMembers();
		
		gm.canWatch();
		System.out.println();
		vm.canOrganise();
		vm.canWatch();
		System.out.println();
		pm.canOrganise();
		pm.canWatch();
	}
}
