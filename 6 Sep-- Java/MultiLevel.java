package com.bmpl.javabasic;


class Person1 { //extends Object{
	
	String personName;
	String personAddress;
	int value = 5;
	
	Person1(){
		//super();
		System.out.println("Default of Person1");
	}
	
	private void personInput(){
		System.out.println("Person Input");
	}
	
	void personOutput(){
		System.out.println("Person Output");
	}
	
}

class Student1 extends Person1{
	
	String studName;
	int rollno;
	int value = 10;
	
	Student1(){
		super();
		System.out.println("Default of Student1");
	}
	
	void studentInput(){
		//personInput();
		personOutput();
		System.out.println("Student Output");
	}
}

class Employee extends Student1{
	
	String empName;
	int empId;
	
	int value = 15;
	
	Employee(int value){
		super();
		
		value = this.value + value + super.value +  ((Person1)this).value;
		
		System.out.println("Default of Employee" + value);
		
	}
	
	void empInput()
	{
		super.studentInput();
		personOutput();
		System.out.println("Employee input method");
	}
	
}


public class MultiLevel {

	public static void main(String[] args) {
		
		Employee employee = new Employee(5);
		employee.personOutput();
		employee.studentInput();
		employee.empInput();

	}

}