package com.bmpl.javabasic;

class Parent1{
	
	int value; 
	
	Parent1(){
		
		System.out.println("Default Constructor of Parent 1 class");
	}
	
	Parent1(float value){
		System.out.println("Param cons of Parent1 class");
	}
	
	void print(int num){
		System.out.println("Print method of Parent1 " + num);
	}
	
	void input(){
		System.out.println("Input method of Parent1 ");
	}
	
}

class Child1 extends Parent1{
		
	int number;
	
	Child1(){
		super(5.5f);//override super cons
		//this(); super and this must be first statement
		value = 10;
		//super();//inheritance
		System.out.println("Default cons of Child1 class");
	}
	
	Child1(int value){
		this();
		System.out.println("Param cons of Child1 class");
	}
	
	void data(float value){
		print(5);
		System.out.println("Data method of Child1 class " + value);
	}
}

//Default keyword: access inside package
//private keyword: access inside the class
//protected keyword: access inside package through inheritance
//public keyword: access from any where inside or outside the package

//class modifier--> public or abstract or final

public class Single {

	public static void main(String[] args) {
		Child1 obj = new Child1(5);
		obj.input();
		obj.print(4);
		obj.data(40.5f);
		obj.number = 5;
		obj.value = 10;
		System.out.println("Number is=" +obj.number);
		System.out.println("Value is=" +obj.value);
		
	}
}
