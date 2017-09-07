package com.bmpl.javabasic;
//final with class name then we cannot inherit that class


class Bank{
	
	final int deposit = 1000;
	
	final void depositAmount(){
		System.out.println("Deposit of Bank");
	}
	
}

class HDFC extends Bank{
	
	int depositHdfc;
	
	void depositAmountHdfc(){
		//Bank.deposit = 5000;
		System.out.println("Deposit Amount HDFC");
	}

	//override--polymorphism--> overloading and overriding
//	void depositAmount(){
		//deposit = 6000;
//		System.out.println("Deposit of HDFC" + deposit);
//	}
	
}



public class FinalDemo {

	public static void main(String[] args) {
	
		HDFC hdfc = new HDFC();
		hdfc.depositAmount();
		
	}

}
