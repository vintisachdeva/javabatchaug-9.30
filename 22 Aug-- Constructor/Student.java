package com.bmpl.javabasic;

public class Student{

	String studName;
	int rollno;
	String collegeName;
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 12;
		person.name = "Rohan";
		person.city = "Delhi";
		person.personDetails();
		
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.city);
	}
}