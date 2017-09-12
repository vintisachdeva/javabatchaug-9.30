package com.bmpl.javabasic;

abstract class Bank1{

	//If any abstract class contains any abstract method then class 
	//needs to be declared with abstract keyword
	
	//Abstract class contains body less method
	//
	
	abstract void calculateRateOfInterest();	//body-less method
	
	abstract void input();
	
	void deposit(){
		
	}
	void Load(){
		
	}
	
	void print(){
		System.out.println("Printing work");
	}
	
	
}

class HDFC1 extends Bank1{

	@Override
	void calculateRateOfInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void input() {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	void calculate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void input() {
		// TODO Auto-generated method stub
		
	}*/
	
}


public class AbstractDemo {

	public static void main(String[] args) {

	}

}
