package com.bmpl.javabasic;

public class ClassDemo1 {

	 //states--> variables--> instance variables
	//static int b;
	
	//global variable
	int b;//instance var. 
	String data;
	float value;
	double dob;
	
	static void print(){
		System.out.println("Printing...");
	}
	
	//instructions 
	public static void main(String[] args) {
		
		int a;//local variable
		
		//System.out.println(a);
		//class ref.
		ClassDemo1 object = new ClassDemo1();//default constructor
		
		//whenever obj is created a constructor is called
		
		System.out.println("int default=" +object.b);
		System.out.println("String default=" +object.data);
		System.out.println("int default=" +object.dob);
		System.out.println("" +object.value);
		//object.print();
		print();
	}

}
