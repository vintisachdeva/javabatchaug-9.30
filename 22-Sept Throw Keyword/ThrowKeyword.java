package com.bmpl.javabasic;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
	
	int age;
	
	MyException(){
		
	}
	
	MyException(int age){
		this.age = age;
	}
	
	public String toString(){
		return "You cannot vote";
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {
		
		//throw is used to explicity throw any exception

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = scanner.nextInt();
		
		if(age> 18){
			System.out.println("You can Vote");
		}
		else {
			try {
				throw new MyException(age);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.toString());
			}
			//throw new InputMismatchException("Cannot Vote");
		}
		
	}

}
