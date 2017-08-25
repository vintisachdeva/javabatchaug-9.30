package com.bmpl.javabasic;

//this keyword--> always point to the current class and its instance variables, constructor, methods, blocks
//this keyword--> used for constructor calling
//this keyword--> to point to the instance variable 
//when local var. and instance var. have the same name

class Demo{
	
	private Demo(){
		System.out.println("Default of Demo class");
	}
	//private -->access when in class
	 Demo(int a){
		this();
		System.out.println("Param. of Demo class" + a);
	}
}

public class ThisDemo {

	
	String studName;
	int rollno;
	String collegeName;
	long phnno; 
	
	ThisDemo(){
		collegeName = "BMPL";
		//System.out.println("Default cons");
	}
	//local variable--> 
	ThisDemo(String studName, int rollno){
		//constructor chaining
		//constructor calling
		//constructor calling must be first statement
		//this();
		
		this(921434345);
		//studName = stud;
		this.studName = studName;
		this.rollno = rollno;
		
		//System.out.println("Parameterized cons");
	}
	
	ThisDemo(long phn){
		this();
		phnno = phn;
	}
	
	void print()
	{
		System.out.println("College Name is= " +collegeName);
		System.out.println("Student Name is= " +studName);
		System.out.println("Rollno is= " +rollno);
		System.out.println("Phone No is= " +phnno);
	}
	
	public static void main(String[] args) {
		
		//ThisDemo obj3 = new ThisDemo();
		
		ThisDemo obj = new ThisDemo("Aman", 1);
		ThisDemo obj1 = new ThisDemo("Ram", 2);
		ThisDemo obj2 = new ThisDemo("Mohan", 3);
		obj.print();
		//obj3.print();
		obj1.print();
		obj2.print();
		
		//Demo demo = new Demo();
		Demo demo1 = new Demo(5);
		
	}

}
