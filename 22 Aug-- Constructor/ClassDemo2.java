package com.bmpl.javabasic;

import java.util.Scanner;

public class ClassDemo2 {

	//declaration and defination
	//instance variable
	//global access
	String name;
	int id;
	float salary;
	//double value;
	
	//void input(String nm, int i, float sal){
	
	void input(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your ID");
		
		id = scanner.nextInt();
		
		System.out.println("Enter your Salary");
		
		salary = scanner.nextFloat();
		
		System.out.println("Enter your name");
		scanner.nextLine();
		name = scanner.nextLine();//nextLine()
		
		//--> \n
		
		
		
		/*name = nm;
		id = i;
		salary = sal;*/
		//no user interaction
		
		/*name = "ram";
		id = 1001;
		salary = 30000.320f;//implicitly convert float to int
		//value = 300000.32323232;
*/		
	}
	
	void output(){
		System.out.println("Name is="+name);
		System.out.println("ID is="+id);
		System.out.println("Salary is="+salary);
	}
	
	public static void main(String[] args) {
		//calling
		ClassDemo2 obj = new ClassDemo2();
		//obj.input("Ram", 1001, 40003.54f);
		obj.input();
		obj.output();
		
	}

}
