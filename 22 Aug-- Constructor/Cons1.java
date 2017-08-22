package com.bmpl.javabasic;

public class Cons1 {
	//Rule:
	//constructor name must be same as class name
	//no return type is allowed with contructor
	//2 type of cons--> default cons and parameterized cons
	
	String name;
	int rollno;
	
	//Default cons
	Cons1(){
		name = "ram";
		rollno = 1;
		System.out.println("this is my default cons" + name + rollno);
	}
	//Parameterized constructor
	Cons1(int a, String name, float b){
		System.out.println("This is my parameterized cons");
	}
	
	Cons1(String name, float b){
		System.out.println("This is my parameterized cons");
	}
	
	void Cons1(){
		name = "Mohan";
		rollno = 2;
		System.out.println("this is my Cons1" +name +rollno);
	}
	
	public static void main(String[] args) {
		
		Cons1 obj = new Cons1();
		obj.Cons1();
	}

}
