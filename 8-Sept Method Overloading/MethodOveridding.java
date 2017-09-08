package com.bmpl.javabasic;

//Method Overloading-- name must be same, changes in param. and return type
// Logic --> data extracting way is different
//inheritance is not mandatory

//Method Overriding-- name, param. and return type must be same
//inheritance is must
//Logic needs to be add, modified then we can do overriding

class Human{
	
	int value = 10;
	
	void input(){
		System.out.println("Human properties");
	}
	
}


//@author vinti
class PersonDetails extends Human{
	
	
	String prsnName;
	long prsnPhn;
	
	void add(int value1, int value2){
		System.out.println(value1 + value2);
	}
	
	void add(float value1, float value2){
		System.out.println(value1 + value2);
	}
	
	void add(int value1, int value2, int value3){
		System.out.println(value1 + value2 + value3);
	}
	
	int add(float value1, int value2){
		System.out.println(value1 + value2);
		return 0;
	}
	
	void input(){
		prsnName = "Ram";
		prsnPhn = 923243133;
	}
	
	void print(){
		System.out.println("Person Name=" + prsnName);
		System.out.println("Person Phn=" + prsnPhn);
	}
	
}

class StudentDetails extends PersonDetails{
	
	String studName;
	String studCourse;
	int studEnrollmnt;

	@Override
	void input(){
		super.input();
		studName = "Ram";
		studCourse = "BCA";
		studEnrollmnt = 1000342;
	}
	
	@Override
	void print(){
		System.out.println("Student Name=" +studName);
		System.out.println("Student Course=" +studCourse);
		System.out.println("Student Enrollment=" +studEnrollmnt);
	}
	
	long add(long value1, long value2){
		
		return 0;
	}
}

public class MethodOveridding {

	public static void main(String[] args) {
	
		//Upcasting--> 
		StudentDetails obj = new StudentDetails();
		
		StudentDetails obj1 = (StudentDetails)obj;//downcasting
		//PersonDetails obj = new PersonDetails();
		obj.input();
		obj.add(40, 40);
		//obj.print();

	}

}
