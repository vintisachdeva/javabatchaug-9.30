package com.bmpl.javabasic;

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
	
//	void input(){
//		prsnName = "Ram";
//		prsnPhn = 923243133;
//	}
	
//	void print(){
//		System.out.println("Person Name=" + prsnName);
//		System.out.println("Person Phn=" + prsnPhn);
//	}
	
}

class StudentDetails extends PersonDetails{
	
	String studName;
	String studCourse;
	int studEnrollmnt;

//	@Override
//	void input(){
//		super.input();
//		studName = "Ram";
//		studCourse = "BCA";
//		studEnrollmnt = 1000342;
//	}
//	
	/*@Override
	void print(){
		System.out.println("Student Name=" +studName);
		System.out.println("Student Course=" +studCourse);
		System.out.println("Student Enrollment=" +studEnrollmnt);
	}*/
}

public class MethodOveridding {

	public static void main(String[] args) {
	
		//Upcasting--> 
		PersonDetails obj = new StudentDetails();
		//PersonDetails obj = new PersonDetails();
		obj.input();
		//obj.print();

	}

}
